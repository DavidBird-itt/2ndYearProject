package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;


@Table(name="Property")
// the user type of this class is "admin"
@DiscriminatorValue("h")

@Entity
public class Houses extends Property {
    
    private int gardenSize;
    private boolean garage;


    //Default Cons
    public Houses() {

    }

    //Overloaded Cons
    public Houses(Long id,  int numBeds, int numBaths, double price, Landlord landlord, Address address, int gardenSize, boolean garage) {
        super(id, numBeds, numBaths, price, landlord, address);
        this.gardenSize = gardenSize;
        this.garage = garage;
    }


    //Getters and Setters
    public int getGardenSize() {
        return this.gardenSize;
    }

    public void setGardenSize(int gardenSize) {
        this.gardenSize = gardenSize;
    }

    public boolean getGarage() {
        return garage;
    }

    public void setGarage(boolean garage){
        this.garage = garage;
    }


    public int getDepositValue() {
        int depositValue = (int)getPrice();

        depositValue = (int)(depositValue / 50); // Simple way to get a "deposit" number

        return depositValue;
    }

    //Finders
    public static final Finder<Long, Houses> find = new Finder<>(Houses.class);

    public static final Houses findById(Long id) {
        return Houses.find.byId(id);
    }

    public static final List<Houses> findAll() {
        return Houses.find.all();
    }

    public static final List<Houses> findRange(int min, int max) {
        List<Houses> resList = Houses.find.all();
        Iterator<Houses> i = resList.iterator();

        while (i.hasNext()) {
            Houses house = i.next();
            double hp = house.getPrice();

            if(hp < min || hp > max)
                i.remove();
        }

        return resList;
    }
}