package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("m")
@Entity
public class Member extends User {

    public Member(){

    }

    public Member(String email, String role, String fname, String lname, String password) {
        super(email, role, fname, lname,password);
    }

    public static final Finder<Long, Member> find = new Finder<>(Member.class);
			    
    public static final List<Member> findAll() {
       return Member.find.all();
    }
}