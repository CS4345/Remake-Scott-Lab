package controllers;
import models.Position;
import models.User;
import play.Logger;
import play.libs.Json;
import play.mvc.*;
import scala.collection.JavaConverters;
import scala.collection.Seq;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    public Result index() {
        return ok(Json.toJson("Welcome to backend!"));
    }
    public Result info() {
        Long id = 1L;
        User user = User.find.byId(id);
        List<String> infos = new ArrayList<String>();
        infos.add("Username: "+ user.username);
        infos.add("Password: "+user.password);
        infos.add("Firstname: "+user.firstname);
        Seq<String> infoSeq = JavaConverters.asScalaBufferConverter(infos).asScala().toSeq();
        Logger.info("infos"+ infoSeq);
        return ok(views.html.info.render(infoSeq));
    }
    public Result getPositions() throws SQLException {
        List<Position> positions = Position.getAllPositions();
        String json = "[";
        for (int i = 0; i < positions.size(); i++) {
            json += positions.get(i).toJsonString();
            if (i != positions.size() - 1) {
                json += ",";
            }
        }
        json += "]";
        System.out.println("JSON: " + json);
        return ok(Json.toJson(json));
    }
}
