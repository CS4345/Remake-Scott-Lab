
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


Seq[Any](format.raw/*2.1*/("""
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
                                $(document).ready(function() """),format.raw/*179.62*/("""{"""),format.raw/*179.63*/("""
                                    """),format.raw/*180.37*/("""$('#status').on('change', function() """),format.raw/*180.74*/("""{"""),format.raw/*180.75*/("""
                                        """),format.raw/*181.41*/("""if ($(this).val() == 'Student') """),format.raw/*181.73*/("""{"""),format.raw/*181.74*/("""
                                            """),format.raw/*182.45*/("""$('#degree-plan-field').show();
                                        """),format.raw/*183.41*/("""}"""),format.raw/*183.42*/(""" """),format.raw/*183.43*/("""else """),format.raw/*183.48*/("""{"""),format.raw/*183.49*/("""
                                            """),format.raw/*184.45*/("""$('#degree-plan-field').hide();
                                        """),format.raw/*185.41*/("""}"""),format.raw/*185.42*/("""
                                    """),format.raw/*186.37*/("""}"""),format.raw/*186.38*/(""");
                                """),format.raw/*187.33*/("""}"""),format.raw/*187.34*/(""");
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



                        """),_display_(/*227.26*/if(authorizeMessage!= null)/*227.53*/{_display_(Seq[Any](format.raw/*227.54*/("""
                            """),format.raw/*228.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*229.30*/authorizeMessage),format.raw/*229.46*/("""
                            """),format.raw/*230.29*/("""</div>
                            <br>
                        """)))}),format.raw/*232.26*/("""

                        """),format.raw/*234.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4 " style="background-color: darkslateblue" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
<script>
        $(document).ready(function() """),format.raw/*245.38*/("""{"""),format.raw/*245.39*/("""
            """),format.raw/*246.13*/("""$('select').formSelect();
        """),format.raw/*247.9*/("""}"""),format.raw/*247.10*/(""");
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
                  DATE: 2023-03-02T10:01:46.473
                  SOURCE: C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/register.scala.html
                  HASH: 9eae00dde369aada93397e57b68de4c9cbe351cd
                  MATRIX: 951->1|1071->28|1098->29|2828->1734|2843->1740|2895->1771|11124->9971|11154->9972|11220->10009|11286->10046|11316->10047|11386->10088|11447->10120|11477->10121|11551->10166|11652->10238|11682->10239|11712->10240|11746->10245|11776->10246|11850->10291|11951->10363|11981->10364|12047->10401|12077->10402|12141->10437|12171->10438|14808->13047|14845->13074|14885->13075|14943->13104|15047->13180|15085->13196|15143->13225|15240->13290|15295->13316|15684->13676|15714->13677|15756->13690|15818->13724|15848->13725
                  LINES: 28->1|33->2|34->3|61->30|61->30|61->30|210->179|210->179|211->180|211->180|211->180|212->181|212->181|212->181|213->182|214->183|214->183|214->183|214->183|214->183|215->184|216->185|216->185|217->186|217->186|218->187|218->187|258->227|258->227|258->227|259->228|260->229|260->229|261->230|263->232|265->234|276->245|276->245|277->246|278->247|278->247
                  -- GENERATED --
              */
          