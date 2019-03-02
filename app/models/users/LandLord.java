package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class LandLord extends Model   {

    @Id
    private Long id;
    @Constraints.Required
    private String fname;

    @Constraints.Required
    private String lname;

    @Constraints.Required
    private int numOfProperties;

    @Constraints.Required
    private double rentAmount;

    @Constraints.Required
    private String email;

    public LandLord() {

    }

    public LandLord(Long id, String fname, String lname, int numOfProperties, double rentAmount,String email) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.numOfProperties = numOfProperties;
        this.rentAmount = rentAmount;
        this.email = email;
    }

    public Long getId(Long id) {
        return id;
    }

    public String getFname(String fname) {
        return fname;
    }

    public String getLname(String lname) {
        return lname;
    }

    public int getNumOfProperties(int numOfProperties) {
        return numOfProperties;
    }

    public double getRentAmount(double rentAmount) {
        return rentAmount;
    }

    public String getEmail(String email) {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setNumOfProperties(int numOfProperties) {
        this.numOfProperties = numOfProperties;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}