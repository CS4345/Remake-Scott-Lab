
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


Seq[Any](format.raw/*1.28*/("""

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
                  DATE: 2023-03-10T17:58:05.053
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab - Copy/Frontend/app/views/login.scala.html
                  HASH: 92a3cd67c9d5e42c68a398def209fa5ca51dd79e
                  MATRIX: 948->1|1069->27|1099->31|1573->478|1588->484|1650->525|2930->1780|2945->1786|2996->1816|3923->2716|3959->2743|3998->2744|4056->2774|4193->2884|4230->2900|4288->2930|4386->2997|4440->3023|4710->3266|4725->3272|4770->3296
                  LINES: 28->1|33->1|35->3|42->10|42->10|42->10|66->34|66->34|66->34|81->49|81->49|81->49|82->50|83->51|83->51|84->52|86->54|87->55|90->58|90->58|90->58
                  -- GENERATED --
              */
          