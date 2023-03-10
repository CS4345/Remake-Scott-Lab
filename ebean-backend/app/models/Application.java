package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
public class Application extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long application_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    @Constraints.Required
    public Long pref_one;

    @Constraints.Required
    public Long pref_two;

    @Constraints.Required
    public Long pref_three;

    public static Find<Long, Application> find = new Find<Long, Application>(){};

    //getters and setters
    public Long getApplication_id() {
        return application_id;
    }
    public void setApplication_id(Long application_id) {
        this.application_id = application_id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Long getPref_one() {
        return pref_one;
    }
    public void setPref_one(Long pref_one) {
        this.pref_one = pref_one;
    }
    public Long getPref_two() {
        return pref_two;
    }
    public void setPref_two(Long pref_two) {
        this.pref_two = pref_two;
    }
    public Long getPref_three() {
        return pref_three;
    }
    public void setPref_three(Long pref_three) {
        this.pref_three = pref_three;
    }

    public static Application findByPositionId(Long pos_id) {
        return Application.find
                .where()
                .eq("pref_one", pos_id)
                .findUnique();
    }
    public static Application findByUserId(Long user_id) {
        return Application.find
                .where()
                .eq("user_id", user_id)
                .findUnique();
    }
    public static Application findByApplicationId(Long app_id) {
        return Application.find
                .where()
                .eq("application_id", app_id)
                .findUnique();
    }
}