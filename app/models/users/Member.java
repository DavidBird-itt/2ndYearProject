package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.shopping.*;

@Table(name="User")
// the user type of this class is "admin"
@DiscriminatorValue("m")
@Entity
public class Member extends User {

    @OneToOne(mappedBy="member", cascade = CascadeType.ALL)
    private Basket basket;

    @OneToMany(mappedBy="member", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

    public Member(){

    }

    public Member(String email, String role, String fname, String lname, String phone, Date dateJoined, String password) {
        super(email, role, fname, lname, phone, dateJoined, password);
    }

    public static final Finder<Long, Member> find = new Finder<>(Member.class);
			    
    public static final List<Member> findAll() {
       return Member.find.all();
    }

    //Mapped Getters and setters
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

    public int convertStripeNum(double val) {
        return (int)val * 100;
        }
}