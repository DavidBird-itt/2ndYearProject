package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.products.*;
import models.users.*;

import views.html.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    //Allows the user to make a class off a form
    public FormFactory formFactory;

    private Environment e;

    @Inject
    public HomeController(FormFactory f, Environment env) {
        this.formFactory = f;
        this.e = env;
    }
    
    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result properties() {
        List<Houses> houseList = Houses.findAll();
        List<Apartment> aList = Apartment.findAll();
        return ok(properties.render(houseList, aList, User.getUserById(session().get("email")), e));
    }

    public Result contact() {
        List<Landlord> landlordList = Landlord.findAll();
        return ok(contact.render(landlordList, User.getUserById(session().get("email")), e));
    }

    public Result landlordProfile(String email) {
        if(email != null){
            Landlord l = (Landlord) User.getUserById(email);
            List<Houses>  houseList = Houses.findAll();
            return ok(landlordProfile.render(l, houseList, User.getUserById(session().get("email")), e));
        }
        return notFound();
    }

    //Adds security so user must be logged in
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addHouse() {
        Form<Houses> houseForm = formFactory.form(Houses.class);
        Form<Address> aForm = formFactory.form(Address.class);

        return ok(addHouse.render(houseForm, aForm, User.getUserById(session().get("email")), e));
    }

    //Interacts directly with the database so the @Transactional is added
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addHouseSubmit() {
        Form<Houses> newHouseForm = formFactory.form(Houses.class).bindFromRequest();
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();

        //Error handling
        if (newHouseForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addHouse.render(newHouseForm, newAddressForm, User.getUserById(session().get("email")), e));
        } else {
            //Puts the form into the houses constructor
            Houses newHouse = newHouseForm.get();
            //Applies mapping to the form
            Address address = newAddressForm.get();
            newHouse.setAddress(address);

            
            
            if(newHouse.getId() == null){
                //Saves to the database
                newHouse.save();
            } else {
                newHouse.update();
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();

            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(newHouse.getId(), image);

            flash("success", "House " + newHouse.getId() + " was added/updated" + saveImageMessage);

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.properties());
        }

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteHouse(Long id) {
        Houses.find.ref(id).delete();

        //Flash message showing result
        flash("success", "House has been deleted.");
        return redirect(controllers.routes.HomeController.properties());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateHouse(Long id) {
        Houses i;
        Address a;
        Form<Houses> houseForm;
        Form<Address> aForm;

        try{
            //Find by id
            i = Houses.find.byId(id);
            i.update();

            if(i.getAddress() != null){
                a = i.getAddress();
                aForm  = formFactory.form(Address.class).fill(a);
            } else {
                aForm = formFactory.form(Address.class);
            }

            //Show the form so they can update it
            houseForm = formFactory.form(Houses.class).fill(i);
            

        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addHouse.render(houseForm, aForm, User.getUserById(session().get("email")), e));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addApartment() {
        Form<Apartment> apartForm = formFactory.form(Apartment.class);
        Form<Address> aForm = formFactory.form(Address.class);
        return ok(addApartment.render(apartForm, aForm, User.getUserById(session().get("email")), e));
    }

    //Interacts directly with the database so the @Transactional is added
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addApartmentSubmit() {
        Form<Apartment> newApartForm = formFactory.form(Apartment.class).bindFromRequest();
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();

        //Error handling
        if (newApartForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addApartment.render(newApartForm, newAddressForm, User.getUserById(session().get("email")), e));
        } else {
            //Puts the form into the houses constructor
            Apartment newApart = newApartForm.get();
            
            if(newApart.getId() == null){
                //Saves to the database
                newApart.save();
            } else {
                newApart.update();
            }

            MultipartFormData<File> data = request().body().asMultipartFormData();

            FilePart<File> image = data.getFile("upload");

            String saveImageMessage = saveFile(newApart.getId(), image);

            flash("success", "Apartment " + newApart.getId() + " was added/updated" + saveImageMessage);

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.properties());
        }

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteApartment(Long id) {
        Apartment.find.ref(id).delete();

        //Flash message showing result
        flash("success", "Apartment has been deleted.");
        return redirect(controllers.routes.HomeController.properties());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateApartment(Long id) {
        Apartment i;
        Address address;

        Form<Apartment> apartForm;
        Form<Address> aForm;

        try{
            //Find by id
            i = Apartment.find.byId(id);

            if(i.getAddress() != null){
                address = i.getAddress();
                aForm  = formFactory.form(Address.class).fill(address);
            } else {
                aForm = formFactory.form(Address.class);
            }

            //Show the form so they can update it
            apartForm = formFactory.form(Apartment.class).fill(i);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addApartment.render(apartForm, aForm, User.getUserById(session().get("email")), e));
    }

    public Result viewUsers() {
        List<Landlord> lList = null;
        List<Admin> aList = null;
        List<Member> mList = null;

        aList = Admin.findAll();
        lList = Landlord.findAll();
        mList = Member.findAll();

        return ok(viewUsers.render(lList,aList,mList,User.getUserById(session().get("email")), e));
    }

    public Result addLandlord() {
        Form<Landlord> lForm = formFactory.form(Landlord.class);
        return ok(addLandlord.render(lForm, User.getUserById(session().get("email")), e));
    }

    public Result addLandlordSubmit() {
        Form<Landlord> newLandlordForm = formFactory.form(Landlord.class).bindFromRequest();

        //Error handling
        if (newLandlordForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addLandlord.render(newLandlordForm, User.getUserById(session().get("email")), e));
        } else {
            //Puts the form into the houses constructor
            Landlord newLandlord = newLandlordForm.get();
            
            if(newLandlord.getUserById(newLandlord.getEmail()) == null){
                //Saves to the database
                newLandlord.save();
            } else {
                newLandlord.update();
            }

            flash("success", "Landlord " + newLandlord.getFname() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.viewUsers());
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateLandlord(String email) {
        Landlord l;
        Form<Landlord> lForm;
    
        try {
            // Find the item by id
            l = (Landlord)User.getUserById(email);
    
            // Populate the form object with data from the item found in the database
            lForm = formFactory.form(Landlord.class).fill(l);
        } catch (Exception ex) {
            return badRequest("error " + ex.getMessage());
        }
    
        // Display the "add item" page, to allow the user to update the item
        return ok(addLandlord.render(lForm,User.getUserById(session().get("email")), e));
        

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteLandlord(String email) {
        Landlord l = (Landlord) User.getUserById(email);
        l.delete();

        flash("success", "Landlord has been deleted");
        return redirect(controllers.routes.HomeController.viewUsers());
    }

    public Result addAdmin() {
        Form<Admin> aForm = formFactory.form(Admin.class);
        return ok(addAdmin.render(aForm, User.getUserById(session().get("email")), e));
    }

    public Result addAdminSubmit() {
        Form<Admin> newAdminForm = formFactory.form(Admin.class).bindFromRequest();

        //Error handling
        if (newAdminForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(addAdmin.render(newAdminForm, User.getUserById(session().get("email")), e));
        } else {
            //Puts the form into the houses constructor
            Admin newAdmin = newAdminForm.get();
            
            if(newAdmin.getUserById(newAdmin.getEmail()) == null){
                //Saves to the database
                newAdmin.save();
            } else {
                newAdmin.update();
            }

            flash("success", "Admin " + newAdmin.getFname() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.HomeController.viewUsers());
        }
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result updateAdmin(String email) {
        Admin a;
        Form<Admin> aForm;
    
        try {
            // Find the item by id
            a = (Admin)User.getUserById(email);
    
            // Populate the form object with data from the item found in the database
            aForm = formFactory.form(Admin.class).fill(a);
        } catch (Exception ex) {
            return badRequest("error");
        }
    
        // Display the "add item" page, to allow the user to update the item
        return ok(addAdmin.render(aForm,User.getUserById(session().get("email")), e));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteAdmin(String email) {
        Admin a = (Admin) User.getUserById(email);
        a.delete();

        flash("success", "Admin has been updated");
        return redirect(controllers.routes.HomeController.viewUsers());
        
    }

    public Result createAccount() {
        Form<Member> mForm = formFactory.form(Member.class);
        return ok(createAccount.render(mForm, User.getUserById(session().get("email"))));
    }

    public Result addMember() {
        Form<Member> mForm = formFactory.form(Member.class);
        return ok(createAccount.render(mForm, User.getUserById(session().get("email"))));
    }

    public Result addMemberSubmit() {
        Form<Member> newMemberForm = formFactory.form(Member.class).bindFromRequest();

        //Error handling
        if (newMemberForm.hasErrors()) {
            //Finds the error and gives the user a new form to fill out
            return badRequest(createAccount.render(newMemberForm, User.getUserById(session().get("email"))));
        } else {
            //Puts the form into the houses constructor
            Member newMember = newMemberForm.get();
            
            if(newMember.getUserById(newMember.getEmail()) == null){
                //Saves to the database
                newMember.save();
            } else {
                newMember.update();
            }

            flash("success", "Member " + newMember.getFname() + " was added/updated.");

            //Brings them back to the initial page and shows the update
            return redirect(controllers.routes.LoginController.login());
        }
    }

    public Result updateMember(String email) {
        Member m;
        Form<Member> mForm;
    
        try {
            // Find the item by id
            m = (Member)User.getUserById(email);
    
            // Populate the form object with data from the item found in the database
            mForm = formFactory.form(Member.class).fill(m);
        } catch (Exception ex) {
            return badRequest("error");
        }
    
        // Display the "add item" page, to allow the user to update the item
        return ok(createAccount.render(mForm,User.getUserById(session().get("email"))));
        

    }

    public Result deleteMember(String email) {
        Member m = (Member) User.getUserById(email);
        m.delete();

        flash("success", "Member has been deleted");
        return redirect(controllers.routes.LoginController.login());
        
    }

    public Result searchDB(int min, int max) {
        // perhaps checks vals are not zero (now done via html)

        List<Houses> searchList = Houses.findRange(min, max);
        return ok(searchQuery.render(searchList, User.getUserById(session().get("email")), e));
    }

    public Result viewHouse(Long id) {
        if(id > 0) { // check valid before trying to query db
            Houses house = Houses.findById(id);

            if(house != null) { // does it exist in db
                System.out.println(house.getId());
                return ok(viewHouse.render(house, User.getUserById(session().get("email"))));
            }
        }
        return notFound(); // not found, spit out error
    }

    public Result viewApartment(Long id) {
        if(id > 0) { // check valid before trying to query db
            Apartment apartment = Apartment.findById(id);

            if(apartment != null) { // does it exist in db
                System.out.println(apartment.getId());
                return ok(viewApartment.render(apartment, User.getUserById(session().get("email"))));
            }
        }
        return notFound(); // not found, spit out error
    }

    public String saveFile(Long id, FilePart < File > uploaded) {
        if (uploaded != null) {
            String mimeType = uploaded.getContentType();

            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();

                String extension = "";
                int i = fileName.lastIndexOf('.');

                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }

                File file = uploaded.getFile();

                File dir = new File("public/images/projectImages");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File newFile = new File("public/images/projectImages/", id + "." + extension);

                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        ImageIO.write(img, extension, new File("public/images/projectImages/", id + "full.jpg")); // full copy

                        if (ImageIO.write(scaledImg, extension, new File("public/images/projectImages/", id + "thumb.jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thumbnail creation failed.";
                        }

                    } catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed.";
                    }

                } else {
                    return "/ file upload failed.";
                }
            }
        }
        return "/ no image file.";


    }

    // public String saveFileLandlord(String email, FilePart < File > uploaded) {
    //     if (uploaded != null) {
    //         String mimeType = uploaded.getContentType();

    //         if (mimeType.startsWith("image/")) {
    //             String fileName = uploaded.getFilename();

    //             String extension = "";
    //             int i = fileName.lastIndexOf('.');

    //             if (i >= 0) {
    //                 extension = fileName.substring(i + 1);
    //             }

    //             File file = uploaded.getFile();

    //             File dir = new File("public/images/projectImages");

    //             if (!dir.exists()) {
    //                 dir.mkdirs();
    //             }

    //             File newFile = new File("public/images/projectImages/", email + "." + extension);

    //             if (file.renameTo(newFile)) {
    //                 try {
    //                     BufferedImage img = ImageIO.read(newFile);
    //                     BufferedImage scaledImg = Scalr.resize(img, 90);

    //                     if (ImageIO.write(scaledImg, extension, new File("public/images/projectImages/", email + "thumb.jpg"))) {
    //                         return "/ file uploaded and thumbnail created.";
    //                     } else {
    //                         return "/ file uploaded but thumbnail creation failed.";
    //                     }

    //                 } catch (IOException e) {
    //                     return "/ file uploaded but thumbnail creation failed.";
    //                 }

    //             } else {
    //                 return "/ file upload failed.";
    //             }
    //         }
    //     }
    //     return "/ no image file.";


    // }
}