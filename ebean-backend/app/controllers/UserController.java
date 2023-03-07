package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
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
        String researchArea = req.get("researchArea").asText();
        String title = req.get("title").asText();
        String position = req.get("position").asText();
        String affiliation = req.get("affiliation").asText();
        String email = req.get("email").asText();
        String phone = req.get("phone").asText();
        String fax = req.get("fax").asText();
        String address = req.get("address").asText();
        String city = req.get("city").asText();
        String country = req.get("country").asText();
        String zipcode = req.get("zipcode").asText();
        String comments= req.get("comments").asText();
        String status = req.get("status").asText();

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
            user.researchArea=researchArea;
            user.title=title;
            user.position=position;
            user.affiliation=affiliation;
            user.email=email;
            user.phone=phone;
            user.fax=fax;
            user.address=address;
            user.city=city;
            user.country=country;
            user.zipcode=zipcode;
            user.comments=comments;
            user.status=status;

            user.save();
            result.put("body", username);
        }
        return ok(result);
    }

}
