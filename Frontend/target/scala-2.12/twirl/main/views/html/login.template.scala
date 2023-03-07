
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
                        """),_display_(/*50.26*/if(authorizeMessage!= null)/*50.53*/{_display_(Seq[Any](format.raw/*50.54*/("""
                            """),format.raw/*51.29*/("""<div class="alert alert-primary" role="alert" style="margin-bottom: 10px;">
                                """),_display_(/*52.34*/authorizeMessage),format.raw/*52.50*/("""
                            """),format.raw/*53.29*/("""</div>
                            <br>
                        """)))}),format.raw/*55.26*/("""
                        """),format.raw/*56.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" style="background-color: darkslateblue"type="submit">Submit</button>
                        </div>
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.HomeController.signup()),format.raw/*59.65*/("""">REGISTER</a>
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
                  DATE: 2023-02-28T15:50:33.053
                  SOURCE: C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/login.scala.html
                  HASH: 191aaa03dff58266be79e581efd8bcda10fc23df
                  MATRIX: 948->1|1068->28|1095->29|1562->469|1577->475|1639->516|2895->1747|2910->1753|2961->1783|3874->2669|3910->2696|3949->2697|4006->2726|4142->2835|4179->2851|4236->2880|4332->2945|4385->2970|4652->3210|4667->3216|4712->3240
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10|65->34|65->34|65->34|81->50|81->50|81->50|82->51|83->52|83->52|84->53|86->55|87->56|90->59|90->59|90->59
                  -- GENERATED --
              */
          