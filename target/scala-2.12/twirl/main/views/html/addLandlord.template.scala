
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

object addLandlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Landlord],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lForm: Form[models.users.Landlord], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add a Landlord", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new Landlord</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addLandlordSubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*15.10*/inputText(lForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.81*/("""

        """),_display_(/*17.10*/inputText(lForm("fname"), '_label -> "First Name", 'class -> "form-control")),format.raw/*17.86*/("""
        """),_display_(/*18.10*/inputText(lForm("lname"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*18.85*/("""
        """),_display_(/*19.10*/inputText(lForm("phone"), '_label -> "Phone", 'class -> "form-control")),format.raw/*19.81*/("""
        """),_display_(/*20.10*/inputDate(lForm("dateJoined"), args = 'size -> 10, '_label -> "Date Joined", 'class -> "form-control")),format.raw/*20.112*/("""
        """),_display_(/*21.10*/inputText(lForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*21.87*/("""

        """),_display_(/*23.10*/inputText(lForm("role").copy(value=Some("landlord")), '_label -> "", 'hidden -> "hidden")),format.raw/*23.99*/("""

        """),format.raw/*25.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        <div class="actions">
            <input type="submit" value="Add Landlord" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.viewUsers()),format.raw/*30.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*34.6*/("""
""")))}))
      }
    }
  }

  def render(lForm:Form[models.users.Landlord],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(lForm,user,env)

  def f:((Form[models.users.Landlord],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (lForm,user,env) => apply(lForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 16:39:02 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/addLandlord.scala.html
                  HASH: c20345322cf205e8c1db61167f8cf27f149e4eb1
                  MATRIX: 1014->1|1175->92|1219->90|1246->109|1273->111|1309->139|1348->141|1379->146|1449->191|1613->347|1652->349|1689->386|1726->396|1739->400|1770->410|1807->420|1999->585|2091->656|2129->667|2226->743|2263->753|2359->828|2396->838|2488->909|2525->919|2649->1021|2686->1031|2784->1108|2822->1119|2932->1208|2969->1218|3231->1453|3246->1459|3294->1486|3442->1604
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|54->23|56->25|61->30|61->30|61->30|65->34
                  -- GENERATED --
              */
          