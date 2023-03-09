
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

        """),format.raw/*153.9*/("""#apply-general """),format.raw/*153.24*/("""{"""),format.raw/*153.25*/("""
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
                        <button class="apply-general" id="apply-general">Apply</button>
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
    <script src="assets/javascripts/fetchJobs.js"></script>
    <script>
        console.log("cai lon ma", """),_display_(/*415.36*/status),format.raw/*415.42*/(""");
    </script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*417.80*/status),format.raw/*417.86*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("modal-apply")

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*429.63*/("""{"""),format.raw/*429.64*/("""
            """),format.raw/*430.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*432.30*/("""{"""),format.raw/*432.31*/("""
                """),format.raw/*433.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*434.13*/("""}"""),format.raw/*434.14*/(""", 0);
        """),format.raw/*435.9*/("""}"""),format.raw/*435.10*/(""");

        // Add a click even listener when user click "Apply" button
        applyButton.addEventListener("click", () => """),format.raw/*438.53*/("""{"""),format.raw/*438.54*/("""
            """),format.raw/*439.13*/("""// Show the paper modal overaly
            paperModalOverlayApply.style.display = "flex";
            setTimeout(() => """),format.raw/*441.30*/("""{"""),format.raw/*441.31*/("""
                """),format.raw/*442.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*443.13*/("""}"""),format.raw/*443.14*/(""", 0);
        """),format.raw/*444.9*/("""}"""),format.raw/*444.10*/(""")


        // Add a click event listener to the paper modal overlay
        paperModalOverlay.addEventListener("click", (event) => """),format.raw/*448.64*/("""{"""),format.raw/*448.65*/("""
            """),format.raw/*449.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlay) """),format.raw/*450.53*/("""{"""),format.raw/*450.54*/("""
                """),format.raw/*451.17*/("""paperModalOverlay.classList.remove("show");
                setTimeout(() => """),format.raw/*452.34*/("""{"""),format.raw/*452.35*/("""
                    """),format.raw/*453.21*/("""paperModalOverlay.style.display = "none";
                """),format.raw/*454.17*/("""}"""),format.raw/*454.18*/(""", 500);
            """),format.raw/*455.13*/("""}"""),format.raw/*455.14*/("""
        """),format.raw/*456.9*/("""}"""),format.raw/*456.10*/(""");
    </script>

</body>

<script>
    $(document).ready(function () """),format.raw/*462.35*/("""{"""),format.raw/*462.36*/("""
        """),format.raw/*463.9*/("""$('select').formSelect();
    """),format.raw/*464.5*/("""}"""),format.raw/*464.6*/(""");
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
                  DATE: 2023-03-09T02:13:50.864
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: 2ce31c28b635d2584ef944b0e0be78c096c6c55a
                  MATRIX: 952->1|1062->18|1721->649|1750->650|1791->663|1846->691|1875->692|1912->702|1953->715|1982->716|2023->729|2400->1079|2429->1080|2466->1090|2515->1111|2544->1112|2585->1125|3220->1733|3249->1734|3286->1744|3340->1770|3369->1771|3410->1784|3620->1967|3649->1968|3686->1978|3721->1985|3750->1986|3791->1999|3936->2117|3965->2118|4002->2128|4043->2141|4072->2142|4113->2155|4175->2190|4204->2191|4241->2201|4277->2209|4306->2210|4347->2223|4591->2440|4620->2441|4657->2451|4701->2467|4730->2468|4771->2481|5028->2711|5057->2712|5094->2722|5137->2737|5166->2738|5207->2751|5288->2805|5317->2806|5354->2816|5398->2832|5427->2833|5468->2846|5717->3067|5747->3068|5785->3078|5830->3094|5860->3095|5902->3108|6172->3350|6202->3351|6240->3361|6283->3375|6313->3376|6355->3389|6536->3542|6566->3543|6604->3553|6648->3568|6678->3569|6720->3582|6833->3667|6863->3668|6901->3678|6942->3690|6972->3691|7014->3704|7265->3927|7295->3928|7333->3938|7387->3963|7417->3964|7459->3977|7790->4280|7820->4281|7858->4291|7902->4306|7932->4307|7974->4320|8249->4567|8279->4568|8317->4578|8377->4609|8407->4610|8449->4623|8569->4715|8599->4716|8637->4726|8681->4741|8711->4742|8753->4755|9105->5079|9135->5080|9168->5085|11213->7102|11229->7108|11282->7139|17623->13451|17653->13452|17711->13481|17778->13519|17808->13520|17870->13553|17931->13585|17961->13586|18027->13623|18120->13687|18150->13688|18180->13689|18214->13694|18244->13695|18310->13732|18403->13796|18433->13797|18491->13826|18521->13827|18577->13854|18607->13855|21441->16661|21469->16667|21593->16763|21621->16769|22303->17422|22333->17423|22375->17436|22519->17551|22549->17552|22595->17569|22677->17622|22707->17623|22749->17637|22779->17638|22932->17762|22962->17763|23004->17776|23153->17896|23183->17897|23229->17914|23316->17972|23346->17973|23388->17987|23418->17988|23579->18120|23609->18121|23651->18134|23797->18251|23827->18252|23873->18269|23979->18346|24009->18347|24059->18368|24146->18426|24176->18427|24225->18447|24255->18448|24292->18457|24322->18458|24421->18528|24451->18529|24488->18538|24546->18568|24575->18569
                  LINES: 28->1|33->2|46->15|46->15|47->16|48->17|48->17|50->19|50->19|50->19|51->20|61->30|61->30|63->32|63->32|63->32|64->33|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|96->65|96->65|98->67|98->67|98->67|99->68|100->69|100->69|102->71|102->71|102->71|103->72|110->79|110->79|112->81|112->81|112->81|113->82|120->89|120->89|122->91|122->91|122->91|123->92|125->94|125->94|127->96|127->96|127->96|128->97|135->104|135->104|137->106|137->106|137->106|138->107|145->114|145->114|147->116|147->116|147->116|148->117|153->122|153->122|155->124|155->124|155->124|156->125|159->128|159->128|161->130|161->130|161->130|162->131|169->138|169->138|171->140|171->140|171->140|172->141|182->151|182->151|184->153|184->153|184->153|185->154|193->162|193->162|195->164|195->164|195->164|196->165|198->167|198->167|200->169|200->169|200->169|201->170|211->180|211->180|212->181|269->238|269->238|269->238|390->359|390->359|391->360|391->360|391->360|392->361|392->361|392->361|393->362|394->363|394->363|394->363|394->363|394->363|395->364|396->365|396->365|397->366|397->366|398->367|398->367|446->415|446->415|448->417|448->417|460->429|460->429|461->430|463->432|463->432|464->433|465->434|465->434|466->435|466->435|469->438|469->438|470->439|472->441|472->441|473->442|474->443|474->443|475->444|475->444|479->448|479->448|480->449|481->450|481->450|482->451|483->452|483->452|484->453|485->454|485->454|486->455|486->455|487->456|487->456|493->462|493->462|494->463|495->464|495->464
                  -- GENERATED --
              */
          