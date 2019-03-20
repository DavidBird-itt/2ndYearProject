package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("h")

@Entity
public class Houses extends Property {
    @Constraints.Required
    private double gardenSize;
    @Constraints.Required
    private boolean garage;

    //Default Cons
    public Houses() {

    }

    //Overloaded Cons
    public Houses(Long id,  int numBeds, int numBaths, double price, double gardenSize, boolean garage) {
        super(id, numBeds, numBaths, price);
        this.gardenSize = gardenSize;
        this.garage = garage;
    }




    //Finders
    public static final Finder<Long, Houses> find = new Finder<>(Houses.class);

    public static final List<Houses> findAll() {
        return Houses.find.all();
    }

}