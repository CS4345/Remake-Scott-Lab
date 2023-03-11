package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.filters.csrf.AddCSRFToken;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Controller;

import java.util.concurrent.CompletionStage;


public class User extends Controller {

    private String username;
    private String password;
    private String firstname;
    private String researchArea;
    private String lastname;
    private String title;
    private String position;
    private String affiliation;
    private String email;
    private String phone;
    private String fax;
    private String address;
    private String city;
    private String country;
    private String zipcode;
    private String comments;
    private String status;
    private String answerOne;
    private String answerTwo;
    private String startingSemester;
    private String expectedGraduation;
    private String degreePlan;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getResearchArea() {return researchArea;}

    public void setResearchArea(String researchArea) { this.researchArea = researchArea; }

    public String getTitle() {return title;}

    public void setTitle(String title) { this.title = title; }

    public String getPosition() {return position;}

    public void setPosition(String position) { this.position = position; }

    public String getAffiliation() {return affiliation;}

    public void setAffiliation(String affiliation) { this.affiliation = affiliation; }

    public String getEmail() {return email;}

    public void setEmail(String email) { this.email = email; }

    public String getPhone() {return phone;}

    public void setPhone(String phone) { this.phone = phone; }

    public String getFax() {return fax;}

    public void setFax(String fax) { this.fax= fax; }

    public String getAddress() {return address;}

    public void setAddress(String address) { this.address = address; }

    public String getCity() {return city;}

    public void setCity(String city) { this.city = city; }

    public String getCountry() {return country;}

    public void setCountry(String country) { this.country= country; }

    public String getZipcode() {return zipcode;}

    public void setZipcode(String zipcode) { this.zipcode = zipcode; }

    public String getComments() {return comments;}

    public void setComments(String comments) { this.comments = comments; }

    public String getStatus() {return status;}

    public void setStatus(String status) { this.status = status; }

    public String getAnswerOne() {return answerOne;}
    public void setAnswerOne(String answerOne) { this.answerOne = answerOne; }
    public String getAnswerTwo() {return answerTwo;}
    public void setAnswerTwo(String answerTwo) { this.answerTwo = answerTwo; }
    public String getStartingSemester() {return startingSemester;}
    public void setStartingSemester(String startingSemester) { this.startingSemester = startingSemester; }
    public String getExpectedGraduation() {return expectedGraduation;}
    public void setExpectedGraduation(String expectedGraduation) { this.expectedGraduation = expectedGraduation; }
    public String getDegreePlan() {return degreePlan;}
    public void setDegreePlan(String degreePlan) { this.degreePlan = degreePlan; }


    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public static CompletionStage<WSResponse> getAccountStatus(String username) {
        WSClient ws = play.test.WSTestClient.newClient(9005);

        String url = "http://localhost:9005/users/getAccountStatus?username=" + username;
        WSRequest request = ws.url(url);
        return request.addHeader("Content-Type", "application/json")
                .get()
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public static CompletionStage<WSResponse> getAccountInfo(String username) {
        WSClient ws = play.test.WSTestClient.newClient(9005);

        String url = "http://localhost:9005/users/" + username;
        WSRequest request = ws.url(url);
        return request.addHeader("Content-Type", "application/json")
                .get()
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    @AddCSRFToken
    public CompletionStage<WSResponse> updateUser(String username) {
        System.out.println("Update Info for User: " + username);
        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", username);
        res.put("researchArea", this.researchArea != null ? this.researchArea : "");
        res.put("title", this.title != null ? this.title : "");
        res.put("position", this.position != null ? this.position : "");
        res.put("affiliation", this.affiliation != null ? this.affiliation : "");
        res.put("email", this.email != null ? this.email : "");
        res.put("phone", this.phone != null ? this.phone : "");
        res.put("fax", this.fax != null ? this.fax : "");
        res.put("address", this.address != null ? this.address : "");
        res.put("city", this.city != null ? this.city : "");
        res.put("country", this.country != null ? this.country : "");
        res.put("zipcode", this.zipcode != null ? this.zipcode : "");
        res.put("comments", this.comments != null ? this.comments : "");
        res.put("status", this.status != null ? this.status : "");
        res.put("answerOne", this.answerOne != null ? this.answerOne : "");
        res.put("answerTwo", this.answerTwo != null ? this.answerTwo : "");
        res.put("startingSemester", this.startingSemester != null ? this.startingSemester : "");
        res.put("expectedGraduation", this.expectedGraduation != null ? this.expectedGraduation : "");
        res.put("degreePlan", this.degreePlan != null ? this.degreePlan : "");

        System.out.println(username);
        System.out.println(researchArea);
        System.out.println(title);
        System.out.println(position);
        System.out.println(affiliation);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(fax);
        System.out.println(address);
        System.out.println(city);
        System.out.println(country);
        System.out.println(zipcode);
        System.out.println(comments);
        System.out.println(status);
        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(startingSemester);
        System.out.println(expectedGraduation);
        System.out.println(degreePlan);


        WSRequest request = ws.url("http://localhost:9005/users/update");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    @AddCSRFToken
    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        res.put("firstname", this.firstname);
        res.put("lastname", this.lastname);


        System.out.println(username);
        System.out.println(password);
        System.out.println(firstname);
        System.out.println(lastname);

        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
