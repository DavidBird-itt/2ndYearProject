
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

object createAccount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Member],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mForm: Form[models.users.Member], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Create Account", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class="lead">Create Account</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addMemberSubmit, 'class -> "form-horizontal", 'role -> "form")/*8.102*/ {_display_(Seq[Any](format.raw/*8.104*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*14.10*/inputText(mForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.81*/("""
        """),_display_(/*15.10*/inputText(mForm("fname"), '_label -> "First Name", 'class -> "form-control")),format.raw/*15.86*/("""
        """),_display_(/*16.10*/inputText(mForm("lname"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*16.85*/("""        
        """),_display_(/*17.10*/inputText(mForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.87*/("""

        """),_display_(/*19.10*/inputText(mForm("role").copy(value=Some("member")), '_label -> "", 'hidden -> "hidden")),format.raw/*19.97*/("""
        """),_display_(/*20.10*/inputText(mForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.71*/("""
        
        """),format.raw/*22.9*/("""<div class="actions">
            <input type="submit" value="Create Account" class="btn btn-primary">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.LoginController.login()),format.raw/*24.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*28.6*/("""
""")))}))
      }
    }
  }

  def render(mForm:Form[models.users.Member],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(mForm,user)

  def f:((Form[models.users.Member],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (mForm,user) => apply(mForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 25 17:00:46 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/createAccount.scala.html
                  HASH: 88bdc1fcf755601de41ab9a6acbe75a1668e6d13
                  MATRIX: 993->1|1125->63|1169->61|1196->79|1223->81|1259->109|1298->111|1329->116|1395->157|1500->253|1540->255|1576->292|1613->302|1626->306|1657->316|1694->326|1886->491|1978->562|2015->572|2112->648|2149->658|2245->733|2290->751|2388->828|2426->839|2534->926|2571->936|2653->997|2698->1015|2850->1140|2865->1146|2910->1170|3058->1288
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|50->19|51->20|51->20|53->22|55->24|55->24|55->24|59->28
                  -- GENERATED --
              */
          