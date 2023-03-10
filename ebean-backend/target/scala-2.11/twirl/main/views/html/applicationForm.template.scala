
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
          <br>
        <select multiple id="coursesTaken" name="coursesTaken[]" required>
        """),_display_(/*61.10*/for(position <- positions) yield /*61.36*/ {_display_(Seq[Any](format.raw/*61.38*/("""
          """),format.raw/*62.11*/("""<option value=""""),_display_(/*62.27*/position/*62.35*/.position_id),format.raw/*62.47*/("""">"""),_display_(/*62.50*/position/*62.58*/.courseTitle),format.raw/*62.70*/("""</option>
        """)))}),format.raw/*63.10*/("""
        """),format.raw/*64.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference1">1st Preference to be TA for:</label>
          <br>
        <select name="preference1" required>
          """),_display_(/*72.12*/for(position <- positions) yield /*72.38*/ {_display_(Seq[Any](format.raw/*72.40*/("""
            """),format.raw/*73.13*/("""<option value=""""),_display_(/*73.29*/position/*73.37*/.position_id),format.raw/*73.49*/("""">"""),_display_(/*73.52*/position/*73.60*/.courseTitle),format.raw/*73.72*/("""</option>
          """)))}),format.raw/*74.12*/("""
        """),format.raw/*75.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference2">2nd Preference to be TA for:</label>
          <br>
        <select name="preference2">
          """),_display_(/*83.12*/for(position <- positions) yield /*83.38*/ {_display_(Seq[Any](format.raw/*83.40*/("""
            """),format.raw/*84.13*/("""<option value=""""),_display_(/*84.29*/position/*84.37*/.position_id),format.raw/*84.49*/("""">"""),_display_(/*84.52*/position/*84.60*/.courseTitle),format.raw/*84.72*/("""</option>
          """)))}),format.raw/*85.12*/("""
          """),format.raw/*86.11*/("""</select>
        </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="preference3">3rd Preference to be TA for:</label>
          <br>
        <select name="preference3">
          """),_display_(/*94.12*/for(position <- positions) yield /*94.38*/ {_display_(Seq[Any](format.raw/*94.40*/("""
            """),format.raw/*95.13*/("""<option value=""""),_display_(/*95.29*/position/*95.37*/.position_id),format.raw/*95.49*/("""">"""),_display_(/*95.52*/position/*95.60*/.courseTitle),format.raw/*95.72*/("""</option>
          """)))}),format.raw/*96.12*/("""
        """),format.raw/*97.9*/("""</select>
      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="coursesNotPreferred">Courses Not Preferred:</label>
        <select multiple id="coursesNotPreferred" name="coursesNotPreferred">
        """),_display_(/*104.10*/for(position <- positions) yield /*104.36*/ {_display_(Seq[Any](format.raw/*104.38*/("""
          """),format.raw/*105.11*/("""<option value=""""),_display_(/*105.27*/position/*105.35*/.position_id),format.raw/*105.47*/("""">"""),_display_(/*105.50*/position/*105.58*/.courseTitle),format.raw/*105.70*/("""</option>
        """)))}),format.raw/*106.10*/("""
        """),format.raw/*107.9*/("""</select>
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
    <script>$(document).ready(function()"""),format.raw/*121.41*/("""{"""),format.raw/*121.42*/("""
      """),format.raw/*122.7*/("""$('select').formSelect();
    """),format.raw/*123.5*/("""}"""),format.raw/*123.6*/(""");</script>
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
                  DATE: Fri Mar 10 15:52:35 CST 2023
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/app/views/applicationForm.scala.html
                  HASH: 07a510830dd5441b719d9b904390db8dea1527b1
                  MATRIX: 945->108|1122->190|1152->195|1166->201|1260->287|1299->289|1330->294|1941->877|1970->878|2015->895|2083->935|2112->936|2349->1146|2362->1150|2393->1160|2598->1338|2611->1342|2641->1351|2867->1550|2880->1554|2907->1560|3123->1749|3136->1753|3163->1759|3417->1986|3430->1990|3462->2001|3699->2211|3712->2215|3751->2232|4038->2492|4051->2496|4092->2515|4380->2776|4422->2802|4462->2804|4501->2815|4544->2831|4561->2839|4594->2851|4624->2854|4641->2862|4674->2874|4724->2893|4760->2902|5024->3139|5066->3165|5106->3167|5147->3180|5190->3196|5207->3204|5240->3216|5270->3219|5287->3227|5320->3239|5372->3260|5408->3269|5663->3497|5705->3523|5745->3525|5786->3538|5829->3554|5846->3562|5879->3574|5909->3577|5926->3585|5959->3597|6011->3618|6050->3629|6307->3859|6349->3885|6389->3887|6430->3900|6473->3916|6490->3924|6523->3936|6553->3939|6570->3947|6603->3959|6655->3980|6691->3989|6974->4244|7017->4270|7058->4272|7098->4283|7142->4299|7160->4307|7194->4319|7225->4322|7243->4330|7277->4342|7328->4361|7365->4370|7802->4778|7832->4779|7867->4786|7925->4816|7954->4817
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|40->7|48->15|48->15|49->16|50->17|50->17|56->23|56->23|56->23|60->27|60->27|60->27|66->33|66->33|66->33|70->37|70->37|70->37|76->43|76->43|76->43|80->47|80->47|80->47|86->53|86->53|86->53|94->61|94->61|94->61|95->62|95->62|95->62|95->62|95->62|95->62|95->62|96->63|97->64|105->72|105->72|105->72|106->73|106->73|106->73|106->73|106->73|106->73|106->73|107->74|108->75|116->83|116->83|116->83|117->84|117->84|117->84|117->84|117->84|117->84|117->84|118->85|119->86|127->94|127->94|127->94|128->95|128->95|128->95|128->95|128->95|128->95|128->95|129->96|130->97|137->104|137->104|137->104|138->105|138->105|138->105|138->105|138->105|138->105|138->105|139->106|140->107|154->121|154->121|155->122|156->123|156->123
                  -- GENERATED --
              */
          