package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

@Table(name = "Property")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "type")

@DiscriminatorValue("p")

public class Property extends Model { 
    @Id
    private Long id;
    @Constraints.Required
    private int numBeds;
    @Constraints.Required
    private int numBaths;
    @Constraints.Required
    private double price;

    public Property(){

    }

    public Property(Long id, int numBeds, int numBaths, double price) {
        this.id = id;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
        this.price = price;
    }

    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}