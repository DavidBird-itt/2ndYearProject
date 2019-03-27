package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.rent.*;
import models.*;

@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("l")
@Entity
public class Landlord extends User {

    @OneToMany(mappedBy = "landlord", cascade = CascadeType.PERSIST)
    private List<Property> property;

    public Landlord(){

    }
    public Landlord(String email, String fname, String lname, String role, String password) {
        super(email, fname, lname, role,password);
    }

    public static final Finder<Long, Landlord> find = new Finder<>(Landlord.class);
			    
    public static final List<Landlord> findAll() {
       return Landlord.find.all();
    }

    //Mapped getters and setters
    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}