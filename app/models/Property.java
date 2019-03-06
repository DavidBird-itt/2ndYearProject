package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Property extends Model { 
    @Id
    private Long id;
    @Constraints.Required
    private String type;
    @Constraints.Required
    private int numBeds;
    @Constraints.Required
    private int numBaths;
    @Constraints.Required
    private double price;
    @Constraints.Required
    private String EirCode;


    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getEirCode() {
        return EirCode;
    }

    public void setEirCode(String EirCode) {
        this.EirCode = EirCode;
    }
}