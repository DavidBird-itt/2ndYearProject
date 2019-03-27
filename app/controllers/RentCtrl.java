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
import models.rent.*;

import views.html.*;

@Security.Authenticated(Secured.class)
@With(CheckIfMember.class)
public class RentCtrl extends Controller {
    private FormFactory FormFactory;
    private Environment env;

    @Inject
    public RentCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.FormFactory = f;
    }

    @Transactional
    public Result viewRent() {
        List<RentDue> rentList = RentDue.findAll();
        return ok(viewRent.render(rentList, (Member)User.getUserById(session().get("email"))));
    }

   
}