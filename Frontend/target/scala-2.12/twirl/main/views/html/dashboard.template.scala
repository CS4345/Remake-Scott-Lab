
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(status: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
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
    <style>
        body """),format.raw/*15.14*/("""{"""),format.raw/*15.15*/("""
            """),format.raw/*16.13*/("""overflow-y: hidden;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""

        """),format.raw/*19.9*/(""".paper-modal """),format.raw/*19.22*/("""{"""),format.raw/*19.23*/("""
            """),format.raw/*20.13*/("""height: calc(100vh - 140px);
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin: 0 auto;
            overflow-y: scroll;
            position: relative;
            padding: 24px;
            width: calc(100% - 32px);
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""

        """),format.raw/*32.9*/(""".paper-modal-overlay """),format.raw/*32.30*/("""{"""),format.raw/*32.31*/("""
            """),format.raw/*33.13*/("""position: fixed;
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
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""

        """),format.raw/*52.9*/(""".paper-modal-overlay.show """),format.raw/*52.35*/("""{"""),format.raw/*52.36*/("""
            """),format.raw/*53.13*/("""visibility: visible;
            opacity: 1;
            transition: opacity 0.5s ease, visibility 0s linear 0s;
            overflow-y: auto;
            /* add this line */
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

        """),format.raw/*60.9*/("""header """),format.raw/*60.16*/("""{"""),format.raw/*60.17*/("""
            """),format.raw/*61.13*/("""height: 0px;
            display: flex;
            justify-content: center;
            align-items: center;
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/("""

        """),format.raw/*67.9*/(""".nav-wrapper """),format.raw/*67.22*/("""{"""),format.raw/*67.23*/("""
            """),format.raw/*68.13*/("""background-color: #6c63ff;
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""

        """),format.raw/*71.9*/(""".navbar """),format.raw/*71.17*/("""{"""),format.raw/*71.18*/("""
            """),format.raw/*72.13*/("""border-radius: 30px;
            width: 80%;
            max-width: 1200px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 20px;
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""

        """),format.raw/*81.9*/(""".dashboard-main """),format.raw/*81.25*/("""{"""),format.raw/*81.26*/("""
            """),format.raw/*82.13*/("""display: flex;
            flex-direction: row;
            width: 100vw;
            height: calc(100vh - 60px);
            background-color: rgba(0, 0, 0, 0.05);
            padding: 2%;
            overflow-y: hidden;
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/("""

        """),format.raw/*91.9*/(""".position-list """),format.raw/*91.24*/("""{"""),format.raw/*91.25*/("""
            """),format.raw/*92.13*/("""flex-grow: 1;
            overflow-y: scroll;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/(""".jobs-container """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
            """),format.raw/*97.13*/("""width: 70%;
            height: 100%;
            background-color: #fff;
            border-radius: 1.75rem;
            flex: 1;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/("""

        """),format.raw/*106.9*/(""".user-container """),format.raw/*106.25*/("""{"""),format.raw/*106.26*/("""
            """),format.raw/*107.13*/("""width: calc(100% - 70%);
            height: 100%;
            background-color: #fff;
            border-radius: 1.75rem;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
            margin-left: 2%;
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""

        """),format.raw/*116.9*/(""".modal-header """),format.raw/*116.23*/("""{"""),format.raw/*116.24*/("""
            """),format.raw/*117.13*/("""font-size: 24px;
            font-weight: bold;
            display: flex;
            align-items: center;
            justify-content: center;
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/("""

        """),format.raw/*124.9*/(""".modal-content """),format.raw/*124.24*/("""{"""),format.raw/*124.25*/("""
            """),format.raw/*125.13*/("""height: 100%;
            display: flex;
            flex-direction: column;
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/("""

        """),format.raw/*130.9*/(""".user-modal """),format.raw/*130.21*/("""{"""),format.raw/*130.22*/("""
            """),format.raw/*131.13*/("""width: "100%";
            /* background-color: gray; */
            height: 70%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/("""

        """),format.raw/*140.9*/("""#complete-profile-button """),format.raw/*140.34*/("""{"""),format.raw/*140.35*/("""
            """),format.raw/*141.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
            display: block;
            margin: 0 auto;
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/("""

        """),format.raw/*153.9*/("""#apply-general-button """),format.raw/*153.31*/("""{"""),format.raw/*153.32*/("""
            """),format.raw/*154.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
        """),format.raw/*162.9*/("""}"""),format.raw/*162.10*/("""

        """),format.raw/*164.9*/("""#complete-profile-button:hover """),format.raw/*164.40*/("""{"""),format.raw/*164.41*/("""
            """),format.raw/*165.13*/("""background-color: #594dc2;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""

        """),format.raw/*169.9*/("""#position-card """),format.raw/*169.24*/("""{"""),format.raw/*169.25*/("""
            """),format.raw/*170.13*/("""width: 98%;
            height: 30%;
            padding: 5px;
            border-radius: 10px;
            display: flex;
            flex-direction: row;
            align-items: center;
            border: 0.5px solid black;
            box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
            overflow-y: hidden;
        """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/("""
    """),format.raw/*181.5*/("""</style>
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
                <form action=""""),_display_(/*238.32*/routes/*238.38*/.HomeController.updateHandler()),format.raw/*238.69*/("""" method="GET">

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
                        $(document).ready(function () """),format.raw/*369.55*/("""{"""),format.raw/*369.56*/("""
                            """),format.raw/*370.29*/("""$('#status').on('change', function () """),format.raw/*370.67*/("""{"""),format.raw/*370.68*/("""
                                """),format.raw/*371.33*/("""if ($(this).val() == 'Student') """),format.raw/*371.65*/("""{"""),format.raw/*371.66*/("""
                                    """),format.raw/*372.37*/("""$('#degree-plan-field').show();
                                """),format.raw/*373.33*/("""}"""),format.raw/*373.34*/(""" """),format.raw/*373.35*/("""else """),format.raw/*373.40*/("""{"""),format.raw/*373.41*/("""
                                    """),format.raw/*374.37*/("""$('#degree-plan-field').hide();
                                """),format.raw/*375.33*/("""}"""),format.raw/*375.34*/("""
                            """),format.raw/*376.29*/("""}"""),format.raw/*376.30*/(""");
                        """),format.raw/*377.25*/("""}"""),format.raw/*377.26*/(""");
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
    <script>
        console.log("cai lon ma", """),_display_(/*435.36*/status),format.raw/*435.42*/(""");
    </script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*437.80*/status),format.raw/*437.86*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general-button")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("application-overlay");

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*449.63*/("""{"""),format.raw/*449.64*/("""
            """),format.raw/*450.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*452.30*/("""{"""),format.raw/*452.31*/("""
                """),format.raw/*453.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*454.13*/("""}"""),format.raw/*454.14*/(""", 0);
        """),format.raw/*455.9*/("""}"""),format.raw/*455.10*/(""");

        // Add a click even listener when user click "Apply" button
        applicationFormSection = document.getElementById("applicationFormSection");
        applyButton.addEventListener("click", () => """),format.raw/*459.53*/("""{"""),format.raw/*459.54*/("""paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*460.30*/("""{"""),format.raw/*460.31*/("""
                """),format.raw/*461.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*462.13*/("""}"""),format.raw/*462.14*/(""", 0);
            fetch('/applicationForm')
                    .then(response => response.text())
                    .then(html => """),format.raw/*465.35*/("""{"""),format.raw/*465.36*/("""
                        """),format.raw/*466.25*/("""// Display the HTML in the application form section of the dashboard
                        applicationFormSection.innerHTML = html;
                    """),format.raw/*468.21*/("""}"""),format.raw/*468.22*/(""")
                    .catch(error => """),format.raw/*469.37*/("""{"""),format.raw/*469.38*/("""
                        """),format.raw/*470.25*/("""console.log(error);
                        // Handle the error
                    """),format.raw/*472.21*/("""}"""),format.raw/*472.22*/(""");
        """),format.raw/*473.9*/("""}"""),format.raw/*473.10*/(""");




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

<script>
    $(document).ready(function () """),format.raw/*503.35*/("""{"""),format.raw/*503.36*/("""
        """),format.raw/*504.9*/("""$('select').formSelect();
    """),format.raw/*505.5*/("""}"""),format.raw/*505.6*/(""");
</script>"""))
      }
    }
  }

  def render(status:String): play.twirl.api.HtmlFormat.Appendable = apply(status)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (status) => apply(status)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-09T23:02:43.141
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: eca9da2191b575decaad97914dfdd274b7c032ad
                  MATRIX: 952->1|1063->17|1091->19|1763->663|1792->664|1834->678|1890->707|1919->708|1958->720|1999->733|2028->734|2070->748|2457->1108|2486->1109|2525->1121|2574->1142|2603->1143|2645->1157|3297->1782|3326->1783|3365->1795|3419->1821|3448->1822|3490->1836|3705->2024|3734->2025|3773->2037|3808->2044|3837->2045|3879->2059|4028->2181|4057->2182|4096->2194|4137->2207|4166->2208|4208->2222|4271->2258|4300->2259|4339->2271|4375->2279|4404->2280|4446->2294|4697->2518|4726->2519|4765->2531|4809->2547|4838->2548|4880->2562|5144->2799|5173->2800|5212->2812|5255->2827|5284->2828|5326->2842|5409->2898|5438->2899|5477->2911|5521->2927|5550->2928|5592->2942|5848->3170|5878->3171|5918->3183|5963->3199|5993->3200|6036->3214|6313->3463|6343->3464|6383->3476|6426->3490|6456->3491|6499->3505|6685->3663|6715->3664|6755->3676|6799->3691|6829->3692|6872->3706|6988->3794|7018->3795|7058->3807|7099->3819|7129->3820|7172->3834|7430->4064|7460->4065|7500->4077|7554->4102|7584->4103|7627->4117|7968->4430|7998->4431|8038->4443|8089->4465|8119->4466|8162->4480|8445->4735|8475->4736|8515->4748|8575->4779|8605->4780|8648->4794|8770->4888|8800->4889|8840->4901|8884->4916|8914->4917|8957->4931|9319->5265|9349->5266|9383->5272|11527->7388|11543->7394|11596->7425|18741->14541|18771->14542|18830->14572|18897->14610|18927->14611|18990->14645|19051->14677|19081->14678|19148->14716|19242->14781|19272->14782|19302->14783|19336->14788|19366->14789|19433->14827|19527->14892|19557->14893|19616->14923|19646->14924|19703->14952|19733->14953|22925->18117|22953->18123|23079->18221|23107->18227|23817->18908|23847->18909|23890->18923|24036->19040|24066->19041|24113->19059|24196->19113|24226->19114|24269->19129|24299->19130|24540->19342|24570->19343|24671->19415|24701->19416|24748->19434|24836->19493|24866->19494|25031->19630|25061->19631|25116->19657|25301->19813|25331->19814|25399->19853|25429->19854|25484->19880|25599->19966|25629->19967|25669->19979|25699->19980|25869->20121|25899->20122|25942->20136|26089->20254|26119->20255|26166->20273|26273->20351|26303->20352|26354->20374|26442->20433|26472->20434|26522->20455|26552->20456|26590->20466|26620->20467|26787->20605|26817->20606|26860->20620|27012->20743|27042->20744|27089->20762|27201->20845|27231->20846|27282->20868|27375->20932|27405->20933|27455->20954|27485->20955|27523->20965|27553->20966|27658->21042|27688->21043|27726->21053|27785->21084|27814->21085
                  LINES: 28->1|33->1|34->2|47->15|47->15|48->16|49->17|49->17|51->19|51->19|51->19|52->20|62->30|62->30|64->32|64->32|64->32|65->33|82->50|82->50|84->52|84->52|84->52|85->53|90->58|90->58|92->60|92->60|92->60|93->61|97->65|97->65|99->67|99->67|99->67|100->68|101->69|101->69|103->71|103->71|103->71|104->72|111->79|111->79|113->81|113->81|113->81|114->82|121->89|121->89|123->91|123->91|123->91|124->92|126->94|126->94|128->96|128->96|128->96|129->97|136->104|136->104|138->106|138->106|138->106|139->107|146->114|146->114|148->116|148->116|148->116|149->117|154->122|154->122|156->124|156->124|156->124|157->125|160->128|160->128|162->130|162->130|162->130|163->131|170->138|170->138|172->140|172->140|172->140|173->141|183->151|183->151|185->153|185->153|185->153|186->154|194->162|194->162|196->164|196->164|196->164|197->165|199->167|199->167|201->169|201->169|201->169|202->170|212->180|212->180|213->181|270->238|270->238|270->238|401->369|401->369|402->370|402->370|402->370|403->371|403->371|403->371|404->372|405->373|405->373|405->373|405->373|405->373|406->374|407->375|407->375|408->376|408->376|409->377|409->377|467->435|467->435|469->437|469->437|481->449|481->449|482->450|484->452|484->452|485->453|486->454|486->454|487->455|487->455|491->459|491->459|492->460|492->460|493->461|494->462|494->462|497->465|497->465|498->466|500->468|500->468|501->469|501->469|502->470|504->472|504->472|505->473|505->473|511->479|511->479|512->480|513->481|513->481|514->482|515->483|515->483|516->484|517->485|517->485|518->486|518->486|519->487|519->487|521->489|521->489|522->490|523->491|523->491|524->492|525->493|525->493|526->494|527->495|527->495|528->496|528->496|529->497|529->497|535->503|535->503|536->504|537->505|537->505
                  -- GENERATED --
              */
          