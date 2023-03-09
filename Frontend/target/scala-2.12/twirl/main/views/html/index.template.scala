
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Login Message</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*13.34*/message),format.raw/*13.41*/("""</p>

        </header>

    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-09T11:03:05.858
                  SOURCE: C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/index.scala.html
                  HASH: 11f3681c379e97c31ea7f186c6f828467a6dffd2
                  MATRIX: 948->1|1038->24|1104->19|1134->62|1470->371|1498->378
                  LINES: 28->1|31->2|34->2|34->3|44->13|44->13
                  -- GENERATED --
              */
          