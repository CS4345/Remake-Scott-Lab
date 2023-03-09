
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Southern Methodist University</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.at("stylesheets/materialize.css")),format.raw/*10.86*/("""">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
        integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
        integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
        crossorigin=""></script>
    </head>
    <body>

        <header class="topbar" style="background-color: #fff; padding: 5px; text-align: center;">
            <h1 class="focused" style="font-size: 37px; color: darkslateblue; margin: 0;">
                <strong>Southern Methodist University</strong>
            </h1>
        </header>


        <div class="row" style=" justify-content: center;">
            <div class="card col s4 offset-s4 " style="margin-top: 50px;">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.loginHandler()),format.raw/*34.72*/("""" method="GET">
                        <div class="row" style="margin-bottom: 0;">
                            <div class="input-field col s12" style="margin-bottom: 0;">

                                <input id="username" name="username" type="text" class="validate">
                                <label for="username" style="margin-left: 10px;">Username</label>
                            </div>
                        </div>
                        <div class="row" style="margin-bottom: 0;">
                            <div class="input-field col s12" style="margin-bottom: 0;">

                                <input id="password" name="password" type="password" class="validate">
                                <label for="password" style="margin-left: 10px;">Password</label>
                            </div>
                        </div>
                        """),_display_(/*49.26*/if(authorizeMessage!= null)/*49.53*/{_display_(Seq[Any](format.raw/*49.54*/("""
                            """),format.raw/*50.29*/("""<div class="alert alert-primary" role="alert" style="margin-bottom: 10px;">
                                """),_display_(/*51.34*/authorizeMessage),format.raw/*51.50*/("""
                            """),format.raw/*52.29*/("""</div>
                            <br>
                        """)))}),format.raw/*54.26*/("""
                        """),format.raw/*55.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" style="background-color: darkslateblue"type="submit">Submit</button>
                        </div>
                        <a href=""""),_display_(/*58.35*/routes/*58.41*/.HomeController.signup()),format.raw/*58.65*/("""">REGISTER</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-09T00:02:12.948
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/Frontend/app/views/login.scala.html
                  HASH: 5c19997eade27cee15ff5b2a02a323ef28aad9c2
                  MATRIX: 948->1|1068->28|1095->29|1562->469|1577->475|1639->516|2895->1747|2910->1753|2961->1783|3873->2668|3909->2695|3948->2696|4005->2725|4141->2834|4178->2850|4235->2879|4331->2944|4384->2969|4651->3209|4666->3215|4711->3239
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10|65->34|65->34|65->34|80->49|80->49|80->49|81->50|82->51|82->51|83->52|85->54|86->55|89->58|89->58|89->58
                  -- GENERATED --
              */
          