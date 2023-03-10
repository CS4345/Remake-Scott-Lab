package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.*;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.shaded.ahc.io.netty.handler.codec.http.websocketx.WebSocketScheme.WS;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.login.render(""));
    }

    /**
     * Index page
     */
    public Result signup() {
        return ok(views.html.register.render(null));
    }

    public CompletionStage<Result> loginHandler() {

        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().checkAuthorized()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean()) {
                        System.out.println(r.asJson());
                        // add username to session
                        session("username",loginForm.get().getUsername());
                        String username = loginForm.get().getUsername();
//                        session("password",loginForm.get().getPosition());   // store username in session for your project
                        // redirect to index page, to display all categories

                        CompletableFuture<String> statusFuture = loginForm.get().getAccountStatus(username)
                                .thenApplyAsync((WSResponse response) -> {
                                    System.out.println(response.asJson());
                                    String status = String.valueOf(response.asJson().get("updateStatus"));
                                    System.out.println("Status: "+ status);
                                    return status;
                                }, ec.current())
                                .toCompletableFuture();

                        String status = statusFuture.join();
                        return ok(views.html.dashboard.render(status));

                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.login.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }
        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(login.render(""));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.register.render("Username already exists"));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> updateHandler() {
        String username = session().get("username");
        System.out.println("Retrieve from session: " + username);

        Form<User> updateProfileForm = formFactory.form(User.class).bindFromRequest();
        if (updateProfileForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }

        return updateProfileForm.get().updateUser(username)
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        CompletableFuture<String> statusFuture = User.getAccountStatus(username)
                                .thenApplyAsync((WSResponse response) -> {
                                    System.out.println(response.asJson());
                                    String status = String.valueOf(response.asJson().get("updateStatus"));
                                    System.out.println("Status: "+ status);
                                    return status;
                                }, ec.current())
                                .toCompletableFuture();

                        String status = statusFuture.join();
                        return ok(views.html.dashboard.render(status));
                    } else {
                        System.out.println("response null");
                        return ok(views.html.dashboard.render("nil"));
                    }
                }, ec.current());
    }
    public  CompletionStage<Result> applyHandler() {
        String username = session().get("username");
        System.out.println("User trying to apply: " + username);

        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/applicationForm/" + username);

        return request.get()
                .thenApplyAsync(response -> {
                    if (response.getStatus() == 200) {
                        String html = response.getBody();
                        return ok(html);
                    } else {
                        return ok("Failed to load application form");
                    }
                }, ec.current());
    }
    public  CompletionStage<Result> submissionHandler() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/submitApplication");

        return request.get()
                .thenApplyAsync(response -> {
                    if (response.getStatus() == 200) {
                        String html = response.getBody();
                        return ok(html);
                    } else {
                        return ok("Failed to load application form");
                    }
                }, ec.current());
    }
}