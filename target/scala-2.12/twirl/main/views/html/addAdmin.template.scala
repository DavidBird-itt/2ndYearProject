
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Admin],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(aForm: Form[models.users.Admin], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add an Admin", user)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new Landlord</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addAdminSubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*15.10*/inputText(aForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.81*/("""

        """),_display_(/*17.10*/inputText(aForm("fname"), '_label -> "First Name", 'class -> "form-control")),format.raw/*17.86*/("""
        """),_display_(/*18.10*/inputText(aForm("lname"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*18.85*/("""
        """),_display_(/*19.10*/inputText(aForm("phone"), '_label -> "Phone", 'class -> "form-control")),format.raw/*19.81*/("""
        """),_display_(/*20.10*/inputDate(aForm("dateJoined"), args = 'size -> 10, '_label -> "Date Joined", 'class -> "form-control")),format.raw/*20.112*/("""
        """),_display_(/*21.10*/inputText(aForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*21.87*/("""

        """),_display_(/*23.10*/inputText(aForm("role").copy(value=Some("admin")), '_label -> "", 'hidden -> "hidden")),format.raw/*23.96*/("""

        """),format.raw/*25.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        <div class="actions">
            <input type="submit" value="Add Admin" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.viewUsers()),format.raw/*30.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*35.6*/("""
""")))}))
      }
    }
  }

  def render(aForm:Form[models.users.Admin],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(aForm,user,env)

  def f:((Form[models.users.Admin],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (aForm,user,env) => apply(aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 24 11:41:43 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addAdmin.scala.html
                  HASH: 7187e034b26abdbda95eaa7e622e3623b432772e
                  MATRIX: 1008->1|1166->89|1210->87|1237->106|1264->108|1298->134|1337->136|1368->141|1438->186|1599->339|1638->341|1675->378|1712->388|1725->392|1756->402|1793->412|1985->577|2077->648|2115->659|2212->735|2249->745|2345->820|2382->830|2474->901|2511->911|2635->1013|2672->1023|2770->1100|2808->1111|2915->1197|2952->1207|3211->1439|3226->1445|3274->1472|3423->1591
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|54->23|56->25|61->30|61->30|61->30|66->35
                  -- GENERATED --
              */
          