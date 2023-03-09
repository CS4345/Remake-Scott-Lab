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

    // Add by eric
    public static User findByUsername(String username) {
        return User.find
                .where()
                .eq("username", username)
                .findUnique();
    }

    // Add by eric
    public static boolean isCompletedProfile(User u) {
        // Check for any empty variables
        return u.username == null || u.password == null || u.firstname == null ||
                u.lastname == null || u.researchArea == null || u.title == null ||
                u.position == null || u.affiliation == null || u.email == null ||
                u.phone == null || u.fax == null || u.address == null || u.city == null ||
                u.country == null || u.zipcode == null || u.comments == null ||
                u.status == null;
    }
}
