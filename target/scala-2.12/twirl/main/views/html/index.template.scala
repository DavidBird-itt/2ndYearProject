
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home", user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
	"""),format.raw/*3.2*/("""<h1>Welcome to the Online Flea Market!</h1>
	<h3>The place where you can buy anything and sell anyting<br/> (as long as it is legal and morally sound)</h3>
""")))}),format.raw/*5.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 01 17:48:10 GMT 2018
                  SOURCE: /home/jvk/wdd1labs/LabWork/WDD1PlayLab/app/views/index.scala.html
                  HASH: 4cd752082dea538a2efd59f05eee4b753c5b0616
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1200->51|1388->210
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5
                  -- GENERATED --
              */
          