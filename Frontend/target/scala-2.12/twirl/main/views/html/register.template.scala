
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Register</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body >

        <header class="topbar" style="background-color: #fff; padding: 5px; text-align: center;">
            <h1 class="focused" style="font-size: 37px; color: darkslateblue; margin: 0;">
                <strong>Register</strong>
            </h1>
        </header>


        <div class="row" style="margin-top: 50px;">
            <div class="card col s4 offset-s4 " style="border-radius: 10px;">
                <div class="card-panel" style="background-color: white;">
                    <form action=""""),_display_(/*30.36*/routes/*30.42*/.HomeController.signupHandler()),format.raw/*30.73*/("""" method="GET" style="overflow-x: hidden">

                        <div class="row" style="background-color: white">
                            <div class="input-field col s12">

                                <input id="username" name="username" type="text" class="validate">
                                <label for="username">Username</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="firstname" name="firstname" type="text" class="validate">
                                <label for="firstname">First Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="lastname" name="lastname" type="text" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>

                        """),_display_(/*61.26*/if(authorizeMessage!= null)/*61.53*/{_display_(Seq[Any](format.raw/*61.54*/("""
                            """),format.raw/*62.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*63.30*/authorizeMessage),format.raw/*63.46*/("""
                            """),format.raw/*64.29*/("""</div>
                            <br>
                        """)))}),format.raw/*66.26*/("""

                        """),format.raw/*68.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4 " style="background-color: darkslateblue" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
<script>
        $(document).ready(function() """),format.raw/*79.38*/("""{"""),format.raw/*79.39*/("""
            """),format.raw/*80.13*/("""$('select').formSelect();
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/(""");
</script>
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
                  DATE: 2023-03-10T17:58:05.112
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab - Copy/Frontend/app/views/register.scala.html
                  HASH: 6de2129d6597d5c5dddc8c2449c5c2e160df9ee6
                  MATRIX: 951->1|1072->27|1102->31|2859->1763|2874->1769|2926->1800|4460->3307|4496->3334|4535->3335|4593->3365|4697->3442|4734->3458|4792->3488|4890->3555|4946->3583|5345->3954|5374->3955|5416->3969|5478->4004|5507->4005
                  LINES: 28->1|33->1|35->3|62->30|62->30|62->30|93->61|93->61|93->61|94->62|95->63|95->63|96->64|98->66|100->68|111->79|111->79|112->80|113->81|113->81
                  -- GENERATED --
              */
          