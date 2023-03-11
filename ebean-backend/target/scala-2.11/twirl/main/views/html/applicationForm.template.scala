
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

  """),_display_(/*6.4*/helper/*6.10*/.form(action = ApplicationController.submitApplication(user.username), Symbol("id") -> "applyForm")/*6.109*/ {_display_(Seq[Any](format.raw/*6.111*/("""
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
    <div id="applyForm">
      <div class="row">
        <div class="input-field col s6">
          <label for="firstName">First Name:</label>
          <input type="text" id="firstName" name="firstName" value=""""),_display_(/*24.70*/user/*24.74*/.firstname),format.raw/*24.84*/("""" readonly>
        </div>
        <div class="input-field col s6">
          <label for="lastName">Last Name:</label>
          <input type="text" id="lastName" name="lastName" value=""""),_display_(/*28.68*/user/*28.72*/.lastname),format.raw/*28.81*/("""" readonly>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s6">
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" value=""""),_display_(/*34.63*/user/*34.67*/.email),format.raw/*34.73*/("""" readonly>
        </div>
        <div class="input-field col s6">
          <label for="phoneNumber">Phone Number:</label>
          <input type="tel" id="phoneNumber" name="phoneNumber" value=""""),_display_(/*38.73*/user/*38.77*/.phone),format.raw/*38.83*/("""" readonly>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s6">
          <label for="degreePlan">Current Degree Plan:</label>
          <input type="text" id="degreePlan" name="degreePlan" value=""""),_display_(/*44.72*/user/*44.76*/.degreePlan),format.raw/*44.87*/("""" readonly>
        </div>
        <div class="input-field col s6">
          <label for="startingSemester">Starting Semester:</label>
          <input type="text" id="startingSemester" name="startingSemester" value=""""),_display_(/*48.84*/user/*48.88*/.startingSemester),format.raw/*48.105*/("""" readonly>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s6">
          <label for="expectedGraduation">Expected Graduation Semester:</label>
          <input type="text" id="expectedGraduation" name="expectedGraduation" value=""""),_display_(/*54.88*/user/*54.92*/.expectedGraduation),format.raw/*54.111*/("""" readonly>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <label for="coursesTaken">Courses taken before:</label>
            <br>
          <select multiple id="coursesTaken" name="coursesTaken[]">
          """),_display_(/*62.12*/for(position <- positions) yield /*62.38*/ {_display_(Seq[Any](format.raw/*62.40*/("""
            """),format.raw/*63.13*/("""<option value=""""),_display_(/*63.29*/position/*63.37*/.position_id),format.raw/*63.49*/("""">"""),_display_(/*63.52*/position/*63.60*/.courseTitle),format.raw/*63.72*/("""</option>
          """)))}),format.raw/*64.12*/("""
          """),format.raw/*65.11*/("""</select>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <label for="preference1">1st Preference to be TA for:</label>
            <br>
          <select name="pref_one" required>
            """),_display_(/*73.14*/for(position <- positions) yield /*73.40*/ {_display_(Seq[Any](format.raw/*73.42*/("""
              """),format.raw/*74.15*/("""<option value=""""),_display_(/*74.31*/position/*74.39*/.position_id),format.raw/*74.51*/("""">"""),_display_(/*74.54*/position/*74.62*/.courseTitle),format.raw/*74.74*/("""</option>
            """)))}),format.raw/*75.14*/("""
          """),format.raw/*76.11*/("""</select>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <label for="preference2">2nd Preference to be TA for:</label>
            <br>
          <select name="pref_two">
            """),_display_(/*84.14*/for(position <- positions) yield /*84.40*/ {_display_(Seq[Any](format.raw/*84.42*/("""
              """),format.raw/*85.15*/("""<option value=""""),_display_(/*85.31*/position/*85.39*/.position_id),format.raw/*85.51*/("""">"""),_display_(/*85.54*/position/*85.62*/.courseTitle),format.raw/*85.74*/("""</option>
            """)))}),format.raw/*86.14*/("""
            """),format.raw/*87.13*/("""</select>
          </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <label for="preference3">3rd Preference to be TA for:</label>
            <br>
          <select name="pref_three">
            """),_display_(/*95.14*/for(position <- positions) yield /*95.40*/ {_display_(Seq[Any](format.raw/*95.42*/("""
              """),format.raw/*96.15*/("""<option value=""""),_display_(/*96.31*/position/*96.39*/.position_id),format.raw/*96.51*/("""">"""),_display_(/*96.54*/position/*96.62*/.courseTitle),format.raw/*96.74*/("""</option>
            """)))}),format.raw/*97.14*/("""
          """),format.raw/*98.11*/("""</select>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <label for="coursesNotPreferred">Courses Not Preferred:</label>
          <select multiple id="coursesNotPreferred" name="coursesNotPreferred">
          """),_display_(/*105.12*/for(position <- positions) yield /*105.38*/ {_display_(Seq[Any](format.raw/*105.40*/("""
            """),format.raw/*106.13*/("""<option value=""""),_display_(/*106.29*/position/*106.37*/.position_id),format.raw/*106.49*/("""">"""),_display_(/*106.52*/position/*106.60*/.courseTitle),format.raw/*106.72*/("""</option>
          """)))}),format.raw/*107.12*/("""
          """),format.raw/*108.11*/("""</select>
        </div>
    </div>
    <div class="row">
        <label for="resume">Resume (PDF):</label>
        <input type="file" id="resume" name="resume">
    </div>
    <div class="row">
      <div class="input-field col s12">
        <button id="submit-app-button" type="submit" name="action">Submit</button>
      </div>
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
                  DATE: Fri Mar 10 21:38:25 CST 2023
                  SOURCE: C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab - Copy/ebean-backend/app/views/applicationForm.scala.html
                  HASH: abf9e38ea13d10da13e387f4f8e67595cac4071b
                  MATRIX: 945->111|1122->193|1154->200|1168->206|1276->305|1316->307|1348->313|1967->904|1996->905|2042->923|2111->964|2140->965|2417->1215|2430->1219|2461->1229|2678->1419|2691->1423|2721->1432|2965->1649|2978->1653|3005->1659|3233->1860|3246->1864|3273->1870|3545->2115|3558->2119|3590->2130|3839->2352|3852->2356|3891->2373|4196->2651|4209->2655|4250->2674|4553->2950|4595->2976|4635->2978|4677->2992|4720->3008|4737->3016|4770->3028|4800->3031|4817->3039|4850->3051|4903->3073|4943->3085|5228->3343|5270->3369|5310->3371|5354->3387|5397->3403|5414->3411|5447->3423|5477->3426|5494->3434|5527->3446|5582->3470|5622->3482|5898->3731|5940->3757|5980->3759|6024->3775|6067->3791|6084->3799|6117->3811|6147->3814|6164->3822|6197->3834|6252->3858|6294->3872|6574->4125|6616->4151|6656->4153|6700->4169|6743->4185|6760->4193|6793->4205|6823->4208|6840->4216|6873->4228|6928->4252|6968->4264|7272->4540|7315->4566|7356->4568|7399->4582|7443->4598|7461->4606|7495->4618|7526->4621|7544->4629|7578->4641|7632->4663|7673->4675|8108->5081|8138->5082|8174->5090|8233->5121|8262->5122
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|40->7|48->15|48->15|49->16|50->17|50->17|57->24|57->24|57->24|61->28|61->28|61->28|67->34|67->34|67->34|71->38|71->38|71->38|77->44|77->44|77->44|81->48|81->48|81->48|87->54|87->54|87->54|95->62|95->62|95->62|96->63|96->63|96->63|96->63|96->63|96->63|96->63|97->64|98->65|106->73|106->73|106->73|107->74|107->74|107->74|107->74|107->74|107->74|107->74|108->75|109->76|117->84|117->84|117->84|118->85|118->85|118->85|118->85|118->85|118->85|118->85|119->86|120->87|128->95|128->95|128->95|129->96|129->96|129->96|129->96|129->96|129->96|129->96|130->97|131->98|138->105|138->105|138->105|139->106|139->106|139->106|139->106|139->106|139->106|139->106|140->107|141->108|154->121|154->121|155->122|156->123|156->123
                  -- GENERATED --
              */
          