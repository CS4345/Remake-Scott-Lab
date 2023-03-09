
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
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Job Dashboard</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link rel="stylesheet" href="path/to/custom.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <style>
        body """),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""
            """),format.raw/*14.13*/("""overflow-y: hidden;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        """),format.raw/*16.9*/(""".paper-modal """),format.raw/*16.22*/("""{"""),format.raw/*16.23*/("""
            """),format.raw/*17.13*/("""background-color: #fff;
            border-radius: 2px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin: 0 auto;
            top: 10px;
            overflow-y: auto;
            position: relative;
            padding: 24px;
            width: calc(100% - 32px);
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        """),format.raw/*28.9*/(""".paper-modal-overlay """),format.raw/*28.30*/("""{"""),format.raw/*28.31*/("""
            """),format.raw/*29.13*/("""position: fixed;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: rgba(0, 0, 0, 0.6); /* semi-transparent black background */
            display: flex;
            justify-content: center;
            align-items: center;
            overflow-y: scroll; /* enable vertical scrolling */
            z-index: 100; /* ensure that the overlay is on top of other elements */
            opacity: 0;
            visibility: hidden;
            transition: opacity 0.5s ease, visibility 0s linear 0.5s;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""

        """),format.raw/*45.9*/(""".paper-modal-overlay.show """),format.raw/*45.35*/("""{"""),format.raw/*45.36*/("""
            """),format.raw/*46.13*/("""visibility: visible;
            opacity: 1;
            transition: opacity 0.5s ease, visibility 0s linear 0s;
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""

        """),format.raw/*51.9*/("""header """),format.raw/*51.16*/("""{"""),format.raw/*51.17*/("""
            """),format.raw/*52.13*/("""height: 80px;
            display: flex;
            justify-content: center;
            align-items: center;
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""

        """),format.raw/*58.9*/(""".nav-wrapper """),format.raw/*58.22*/("""{"""),format.raw/*58.23*/("""
            """),format.raw/*59.13*/("""background-color: #6c63ff;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""

        """),format.raw/*62.9*/(""".navbar """),format.raw/*62.17*/("""{"""),format.raw/*62.18*/("""
            """),format.raw/*63.13*/("""border-radius: 30px;
            width: 80%;
            max-width: 1200px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 20px;
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""

        """),format.raw/*72.9*/(""".dashboard-main """),format.raw/*72.25*/("""{"""),format.raw/*72.26*/("""
            """),format.raw/*73.13*/("""display: flex;
            flex-direction: row;
            width: 100vw;
            height: calc(100vh - 60px);
            background-color: rgba(0, 0, 0, 0.05);
            padding: 2%;
            overflow-y: hidden;
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/("""

        """),format.raw/*82.9*/(""".position-list """),format.raw/*82.24*/("""{"""),format.raw/*82.25*/("""
            """),format.raw/*83.13*/("""max-height: 65vh;
            overflow-y: scroll;
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/("""

        """),format.raw/*87.9*/(""".jobs-container """),format.raw/*87.25*/("""{"""),format.raw/*87.26*/("""
            """),format.raw/*88.13*/("""width: 70%;
            background-color: #fff;
            border-radius: 1.75rem;
            flex: 1;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""
        """),format.raw/*95.9*/(""".user-container """),format.raw/*95.25*/("""{"""),format.raw/*95.26*/("""
            """),format.raw/*96.13*/("""width: calc(100% - 70%);
            height: 100%;
            background-color: #fff;
            border-radius: 1.75rem;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 2%;
            margin-left: 2%;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
        """),format.raw/*104.9*/(""".model-header """),format.raw/*104.23*/("""{"""),format.raw/*104.24*/("""
            """),format.raw/*105.13*/("""font-size: 24px;
            font-weight: bold;
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
        """),format.raw/*108.9*/(""".user-modal """),format.raw/*108.21*/("""{"""),format.raw/*108.22*/("""
            """),format.raw/*109.13*/("""width: "100%";
            /* background-color: gray; */
            height: 70%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/("""
        """),format.raw/*117.9*/("""#complete-profile-button """),format.raw/*117.34*/("""{"""),format.raw/*117.35*/("""
            """),format.raw/*118.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
            display: block;
            margin: 0 auto;
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/("""

        """),format.raw/*130.9*/("""#apply-general """),format.raw/*130.24*/("""{"""),format.raw/*130.25*/("""
            """),format.raw/*131.13*/("""background-color: #6c63ff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            transition: all 0.3s ease;
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/("""

        """),format.raw/*141.9*/("""#complete-profile-button:hover """),format.raw/*141.40*/("""{"""),format.raw/*141.41*/("""
            """),format.raw/*142.13*/("""background-color: #594dc2;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/("""
        """),format.raw/*145.9*/("""#position-card """),format.raw/*145.24*/("""{"""),format.raw/*145.25*/("""
            """),format.raw/*146.13*/("""width: 98%;
            height: 100%;
            padding: 5px;
            border-radius: 10px;
            display: flex;
            flex-direction: row;
            align-items: center;
            border: 0.5px solid black;
            box-shadow: 2px 2px 4px rgba(0,0,0,0.2);
            overflow-y: scroll;
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""
    """),format.raw/*157.5*/("""</style>
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
                    <form method="GET">

                        <div class="input-field col s12">
                            <label for="title">Title</label>
                            <input type="text" name="title" id="title">
                        </div>

                        <div class="input-field col s12">
                            <label for="position">Position</label>
                            <input type="text" name="position" id="position">
                        </div>

                        <div class="input-field col s12">
                            <label for="affiliation">Affiliation</label>
                            <input type="text" name="affiliation" id="affiliation">
                        </div>

                        <div class="input-field col s12">
                            <label for="phone">Phone</label>
                            <input type="text" name="phone" id="phone">
                        </div>

                        <div class="input-field col s12">
                            <label for="fax">Fax</label>
                            <input type="text" name="fax" id="fax">
                        </div>

                        <div class="input-field col s12">
                            <label for="address">Address</label>
                            <input type="text" name="address" id="address">
                        </div>

                        <div class="input-field col s12">
                            <label for="city">City</label>
                            <input type="text" name="city" id="city">
                        </div>

                        <div class="input-field col s12">
                            <label for="countryRegion">Country/Region</label>
                            <input type="text" name="countryRegion" id="countryRegion">
                        </div>

                        <div class="input-field col s12">
                            <label for="zipcode">Zip Code</label>
                            <input type="text" name="zipcode" id="zipcode">
                        </div>

                        <div class="input-field col s12">
                            <label for="comments">Comments</label>
                            <textarea name="comments" id="comments"></textarea>
                        </div>

                        <div class="input-field col s12">
                            <button id="complete-profile-button" type="submit" name="action">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
        <script src="assets/javascripts/fetchJobs.js"></script>
        <script id="profile" src="assets/javascripts/fetchProfileState.js" username="""),_display_(/*275.86*/username),format.raw/*275.94*/("""> </script>
        <script>
    // Get the "Complete Profile" button and the paper modal overlay
    const applyButton = document.getElementById("apply-general")
    const completeProfileButton = document.getElementById("complete-profile-button");
    const paperModalOverlay = document.querySelector(".paper-modal-overlay");
    const paperModalOverlayApply = document.getElementById("modal-apply")

    // Hide the paper modal overlay by default
    paperModalOverlay.style.display = "none";

    // Add a click event listener to the "Complete Profile" button
    completeProfileButton.addEventListener("click", () => """),format.raw/*287.59*/("""{"""),format.raw/*287.60*/("""
        """),format.raw/*288.9*/("""// Show the paper modal overlay
        paperModalOverlay.style.display = "flex";
        setTimeout(() => """),format.raw/*290.26*/("""{"""),format.raw/*290.27*/("""
            """),format.raw/*291.13*/("""paperModalOverlay.classList.add("show");
        """),format.raw/*292.9*/("""}"""),format.raw/*292.10*/(""", 0);
    """),format.raw/*293.5*/("""}"""),format.raw/*293.6*/(""");

    // Add a click even listener when user click "Apply" button
    applyButton.addEventListener("click", () => """),format.raw/*296.49*/("""{"""),format.raw/*296.50*/("""
        """),format.raw/*297.9*/("""// Show the paper modal overaly
        paperModalOverlayApply.style.display = "flex";
        setTimeout(() => """),format.raw/*299.26*/("""{"""),format.raw/*299.27*/("""
            """),format.raw/*300.13*/("""paperModalOverlayApply.classList.add("show");
        """),format.raw/*301.9*/("""}"""),format.raw/*301.10*/(""", 0);
    """),format.raw/*302.5*/("""}"""),format.raw/*302.6*/(""")


    // Add a click event listener to the paper modal overlay
    paperModalOverlay.addEventListener("click", (event) => """),format.raw/*306.60*/("""{"""),format.raw/*306.61*/("""
        """),format.raw/*307.9*/("""// If the user clicked outside the paper modal, hide the overlay
        if (event.target === paperModalOverlay) """),format.raw/*308.49*/("""{"""),format.raw/*308.50*/("""
            """),format.raw/*309.13*/("""paperModalOverlay.classList.remove("show");
            setTimeout(() => """),format.raw/*310.30*/("""{"""),format.raw/*310.31*/("""
                """),format.raw/*311.17*/("""paperModalOverlay.style.display = "none";
            """),format.raw/*312.13*/("""}"""),format.raw/*312.14*/(""", 500);
        """),format.raw/*313.9*/("""}"""),format.raw/*313.10*/("""
    """),format.raw/*314.5*/("""}"""),format.raw/*314.6*/(""");
</script>

    </body>"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-08T17:43:07.551
                  SOURCE: C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/dashboard.scala.html
                  HASH: 288277340c5c3d19c841b1c13202979ca7c5c252
                  MATRIX: 952->1|1065->19|1093->21|1836->736|1865->737|1907->751|1963->780|1992->781|2029->791|2070->804|2099->805|2141->819|2507->1158|2536->1159|2573->1169|2622->1190|2651->1191|2693->1205|3306->1791|3335->1792|3374->1804|3428->1830|3457->1831|3499->1845|3650->1969|3679->1970|3718->1982|3753->1989|3782->1990|3824->2004|3974->2127|4003->2128|4042->2140|4083->2153|4112->2154|4154->2168|4217->2204|4246->2205|4285->2217|4321->2225|4350->2226|4392->2240|4643->2464|4672->2465|4711->2477|4755->2493|4784->2494|4826->2508|5090->2745|5119->2746|5158->2758|5201->2773|5230->2774|5272->2788|5359->2848|5388->2849|5427->2861|5471->2877|5500->2878|5542->2892|5770->3093|5799->3094|5836->3104|5880->3120|5909->3121|5951->3135|6228->3384|6258->3385|6296->3395|6339->3409|6369->3410|6412->3424|6498->3482|6528->3483|6566->3493|6607->3505|6637->3506|6680->3520|6938->3750|6968->3751|7006->3761|7060->3786|7090->3787|7133->3801|7474->4114|7504->4115|7544->4127|7588->4142|7618->4143|7661->4157|7944->4412|7974->4413|8014->4425|8074->4456|8104->4457|8147->4471|8269->4565|8299->4566|8337->4576|8381->4591|8411->4592|8454->4606|8814->4938|8844->4939|8878->4945|14007->10046|14037->10054|14699->10687|14729->10688|14767->10698|14905->10807|14935->10808|14978->10822|15056->10872|15086->10873|15125->10884|15154->10885|15302->11004|15332->11005|15370->11015|15513->11129|15543->11130|15586->11144|15669->11199|15699->11200|15738->11211|15767->11212|15924->11340|15954->11341|15992->11351|16135->11465|16165->11466|16208->11480|16311->11554|16341->11555|16388->11573|16472->11628|16502->11629|16547->11646|16577->11647|16611->11653|16640->11654
                  LINES: 28->1|33->1|34->2|45->13|45->13|46->14|47->15|47->15|48->16|48->16|48->16|49->17|59->27|59->27|60->28|60->28|60->28|61->29|75->43|75->43|77->45|77->45|77->45|78->46|81->49|81->49|83->51|83->51|83->51|84->52|88->56|88->56|90->58|90->58|90->58|91->59|92->60|92->60|94->62|94->62|94->62|95->63|102->70|102->70|104->72|104->72|104->72|105->73|112->80|112->80|114->82|114->82|114->82|115->83|117->85|117->85|119->87|119->87|119->87|120->88|126->94|126->94|127->95|127->95|127->95|128->96|135->103|135->103|136->104|136->104|136->104|137->105|139->107|139->107|140->108|140->108|140->108|141->109|148->116|148->116|149->117|149->117|149->117|150->118|160->128|160->128|162->130|162->130|162->130|163->131|171->139|171->139|173->141|173->141|173->141|174->142|176->144|176->144|177->145|177->145|177->145|178->146|188->156|188->156|189->157|307->275|307->275|319->287|319->287|320->288|322->290|322->290|323->291|324->292|324->292|325->293|325->293|328->296|328->296|329->297|331->299|331->299|332->300|333->301|333->301|334->302|334->302|338->306|338->306|339->307|340->308|340->308|341->309|342->310|342->310|343->311|344->312|344->312|345->313|345->313|346->314|346->314
                  -- GENERATED --
              */
          