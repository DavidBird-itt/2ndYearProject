package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    //Allows the user to make a class off a form
    public FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }
    
    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result payment() {
        return ok(payment.render(User.getUserById(session().get("email"))));
    }

    public Result database() {
        List<Houses> houseList = Houses.findAll();
        return ok(database.render(houseList, User.getUserById(session().get("email"))));
    }

    //Adds security so user must be logged in
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addHouse() {
        Form<Houses> houseForm = formFactory.form(Houses.class);
        return ok(addHouse.render(houseForm, User.getUserById(session().get("email"))));
    }

    //Interacts directly with the database so the @Transactional is added
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addHouseSubmit() {
        Form<Houses> newHouseForm = formFactory.form(Houses.class).bindFromRequest();

        //Error handling
        if (newHouseForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addHouse.render(newHouseForm, User.getUserById(session().get("email"))));
        } else {
            //Puts the form into the houses constructor
            Houses newHouse = newHouseForm.get();
            
            if(newHouse.getId() == null){
                //Saves to the database
                newHouse.save();
            } else {
                newHouse.update();
            }

            flash("success", "House " + newHouse.getAddress() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.database());
        }

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteHouse(Long id) {
        Houses.find.ref(id).delete();

        //Flash message showing result
        flash("success", "House has been deleted.");
        return redirect(controllers.routes.HomeController.database());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateHouse(Long id) {
        Houses i;
        Form<Houses> houseForm;

        try{
            //Find by id
            i = Houses.find.byId(id);

            //Show the form so they can update it
            houseForm = formFactory.form(Houses.class).fill(i);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addHouse.render(houseForm, User.getUserById(session().get("email"))));
    }

    public Result landlord() {
        List<Landlord> userList = null;

        userList = Landlord.findAll();

        return ok(landlord.render(userList,User.getUserById(session().get("email"))));
    }

    public Result addLandlord() {
        Form<Landlord> lForm = formFactory.form(Landlord.class);
        return ok(addLandlord.render(lForm, User.getUserById(session().get("email"))));
    }

    public Result addLandlordSubmit() {
        Form<Landlord> newLandlordForm = formFactory.form(Landlord.class).bindFromRequest();

        //Error handling
        if (newLandlordForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addLandlord.render(newLandlordForm, User.getUserById(session().get("email"))));
        } else {
            //Puts the form into the houses constructor
            Landlord newLandlord = newLandlordForm.get();
            
            if(newLandlord.getUserById(newLandlord.getEmail()) == null){
                //Saves to the database
                newLandlord.save();
            } else {
                newLandlord.update();
            }

            flash("success", "Landlord " + newLandlord.getFName() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.landlord());
        }
    }

    public Result updateLandlord(String email) {
        Landlord l;
        Form<Landlord> lForm;
    
        try {
            // Find the item by id
            l = Landlord.find.getUserById(id);
    
            // Populate the form object with data from the item found in the database
            lForm = formFactory.form(Landlord.class).fill(i);
        } catch (Exception ex) {
            return badRequest("error");
        }
    
        // Display the "add item" page, to allow the user to update the item
        return ok(addLandlord.render(lForm,User.getUserById(session().get("email"))));
        

    }

    public Result deleteLandlord(String email) {
        Landlord l = Landlord.getUserById(email);
        l.delete();

        flash("success", "Landlord has been updated");
        return redirect(controllers.routes.HomeController.landlord());
        
    }
}