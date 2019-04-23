package models.products;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import java.text.NumberFormat;

import models.users.*;

@Entity 
public class Style extends Model {
    //Primary Key
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    //Mappings
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Property> property;

    //Cons
    public Style() {

    }

    public Style(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Style> find = new Finder<Long,Style>(Style.class);

   //Find all Products in the database
   public static List<Style> findAll() {
      return Style.find.query().where().orderBy("name asc").findList();
   }
   
   public static Map<String,String> options() {
       LinkedHashMap<String,String> options = new LinkedHashMap();
    
       // Get all the categories from the database and add them to the options hash map
       for (Style s: Style.findAll()) {
          options.put(s.getId().toString(), s.getName());
       }
       return options;
    }

    public static boolean inStyle(Long style, Long property) {
       return find.query().where().eq("property.id", property)
                          .eq("id", style)
                          .findList().size() > 0;
   }
   
}