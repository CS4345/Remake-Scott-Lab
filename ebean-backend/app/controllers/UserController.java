package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.data.validation.ValidationError;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * @description: user reg/login
 * @author: Swati Bhat
 * @create: 2019-11-16 15:15
 */

public class UserController extends Controller {

    public Result authenticate() {

        System.out.println("In authenticate");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();

        try {
            User user = User.findByName(username); // ( match where username and password both match )
            if(user!=null && username.equals(user.username) && password.equals(user.password)){
                return ok("true");
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }

    }

    /**
     *
     */
    public Result updateAccount() {
        ObjectNode result = null;

        try {
            JsonNode req = request().body().asJson();
            System.out.println(req);
            String username = req.get("username").asText();
            String researchArea = req.get("researchArea").asText();
            String title = req.get("title").asText();
            System.out.println("Passed title");
            String position = req.get("position").asText();
            String affiliation = req.get("affiliation").asText();
            String email = req.get("email").asText();
            String phone = req.get("phone").asText();
            String fax = req.get("fax").asText();
            String address = req.get("address").asText();
            String city = req.get("city").asText();
            String country = req.get("country").asText();
            String zipcode = req.get("zipcode").asText();
            String comments = req.get("comments").asText();
            String status = req.get("status").asText();

            System.out.println("Update for: " + username);
            if (username == null || username.isEmpty()) {
                System.out.println("Bad request");
                return badRequest();
            }

            System.out.println("Username is not null, continue");

            User user = User.findByName(username);

            if (user != null) {
                System.out.println("current user");
                result = Json.newObject();

                user.setResearchArea(researchArea);
                user.setTitle(title);
                user.setPosition(position);
                user.setAffiliation(affiliation);
                user.setEmail(email);
                user.setPhone(phone);
                user.setFax(fax);
                user.setAddress(address);
                user.setCity(city);
                user.setCountry(country);
                user.setZipcode(zipcode);
                user.setComments(comments);
                user.setStatus(status);

                user.update();

                System.out.println("SAVED: " + user.zipcode + " " + User.findByName(username).zipcode);
                result.put("body", username);
            }
            return ok(result);
        } catch (Exception e ) {
            System.out.println("Exception in update");
            return badRequest();
        }
    }

    /**
     * When a user register, check if the username is taken
     * save to database if valid
     * POST
     * @return success if valid, fail if already taken
     */
    public Result registerNew() {
        System.out.println("In register");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();
        String firstname = req.get("firstname").asText();
        String lastname = req.get("lastname").asText();

        User u = User.findByName(username);
        ObjectNode result = null;
        if (u == null) {
            System.out.println("new user");
            result = Json.newObject();
            User user = new User();
            user.username=username;
            user.password=password;
            user.firstname=firstname;
            user.lastname=lastname;

            user.save();
            result.put("body", username);
        }
        return ok(result);
    }

    // Add by Eric
    public Result checkUpdateStatus() {
        System.out.print("Checking account completion status for: ");

        // Retrieve the value of the "name" parameter
        String username = request().getQueryString("username");
        System.out.println(username); // Outputs: Username

        if (username == null) {
            return ok("Empty username");
        }

        ObjectNode result = null;
        try {
            // Retrieve the account
            User u = User.findByUsername(username);
            if (u != null) {
                result = Json.newObject();

                boolean updateStatus = User.isCompletedProfile(u);

                System.out.println("Status: "+ updateStatus);
                // Put the status
                result.put("updateStatus", updateStatus);
            }
        } catch (Exception e) {
            ok("Failed to validate");
        }
        return ok(result);
    }
}
