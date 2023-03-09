
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
            """),format.raw/*92.13*/("""max-height: 65vh;
            overflow-y: scroll;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/(""".jobs-container """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
            """),format.raw/*97.13*/("""width: 70%;
            background-color: #fff;
            border-radius: 1.75rem;
            flex: 1;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""

        """),format.raw/*105.9*/(""".user-container """),format.raw/*105.25*/("""{"""),format.raw/*105.26*/("""
            """),format.raw/*106.13*/("""width: calc(100% - 70%);
            height: 100%;
            background-color: #fff;
            border-radius: 1.75rem;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
            margin-left: 2%;
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/("""

        """),format.raw/*115.9*/(""".model-header """),format.raw/*115.23*/("""{"""),format.raw/*115.24*/("""
            """),format.raw/*116.13*/("""font-size: 24px;
            font-weight: bold;
            display: flex;
            align-items: center;
            justify-content: center;
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/("""

        """),format.raw/*123.9*/(""".user-modal """),format.raw/*123.21*/("""{"""),format.raw/*123.22*/("""
            """),format.raw/*124.13*/("""width: "100%";
            /* background-color: gray; */
            height: 70%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/("""

        """),format.raw/*133.9*/("""#complete-profile-button """),format.raw/*133.34*/("""{"""),format.raw/*133.35*/("""
            """),format.raw/*134.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
            display: block;
            margin: 0 auto;
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/("""

        """),format.raw/*146.9*/("""#apply-general """),format.raw/*146.24*/("""{"""),format.raw/*146.25*/("""
            """),format.raw/*147.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
        """),format.raw/*155.9*/("""}"""),format.raw/*155.10*/("""

        """),format.raw/*157.9*/("""#complete-profile-button:hover """),format.raw/*157.40*/("""{"""),format.raw/*157.41*/("""
            """),format.raw/*158.13*/("""background-color: #594dc2;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/("""

        """),format.raw/*162.9*/("""#position-card """),format.raw/*162.24*/("""{"""),format.raw/*162.25*/("""
            """),format.raw/*163.13*/("""width: 98%;
            height: 100%;
            padding: 5px;
            border-radius: 10px;
            display: flex;
            flex-direction: row;
            align-items: center;
            border: 0.5px solid black;
            box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
            overflow-y: scroll;
        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/("""
    """),format.raw/*174.5*/("""</style>
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
                        height: 100%;
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
            <div class="model-header">
                Edit Profile
            </div>
            <div class="model-content">
                <form action=""""),_display_(/*232.32*/routes/*232.38*/.HomeController.updateHandler()),format.raw/*232.69*/("""" method="GET">

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
                        $(document).ready(function () """),format.raw/*353.55*/("""{"""),format.raw/*353.56*/("""
                            """),format.raw/*354.29*/("""$('#status').on('change', function () """),format.raw/*354.67*/("""{"""),format.raw/*354.68*/("""
                                """),format.raw/*355.33*/("""if ($(this).val() == 'Student') """),format.raw/*355.65*/("""{"""),format.raw/*355.66*/("""
                                    """),format.raw/*356.37*/("""$('#degree-plan-field').show();
                                """),format.raw/*357.33*/("""}"""),format.raw/*357.34*/(""" """),format.raw/*357.35*/("""else """),format.raw/*357.40*/("""{"""),format.raw/*357.41*/("""
                                    """),format.raw/*358.37*/("""$('#degree-plan-field').hide();
                                """),format.raw/*359.33*/("""}"""),format.raw/*359.34*/("""
                            """),format.raw/*360.29*/("""}"""),format.raw/*360.30*/(""");
                        """),format.raw/*361.25*/("""}"""),format.raw/*361.26*/(""");
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
        console.log("cai lon ma", """),_display_(/*409.36*/status),format.raw/*409.42*/(""");
    </script>
    <script id="profile" src="assets/javascripts/fetchProfileState.js" status="""),_display_(/*411.80*/status),format.raw/*411.86*/("""> </script>
    <script>
        // Get the "Complete Profile" button and the paper modal overlay
        const applyButton = document.getElementById("apply-general")
        const completeProfileButton = document.getElementById("complete-profile-button");
        const paperModalOverlay = document.querySelector(".paper-modal-overlay");
        const paperModalOverlayApply = document.getElementById("modal-apply")

        // Hide the paper modal overlay by default
        paperModalOverlay.style.display = "none";

        // Add a click event listener to the "Complete Profile" button
        completeProfileButton.addEventListener("click", () => """),format.raw/*423.63*/("""{"""),format.raw/*423.64*/("""
            """),format.raw/*424.13*/("""// Show the paper modal overlay
            paperModalOverlay.style.display = "flex";
            setTimeout(() => """),format.raw/*426.30*/("""{"""),format.raw/*426.31*/("""
                """),format.raw/*427.17*/("""paperModalOverlay.classList.add("show");
            """),format.raw/*428.13*/("""}"""),format.raw/*428.14*/(""", 0);
        """),format.raw/*429.9*/("""}"""),format.raw/*429.10*/(""");

        // Add a click even listener when user click "Apply" button
        applyButton.addEventListener("click", () => """),format.raw/*432.53*/("""{"""),format.raw/*432.54*/("""
            """),format.raw/*433.13*/("""// Show the paper modal overaly
            paperModalOverlayApply.style.display = "flex";
            setTimeout(() => """),format.raw/*435.30*/("""{"""),format.raw/*435.31*/("""
                """),format.raw/*436.17*/("""paperModalOverlayApply.classList.add("show");
            """),format.raw/*437.13*/("""}"""),format.raw/*437.14*/(""", 0);
        """),format.raw/*438.9*/("""}"""),format.raw/*438.10*/(""")


        // Add a click event listener to the paper modal overlay
        paperModalOverlay.addEventListener("click", (event) => """),format.raw/*442.64*/("""{"""),format.raw/*442.65*/("""
            """),format.raw/*443.13*/("""// If the user clicked outside the paper modal, hide the overlay
            if (event.target === paperModalOverlay) """),format.raw/*444.53*/("""{"""),format.raw/*444.54*/("""
                """),format.raw/*445.17*/("""paperModalOverlay.classList.remove("show");
                setTimeout(() => """),format.raw/*446.34*/("""{"""),format.raw/*446.35*/("""
                    """),format.raw/*447.21*/("""paperModalOverlay.style.display = "none";
                """),format.raw/*448.17*/("""}"""),format.raw/*448.18*/(""", 500);
            """),format.raw/*449.13*/("""}"""),format.raw/*449.14*/("""
        """),format.raw/*450.9*/("""}"""),format.raw/*450.10*/(""");
    </script>

</body>

<script>
    $(document).ready(function () """),format.raw/*456.35*/("""{"""),format.raw/*456.36*/("""
        """),format.raw/*457.9*/("""$('select').formSelect();
    """),format.raw/*458.5*/("""}"""),format.raw/*458.6*/(""");
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
                  DATE: 2023-03-09T01:43:08.812
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/Frontend/app/views/dashboard.scala.html
                  HASH: 1b837b0cc37e2e560d38543a082b49c400957497
                  MATRIX: 952->1|1062->18|1721->649|1750->650|1791->663|1846->691|1875->692|1912->702|1953->715|1982->716|2023->729|2400->1079|2429->1080|2466->1090|2515->1111|2544->1112|2585->1125|3220->1733|3249->1734|3286->1744|3340->1770|3369->1771|3410->1784|3620->1967|3649->1968|3686->1978|3721->1985|3750->1986|3791->1999|3936->2117|3965->2118|4002->2128|4043->2141|4072->2142|4113->2155|4175->2190|4204->2191|4241->2201|4277->2209|4306->2210|4347->2223|4591->2440|4620->2441|4657->2451|4701->2467|4730->2468|4771->2481|5028->2711|5057->2712|5094->2722|5137->2737|5166->2738|5207->2751|5292->2809|5321->2810|5358->2820|5402->2836|5431->2837|5472->2850|5695->3045|5725->3046|5763->3056|5808->3072|5838->3073|5880->3086|6150->3328|6180->3329|6218->3339|6261->3353|6291->3354|6333->3367|6514->3520|6544->3521|6582->3531|6623->3543|6653->3544|6695->3557|6946->3780|6976->3781|7014->3791|7068->3816|7098->3817|7140->3830|7471->4133|7501->4134|7539->4144|7583->4159|7613->4160|7655->4173|7930->4420|7960->4421|7998->4431|8058->4462|8088->4463|8130->4476|8250->4568|8280->4569|8318->4579|8362->4594|8392->4595|8434->4608|8787->4933|8817->4934|8850->4939|10933->6994|10949->7000|11002->7031|17343->13343|17373->13344|17431->13373|17498->13411|17528->13412|17590->13445|17651->13477|17681->13478|17747->13515|17840->13579|17870->13580|17900->13581|17934->13586|17964->13587|18030->13624|18123->13688|18153->13689|18211->13718|18241->13719|18297->13746|18327->13747|21161->16553|21189->16559|21313->16655|21341->16661|22023->17314|22053->17315|22095->17328|22239->17443|22269->17444|22315->17461|22397->17514|22427->17515|22469->17529|22499->17530|22652->17654|22682->17655|22724->17668|22873->17788|22903->17789|22949->17806|23036->17864|23066->17865|23108->17879|23138->17880|23299->18012|23329->18013|23371->18026|23517->18143|23547->18144|23593->18161|23699->18238|23729->18239|23779->18260|23866->18318|23896->18319|23945->18339|23975->18340|24012->18349|24042->18350|24141->18420|24171->18421|24208->18430|24266->18460|24295->18461
                  LINES: 28->1|33->2|46->15|46->15|47->16|48->17|48->17|50->19|50->19|50->19|51->20|61->30|61->30|63->32|63->32|63->32|64->33|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|96->65|96->65|98->67|98->67|98->67|99->68|100->69|100->69|102->71|102->71|102->71|103->72|110->79|110->79|112->81|112->81|112->81|113->82|120->89|120->89|122->91|122->91|122->91|123->92|125->94|125->94|127->96|127->96|127->96|128->97|134->103|134->103|136->105|136->105|136->105|137->106|144->113|144->113|146->115|146->115|146->115|147->116|152->121|152->121|154->123|154->123|154->123|155->124|162->131|162->131|164->133|164->133|164->133|165->134|175->144|175->144|177->146|177->146|177->146|178->147|186->155|186->155|188->157|188->157|188->157|189->158|191->160|191->160|193->162|193->162|193->162|194->163|204->173|204->173|205->174|263->232|263->232|263->232|384->353|384->353|385->354|385->354|385->354|386->355|386->355|386->355|387->356|388->357|388->357|388->357|388->357|388->357|389->358|390->359|390->359|391->360|391->360|392->361|392->361|440->409|440->409|442->411|442->411|454->423|454->423|455->424|457->426|457->426|458->427|459->428|459->428|460->429|460->429|463->432|463->432|464->433|466->435|466->435|467->436|468->437|468->437|469->438|469->438|473->442|473->442|474->443|475->444|475->444|476->445|477->446|477->446|478->447|479->448|479->448|480->449|480->449|481->450|481->450|487->456|487->456|488->457|489->458|489->458
                  -- GENERATED --
              */
          