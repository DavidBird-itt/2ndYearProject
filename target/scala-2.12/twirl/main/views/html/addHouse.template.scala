
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

object addHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.products.Houses],Form[models.products.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houseForm: Form[models.products.Houses], aForm: Form[models.products.Address], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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

        """),_display_(/*21.10*/if((user != null) && ("admin".equals(user.getRole())))/*21.64*/{_display_(Seq[Any](format.raw/*21.65*/("""
            """),_display_(/*22.14*/select(
                houseForm("landlord.email"),
                options(users.Landlord.options),
                '_label -> "Landlord", '_default -> "-- Choose a landlord --",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*27.14*/("""
        """)))}/*28.11*/else/*28.16*/{_display_(Seq[Any](format.raw/*28.17*/("""
            """),_display_(/*29.14*/inputText(houseForm("landlord.email").copy(value=Some(user.getEmail())), '_label -> "", 'hidden -> "hidden")),format.raw/*29.122*/("""
        """)))}),format.raw/*30.10*/("""
        
        """),_display_(/*32.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*32.86*/("""
        """),_display_(/*33.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*33.86*/("""
        """),_display_(/*34.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*34.79*/("""
        """),_display_(/*35.10*/inputText(aForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*35.87*/("""
        
        """),format.raw/*37.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*40.10*/inputText(houseForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*40.72*/("""
    
        """),format.raw/*42.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.HomeController.database()),format.raw/*44.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*48.6*/("""
""")))}))
      }
    }
  }

  def render(houseForm:Form[models.products.Houses],aForm:Form[models.products.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houseForm,aForm,user,env)

  def f:((Form[models.products.Houses],Form[models.products.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houseForm,aForm,user,env) => apply(houseForm,aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 15:44:13 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addHouse.scala.html
                  HASH: 070eb91693705678a96014b5d3d7303eb5aea9b0
                  MATRIX: 1042->1|1246->135|1290->133|1317->152|1344->154|1375->177|1414->179|1445->184|1511->225|1672->378|1711->380|1748->417|1785->427|1798->431|1829->441|1866->451|2058->616|2159->696|2196->706|2299->788|2336->798|2432->873|2469->883|2576->969|2613->979|2711->1056|2749->1067|2812->1121|2851->1122|2892->1136|3176->1399|3205->1410|3218->1415|3257->1416|3298->1430|3428->1538|3469->1548|3515->1567|3612->1643|3649->1653|3746->1729|3783->1739|3873->1808|3910->1818|4008->1895|4053->1913|4193->2026|4276->2088|4317->2102|4464->2222|4479->2228|4526->2254|4674->2372
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|52->21|52->21|52->21|53->22|58->27|59->28|59->28|59->28|60->29|60->29|61->30|63->32|63->32|64->33|64->33|65->34|65->34|66->35|66->35|68->37|71->40|71->40|73->42|75->44|75->44|75->44|79->48
                  -- GENERATED --
              */
          