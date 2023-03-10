
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
                    <script>
                        $(document).ready(function () """),format.raw/*359.55*/("""{"""),format.raw/*359.56*/("""
                            """),format.raw/*360.29*/("""$('#status').on('change', function () """),format.raw/*360.67*/("""{"""),format.raw/*360.68*/("""
                                """),format.raw/*361.33*/("""if ($(this).val() == 'Student') """),format.raw/*361.65*/("""{"""),format.raw/*361.66*/("""
                                    """),format.raw/*362.37*/("""$('#degree-plan-field').show();
                                """),format.raw/*363.33*/("""}"""),format.raw/*363.34*/(""" """),format.raw/*363.35*/("""else """),format.raw/*363.40*/("""{"""),format.raw/*363.41*/("""
                                    """),format.raw/*364.37*/("""$('#degree-plan-field').hide();
                                """),format.raw/*365.33*/("""}"""),format.raw/*365.34*/("""
                            """),format.raw/*366.29*/("""}"""),format.raw/*366.30*/(""");
                        """),format.raw/*367.25*/("""}"""),format.raw/*367.26*/(""");
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
        console.log("cai lon ma", """),_display_(/*425.36*/status),format.raw/*425.42*/(""");
    </script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*427.80*/status),format.raw/*427.86*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general-button")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("application-overlay");

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*439.63*/("""{"""),format.raw/*439.64*/("""
            """),format.raw/*440.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*442.30*/("""{"""),format.raw/*442.31*/("""
                """),format.raw/*443.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*444.13*/("""}"""),format.raw/*444.14*/(""", 0);
        """),format.raw/*445.9*/("""}"""),format.raw/*445.10*/(""");

        // Add a click even listener when user click "Apply" button
        applicationFormSection = document.getElementById("applicationFormSection");
        applyButton.addEventListener("click", () => """),format.raw/*449.53*/("""{"""),format.raw/*449.54*/("""paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*450.30*/("""{"""),format.raw/*450.31*/("""
                """),format.raw/*451.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*452.13*/("""}"""),format.raw/*452.14*/(""", 0);
            fetch('/applicationForm')
                    .then(response => response.text())
                    .then(html => """),format.raw/*455.35*/("""{"""),format.raw/*455.36*/("""
                        """),format.raw/*456.25*/("""// Display the HTML in the application form section of the dashboard
                        applicationFormSection.innerHTML = html;
                    """),format.raw/*458.21*/("""}"""),format.raw/*458.22*/(""")
                    .catch(error => """),format.raw/*459.37*/("""{"""),format.raw/*459.38*/("""
                        """),format.raw/*460.25*/("""console.log(error);
                        // Handle the error
                    """),format.raw/*462.21*/("""}"""),format.raw/*462.22*/(""");
        """),format.raw/*463.9*/("""}"""),format.raw/*463.10*/(""");




        // Add a click event listener to the paper modal overlay
        paperModalOverlay.addEventListener("click", (event) => """),format.raw/*469.64*/("""{"""),format.raw/*469.65*/("""
            """),format.raw/*470.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlay) """),format.raw/*471.53*/("""{"""),format.raw/*471.54*/("""
                """),format.raw/*472.17*/("""paperModalOverlay.classList.remove("show");
                setTimeout(() => """),format.raw/*473.34*/("""{"""),format.raw/*473.35*/("""
                    """),format.raw/*474.21*/("""paperModalOverlay.style.display = "none";
                """),format.raw/*475.17*/("""}"""),format.raw/*475.18*/(""", 500);
            """),format.raw/*476.13*/("""}"""),format.raw/*476.14*/("""
        """),format.raw/*477.9*/("""}"""),format.raw/*477.10*/(""");
    </script>

</body>

<script>
    $(document).ready(function () """),format.raw/*483.35*/("""{"""),format.raw/*483.36*/("""
        """),format.raw/*484.9*/("""$('select').formSelect();
    """),format.raw/*485.5*/("""}"""),format.raw/*485.6*/(""");
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
                  DATE: 2023-03-09T21:41:48.902
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: 3d69fb8f2566fc8b1fa917f6ef9fa29d9d665d92
                  MATRIX: 952->1|1063->17|1091->19|1763->663|1792->664|1834->678|1890->707|1919->708|1958->720|1999->733|2028->734|2070->748|2457->1108|2486->1109|2525->1121|2574->1142|2603->1143|2645->1157|3297->1782|3326->1783|3365->1795|3419->1821|3448->1822|3490->1836|3705->2024|3734->2025|3773->2037|3808->2044|3837->2045|3879->2059|4028->2181|4057->2182|4096->2194|4137->2207|4166->2208|4208->2222|4271->2258|4300->2259|4339->2271|4375->2279|4404->2280|4446->2294|4697->2518|4726->2519|4765->2531|4809->2547|4838->2548|4880->2562|5144->2799|5173->2800|5212->2812|5255->2827|5284->2828|5326->2842|5409->2898|5438->2899|5477->2911|5521->2927|5550->2928|5592->2942|5848->3170|5878->3171|5918->3183|5963->3199|5993->3200|6036->3214|6313->3463|6343->3464|6383->3476|6426->3490|6456->3491|6499->3505|6685->3663|6715->3664|6755->3676|6799->3691|6829->3692|6872->3706|6988->3794|7018->3795|7058->3807|7099->3819|7129->3820|7172->3834|7430->4064|7460->4065|7500->4077|7554->4102|7584->4103|7627->4117|7968->4430|7998->4431|8038->4443|8089->4465|8119->4466|8162->4480|8445->4735|8475->4736|8515->4748|8575->4779|8605->4780|8648->4794|8770->4888|8800->4889|8840->4901|8884->4916|8914->4917|8957->4931|9319->5265|9349->5266|9383->5272|11527->7388|11543->7394|11596->7425|18058->13858|18088->13859|18147->13889|18214->13927|18244->13928|18307->13962|18368->13994|18398->13995|18465->14033|18559->14098|18589->14099|18619->14100|18653->14105|18683->14106|18750->14144|18844->14209|18874->14210|18933->14240|18963->14241|19020->14269|19050->14270|22242->17434|22270->17440|22396->17538|22424->17544|23134->18225|23164->18226|23207->18240|23353->18357|23383->18358|23430->18376|23513->18430|23543->18431|23586->18446|23616->18447|23857->18659|23887->18660|23988->18732|24018->18733|24065->18751|24153->18810|24183->18811|24348->18947|24378->18948|24433->18974|24618->19130|24648->19131|24716->19170|24746->19171|24801->19197|24916->19283|24946->19284|24986->19296|25016->19297|25186->19438|25216->19439|25259->19453|25406->19571|25436->19572|25483->19590|25590->19668|25620->19669|25671->19691|25759->19750|25789->19751|25839->19772|25869->19773|25907->19783|25937->19784|26042->19860|26072->19861|26110->19871|26169->19902|26198->19903
                  LINES: 28->1|33->1|34->2|47->15|47->15|48->16|49->17|49->17|51->19|51->19|51->19|52->20|62->30|62->30|64->32|64->32|64->32|65->33|82->50|82->50|84->52|84->52|84->52|85->53|90->58|90->58|92->60|92->60|92->60|93->61|97->65|97->65|99->67|99->67|99->67|100->68|101->69|101->69|103->71|103->71|103->71|104->72|111->79|111->79|113->81|113->81|113->81|114->82|121->89|121->89|123->91|123->91|123->91|124->92|126->94|126->94|128->96|128->96|128->96|129->97|136->104|136->104|138->106|138->106|138->106|139->107|146->114|146->114|148->116|148->116|148->116|149->117|154->122|154->122|156->124|156->124|156->124|157->125|160->128|160->128|162->130|162->130|162->130|163->131|170->138|170->138|172->140|172->140|172->140|173->141|183->151|183->151|185->153|185->153|185->153|186->154|194->162|194->162|196->164|196->164|196->164|197->165|199->167|199->167|201->169|201->169|201->169|202->170|212->180|212->180|213->181|270->238|270->238|270->238|391->359|391->359|392->360|392->360|392->360|393->361|393->361|393->361|394->362|395->363|395->363|395->363|395->363|395->363|396->364|397->365|397->365|398->366|398->366|399->367|399->367|457->425|457->425|459->427|459->427|471->439|471->439|472->440|474->442|474->442|475->443|476->444|476->444|477->445|477->445|481->449|481->449|482->450|482->450|483->451|484->452|484->452|487->455|487->455|488->456|490->458|490->458|491->459|491->459|492->460|494->462|494->462|495->463|495->463|501->469|501->469|502->470|503->471|503->471|504->472|505->473|505->473|506->474|507->475|507->475|508->476|508->476|509->477|509->477|515->483|515->483|516->484|517->485|517->485
                  -- GENERATED --
              */
          