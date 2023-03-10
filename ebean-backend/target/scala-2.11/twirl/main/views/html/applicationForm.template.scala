
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

  """),_display_(/*6.4*/helper/*6.10*/.form(action = ApplicationController.submitApplication())/*6.67*/ {_display_(Seq[Any](format.raw/*6.69*/("""
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
                  DATE: Fri Mar 10 13:25:54 CST 2023
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/app/views/applicationForm.scala.html
                  HASH: 4bcc6e80627b1df34d083bfd129b9df01974d4e0
                  MATRIX: 945->108|1122->190|1152->195|1166->201|1231->258|1270->260|1301->265|1912->848|1941->849|1986->866|2054->906|2083->907|2320->1117|2333->1121|2364->1131|2569->1309|2582->1313|2612->1322|2838->1521|2851->1525|2878->1531|3094->1720|3107->1724|3134->1730|3388->1957|3401->1961|3433->1972|3670->2182|3683->2186|3722->2203|4009->2463|4022->2467|4063->2486|4336->2732|4378->2758|4418->2760|4457->2771|4500->2787|4517->2795|4550->2807|4580->2810|4597->2818|4630->2830|4680->2849|4716->2858|5035->3150|5077->3176|5117->3178|5158->3191|5201->3207|5218->3215|5251->3227|5281->3230|5298->3238|5331->3250|5383->3271|5419->3280|5729->3563|5771->3589|5811->3591|5852->3604|5895->3620|5912->3628|5945->3640|5975->3643|5992->3651|6025->3663|6077->3684|6116->3695|6428->3980|6470->4006|6510->4008|6551->4021|6594->4037|6611->4045|6644->4057|6674->4060|6691->4068|6724->4080|6776->4101|6812->4110|7095->4365|7138->4391|7179->4393|7219->4404|7263->4420|7281->4428|7315->4440|7346->4443|7364->4451|7398->4463|7449->4482|7486->4491|7923->4899|7953->4900|7988->4907|8046->4937|8075->4938
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|40->7|48->15|48->15|49->16|50->17|50->17|56->23|56->23|56->23|60->27|60->27|60->27|66->33|66->33|66->33|70->37|70->37|70->37|76->43|76->43|76->43|80->47|80->47|80->47|86->53|86->53|86->53|93->60|93->60|93->60|94->61|94->61|94->61|94->61|94->61|94->61|94->61|95->62|96->63|104->71|104->71|104->71|105->72|105->72|105->72|105->72|105->72|105->72|105->72|106->73|107->74|115->82|115->82|115->82|116->83|116->83|116->83|116->83|116->83|116->83|116->83|117->84|118->85|126->93|126->93|126->93|127->94|127->94|127->94|127->94|127->94|127->94|127->94|128->95|129->96|136->103|136->103|136->103|137->104|137->104|137->104|137->104|137->104|137->104|137->104|138->105|139->106|153->120|153->120|154->121|155->122|155->122
                  -- GENERATED --
              */
          