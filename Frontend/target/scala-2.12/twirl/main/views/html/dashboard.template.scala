
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


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
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
                            <input id="expectedSemester" name="expectedSemester" type="text" class="validate">
                            <label for="expectedSemester">Expected Semester to Graduate (Semester, Year)</label>
                        </div>
                        <div class="input-field col s12">
                            <select id="coursesTakenBefore" name="coursesTakenBefore[]" multiple>
                                <option value="" disabled selected>Select Courses Taken Before</option>
                                <option value="Course1">Course1</option>
                                <option value="Course2">Course2</option>
                                <option value="Course3">Course3</option>
                                <option value="Course4">Course4</option>
                                <option value="Course5">Course5</option>
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

            </div>
        </div>
    </div>

    <script src="assets/javascripts/fetchJobs.js"></script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*440.80*/status),format.raw/*440.86*/(""" """),format.raw/*440.87*/("""first="""),_display_(/*440.94*/firstname),format.raw/*440.103*/(""" """),format.raw/*440.104*/("""last="""),_display_(/*440.110*/lastname),format.raw/*440.118*/(""" """),format.raw/*440.119*/("""aStatus="""),_display_(/*440.128*/aStatus),format.raw/*440.135*/(""" """),format.raw/*440.136*/("""email="""),_display_(/*440.143*/email),format.raw/*440.148*/(""" """),format.raw/*440.149*/("""phone="""),_display_(/*440.156*/phone),format.raw/*440.161*/(""" """),format.raw/*440.162*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general-button")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("application-overlay");

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*452.63*/("""{"""),format.raw/*452.64*/("""
            """),format.raw/*453.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*455.30*/("""{"""),format.raw/*455.31*/("""
                """),format.raw/*456.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*457.13*/("""}"""),format.raw/*457.14*/(""", 0);
        """),format.raw/*458.9*/("""}"""),format.raw/*458.10*/(""");

        // Add a click even listener when user click "Apply" button
        applicationFormSection = document.getElementById("applicationFormSection");
        applyButton.addEventListener("click", () => """),format.raw/*462.53*/("""{"""),format.raw/*462.54*/("""paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*463.30*/("""{"""),format.raw/*463.31*/("""
                """),format.raw/*464.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*465.13*/("""}"""),format.raw/*465.14*/(""", 0);
            fetch('/applicationForm')
                    .then(response => response.text())
                    .then(html => """),format.raw/*468.35*/("""{"""),format.raw/*468.36*/("""
                        """),format.raw/*469.25*/("""// Display the HTML in the application form section of the dashboard
                        applicationFormSection.innerHTML = html;
                    """),format.raw/*471.21*/("""}"""),format.raw/*471.22*/(""")
                    .catch(error => """),format.raw/*472.37*/("""{"""),format.raw/*472.38*/("""
                        """),format.raw/*473.25*/("""console.log(error);
                        // Handle the error
                    """),format.raw/*475.21*/("""}"""),format.raw/*475.22*/(""");
        """),format.raw/*476.9*/("""}"""),format.raw/*476.10*/(""");

        // Add a click event listener to the paper modal overlay
        paperModalOverlay.addEventListener("click", (event) => """),format.raw/*479.64*/("""{"""),format.raw/*479.65*/("""
            """),format.raw/*480.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlay) """),format.raw/*481.53*/("""{"""),format.raw/*481.54*/("""
                """),format.raw/*482.17*/("""paperModalOverlay.classList.remove("show");
                setTimeout(() => """),format.raw/*483.34*/("""{"""),format.raw/*483.35*/("""
                    """),format.raw/*484.21*/("""paperModalOverlay.style.display = "none";
                """),format.raw/*485.17*/("""}"""),format.raw/*485.18*/(""", 500);
            """),format.raw/*486.13*/("""}"""),format.raw/*486.14*/("""
        """),format.raw/*487.9*/("""}"""),format.raw/*487.10*/(""");
        // Add a click event listener to the paper modal overlay
        paperModalOverlayApply.addEventListener("click", (event) => """),format.raw/*489.69*/("""{"""),format.raw/*489.70*/("""
            """),format.raw/*490.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlayApply) """),format.raw/*491.58*/("""{"""),format.raw/*491.59*/("""
                """),format.raw/*492.17*/("""paperModalOverlayApply.classList.remove("show");
                setTimeout(() => """),format.raw/*493.34*/("""{"""),format.raw/*493.35*/("""
                    """),format.raw/*494.21*/("""paperModalOverlayApply.style.display = "none";
                """),format.raw/*495.17*/("""}"""),format.raw/*495.18*/(""", 500);
            """),format.raw/*496.13*/("""}"""),format.raw/*496.14*/("""
        """),format.raw/*497.9*/("""}"""),format.raw/*497.10*/(""");
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
                  DATE: 2023-03-10T15:27:58.694
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: 1bed8b922ab3b629595b9522b5bc9d5c8c09a23d
                  MATRIX: 987->1|1181->102|1864->757|1893->758|1934->771|1995->805|2024->806|2090->844|2119->845|2160->858|2215->886|2244->887|2281->897|2322->910|2351->911|2392->924|2769->1274|2798->1275|2835->1285|2884->1306|2913->1307|2954->1320|3589->1928|3618->1929|3655->1939|3709->1965|3738->1966|3779->1979|3989->2162|4018->2163|4055->2173|4090->2180|4119->2181|4160->2194|4305->2312|4334->2313|4371->2323|4412->2336|4441->2337|4482->2350|4544->2385|4573->2386|4610->2396|4646->2404|4675->2405|4716->2418|4960->2635|4989->2636|5026->2646|5070->2662|5099->2663|5140->2676|5397->2906|5426->2907|5463->2917|5506->2932|5535->2933|5576->2946|5657->3000|5686->3001|5724->3011|5769->3027|5799->3028|5841->3041|6090->3262|6120->3263|6158->3273|6203->3289|6233->3290|6275->3303|6545->3545|6575->3546|6613->3556|6656->3570|6686->3571|6728->3584|6909->3737|6939->3738|6977->3748|7021->3763|7051->3764|7093->3777|7206->3862|7236->3863|7274->3873|7315->3885|7345->3886|7387->3899|7636->4120|7666->4121|7704->4131|7758->4156|7788->4157|7830->4170|8161->4473|8191->4474|8229->4484|8280->4506|8310->4507|8352->4520|8627->4767|8657->4768|8695->4778|8755->4809|8785->4810|8827->4823|8947->4915|8977->4916|9015->4926|9059->4941|9089->4942|9131->4955|9483->5279|9513->5280|9546->5285|11633->7344|11649->7350|11702->7381|18716->14366|18746->14367|18804->14396|18871->14434|18901->14435|18963->14468|19024->14500|19054->14501|19120->14538|19213->14602|19243->14603|19273->14604|19307->14609|19337->14610|19403->14647|19496->14711|19526->14712|19584->14741|19614->14742|19670->14769|19700->14770|22866->17908|22894->17914|22924->17915|22959->17922|22991->17931|23022->17932|23057->17938|23088->17946|23119->17947|23157->17956|23187->17963|23218->17964|23254->17971|23282->17976|23313->17977|23349->17984|23377->17989|23408->17990|24106->18659|24136->18660|24178->18673|24322->18788|24352->18789|24398->18806|24480->18859|24510->18860|24552->18874|24582->18875|24819->19083|24849->19084|24949->19155|24979->19156|25025->19173|25112->19231|25142->19232|25304->19365|25334->19366|25388->19391|25571->19545|25601->19546|25668->19584|25698->19585|25752->19610|25865->19694|25895->19695|25934->19706|25964->19707|26125->19839|26155->19840|26197->19853|26343->19970|26373->19971|26419->19988|26525->20065|26555->20066|26605->20087|26692->20145|26722->20146|26771->20166|26801->20167|26838->20176|26868->20177|27033->20313|27063->20314|27105->20327|27256->20449|27286->20450|27332->20467|27443->20549|27473->20550|27523->20571|27615->20634|27645->20635|27694->20655|27724->20656|27761->20665|27791->20666
                  LINES: 28->1|33->2|46->15|46->15|47->16|48->17|48->17|51->20|51->20|52->21|53->22|53->22|55->24|55->24|55->24|56->25|66->35|66->35|68->37|68->37|68->37|69->38|86->55|86->55|88->57|88->57|88->57|89->58|94->63|94->63|96->65|96->65|96->65|97->66|101->70|101->70|103->72|103->72|103->72|104->73|105->74|105->74|107->76|107->76|107->76|108->77|115->84|115->84|117->86|117->86|117->86|118->87|125->94|125->94|127->96|127->96|127->96|128->97|130->99|130->99|132->101|132->101|132->101|133->102|140->109|140->109|142->111|142->111|142->111|143->112|150->119|150->119|152->121|152->121|152->121|153->122|158->127|158->127|160->129|160->129|160->129|161->130|164->133|164->133|166->135|166->135|166->135|167->136|174->143|174->143|176->145|176->145|176->145|177->146|187->156|187->156|189->158|189->158|189->158|190->159|198->167|198->167|200->169|200->169|200->169|201->170|203->172|203->172|205->174|205->174|205->174|206->175|216->185|216->185|217->186|274->243|274->243|274->243|405->374|405->374|406->375|406->375|406->375|407->376|407->376|407->376|408->377|409->378|409->378|409->378|409->378|409->378|410->379|411->380|411->380|412->381|412->381|413->382|413->382|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|471->440|483->452|483->452|484->453|486->455|486->455|487->456|488->457|488->457|489->458|489->458|493->462|493->462|494->463|494->463|495->464|496->465|496->465|499->468|499->468|500->469|502->471|502->471|503->472|503->472|504->473|506->475|506->475|507->476|507->476|510->479|510->479|511->480|512->481|512->481|513->482|514->483|514->483|515->484|516->485|516->485|517->486|517->486|518->487|518->487|520->489|520->489|521->490|522->491|522->491|523->492|524->493|524->493|525->494|526->495|526->495|527->496|527->496|528->497|528->497
                  -- GENERATED --
              */
          