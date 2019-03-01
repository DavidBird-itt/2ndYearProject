package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

public class LandLord extends Models {

    @Id
    private Long id;
    @Constraints.Required
    private String fname;
    @Constraints.Required
    private String lname;
    @Constraints.Required
    private Long numOfProperties;
    @Constraints.Required
    private Long rentAmount;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String role;

    public LandLord() {

    }

    public LandLord(Long id, String fname, String lname, Long numOfProperties, Long rentAmount,String email, String role) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.numOfProperties = numOfProperties;
        this.rentAmount = rentAmount;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String fname() {
        return fname;
    }

    public String lname() {
        return lname;
    }

    public Long numOfProperties() {
        return numOfProperties;
    }

    public Long rentAmount() {
        return rentAmount;
    }

    public String email() {
        return email;
    }

    public String role() {
        return role;
    }

    public Long setId(Long id) {
        this.id = id;
    }

    public String fname(String fname) {
        this.fname = fname;
    }

    public String lname(String lname) {
        this.lname = lname;
    }

    public Long numOfProperties(Long numOfProperties) {
        this.numOfProperties = numOfProperties;
    }

    public Long rentAmount(Long rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String email(String email) {
        this.email = email;
    }

    public String role(String role) {
        this.role = role;
    }
}




















