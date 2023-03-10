
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
    """),format.raw/*7.5*/("""<div class="row">
      <div class="input-field col s6">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" value=""""),_display_(/*10.68*/user/*10.72*/.firstname),format.raw/*10.82*/("""" readonly>
      </div>
      <div class="input-field col s6">
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" value=""""),_display_(/*14.66*/user/*14.70*/.lastname),format.raw/*14.79*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s6">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value=""""),_display_(/*20.61*/user/*20.65*/.email),format.raw/*20.71*/("""" readonly>
      </div>
      <div class="input-field col s6">
        <label for="phoneNumber">Phone Number:</label>
        <input type="tel" id="phoneNumber" name="phoneNumber" value=""""),_display_(/*24.71*/user/*24.75*/.phone),format.raw/*24.81*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s6">
        <label for="degreePlan">Current Degree Plan:</label>
        <input type="text" id="degreePlan" name="degreePlan" value=""""),_display_(/*30.70*/user/*30.74*/.degreePlan),format.raw/*30.85*/("""" readonly>
      </div>
      <div class="input-field col s6">
        <label for="startingSemester">Starting Semester:</label>
        <input type="text" id="startingSemester" name="startingSemester" value=""""),_display_(/*34.82*/user/*34.86*/.startingSemester),format.raw/*34.103*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s6">
        <label for="expectedGraduation">Expected Graduation Semester:</label>
        <input type="text" id="expectedGraduation" name="expectedGraduation" value=""""),_display_(/*40.86*/user/*40.90*/.expectedGraduation),format.raw/*40.109*/("""" readonly>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="coursesTaken">Courses taken before:</label>
        <select multiple id="coursesTaken" name="coursesTaken[]" required>
        """),_display_(/*47.10*/for(position <- positions) yield /*47.36*/ {_display_(Seq[Any](format.raw/*47.38*/("""
          """),format.raw/*48.11*/("""<option value=""""),_display_(/*48.27*/position/*48.35*/.position_id),format.raw/*48.47*/("""">"""),_display_(/*48.50*/position/*48.58*/.courseTitle),format.raw/*48.70*/("""</option>
        """)))}),format.raw/*49.10*/("""
        """),format.raw/*50.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference1">1st Preference to be TA for:</label>
        <select name="preference1" required>
          <option value="" disabled selected>Select a course</option>
          """),_display_(/*58.12*/for(position <- positions) yield /*58.38*/ {_display_(Seq[Any](format.raw/*58.40*/("""
            """),format.raw/*59.13*/("""<option value=""""),_display_(/*59.29*/position/*59.37*/.position_id),format.raw/*59.49*/("""">"""),_display_(/*59.52*/position/*59.60*/.courseTitle),format.raw/*59.72*/("""</option>
          """)))}),format.raw/*60.12*/("""
        """),format.raw/*61.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference2">2nd Preference to be TA for:</label>
        <select name="preference2">
          <option value="" disabled selected>Select a course</option>
          """),_display_(/*69.12*/for(position <- positions) yield /*69.38*/ {_display_(Seq[Any](format.raw/*69.40*/("""
            """),format.raw/*70.13*/("""<option value=""""),_display_(/*70.29*/position/*70.37*/.position_id),format.raw/*70.49*/("""">"""),_display_(/*70.52*/position/*70.60*/.courseTitle),format.raw/*70.72*/("""</option>
          """)))}),format.raw/*71.12*/("""
          """),format.raw/*72.11*/("""</select>
        </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference3">3rd Preference to be TA for:</label>
        <select name="preference3">
          <option value="" disabled selected>Select a course</option>
          """),_display_(/*80.12*/for(position <- positions) yield /*80.38*/ {_display_(Seq[Any](format.raw/*80.40*/("""
            """),format.raw/*81.13*/("""<option value=""""),_display_(/*81.29*/position/*81.37*/.position_id),format.raw/*81.49*/("""">"""),_display_(/*81.52*/position/*81.60*/.courseTitle),format.raw/*81.72*/("""</option>
          """)))}),format.raw/*82.12*/("""
        """),format.raw/*83.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="coursesNotPreferred">Courses Not Preferred:</label>
        <select multiple id="coursesNotPreferred" name="coursesNotPreferred">
        """),_display_(/*90.10*/for(position <- positions) yield /*90.36*/ {_display_(Seq[Any](format.raw/*90.38*/("""
          """),format.raw/*91.11*/("""<option value=""""),_display_(/*91.27*/position/*91.35*/.position_id),format.raw/*91.47*/("""">"""),_display_(/*91.50*/position/*91.58*/.courseTitle),format.raw/*91.70*/("""</option>
        """)))}),format.raw/*92.10*/("""
        """),format.raw/*93.9*/("""</select>
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
    <script>$(document).ready(function()"""),format.raw/*107.41*/("""{"""),format.raw/*107.42*/("""
      """),format.raw/*108.7*/("""$('select').formSelect();
    """),format.raw/*109.5*/("""}"""),format.raw/*109.6*/(""");</script>
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
                  DATE: Fri Mar 10 13:13:49 CST 2023
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/app/views/applicationForm.scala.html
                  HASH: afbde24d13796e9ebefc078388b7256e64d5dda4
                  MATRIX: 945->108|1122->190|1152->195|1166->201|1231->258|1270->260|1301->265|1503->440|1516->444|1547->454|1752->632|1765->636|1795->645|2021->844|2034->848|2061->854|2277->1043|2290->1047|2317->1053|2571->1280|2584->1284|2616->1295|2853->1505|2866->1509|2905->1526|3192->1786|3205->1790|3246->1809|3519->2055|3561->2081|3601->2083|3640->2094|3683->2110|3700->2118|3733->2130|3763->2133|3780->2141|3813->2153|3863->2172|3899->2181|4218->2473|4260->2499|4300->2501|4341->2514|4384->2530|4401->2538|4434->2550|4464->2553|4481->2561|4514->2573|4566->2594|4602->2603|4912->2886|4954->2912|4994->2914|5035->2927|5078->2943|5095->2951|5128->2963|5158->2966|5175->2974|5208->2986|5260->3007|5299->3018|5611->3303|5653->3329|5693->3331|5734->3344|5777->3360|5794->3368|5827->3380|5857->3383|5874->3391|5907->3403|5959->3424|5995->3433|6277->3688|6319->3714|6359->3716|6398->3727|6441->3743|6458->3751|6491->3763|6521->3766|6538->3774|6571->3786|6621->3805|6657->3814|7094->4222|7124->4223|7159->4230|7217->4260|7246->4261
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|40->7|43->10|43->10|43->10|47->14|47->14|47->14|53->20|53->20|53->20|57->24|57->24|57->24|63->30|63->30|63->30|67->34|67->34|67->34|73->40|73->40|73->40|80->47|80->47|80->47|81->48|81->48|81->48|81->48|81->48|81->48|81->48|82->49|83->50|91->58|91->58|91->58|92->59|92->59|92->59|92->59|92->59|92->59|92->59|93->60|94->61|102->69|102->69|102->69|103->70|103->70|103->70|103->70|103->70|103->70|103->70|104->71|105->72|113->80|113->80|113->80|114->81|114->81|114->81|114->81|114->81|114->81|114->81|115->82|116->83|123->90|123->90|123->90|124->91|124->91|124->91|124->91|124->91|124->91|124->91|125->92|126->93|140->107|140->107|141->108|142->109|142->109
                  -- GENERATED --
              */
          