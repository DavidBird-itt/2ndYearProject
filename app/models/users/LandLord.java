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

    public String fname(String fname) {
        return fname;
    }

    public String lname(String lname) {
        return lname;
    }

    public int numOfProperties(int numOfProperties) {
        return numOfProperties;
    }

    public double rentAmount(double rentAmount) {
        return rentAmount;
    }

    public String email(String email) {
        return email;
    }

    public Long setId(Long id) {
        this.id = id;
    }

    void fname(String fname) {
        this.fname = fname;
    }

    public String lname(String lname) {
        this.lname = lname;
    }

    public int numOfProperties(int numOfProperties) {
        this.numOfProperties = numOfProperties;
    }

    public double rentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String email(String email) {
        this.email = email;
    }
}