package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class User {

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



    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        res.put("firstname", this.firstname);
        res.put("lastname", this.lastname);
        res.put("researchArea", this.researchArea);
        res.put("title", this.title);
        res.put("position", this.position);
        res.put("affiliation", this.affiliation);
        res.put("email", this.email);
        res.put("phone", this.phone);
        res.put("fax", this.fax);
        res.put("address", this.address);
        res.put("city", this.city);
        res.put("country", this.country);
        res.put("zipcode", this.zipcode);
        res.put("comments", this.comments);
        res.put("status", this.status);


        System.out.println(username);
        System.out.println(password);
        System.out.println(firstname);
        System.out.println(lastname);
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


        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
