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

    @Constraints.Required
    public String coursesTaken;

    @Constraints.Required
    public String degreePlan;

    @Constraints.Required
    public String startingSemester;

    @Constraints.Required
    public String expectedGraduation;

    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getResearchArea() {
        return researchArea;
    }
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getAffiliation() {
        return affiliation;
    }
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoursesTaken() {
        return coursesTaken;
    }
    public void setCoursesTaken(String coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public String getDegreePlan() {
        return degreePlan;
    }
    public void setDegreePlan(String degreePlan) {
        this.degreePlan = degreePlan;
    }
    public String getStartingSemester() {
        return startingSemester;
    }
    public void setStartingSemester(String startingSemester) {
        this.startingSemester = startingSemester;
    }
    public String getExpectedGraduation() {
        return expectedGraduation;
    }
    public void setExpectedGraduation(String expectedGraduation) {
        this.expectedGraduation = expectedGraduation;
    }

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
        System.out.println(u);
        return u.researchArea == null || u.researchArea.isEmpty() ||
                u.title == null || u.title.isEmpty() ||
                u.position == null || u.position.isEmpty() ||
                u.affiliation == null || u.affiliation.isEmpty() ||
                u.email == null || u.email.isEmpty() ||
                u.phone == null || u.phone.isEmpty() ||
                u.fax == null || u.fax.isEmpty() ||
                u.address == null || u.address.isEmpty() ||
                u.city == null || u.city.isEmpty() ||
                u.country == null || u.country.isEmpty() ||
                u.zipcode == null || u.zipcode.isEmpty() ||
                u.comments == null || u.comments.isEmpty() ||
                u.status == null || u.status.isEmpty();
    }
    public boolean alreadySubmittedGeneralApplication() {
        return Application.findByUserId(this.id) == null;
    }
}
