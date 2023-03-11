
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(status: String, firstname: String, lastname: String, aStatus: String, email: String, phone: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Job Dashboard</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script>
        $(document).ready(function()"""),format.raw/*15.37*/("""{"""),format.raw/*15.38*/("""
            """),format.raw/*16.13*/("""$('select').formSelect();
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/(""");
</script>
    <style>
        body """),format.raw/*20.14*/("""{"""),format.raw/*20.15*/("""
            """),format.raw/*21.13*/("""overflow-y: hidden;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        """),format.raw/*24.9*/(""".paper-modal """),format.raw/*24.22*/("""{"""),format.raw/*24.23*/("""
            """),format.raw/*25.13*/("""height: calc(100vh - 140px);
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin: 0 auto;
            overflow-y: scroll;
            position: relative;
            padding: 24px;
            width: calc(100% - 32px);
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""

        """),format.raw/*37.9*/(""".paper-modal-overlay """),format.raw/*37.30*/("""{"""),format.raw/*37.31*/("""
            """),format.raw/*38.13*/("""position: fixed;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: rgba(0, 0, 0, 0.6);
            /* semi-transparent black background */
            display: flex;
            justify-content: center;
            align-items: center;
            overflow-y: scroll;
            /* enable vertical scrolling */
            z-index: 100;
            /* ensure that the overlay is on top of other elements */
            opacity: 0;
            visibility: hidden;
            transition: opacity 0.5s ease, visibility 0s linear 0.5s;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""

        """),format.raw/*57.9*/(""".paper-modal-overlay.show """),format.raw/*57.35*/("""{"""),format.raw/*57.36*/("""
            """),format.raw/*58.13*/("""visibility: visible;
            opacity: 1;
            transition: opacity 0.5s ease, visibility 0s linear 0s;
            overflow-y: auto;
            /* add this line */
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/("""

        """),format.raw/*65.9*/("""header """),format.raw/*65.16*/("""{"""),format.raw/*65.17*/("""
            """),format.raw/*66.13*/("""height: 0px;
            display: flex;
            justify-content: center;
            align-items: center;
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""

        """),format.raw/*72.9*/(""".nav-wrapper """),format.raw/*72.22*/("""{"""),format.raw/*72.23*/("""
            """),format.raw/*73.13*/("""background-color: #6c63ff;
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""

        """),format.raw/*76.9*/(""".navbar """),format.raw/*76.17*/("""{"""),format.raw/*76.18*/("""
            """),format.raw/*77.13*/("""border-radius: 30px;
            width: 80%;
            max-width: 1200px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 20px;
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""

        """),format.raw/*86.9*/(""".dashboard-main """),format.raw/*86.25*/("""{"""),format.raw/*86.26*/("""
            """),format.raw/*87.13*/("""display: flex;
            flex-direction: row;
            width: 100vw;
            height: calc(100vh - 60px);
            background-color: rgba(0, 0, 0, 0.05);
            padding: 2%;
            overflow-y: hidden;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/(""".position-list """),format.raw/*96.24*/("""{"""),format.raw/*96.25*/("""
            """),format.raw/*97.13*/("""flex-grow: 1;
            overflow-y: scroll;
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""

        """),format.raw/*101.9*/(""".jobs-container """),format.raw/*101.25*/("""{"""),format.raw/*101.26*/("""
            """),format.raw/*102.13*/("""width: 70%;
            height: 100%;
            background-color: #fff;
            border-radius: 1.75rem;
            flex: 1;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""

        """),format.raw/*111.9*/(""".user-container """),format.raw/*111.25*/("""{"""),format.raw/*111.26*/("""
            """),format.raw/*112.13*/("""width: calc(100% - 70%);
            height: 100%;
            background-color: #fff;
            border-radius: 1.75rem;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
            margin-left: 2%;
        """),format.raw/*119.9*/("""}"""),format.raw/*119.10*/("""

        """),format.raw/*121.9*/(""".modal-header """),format.raw/*121.23*/("""{"""),format.raw/*121.24*/("""
            """),format.raw/*122.13*/("""font-size: 24px;
            font-weight: bold;
            display: flex;
            align-items: center;
            justify-content: center;
        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/("""

        """),format.raw/*129.9*/(""".modal-content """),format.raw/*129.24*/("""{"""),format.raw/*129.25*/("""
            """),format.raw/*130.13*/("""height: 100%;
            display: flex;
            flex-direction: column;
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""

        """),format.raw/*135.9*/(""".user-modal """),format.raw/*135.21*/("""{"""),format.raw/*135.22*/("""
            """),format.raw/*136.13*/("""width: 100%;
            /* background-color: gray; */
            height: 70%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""

        """),format.raw/*145.9*/("""#complete-profile-button """),format.raw/*145.34*/("""{"""),format.raw/*145.35*/("""
            """),format.raw/*146.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
            display: block;
            margin: 0 auto;
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""

        """),format.raw/*158.9*/("""#apply-general-button """),format.raw/*158.31*/("""{"""),format.raw/*158.32*/("""
            """),format.raw/*159.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""

        """),format.raw/*169.9*/("""#complete-profile-button:hover """),format.raw/*169.40*/("""{"""),format.raw/*169.41*/("""
            """),format.raw/*170.13*/("""background-color: #594dc2;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
        """),format.raw/*172.9*/("""}"""),format.raw/*172.10*/("""

        """),format.raw/*174.9*/("""#position-card """),format.raw/*174.24*/("""{"""),format.raw/*174.25*/("""
            """),format.raw/*175.13*/("""width: 98%;
            height: 30%;
            padding: 5px;
            border-radius: 10px;
            display: flex;
            flex-direction: row;
            align-items: center;
            border: 0.5px solid black;
            box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
            overflow-y: hidden;
        """),format.raw/*185.9*/("""}"""),format.raw/*185.10*/("""
    """),format.raw/*186.5*/("""</style>
</head>

<body>

    <nav>
        <div class="nav-wrapper">
            <a href="#" class="brand-logo center">Job Dashboard</a>
            <a href="#" data-target="mobile-menu" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
                <li><a href="#">Home</a></li>
                <li><a href="#">Applications</a></li>
                <li><a href="#">Contact Us</a></li>
            </ul>
        </div>
    </nav>

    <ul class="sidenav" id="mobile-menu">
        <li><a href="#">Home</a></li>
        <li><a href="#">Applications</a></li>
        <li><a href="#">Contact Us</a></li>
    </ul>

    <!-- Modal structure for jobs -->
    <div id="main-container" class="dashboard-main">
        <div id="jobs-modal" class="jobs-container">
            <div class="modal-content">
                <div id="jobs-post-title" style="
                        display: flex;
                        flex: 1;
                        justify-content: space-between;
                        padding-right: 24px;
                    ">
                    <h4>Featured Positions</h4>
                    <div style="
                            display: flex;
                            align-items: center;
                        ">
                        <button class="apply-general-button" id="apply-general-button" type="submit" name="action">Apply</button>
                    </div>
                </div>
                <p>List of current job openings here</p>
                <div id="position-list" class="position-list"></div>
            </div>
        </div>
        <div id="user-modal-container" class="user-container">
            <h4>Profile</h4>
            <div class="user-modal" id="user-modal"></div>
        </div>
    </div>

    <div class="paper-modal-overlay">
        <div class="paper-modal">
            <div class="modal-header">
                Edit Profile
            </div>
            <div class="modal-content">
                <form action=""""),_display_(/*243.32*/routes/*243.38*/.HomeController.updateHandler()),format.raw/*243.69*/("""" method="GET">

                    <div class="row">
                        <div class="input-field col s12">
                            <select id="researchArea" name="researchArea">
                                <option value="" disabled selected>Choose your research area</option>
                                <option value="Algorithm Development">Algorithm Development</option>
                                <option value="Software Engineering">Software Engineering</option>
                                <option value="Cyber Security">Cyber Security</option>
                                <option value="Data Science">Data Science</option>
                            </select>
                            <label>Research Area</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select id="title" name="title">
                                <option value="" disabled selected>Title</option>
                                <option value="Mr">Mr</option>
                                <option value="Ms">Ms</option>
                                <option value="Dr">Dr</option>
                                <option value="Sir">Sir</option>
                            </select>
                            <label>Title</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select id="position" name="position">
                                <option value="" disabled selected>Select Option</option>
                                <option value="Professor">Professor</option>
                                <option value="TA">TA</option>
                                <option value="Student">Student</option>
                                <option value="Heisenberg">Heisenberg</option>
                            </select>
                            <label>Position</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select id="affiliation" name="affiliation">
                                <option value="" disabled selected>Select Option</option>
                                <option value="Southern Methodist University">Southern Methodist University</option>
                                <option value="Other University">Other University</option>
                                <option value="Google">Google</option>
                            </select>
                            <label>Affiliation</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <input id="email" name="email" type="text" class="validate">
                            <label for="email">Email</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <input id="phone" name="phone" type="text" class="validate">
                            <label for="phone">Phone #</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <input id="fax" name="fax" type="text" class="validate">
                            <label for="fax">Fax</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <textarea name="address" id="address" cols="20" rows="5"></textarea>
                            <label for="address">Address</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <input id="city" name="city" type="text" class="validate">
                            <label for="city">City</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select id="country" name="country">
                                <option value="" disabled selected>Select Option</option>
                                <option value="United States">United States</option>
                                <option value="Canada">Canada</option>
                                <option value="Mexico">Mexico</option>
                            </select>
                            <label>Country</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <input id="zipcode" name="zipcode" type="text" class="validate">
                            <label for="zipcode">Zipcode</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">

                            <textarea name="comments" id="comments" cols="20" rows="5"></textarea>
                            <label for="comments">Comments</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select id="status" name="status">
                                <option value="" disabled selected>Select Option</option>
                                <option value="Faculty">Faculty</option>
                                <option value="Student">Student</option>
                                <option value="Staff">Staff</option>
                            </select>
                            <label>Status</label>
                        </div>
                    </div>
                    <div id="security-questions">
                        <div class="input-field col s6">
                            <input id="answerOne" name="answerOne" type="text" class="validate">
                            <label for="question1">Security Question 1: What street did you grow up on?</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="answerTwo" name="answerTwo" type="text" class="validate">
                            <label for="question2">Security Question 2: What's your mother's maiden name?</label>
                        </div>
                    </div>
                    <script>
                        $(document).ready(function () """),format.raw/*374.55*/("""{"""),format.raw/*374.56*/("""
                            """),format.raw/*375.29*/("""$('#status').on('change', function () """),format.raw/*375.67*/("""{"""),format.raw/*375.68*/("""
                                """),format.raw/*376.33*/("""if ($(this).val() == 'Student') """),format.raw/*376.65*/("""{"""),format.raw/*376.66*/("""
                                    """),format.raw/*377.37*/("""$('#degree-plan-field').show();
                                """),format.raw/*378.33*/("""}"""),format.raw/*378.34*/(""" """),format.raw/*378.35*/("""else """),format.raw/*378.40*/("""{"""),format.raw/*378.41*/("""
                                    """),format.raw/*379.37*/("""$('#degree-plan-field').hide();
                                """),format.raw/*380.33*/("""}"""),format.raw/*380.34*/("""
                            """),format.raw/*381.29*/("""}"""),format.raw/*381.30*/(""");
                        """),format.raw/*382.25*/("""}"""),format.raw/*382.26*/(""");
                    </script>

                    <div id="degree-plan-field" class="row" style="display: none;">
                        <div class="input-field col s12">
                            <select id="degreePlan" name="degreePlan">
                                <option value="" disabled selected>Select Degree Plan</option>
                                <option value="Ph.D.">Ph.D.</option>
                                <option value="D.E.-SE">D.E.-SE</option>
                                <option value="MS-CS">MS-CS</option>
                                <option value="MS-SE">MS-SE</option>
                                <option value="MS-Cybersecurity">MS-Cybersecurity</option>
                                <option value="BS-CS">BS-CS</option>
                                <option value="BA-CS">BA-CS</option>
                            </select>
                            <label for="degreePlan">Current Degree Plan</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="startingSemester" name="startingSemester" type="text" class="validate">
                            <label for="startingSemester">Starting Semester of Current Program (Semester, Year)</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="expectedGraduation" name="expectedGraduation" type="text" class="validate">
                            <label for="expectedGraduation">Expected Semester to Graduate (Semester, Year)</label>
                        </div>
                        <div class="input-field col s12">
                            <select id="coursesTaken" name="coursesTakenBefore[]" multiple>
                                <option value="" disabled>Select Courses Taken Before</option>
                                <option value="1">CS 4345</option>
                                <option value="2">CS 9999</option>
                                <option value="3">CS 4444</option>
                            </select>
                            <label for="coursesTakenBefore">Courses Taken Before</label>
                        </div>
                    </div>

                    <div class="input-field col s12">
                        <button id="complete-profile-button" type="submit" name="action">Submit</button>
                    </div>

                </form>
            </div>
        </div>
    </div>
    <div class="paper-modal-overlay" id="application-overlay">
        <div class="paper-modal">
            <div class="modal-header">
                TA Application
            </div>
            <div class="modal-content" id="applicationFormSection">
                <iframe id="my-frame" frameBorder="0" height="95%"></iframe>
            </div>
        </div>
    </div>

    <script src="assets/javascripts/fetchJobs.js"></script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*438.80*/status),format.raw/*438.86*/(""" """),format.raw/*438.87*/("""first="""),_display_(/*438.94*/firstname),format.raw/*438.103*/(""" """),format.raw/*438.104*/("""last="""),_display_(/*438.110*/lastname),format.raw/*438.118*/(""" """),format.raw/*438.119*/("""aStatus="""),_display_(/*438.128*/aStatus),format.raw/*438.135*/(""" """),format.raw/*438.136*/("""email="""),_display_(/*438.143*/email),format.raw/*438.148*/(""" """),format.raw/*438.149*/("""phone="""),_display_(/*438.156*/phone),format.raw/*438.161*/(""" """),format.raw/*438.162*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general-button")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("application-overlay");

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*450.63*/("""{"""),format.raw/*450.64*/("""
            """),format.raw/*451.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*453.30*/("""{"""),format.raw/*453.31*/("""
                """),format.raw/*454.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*455.13*/("""}"""),format.raw/*455.14*/(""", 0);
        """),format.raw/*456.9*/("""}"""),format.raw/*456.10*/(""");

        // Add a click even listener when user click "Apply" button
        applicationFormSection = document.getElementById("applicationFormSection");
        applyButton.addEventListener("click", () => """),format.raw/*460.53*/("""{"""),format.raw/*460.54*/("""paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*461.30*/("""{"""),format.raw/*461.31*/("""
                """),format.raw/*462.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*463.13*/("""}"""),format.raw/*463.14*/(""", 0);
            fetch('/applicationForm')
                    .then(response => response.text())
                    .then(html => """),format.raw/*466.35*/("""{"""),format.raw/*466.36*/("""
                        """),format.raw/*467.25*/("""frame = document.getElementById("my-frame");
                        frame.srcdoc = html;

                        // Create a new DOM parser
                        const parser = new DOMParser();

                        // Parse the iframe's srcdoc content into a new document
                        const iframeDoc = parser.parseFromString(frame.srcdoc, "text/html");

                        // Find the form element by its ID
                        const applyForm = iframeDoc.getElementById("applyForm");

                        // Get the action URL from the form's "action" attribute
                        const actionUrl = applyForm.getAttribute("action");

                        // Prepend "localhost" to the action URL
                        const newActionUrl = "http://localhost:9005" + actionUrl;

                        // Set the new action URL on the form's "action" attribute
                        applyForm.setAttribute("action", newActionUrl);

                        // Update the iframe's srcdoc content with the modified document
                        frame.srcdoc = iframeDoc.documentElement.outerHTML;
                    """),format.raw/*490.21*/("""}"""),format.raw/*490.22*/(""")
                    .catch(error => """),format.raw/*491.37*/("""{"""),format.raw/*491.38*/("""
                        """),format.raw/*492.25*/("""console.log(error);
                        // Handle the error
                    """),format.raw/*494.21*/("""}"""),format.raw/*494.22*/(""");
        """),format.raw/*495.9*/("""}"""),format.raw/*495.10*/(""");

        // Add a click event listener to the paper modal overlay
        paperModalOverlay.addEventListener("click", (event) => """),format.raw/*498.64*/("""{"""),format.raw/*498.65*/("""
            """),format.raw/*499.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlay) """),format.raw/*500.53*/("""{"""),format.raw/*500.54*/("""
                """),format.raw/*501.17*/("""paperModalOverlay.classList.remove("show");
                setTimeout(() => """),format.raw/*502.34*/("""{"""),format.raw/*502.35*/("""
                    """),format.raw/*503.21*/("""paperModalOverlay.style.display = "none";
                """),format.raw/*504.17*/("""}"""),format.raw/*504.18*/(""", 500);
            """),format.raw/*505.13*/("""}"""),format.raw/*505.14*/("""
        """),format.raw/*506.9*/("""}"""),format.raw/*506.10*/(""");
        // Add a click event listener to the paper modal overlay
        paperModalOverlayApply.addEventListener("click", (event) => """),format.raw/*508.69*/("""{"""),format.raw/*508.70*/("""
            """),format.raw/*509.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlayApply) """),format.raw/*510.58*/("""{"""),format.raw/*510.59*/("""
                """),format.raw/*511.17*/("""paperModalOverlayApply.classList.remove("show");
                setTimeout(() => """),format.raw/*512.34*/("""{"""),format.raw/*512.35*/("""
                    """),format.raw/*513.21*/("""paperModalOverlayApply.style.display = "none";
                """),format.raw/*514.17*/("""}"""),format.raw/*514.18*/(""", 500);
            """),format.raw/*515.13*/("""}"""),format.raw/*515.14*/("""
        """),format.raw/*516.9*/("""}"""),format.raw/*516.10*/(""");
    </script>
    <script>
            var jobData;
            fetch('/positions')
                    .then(response => response.json())
                    .then(data => """),format.raw/*522.35*/("""{"""),format.raw/*522.36*/("""
                        """),format.raw/*523.25*/("""console.log(data);
                        jobData = data;
                        if (typeof jobData === "string") """),format.raw/*525.58*/("""{"""),format.raw/*525.59*/(""" """),format.raw/*525.60*/("""// Check if jobData is a string
                            jobData = JSON.parse(jobData); // Convert the string to an array
                        """),format.raw/*527.25*/("""}"""),format.raw/*527.26*/("""
                        """),format.raw/*528.25*/("""// Do something with the responseData variable
                        console.log(jobData);
                        const positionList = document.getElementById('position-list');
                        const jobCards = jobData.map(job => `
                                <div id="position-card" class="position-card">
                                    <img src="https://styles.redditmedia.com/t5_2rpt9/styles/communityIcon_iyl98xuwsp251.png" alt="Southern Methodist University: Home of the Mustangs" data-noaft="1" style="width: 128px; height: 128px; margin: 0px;">
                                        <div id="job-description" class="job-description" style="
                                            display: flex;
                                            flex-direction: column;
                                            /* background-color: yellow; */
                                        ">
                                            <h5 style="
                                                font-weight: bold;
                                            ">$"""),format.raw/*541.48*/("""{"""),format.raw/*541.49*/("""job.courseTitle"""),format.raw/*541.64*/("""}"""),format.raw/*541.65*/("""</h5>
                                            <h7 style="
                                                color: #888;
                                                font-weight: normal;
                                            ">$$"""),format.raw/*545.49*/("""{"""),format.raw/*545.50*/("""job.pay"""),format.raw/*545.57*/("""}"""),format.raw/*545.58*/(""", $"""),format.raw/*545.61*/("""{"""),format.raw/*545.62*/("""job.hours"""),format.raw/*545.71*/("""}"""),format.raw/*545.72*/(""" """),format.raw/*545.73*/("""hours</h7>
                                            <h7 style="
                                                color: #888;
                                                font-weight: normal;
                                            ">Faculty: $"""),format.raw/*549.57*/("""{"""),format.raw/*549.58*/("""job.faculty"""),format.raw/*549.69*/("""}"""),format.raw/*549.70*/("""</h7>
                                        </div>
                                    <div id="job-description" class="job-description" style="
                                        display: flex;
                                        flex: 1;
                                        flex-direction: row;
                                        /* background-color: yellow; */
                                        justify-content: flex-end;
                                        padding-right: 10px;
                                    ">
                                        <h5>View details</h5>
                                    </div>
                                </div>
                            <br/>
                        `).join('');
                        positionList.innerHTML = jobCards;
                    """),format.raw/*565.21*/("""}"""),format.raw/*565.22*/(""")
                    .catch(error => console.error(error));
    </script>

</body>

"""))
      }
    }
  }

  def render(status:String,firstname:String,lastname:String,aStatus:String,email:String,phone:String): play.twirl.api.HtmlFormat.Appendable = apply(status,firstname,lastname,aStatus,email,phone)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (status,firstname,lastname,aStatus,email,phone) => apply(status,firstname,lastname,aStatus,email,phone)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-10T22:53:48.186
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab - Copy/Frontend/app/views/dashboard.scala.html
                  HASH: d0a75a61ff3f1799adef97901b703a56e3d85855
                  MATRIX: 987->1|1183->101|1211->103|1907->771|1936->772|1978->786|2040->821|2069->822|2138->863|2167->864|2209->878|2265->907|2294->908|2333->920|2374->933|2403->934|2445->948|2832->1308|2861->1309|2900->1321|2949->1342|2978->1343|3020->1357|3672->1982|3701->1983|3740->1995|3794->2021|3823->2022|3865->2036|4080->2224|4109->2225|4148->2237|4183->2244|4212->2245|4254->2259|4403->2381|4432->2382|4471->2394|4512->2407|4541->2408|4583->2422|4646->2458|4675->2459|4714->2471|4750->2479|4779->2480|4821->2494|5072->2718|5101->2719|5140->2731|5184->2747|5213->2748|5255->2762|5519->2999|5548->3000|5587->3012|5630->3027|5659->3028|5701->3042|5784->3098|5813->3099|5853->3111|5898->3127|5928->3128|5971->3142|6227->3370|6257->3371|6297->3383|6342->3399|6372->3400|6415->3414|6692->3663|6722->3664|6762->3676|6805->3690|6835->3691|6878->3705|7064->3863|7094->3864|7134->3876|7178->3891|7208->3892|7251->3906|7367->3994|7397->3995|7437->4007|7478->4019|7508->4020|7551->4034|7807->4262|7837->4263|7877->4275|7931->4300|7961->4301|8004->4315|8345->4628|8375->4629|8415->4641|8466->4663|8496->4664|8539->4678|8822->4933|8852->4934|8892->4946|8952->4977|8982->4978|9025->4992|9147->5086|9177->5087|9217->5099|9261->5114|9291->5115|9334->5129|9696->5463|9726->5464|9760->5470|11904->7586|11920->7592|11973->7623|19118->14739|19148->14740|19207->14770|19274->14808|19304->14809|19367->14843|19428->14875|19458->14876|19525->14914|19619->14979|19649->14980|19679->14981|19713->14986|19743->14987|19810->15025|19904->15090|19934->15091|19993->15121|20023->15122|20080->15150|20110->15151|23235->18248|23263->18254|23293->18255|23328->18262|23360->18271|23391->18272|23426->18278|23457->18286|23488->18287|23526->18296|23556->18303|23587->18304|23623->18311|23651->18316|23682->18317|23718->18324|23746->18329|23777->18330|24487->19011|24517->19012|24560->19026|24706->19143|24736->19144|24783->19162|24866->19216|24896->19217|24939->19232|24969->19233|25210->19445|25240->19446|25341->19518|25371->19519|25418->19537|25506->19596|25536->19597|25701->19733|25731->19734|25786->19760|27000->20945|27030->20946|27098->20985|27128->20986|27183->21012|27298->21098|27328->21099|27368->21111|27398->21112|27562->21247|27592->21248|27635->21262|27782->21380|27812->21381|27859->21399|27966->21477|27996->21478|28047->21500|28135->21559|28165->21560|28215->21581|28245->21582|28283->21592|28313->21593|28480->21731|28510->21732|28553->21746|28705->21869|28735->21870|28782->21888|28894->21971|28924->21972|28975->21994|29068->22058|29098->22059|29148->22080|29178->22081|29216->22091|29246->22092|29457->22274|29487->22275|29542->22301|29689->22419|29719->22420|29749->22421|29929->22572|29959->22573|30014->22599|31141->23697|31171->23698|31215->23713|31245->23714|31518->23958|31548->23959|31584->23966|31614->23967|31646->23970|31676->23971|31714->23980|31744->23981|31774->23982|32060->24239|32090->24240|32130->24251|32160->24252|33050->25113|33080->25114
                  LINES: 28->1|33->1|34->2|47->15|47->15|48->16|49->17|49->17|52->20|52->20|53->21|54->22|54->22|56->24|56->24|56->24|57->25|67->35|67->35|69->37|69->37|69->37|70->38|87->55|87->55|89->57|89->57|89->57|90->58|95->63|95->63|97->65|97->65|97->65|98->66|102->70|102->70|104->72|104->72|104->72|105->73|106->74|106->74|108->76|108->76|108->76|109->77|116->84|116->84|118->86|118->86|118->86|119->87|126->94|126->94|128->96|128->96|128->96|129->97|131->99|131->99|133->101|133->101|133->101|134->102|141->109|141->109|143->111|143->111|143->111|144->112|151->119|151->119|153->121|153->121|153->121|154->122|159->127|159->127|161->129|161->129|161->129|162->130|165->133|165->133|167->135|167->135|167->135|168->136|175->143|175->143|177->145|177->145|177->145|178->146|188->156|188->156|190->158|190->158|190->158|191->159|199->167|199->167|201->169|201->169|201->169|202->170|204->172|204->172|206->174|206->174|206->174|207->175|217->185|217->185|218->186|275->243|275->243|275->243|406->374|406->374|407->375|407->375|407->375|408->376|408->376|408->376|409->377|410->378|410->378|410->378|410->378|410->378|411->379|412->380|412->380|413->381|413->381|414->382|414->382|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|470->438|482->450|482->450|483->451|485->453|485->453|486->454|487->455|487->455|488->456|488->456|492->460|492->460|493->461|493->461|494->462|495->463|495->463|498->466|498->466|499->467|522->490|522->490|523->491|523->491|524->492|526->494|526->494|527->495|527->495|530->498|530->498|531->499|532->500|532->500|533->501|534->502|534->502|535->503|536->504|536->504|537->505|537->505|538->506|538->506|540->508|540->508|541->509|542->510|542->510|543->511|544->512|544->512|545->513|546->514|546->514|547->515|547->515|548->516|548->516|554->522|554->522|555->523|557->525|557->525|557->525|559->527|559->527|560->528|573->541|573->541|573->541|573->541|577->545|577->545|577->545|577->545|577->545|577->545|577->545|577->545|577->545|581->549|581->549|581->549|581->549|597->565|597->565
                  -- GENERATED --
              */
          