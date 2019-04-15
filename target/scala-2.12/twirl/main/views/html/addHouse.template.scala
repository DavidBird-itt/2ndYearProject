
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

object addHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.Houses],Form[models.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houseForm: Form[models.Houses], aForm: Form[models.Address], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add House", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addHouseSubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*15.10*/inputText(houseForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/inputText(houseForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*16.92*/("""
        """),_display_(/*17.10*/inputText(houseForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*17.85*/("""
        """),_display_(/*18.10*/inputText(houseForm("gardenSize"), '_label -> "Garden Size", 'class -> "form-control")),format.raw/*18.96*/("""
        """),_display_(/*19.10*/inputText(houseForm("garage"), '_label -> "Garage", 'class -> "form-control")),format.raw/*19.87*/("""

        
        """),_display_(/*22.10*/select(
            houseForm("landlord.email"),
            options(users.Landlord.options),
            '_label -> "Landlord", '_default -> "-- Choose a landlord --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*27.10*/("""
        
        
        
        """),_display_(/*31.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*31.86*/("""
        """),_display_(/*32.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*32.86*/("""
        """),_display_(/*33.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*33.79*/("""
        """),_display_(/*34.10*/inputText(aForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*34.87*/("""
        
        """),format.raw/*36.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*39.10*/inputText(houseForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*39.72*/("""
    
        """),format.raw/*41.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.HomeController.database()),format.raw/*43.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*47.6*/("""
""")))}))
      }
    }
  }

  def render(houseForm:Form[models.Houses],aForm:Form[models.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houseForm,aForm,user,env)

  def f:((Form[models.Houses],Form[models.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houseForm,aForm,user,env) => apply(houseForm,aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 15 16:02:52 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addHouse.scala.html
                  HASH: 9e33577e10d756f055b10161865e651d9092b9fc
                  MATRIX: 1024->1|1210->117|1254->115|1281->134|1308->136|1339->159|1378->161|1409->166|1475->207|1636->360|1675->362|1712->399|1749->409|1762->413|1793->423|1830->433|2022->598|2123->678|2160->688|2263->770|2300->780|2396->855|2433->865|2540->951|2577->961|2675->1038|2722->1058|2986->1301|3050->1338|3147->1414|3184->1424|3281->1500|3318->1510|3408->1579|3445->1589|3543->1666|3588->1684|3728->1797|3811->1859|3852->1873|3999->1993|4014->1999|4061->2025|4209->2143
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|53->22|58->27|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|67->36|70->39|70->39|72->41|74->43|74->43|74->43|78->47
                  -- GENERATED --
              */
          