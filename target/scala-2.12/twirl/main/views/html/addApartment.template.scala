
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

object addApartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.products.Apartment],Form[models.products.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(apartForm: Form[models.products.Apartment], aForm: Form[models.products.Address], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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

        """),_display_(/*20.10*/if((user != null) && ("admin".equals(user.getRole())))/*20.64*/{_display_(Seq[Any](format.raw/*20.65*/("""
            """),_display_(/*21.14*/select(
                apartForm("landlord.email"),
                options(users.Landlord.options),
                '_label -> "Landlord", '_default -> "-- Choose a landlord --",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*26.14*/("""
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),_display_(/*28.14*/inputText(apartForm("landlord.email").copy(value=Some(user.getEmail())), '_label -> "", 'hidden -> "hidden")),format.raw/*28.122*/("""
        """)))}),format.raw/*29.10*/("""

        """),_display_(/*31.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*31.86*/("""
        """),_display_(/*32.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*32.86*/("""
        """),_display_(/*33.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*33.79*/("""
        """),_display_(/*34.10*/inputText(aForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*34.87*/("""
        
        """),format.raw/*36.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*39.10*/inputText(aForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*39.68*/("""
    
        """),format.raw/*41.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.HomeController.properties()),format.raw/*43.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*47.6*/("""
""")))}))
      }
    }
  }

  def render(apartForm:Form[models.products.Apartment],aForm:Form[models.products.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(apartForm,aForm,user,env)

  def f:((Form[models.products.Apartment],Form[models.products.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (apartForm,aForm,user,env) => apply(apartForm,aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 19 16:26:10 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addApartment.scala.html
                  HASH: 671dd40b6fa6878cb20db7c2a77ff35b13929de8
                  MATRIX: 1049->1|1256->138|1300->136|1327->155|1354->157|1389->184|1428->186|1459->191|1525->232|1690->389|1729->391|1766->428|1803->438|1816->442|1847->452|1884->462|2076->627|2177->707|2214->717|2317->799|2354->809|2450->884|2487->894|2583->969|2621->980|2684->1034|2723->1035|2764->1049|3048->1312|3077->1323|3090->1328|3129->1329|3170->1343|3300->1451|3341->1461|3379->1472|3476->1548|3513->1558|3610->1634|3647->1644|3737->1713|3774->1723|3872->1800|3917->1818|4057->1931|4136->1989|4177->2003|4324->2123|4339->2129|4388->2157|4536->2275
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|58->27|58->27|58->27|59->28|59->28|60->29|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|67->36|70->39|70->39|72->41|74->43|74->43|74->43|78->47
                  -- GENERATED --
              */
          