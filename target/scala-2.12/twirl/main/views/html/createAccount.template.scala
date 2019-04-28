
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

    """),_display_(/*8.6*/form(action=routes.HomeController.addMemberSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*14.10*/inputText(mForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.81*/("""

        """),_display_(/*16.10*/inputText(mForm("fname"), '_label -> "First Name", 'class -> "form-control")),format.raw/*16.86*/("""
        """),_display_(/*17.10*/inputText(mForm("lname"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*17.85*/("""
        """),_display_(/*18.10*/inputText(mForm("phone"), '_label -> "Phone", 'class -> "form-control")),format.raw/*18.81*/("""
        """),_display_(/*19.10*/inputDate(mForm("dateJoined"), args = 'size -> 10, '_label -> "Date Joined", 'class -> "form-control")),format.raw/*19.112*/("""        
        """),_display_(/*20.10*/inputText(mForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*20.87*/("""

        """),_display_(/*22.10*/inputText(mForm("role").copy(value=Some("member")), '_label -> "", 'hidden -> "hidden")),format.raw/*22.97*/("""
        
        """),format.raw/*24.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">

        <div class="actions">
            <input type="submit" value="Create Account" class="btn btn-primary">
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.LoginController.login()),format.raw/*29.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>

        
    """)))}),format.raw/*35.6*/("""
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
                  DATE: Sun Apr 28 20:52:15 CEST 2019
                  SOURCE: /home/wdd/collegeLastThisOneActually/PlayReminder/app/views/createAccount.scala.html
                  HASH: a8d0ff3d941da2b1948e197cfef3a9f150aaf5fd
                  MATRIX: 993->1|1125->63|1169->61|1196->79|1223->81|1259->109|1298->111|1329->116|1395->157|1502->255|1542->257|1578->294|1615->304|1628->308|1659->318|1696->328|1888->493|1980->564|2018->575|2115->651|2152->661|2248->736|2285->746|2377->817|2414->827|2538->929|2583->947|2681->1024|2719->1035|2827->1122|2872->1140|3132->1373|3147->1379|3192->1403|3350->1531
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|53->22|53->22|55->24|60->29|60->29|60->29|66->35
                  -- GENERATED --
              */
          