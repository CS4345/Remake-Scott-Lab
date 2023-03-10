
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object applicationForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object applicationForm_Scope1 {
import routes._
import models.{User, Position, ApplicationFormData}
import routes.ApplicationController

class applicationForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Seq[Position],Form[ApplicationFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: User, positions: Seq[Position], applicationForm: Form[ApplicationFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

  """),_display_(/*6.4*/helper/*6.10*/.form(action = ApplicationController.submitApplication(), Symbol("id") -> "applyForm")/*6.96*/ {_display_(Seq[Any](format.raw/*6.98*/("""
    """),format.raw/*7.5*/("""<head>
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
      <script>
              $(document).ready(function()"""),format.raw/*15.43*/("""{"""),format.raw/*15.44*/("""
                """),format.raw/*16.17*/("""$('select').formSelect();
              """),format.raw/*17.15*/("""}"""),format.raw/*17.16*/(""");
      </script>
    </head>
    <div class="row">
      <div class="input-field col s6">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" value=""""),_display_(/*23.68*/user/*23.72*/.firstname),format.raw/*23.82*/("""" readonly>
      </div>
      <div class="input-field col s6">
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" value=""""),_display_(/*27.66*/user/*27.70*/.lastname),format.raw/*27.79*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s6">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value=""""),_display_(/*33.61*/user/*33.65*/.email),format.raw/*33.71*/("""" readonly>
      </div>
      <div class="input-field col s6">
        <label for="phoneNumber">Phone Number:</label>
        <input type="tel" id="phoneNumber" name="phoneNumber" value=""""),_display_(/*37.71*/user/*37.75*/.phone),format.raw/*37.81*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s6">
        <label for="degreePlan">Current Degree Plan:</label>
        <input type="text" id="degreePlan" name="degreePlan" value=""""),_display_(/*43.70*/user/*43.74*/.degreePlan),format.raw/*43.85*/("""" readonly>
      </div>
      <div class="input-field col s6">
        <label for="startingSemester">Starting Semester:</label>
        <input type="text" id="startingSemester" name="startingSemester" value=""""),_display_(/*47.82*/user/*47.86*/.startingSemester),format.raw/*47.103*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s6">
        <label for="expectedGraduation">Expected Graduation Semester:</label>
        <input type="text" id="expectedGraduation" name="expectedGraduation" value=""""),_display_(/*53.86*/user/*53.90*/.expectedGraduation),format.raw/*53.109*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="coursesTaken">Courses taken before:</label>
        <select multiple id="coursesTaken" name="coursesTaken[]" required>
        """),_display_(/*60.10*/for(position <- positions) yield /*60.36*/ {_display_(Seq[Any](format.raw/*60.38*/("""
          """),format.raw/*61.11*/("""<option value=""""),_display_(/*61.27*/position/*61.35*/.position_id),format.raw/*61.47*/("""">"""),_display_(/*61.50*/position/*61.58*/.courseTitle),format.raw/*61.70*/("""</option>
        """)))}),format.raw/*62.10*/("""
        """),format.raw/*63.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference1">1st Preference to be TA for:</label>
        <select name="preference1" required>
          <option value="" disabled selected>Select a course</option>
          """),_display_(/*71.12*/for(position <- positions) yield /*71.38*/ {_display_(Seq[Any](format.raw/*71.40*/("""
            """),format.raw/*72.13*/("""<option value=""""),_display_(/*72.29*/position/*72.37*/.position_id),format.raw/*72.49*/("""">"""),_display_(/*72.52*/position/*72.60*/.courseTitle),format.raw/*72.72*/("""</option>
          """)))}),format.raw/*73.12*/("""
        """),format.raw/*74.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference2">2nd Preference to be TA for:</label>
        <select name="preference2">
          <option value="" disabled selected>Select a course</option>
          """),_display_(/*82.12*/for(position <- positions) yield /*82.38*/ {_display_(Seq[Any](format.raw/*82.40*/("""
            """),format.raw/*83.13*/("""<option value=""""),_display_(/*83.29*/position/*83.37*/.position_id),format.raw/*83.49*/("""">"""),_display_(/*83.52*/position/*83.60*/.courseTitle),format.raw/*83.72*/("""</option>
          """)))}),format.raw/*84.12*/("""
          """),format.raw/*85.11*/("""</select>
        </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference3">3rd Preference to be TA for:</label>
        <select name="preference3">
          <option value="" disabled selected>Select a course</option>
          """),_display_(/*93.12*/for(position <- positions) yield /*93.38*/ {_display_(Seq[Any](format.raw/*93.40*/("""
            """),format.raw/*94.13*/("""<option value=""""),_display_(/*94.29*/position/*94.37*/.position_id),format.raw/*94.49*/("""">"""),_display_(/*94.52*/position/*94.60*/.courseTitle),format.raw/*94.72*/("""</option>
          """)))}),format.raw/*95.12*/("""
        """),format.raw/*96.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="coursesNotPreferred">Courses Not Preferred:</label>
        <select multiple id="coursesNotPreferred" name="coursesNotPreferred">
        """),_display_(/*103.10*/for(position <- positions) yield /*103.36*/ {_display_(Seq[Any](format.raw/*103.38*/("""
          """),format.raw/*104.11*/("""<option value=""""),_display_(/*104.27*/position/*104.35*/.position_id),format.raw/*104.47*/("""">"""),_display_(/*104.50*/position/*104.58*/.courseTitle),format.raw/*104.70*/("""</option>
        """)))}),format.raw/*105.10*/("""
        """),format.raw/*106.9*/("""</select>
      </div>
  </div>
  <div class="row">
    <div class="input-field col s6">
      <label for="resume">Resume (PDF):</label>
      <input type="file" id="resume" name="resume">
    </div>
  </div>
  <div class="row">
    <div class="input-field col s12">
      <button id="submit-app-button" type="submit" name="action">Submit</button>
    </div>
  </div>
    <script>$(document).ready(function()"""),format.raw/*120.41*/("""{"""),format.raw/*120.42*/("""
      """),format.raw/*121.7*/("""$('select').formSelect();
    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/(""");</script>
  """)))}))
      }
    }
  }

  def render(user:User,positions:Seq[Position],applicationForm:Form[ApplicationFormData]): play.twirl.api.HtmlFormat.Appendable = apply(user,positions,applicationForm)

  def f:((User,Seq[Position],Form[ApplicationFormData]) => play.twirl.api.HtmlFormat.Appendable) = (user,positions,applicationForm) => apply(user,positions,applicationForm)

  def ref: this.type = this

}


}
}

/**/
object applicationForm extends applicationForm_Scope0.applicationForm_Scope1.applicationForm
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 15:40:50 CST 2023
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/app/views/applicationForm.scala.html
                  HASH: 6028f0cdc68ac71bf89b1d1d7b0c243e94069922
                  MATRIX: 945->108|1122->190|1152->195|1166->201|1260->287|1299->289|1330->294|1941->877|1970->878|2015->895|2083->935|2112->936|2349->1146|2362->1150|2393->1160|2598->1338|2611->1342|2641->1351|2867->1550|2880->1554|2907->1560|3123->1749|3136->1753|3163->1759|3417->1986|3430->1990|3462->2001|3699->2211|3712->2215|3751->2232|4038->2492|4051->2496|4092->2515|4365->2761|4407->2787|4447->2789|4486->2800|4529->2816|4546->2824|4579->2836|4609->2839|4626->2847|4659->2859|4709->2878|4745->2887|5064->3179|5106->3205|5146->3207|5187->3220|5230->3236|5247->3244|5280->3256|5310->3259|5327->3267|5360->3279|5412->3300|5448->3309|5758->3592|5800->3618|5840->3620|5881->3633|5924->3649|5941->3657|5974->3669|6004->3672|6021->3680|6054->3692|6106->3713|6145->3724|6457->4009|6499->4035|6539->4037|6580->4050|6623->4066|6640->4074|6673->4086|6703->4089|6720->4097|6753->4109|6805->4130|6841->4139|7124->4394|7167->4420|7208->4422|7248->4433|7292->4449|7310->4457|7344->4469|7375->4472|7393->4480|7427->4492|7478->4511|7515->4520|7952->4928|7982->4929|8017->4936|8075->4966|8104->4967
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|40->7|48->15|48->15|49->16|50->17|50->17|56->23|56->23|56->23|60->27|60->27|60->27|66->33|66->33|66->33|70->37|70->37|70->37|76->43|76->43|76->43|80->47|80->47|80->47|86->53|86->53|86->53|93->60|93->60|93->60|94->61|94->61|94->61|94->61|94->61|94->61|94->61|95->62|96->63|104->71|104->71|104->71|105->72|105->72|105->72|105->72|105->72|105->72|105->72|106->73|107->74|115->82|115->82|115->82|116->83|116->83|116->83|116->83|116->83|116->83|116->83|117->84|118->85|126->93|126->93|126->93|127->94|127->94|127->94|127->94|127->94|127->94|127->94|128->95|129->96|136->103|136->103|136->103|137->104|137->104|137->104|137->104|137->104|137->104|137->104|138->105|139->106|153->120|153->120|154->121|155->122|155->122
                  -- GENERATED --
              */
          