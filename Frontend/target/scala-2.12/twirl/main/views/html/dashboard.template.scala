
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
                  DATE: 2023-03-09T23:44:48.056
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: ed4af1333780378689c7983309bafbe858b4c41b
                  MATRIX: 952->1|1063->17|1091->19|1787->687|1816->688|1858->702|1920->737|1949->738|2018->779|2047->780|2089->794|2145->823|2174->824|2213->836|2254->849|2283->850|2325->864|2712->1224|2741->1225|2780->1237|2829->1258|2858->1259|2900->1273|3552->1898|3581->1899|3620->1911|3674->1937|3703->1938|3745->1952|3960->2140|3989->2141|4028->2153|4063->2160|4092->2161|4134->2175|4283->2297|4312->2298|4351->2310|4392->2323|4421->2324|4463->2338|4526->2374|4555->2375|4594->2387|4630->2395|4659->2396|4701->2410|4952->2634|4981->2635|5020->2647|5064->2663|5093->2664|5135->2678|5399->2915|5428->2916|5467->2928|5510->2943|5539->2944|5581->2958|5664->3014|5693->3015|5733->3027|5778->3043|5808->3044|5851->3058|6107->3286|6137->3287|6177->3299|6222->3315|6252->3316|6295->3330|6572->3579|6602->3580|6642->3592|6685->3606|6715->3607|6758->3621|6944->3779|6974->3780|7014->3792|7058->3807|7088->3808|7131->3822|7247->3910|7277->3911|7317->3923|7358->3935|7388->3936|7431->3950|7689->4180|7719->4181|7759->4193|7813->4218|7843->4219|7886->4233|8227->4546|8257->4547|8297->4559|8348->4581|8378->4582|8421->4596|8704->4851|8734->4852|8774->4864|8834->4895|8864->4896|8907->4910|9029->5004|9059->5005|9099->5017|9143->5032|9173->5033|9216->5047|9578->5381|9608->5382|9642->5388|11786->7504|11802->7510|11855->7541|19000->14657|19030->14658|19089->14688|19156->14726|19186->14727|19249->14761|19310->14793|19340->14794|19407->14832|19501->14897|19531->14898|19561->14899|19595->14904|19625->14905|19692->14943|19786->15008|19816->15009|19875->15039|19905->15040|19962->15068|19992->15069|23184->18233|23212->18239|23338->18337|23366->18343|24076->19024|24106->19025|24149->19039|24295->19156|24325->19157|24372->19175|24455->19229|24485->19230|24528->19245|24558->19246|24799->19458|24829->19459|24930->19531|24960->19532|25007->19550|25095->19609|25125->19610|25290->19746|25320->19747|25375->19773|25560->19929|25590->19930|25658->19969|25688->19970|25743->19996|25858->20082|25888->20083|25928->20095|25958->20096|26128->20237|26158->20238|26201->20252|26348->20370|26378->20371|26425->20389|26532->20467|26562->20468|26613->20490|26701->20549|26731->20550|26781->20571|26811->20572|26849->20582|26879->20583|27046->20721|27076->20722|27119->20736|27271->20859|27301->20860|27348->20878|27460->20961|27490->20962|27541->20984|27634->21048|27664->21049|27714->21070|27744->21071|27782->21081|27812->21082
                  LINES: 28->1|33->1|34->2|47->15|47->15|48->16|49->17|49->17|52->20|52->20|53->21|54->22|54->22|56->24|56->24|56->24|57->25|67->35|67->35|69->37|69->37|69->37|70->38|87->55|87->55|89->57|89->57|89->57|90->58|95->63|95->63|97->65|97->65|97->65|98->66|102->70|102->70|104->72|104->72|104->72|105->73|106->74|106->74|108->76|108->76|108->76|109->77|116->84|116->84|118->86|118->86|118->86|119->87|126->94|126->94|128->96|128->96|128->96|129->97|131->99|131->99|133->101|133->101|133->101|134->102|141->109|141->109|143->111|143->111|143->111|144->112|151->119|151->119|153->121|153->121|153->121|154->122|159->127|159->127|161->129|161->129|161->129|162->130|165->133|165->133|167->135|167->135|167->135|168->136|175->143|175->143|177->145|177->145|177->145|178->146|188->156|188->156|190->158|190->158|190->158|191->159|199->167|199->167|201->169|201->169|201->169|202->170|204->172|204->172|206->174|206->174|206->174|207->175|217->185|217->185|218->186|275->243|275->243|275->243|406->374|406->374|407->375|407->375|407->375|408->376|408->376|408->376|409->377|410->378|410->378|410->378|410->378|410->378|411->379|412->380|412->380|413->381|413->381|414->382|414->382|472->440|472->440|474->442|474->442|486->454|486->454|487->455|489->457|489->457|490->458|491->459|491->459|492->460|492->460|496->464|496->464|497->465|497->465|498->466|499->467|499->467|502->470|502->470|503->471|505->473|505->473|506->474|506->474|507->475|509->477|509->477|510->478|510->478|516->484|516->484|517->485|518->486|518->486|519->487|520->488|520->488|521->489|522->490|522->490|523->491|523->491|524->492|524->492|526->494|526->494|527->495|528->496|528->496|529->497|530->498|530->498|531->499|532->500|532->500|533->501|533->501|534->502|534->502
                  -- GENERATED --
              */
          