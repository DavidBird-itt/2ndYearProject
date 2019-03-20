
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

object createAccount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(createForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Create Account", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class="lead">Create Account</p>

    """),_display_(/*8.6*/form(action=routes.LoginController.createAccount, 'class -> "form-horizontal", 'role -> "form")/*8.101*/ {_display_(Seq[Any](format.raw/*8.103*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*14.10*/inputText(createForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.86*/("""
        """),_display_(/*15.10*/inputText(createForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.84*/("""
        """),_display_(/*16.10*/inputText(createForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.92*/("""
        """),_display_(/*17.10*/inputText(createForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*17.84*/("""
        
        """),format.raw/*19.9*/("""<div class="actions">
            <input type="submit" value="Create Account" class="btn btn-primary">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.LoginController.login()),format.raw/*21.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(createForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(createForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (createForm,user) => apply(createForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 16:06:24 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/createAccount.scala.html
                  HASH: 916c1b9ced4840296eca38117d373377f0baf9f3
                  MATRIX: 991->1|1126->66|1170->64|1197->82|1224->84|1260->112|1299->114|1330->119|1396->160|1500->255|1540->257|1576->294|1613->304|1626->308|1657->318|1694->328|1886->493|1983->569|2020->579|2115->653|2152->663|2255->745|2292->755|2387->829|2432->847|2584->972|2599->978|2644->1002|2792->1120
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|52->21|52->21|52->21|56->25
                  -- GENERATED --
              */
          