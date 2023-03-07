package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    @Constraints.Required
    public String firstname;
    @Constraints.Required
    public String lastname;
    @Constraints.Required
    public String researchArea;
    @Constraints.Required
    public String title;
    @Constraints.Required
    public String position;
    @Constraints.Required
    public String affiliation;
    @Constraints.Required
    public String email;
    @Constraints.Required
    public String phone;
    @Constraints.Required
    public String fax;
    @Constraints.Required
    public String address;
    @Constraints.Required
    public String city;
    @Constraints.Required
    public String country;
    @Constraints.Required
    public String zipcode;
    @Constraints.Required
    public String comments;
    @Constraints.Required
    public String status;

    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }
}
