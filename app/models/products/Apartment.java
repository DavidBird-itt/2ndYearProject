package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;

@Table(name="Property")
// the user type of this class is "admin"
@DiscriminatorValue("a")

@Entity
public class Apartment extends Property {
    @Id
    private Long id;

    private int floor;



    public Apartment() {

    }

    //Overloaded Cons
    public Apartment(Long id,  int numBeds, int numBaths, double price, Landlord landlord, Address address, int floor) {
        super(id, numBeds, numBaths, price, landlord, address);
        this.floor = floor;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    // Finders

    public static final Finder<Long, Apartment> find = new Finder<>(Apartment.class);

    public static final Apartment findById(Long id) {
        return Apartment.find.byId(id);
    }

    public static final List<Apartment> findAll() {
        return Apartment.find.all();
    }

    //Method
    public int getDepositValue() {
        int depositValue = (int)getPrice();

        depositValue = (int)(depositValue* 3); // Simple way to get a "deposit" number

        return depositValue;
    }
}