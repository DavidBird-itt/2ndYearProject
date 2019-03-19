
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

object addLandlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Landlord],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lForm: Form[models.users.Landlord], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add a Landlord", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new Landlord</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addLandlordSubmit, 'class -> "form-horizontal", 'role -> "form")/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*14.10*/inputText(lForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.81*/("""
        """),_display_(/*15.10*/inputText(lForm("fname"), '_label -> "First Name", 'class -> "form-control")),format.raw/*15.86*/("""
        """),_display_(/*16.10*/inputText(lForm("lname"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*16.85*/("""
        """),_display_(/*17.10*/inputText(lForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.87*/("""
    
        """),_display_(/*19.10*/inputText(lForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.68*/("""
    
        """),format.raw/*21.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.database()),format.raw/*23.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*27.6*/("""
""")))}))
      }
    }
  }

  def render(lForm:Form[models.users.Landlord],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(lForm,user)

  def f:((Form[models.users.Landlord],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (lForm,user) => apply(lForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 19 10:36:42 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addLandlord.scala.html
                  HASH: ccc70b2060b4c2b70a75bbfccb0ea8a17db25990
                  MATRIX: 993->1|1127->65|1171->63|1198->82|1225->84|1261->112|1300->114|1331->119|1401->164|1508->262|1548->264|1584->301|1621->311|1634->315|1665->325|1702->335|1894->500|1986->571|2023->581|2120->657|2157->667|2253->742|2290->752|2388->829|2430->844|2509->902|2550->916|2697->1036|2712->1042|2759->1068|2907->1186
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|50->19|52->21|54->23|54->23|54->23|58->27
                  -- GENERATED --
              */
          