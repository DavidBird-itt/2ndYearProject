
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

object addApartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.Apartment],Form[models.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(apartForm: Form[models.Apartment], aForm: Form[models.Address], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
        """),_display_(/*15.10*/inputText(apartForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/inputText(apartForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*16.92*/("""
        """),_display_(/*17.10*/inputText(apartForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*17.85*/("""
        """),_display_(/*18.10*/inputText(apartForm("floor"), '_label -> "Floor", 'class -> "form-control")),format.raw/*18.85*/("""

        """),_display_(/*20.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*20.86*/("""
        """),_display_(/*21.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*21.86*/("""
        """),_display_(/*22.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*22.79*/("""
        """),_display_(/*23.10*/inputText(aForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*23.87*/("""
        
        """),format.raw/*25.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*28.10*/inputText(aForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.68*/("""
    
        """),format.raw/*30.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*32.23*/routes/*32.29*/.HomeController.database()),format.raw/*32.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*36.6*/("""
""")))}))
      }
    }
  }

  def render(apartForm:Form[models.Apartment],aForm:Form[models.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(apartForm,aForm,user,env)

  def f:((Form[models.Apartment],Form[models.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (apartForm,aForm,user,env) => apply(apartForm,aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 14 14:57:42 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addApartment.scala.html
                  HASH: 396cd1496c7a34553a374f97c7c46ea3c2d4260f
                  MATRIX: 1031->1|1220->120|1264->118|1291->137|1318->139|1353->166|1392->168|1423->173|1489->214|1654->371|1693->373|1730->410|1767->420|1780->424|1811->434|1848->444|2040->609|2141->689|2178->699|2281->781|2318->791|2414->866|2451->876|2547->951|2585->962|2682->1038|2719->1048|2816->1124|2853->1134|2943->1203|2980->1213|3078->1290|3123->1308|3263->1421|3342->1479|3383->1493|3530->1613|3545->1619|3592->1645|3740->1763
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|59->28|59->28|61->30|63->32|63->32|63->32|67->36
                  -- GENERATED --
              */
          