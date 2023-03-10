
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
            """),format.raw/*136.13*/("""width: "100%";
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
    <script>
        console.log("cai lon ma", """),_display_(/*440.36*/status),format.raw/*440.42*/(""");
    </script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*442.80*/status),format.raw/*442.86*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general-button")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("application-overlay");

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*454.63*/("""{"""),format.raw/*454.64*/("""
            """),format.raw/*455.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*457.30*/("""{"""),format.raw/*457.31*/("""
                """),format.raw/*458.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*459.13*/("""}"""),format.raw/*459.14*/(""", 0);
        """),format.raw/*460.9*/("""}"""),format.raw/*460.10*/(""");

        // Add a click even listener when user click "Apply" button
        applicationFormSection = document.getElementById("applicationFormSection");
        applyButton.addEventListener("click", () => """),format.raw/*464.53*/("""{"""),format.raw/*464.54*/("""paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*465.30*/("""{"""),format.raw/*465.31*/("""
                """),format.raw/*466.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*467.13*/("""}"""),format.raw/*467.14*/(""", 0);
            fetch('/applicationForm')
                    .then(response => response.text())
                    .then(html => """),format.raw/*470.35*/("""{"""),format.raw/*470.36*/("""
                        """),format.raw/*471.25*/("""// Display the HTML in the application form section of the dashboard
                        applicationFormSection.innerHTML = html;
                    """),format.raw/*473.21*/("""}"""),format.raw/*473.22*/(""")
                    .catch(error => """),format.raw/*474.37*/("""{"""),format.raw/*474.38*/("""
                        """),format.raw/*475.25*/("""console.log(error);
                        // Handle the error
                    """),format.raw/*477.21*/("""}"""),format.raw/*477.22*/(""");
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/(""");




        // Add a click event listener to the paper modal overlay
        paperModalOverlay.addEventListener("click", (event) => """),format.raw/*484.64*/("""{"""),format.raw/*484.65*/("""
            """),format.raw/*485.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlay) """),format.raw/*486.53*/("""{"""),format.raw/*486.54*/("""
                """),format.raw/*487.17*/("""paperModalOverlay.classList.remove("show");
                setTimeout(() => """),format.raw/*488.34*/("""{"""),format.raw/*488.35*/("""
                    """),format.raw/*489.21*/("""paperModalOverlay.style.display = "none";
                """),format.raw/*490.17*/("""}"""),format.raw/*490.18*/(""", 500);
            """),format.raw/*491.13*/("""}"""),format.raw/*491.14*/("""
        """),format.raw/*492.9*/("""}"""),format.raw/*492.10*/(""");
        // Add a click event listener to the paper modal overlay
        paperModalOverlayApply.addEventListener("click", (event) => """),format.raw/*494.69*/("""{"""),format.raw/*494.70*/("""
            """),format.raw/*495.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlayApply) """),format.raw/*496.58*/("""{"""),format.raw/*496.59*/("""
                """),format.raw/*497.17*/("""paperModalOverlayApply.classList.remove("show");
                setTimeout(() => """),format.raw/*498.34*/("""{"""),format.raw/*498.35*/("""
                    """),format.raw/*499.21*/("""paperModalOverlayApply.style.display = "none";
                """),format.raw/*500.17*/("""}"""),format.raw/*500.18*/(""", 500);
            """),format.raw/*501.13*/("""}"""),format.raw/*501.14*/("""
        """),format.raw/*502.9*/("""}"""),format.raw/*502.10*/(""");
    </script>

</body>

"""))
      }
    }
  }

  def render(status:String): play.twirl.api.HtmlFormat.Appendable = apply(status)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (status) => apply(status)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-10T13:16:43.583
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: c1297ed213984c778acb1008e3b692d1a5a0098c
                  MATRIX: 952->1|1062->18|1745->673|1774->674|1815->687|1876->721|1905->722|1971->760|2000->761|2041->774|2096->802|2125->803|2162->813|2203->826|2232->827|2273->840|2650->1190|2679->1191|2716->1201|2765->1222|2794->1223|2835->1236|3470->1844|3499->1845|3536->1855|3590->1881|3619->1882|3660->1895|3870->2078|3899->2079|3936->2089|3971->2096|4000->2097|4041->2110|4186->2228|4215->2229|4252->2239|4293->2252|4322->2253|4363->2266|4425->2301|4454->2302|4491->2312|4527->2320|4556->2321|4597->2334|4841->2551|4870->2552|4907->2562|4951->2578|4980->2579|5021->2592|5278->2822|5307->2823|5344->2833|5387->2848|5416->2849|5457->2862|5538->2916|5567->2917|5605->2927|5650->2943|5680->2944|5722->2957|5971->3178|6001->3179|6039->3189|6084->3205|6114->3206|6156->3219|6426->3461|6456->3462|6494->3472|6537->3486|6567->3487|6609->3500|6790->3653|6820->3654|6858->3664|6902->3679|6932->3680|6974->3693|7087->3778|7117->3779|7155->3789|7196->3801|7226->3802|7268->3815|7519->4038|7549->4039|7587->4049|7641->4074|7671->4075|7713->4088|8044->4391|8074->4392|8112->4402|8163->4424|8193->4425|8235->4438|8510->4685|8540->4686|8578->4696|8638->4727|8668->4728|8710->4741|8830->4833|8860->4834|8898->4844|8942->4859|8972->4860|9014->4873|9366->5197|9396->5198|9429->5203|11516->7262|11532->7268|11585->7299|18599->14284|18629->14285|18687->14314|18754->14352|18784->14353|18846->14386|18907->14418|18937->14419|19003->14456|19096->14520|19126->14521|19156->14522|19190->14527|19220->14528|19286->14565|19379->14629|19409->14630|19467->14659|19497->14660|19553->14687|19583->14688|22717->17794|22745->17800|22869->17896|22897->17902|23595->18571|23625->18572|23667->18585|23811->18700|23841->18701|23887->18718|23969->18771|23999->18772|24041->18786|24071->18787|24308->18995|24338->18996|24438->19067|24468->19068|24514->19085|24601->19143|24631->19144|24793->19277|24823->19278|24877->19303|25060->19457|25090->19458|25157->19496|25187->19497|25241->19522|25354->19606|25384->19607|25423->19618|25453->19619|25617->19754|25647->19755|25689->19768|25835->19885|25865->19886|25911->19903|26017->19980|26047->19981|26097->20002|26184->20060|26214->20061|26263->20081|26293->20082|26330->20091|26360->20092|26525->20228|26555->20229|26597->20242|26748->20364|26778->20365|26824->20382|26935->20464|26965->20465|27015->20486|27107->20549|27137->20550|27186->20570|27216->20571|27253->20580|27283->20581
                  LINES: 28->1|33->2|46->15|46->15|47->16|48->17|48->17|51->20|51->20|52->21|53->22|53->22|55->24|55->24|55->24|56->25|66->35|66->35|68->37|68->37|68->37|69->38|86->55|86->55|88->57|88->57|88->57|89->58|94->63|94->63|96->65|96->65|96->65|97->66|101->70|101->70|103->72|103->72|103->72|104->73|105->74|105->74|107->76|107->76|107->76|108->77|115->84|115->84|117->86|117->86|117->86|118->87|125->94|125->94|127->96|127->96|127->96|128->97|130->99|130->99|132->101|132->101|132->101|133->102|140->109|140->109|142->111|142->111|142->111|143->112|150->119|150->119|152->121|152->121|152->121|153->122|158->127|158->127|160->129|160->129|160->129|161->130|164->133|164->133|166->135|166->135|166->135|167->136|174->143|174->143|176->145|176->145|176->145|177->146|187->156|187->156|189->158|189->158|189->158|190->159|198->167|198->167|200->169|200->169|200->169|201->170|203->172|203->172|205->174|205->174|205->174|206->175|216->185|216->185|217->186|274->243|274->243|274->243|405->374|405->374|406->375|406->375|406->375|407->376|407->376|407->376|408->377|409->378|409->378|409->378|409->378|409->378|410->379|411->380|411->380|412->381|412->381|413->382|413->382|471->440|471->440|473->442|473->442|485->454|485->454|486->455|488->457|488->457|489->458|490->459|490->459|491->460|491->460|495->464|495->464|496->465|496->465|497->466|498->467|498->467|501->470|501->470|502->471|504->473|504->473|505->474|505->474|506->475|508->477|508->477|509->478|509->478|515->484|515->484|516->485|517->486|517->486|518->487|519->488|519->488|520->489|521->490|521->490|522->491|522->491|523->492|523->492|525->494|525->494|526->495|527->496|527->496|528->497|529->498|529->498|530->499|531->500|531->500|532->501|532->501|533->502|533->502
                  -- GENERATED --
              */
          