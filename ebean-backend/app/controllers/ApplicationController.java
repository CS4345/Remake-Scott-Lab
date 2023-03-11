package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import models.Application;
import java.util.*;
import play.Logger;
import scala.collection.*;
import java.sql.*;
import javax.inject.Inject;
import scala.concurrent.*;
import play.api.*;
import play.api.libs.json.*;
import java.sql.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ApplicationController extends Controller {
    /**
     * used to apply to a position
     * POST
     *
     * @return
     */
    public Result apply() {
        return ok(Json.toJson("Application to nothing successful!"));
    }

    /**
     * returns applications by position_id or application_id
     * GET
     *
     * @return
     */
    public Result retrieveApplications(Long position_id) {
        return ok(Json.toJson("Application to nothing successful!"));
    }

    /**
     * returns applications by user_id, position_id, or application_id
     * GET
     *
     * @return
     */
    public Result retrieveApplications() {
        JsonNode req = request().body().asJson();
        HashMap<String, Long> map = new HashMap<String, Long>();
        req.fields().forEachRemaining(entry -> {
            map.put(entry.getKey(), entry.getValue().asLong());
        });
        // Get the first key in the map
        String key = map.keySet().iterator().next();
        // Get the value associated with the first key
        Long val = map.get(key);
        System.out.println("Getting all applications by " + key + " with value " + val);
        try {
            Application app;
            switch (key) {
                case "user_id":
                    app = Application.findByUserId(val);
                    break;
                case "position_id":
                    app = Application.findByPositionId(val);
                    break;
                case "application_id":
                    app = Application.findByApplicationId(val);
                    break;
                default:
                    app = null;
                    break;
            }
            if (app != null) {
                return ok(Json.toJson(app));
            } else {
                return ok(Json.toJson("No applications found!"));
            }
        }
        catch (Exception e) {
            return ok(Json.toJson("Request unsuccessful. Remember to use user_id, position_id, or application_id!"));
        }
    }
    public Result deleteApplication() {
        return ok(Json.toJson("Absolutely nothing was deleted!"));
    }
    public Result showApplicationForm(String username) throws SQLException {
        System.out.println("showing application");
        User user = User.findByUsername(username);
        List<models.Position> positions = models.Position.getAllPositions();
        Form<ApplicationFormData> applicationForm = Form.form(ApplicationFormData.class).bindFromRequest();
        System.out.println("Application form for user " + user.username);
        for (int i = 0; i < positions.size(); i++) {
            System.out.println("Position " + i + ": " + positions.get(i).courseTitle);
        }
        Seq<Position> seq = JavaConverters.asScalaBufferConverter(positions).asScala().toSeq();
        return ok(views.html.applicationForm.render(user, seq, applicationForm));
    }
    public Result submitApplication(String username) throws SQLException {
        Form<ApplicationFormData> applicationForm = Form.form(ApplicationFormData.class).bindFromRequest();
        System.out.println("Submitting application");
        if(applicationForm.hasErrors()) {
            return badRequest(views.html.applicationForm.render(null, null, null));
        } else {
            System.out.println("Application Information:");
            System.out.println("Pref 1: " + applicationForm.get().getPref_one());
            System.out.println("Pref 2: " + applicationForm.get().getPref_two());
            System.out.println("Pref 3: " + applicationForm.get().getPref_three());
            System.out.println("Courses taken: " + applicationForm.get().getCoursesTaken());
            Application app = new Application();
            app.user = User.findByUsername(username);
            app.setPref_one(applicationForm.get().getPref_one());
            app.setPref_two(applicationForm.get().getPref_two());
            app.setPref_three(applicationForm.get().getPref_three());
            String[] coursesTakenArr = applicationForm.get().getCoursesTaken();
            String coursesTakenStr = "";
            if (coursesTakenArr != null) {
                for (int i = 0; i < coursesTakenArr.length; i++) {
                    coursesTakenStr += coursesTakenArr[i];
                    if (i != coursesTakenArr.length - 1) {
                        coursesTakenStr += ",";
                    }
                }
            }
            app.user.setCoursesTaken(coursesTakenStr);
            app.save();
            app.user.update();

            return ok("Application submitted successfully!");
        }
    }
}