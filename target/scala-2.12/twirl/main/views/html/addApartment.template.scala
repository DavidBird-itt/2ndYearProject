
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

object addApartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Apartment],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(aForm: Form[models.Apartment], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Apartment", user)/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addApartmentSubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*15.10*/inputText(aForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*15.86*/("""
        """),_display_(/*16.10*/inputText(aForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*16.88*/("""
        """),_display_(/*17.10*/inputText(aForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*17.81*/("""
        """),_display_(/*18.10*/inputText(aForm("floor"), '_label -> "Floor", 'class -> "form-control")),format.raw/*18.81*/("""

        """),format.raw/*20.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*23.10*/inputText(aForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.68*/("""
    
        """),format.raw/*25.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*27.23*/routes/*27.29*/.HomeController.database()),format.raw/*27.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*31.6*/("""
""")))}))
      }
    }
  }

  def render(aForm:Form[models.Apartment],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(aForm,user,env)

  def f:((Form[models.Apartment],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (aForm,user,env) => apply(aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 01 12:54:22 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addApartment.scala.html
                  HASH: 2977d980ba2d38661bd8fbd2261fb612d7882cc6
                  MATRIX: 1010->1|1166->87|1210->85|1237->104|1264->106|1299->133|1338->135|1369->140|1435->181|1600->338|1639->340|1676->377|1713->387|1726->391|1757->401|1794->411|1986->576|2083->652|2120->662|2219->740|2256->750|2348->821|2385->831|2477->902|2514->912|2654->1025|2733->1083|2774->1097|2921->1217|2936->1223|2983->1249|3131->1367
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|54->23|54->23|56->25|58->27|58->27|58->27|62->31
                  -- GENERATED --
              */
          