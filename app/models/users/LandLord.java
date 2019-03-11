package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("a")
@Entity
public class LandLord extends User {

    public LandLord(){

    }
    public LandLord(String email, String name,String role, String password) {
        super(email, name, role,password);
    }

    public static final Finder<Long, LandLord> find = new Finder<>(LandLord.class);
			    
    public static final List<LandLord> findAll() {
       return LandLord.find.all();
    }
}