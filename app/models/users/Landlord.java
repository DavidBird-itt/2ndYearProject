package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("l")
@Entity
public class Landlord extends User {

    public Landlord(){

    }
    public Landlord(String email, String fname, String lname, String role, String password) {
        super(email, fname, lname, role,password);
    }

    public static final Finder<Long, Landlord> find = new Finder<>(Landlord.class);
			    
    public static final List<Landlord> findAll() {
       return Landlord.find.all();
    }
}