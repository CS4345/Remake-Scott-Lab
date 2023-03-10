
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object info_Scope0 {
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

class info extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(infoMessages: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
            color: #57a957">
                <strong>User Info</strong>
            </h1>
        </header>
        """),_display_(/*11.10*/for(infoMessage <- infoMessages) yield /*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
            """),format.raw/*12.13*/("""<li>"""),_display_(/*12.18*/infoMessage),format.raw/*12.29*/("""</li>
        """)))}),format.raw/*13.10*/("""
    """),format.raw/*14.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(infoMessages:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(infoMessages)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (infoMessages) => apply(infoMessages)

  def ref: this.type = this

}


}

/**/
object info extends info_Scope0.info
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 13:13:49 CST 2023
                  SOURCE: /Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/app/views/info.scala.html
                  HASH: e5d7ac998728e820079b20e0f174d3c35279f0e4
                  MATRIX: 748->1|870->28|897->29|1163->268|1211->300|1251->302|1292->315|1324->320|1356->331|1402->346|1434->351
                  LINES: 27->1|32->1|33->2|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14
                  -- GENERATED --
              */
          