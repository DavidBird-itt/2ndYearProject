package models.products;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import java.text.NumberFormat;

import models.users.*;
import models.rent.*;
import java.io.File;

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
    @Constraints.Min(0)
    private int stock;

    @ManyToOne
    private Landlord landlord;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="AID")
    private Address address;

    @OneToOne(mappedBy="property", cascade = CascadeType.ALL)
    private Fees fees;

    public Property(){

    }

    public Property(Long id, int numBeds, int numBaths, double price, Landlord l, Address a) {
        this.id = id;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
        this.price = price;
        this.landlord = l;
        this.address = a;
        this.stock = 1;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Sold Method
    public void sellProperty() {
        this.stock = 0;
    }

    //Mapping getters and setters
    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees Fees) {
        this.fees = fees;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address a) {
        this.address = a;
    }

    //Methods
    public String getDisplayValue(double val) {
        return NumberFormat.getNumberInstance(Locale.US).format(val);
    }

    public int convertStripeNum(double val) {
        return (int)val * 100;
    }

    public String getImagePath() { // Use this instead of putting it into the view files
        String path = String.format("public/images/projectImages/%dfull.jpg", getId());

        if(new File(path).exists()) { 
            return String.format("/assets/images/projectImages/%dfull.jpg", id);
        } else {
            return "/assets/images/projectImages/noImage.jpg";
        }
    }

    public String getThumbnailPath() { // Use this instead of putting it into the view files
        String path = String.format("public/images/projectImages/%dthumb.jpg", getId());

        if(new File(path).exists()) { 
            return String.format("/assets/images/projectImages/%dthumb.jpg", id);
        } else {
            return "/assets/images/projectImages/noImageThumb.jpg";
        }
    }

    //Finders
    public static final Finder<Long, Property> findp = new Finder<>(Property.class);
    
    public static final List<Property> findAllp() {
        return Property.findp.all();
    }

    
    
}