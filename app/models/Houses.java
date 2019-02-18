package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Houses extends Model {
    @Id
    private Long id;

    @Constraints.Required
    private String address;

    @Constraints.Required
    private String postcode;

    @Constraints.Required
    private int numBeds;

    @Constraints.Required
    private int numBaths;

    @Constraints.Required
    private double price;

    //Default Cons
    public Houses() {

    }

    //Overloaded Cons
    public Houses(Long id, String address, String postcode, int numBeds, int numBaths, double price) {
        this.id = id;
        this.address = address;
        this.postcode = postcode;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
        this.price = price;
    }

    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public void setNumBahts(int numBaths) {
        this.numBaths = numBaths;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Finders
    public static final Finder<Long, Houses> find = new Finder<>(Houses.class);

    public static final List<Houses> findAll() {
        return Houses.find.all();
    }

}