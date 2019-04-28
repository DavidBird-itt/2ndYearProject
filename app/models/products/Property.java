package models.products;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import java.text.NumberFormat;

import models.users.*;
import java.io.File;

@Entity
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

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "property")
    private List<Style> styles;

    private List<Long> styleSelect = new ArrayList<Long>();

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

    public void cancelRent() {
        this.stock = 1;
    }

    //Mapping getters and setters
    public List<Style> getStyles() {
        return styles;
    }

    public void setStyles(List<Style> styles){
        this.styles = styles;
    }

    public List<Long> getStyleSelect() {
        return styleSelect;
    }

    public void setStyleSelect(List<Long> styleSelect) {
        this.styleSelect = styleSelect;
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

    //Methods
    public static final List<Property> findRange(int min, int max) {
        List<Property> resList = Property.find.all();
        Iterator<Property> i = resList.iterator();

        while (i.hasNext()) {
            Property property = i.next();
            double hp = property.getPrice();

            if(hp < min || hp > max)
                i.remove();
        }

        return resList;
    }

        //Method
        public int getDepositValue() {
            int depositValue = (int)getPrice();
    
            depositValue = (int)(depositValue* 3); // Simple way to get a "deposit" number
    
            return depositValue;
        }


    //Finders
    public static final Finder<Long, Property> find = new Finder<>(Property.class);
    
    public static final List<Property> findAll() {
        return Property.find.all();
    }

    public static final Property findById(Long id) {
        return Property.find.byId(id);
    }

    public static final List<Property> findRecent() { // cant figure this out -adam
        List<Property> resList = Property.find.all();
        Iterator<Property> i = resList.iterator();
        int cnt = 0;

        while (i.hasNext()) {
            cnt++;

            if(cnt > 8)
                i.remove();
        }

        return resList;
    }
    
}