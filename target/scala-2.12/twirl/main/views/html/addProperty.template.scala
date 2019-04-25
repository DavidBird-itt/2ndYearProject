
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

object addProperty extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.products.Property],Form[models.products.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pForm: Form[models.products.Property], aForm: Form[models.products.Address], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Property", user)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new Property</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addPropertySubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->

        <p><strong>Styles</strong></p>
        """),_display_(/*17.10*/for((value, name) <- products.Style.options) yield /*17.54*/ {_display_(Seq[Any](format.raw/*17.56*/("""
            """),format.raw/*18.13*/("""<input type="checkbox" name="styleSelect[]" value=""""),_display_(/*18.65*/value),format.raw/*18.70*/(""""  
                """),_display_(/*19.18*/if(pForm("id").getValue.isPresent && pForm("id").getValue.get != "")/*19.86*/ {_display_(Seq[Any](format.raw/*19.88*/(""" 
                    """),_display_(/*20.22*/if(products.Style.inStyle(value.toLong, pForm("id").getValue.get.toLong))/*20.95*/ {_display_(Seq[Any](format.raw/*20.97*/("""
                        """),format.raw/*21.25*/("""checked
                    """)))}),format.raw/*22.22*/("""
                """)))}),format.raw/*23.18*/(""" 
            """),format.raw/*24.13*/("""/> """),_display_(/*24.17*/name),format.raw/*24.21*/(""" """),format.raw/*24.22*/("""</br>
        """)))}),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""</p>

        """),_display_(/*28.10*/inputText(pForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*28.86*/("""
        """),_display_(/*29.10*/inputText(pForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*29.88*/("""
        """),_display_(/*30.10*/inputText(pForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*30.81*/("""

        """),_display_(/*32.10*/if((user != null) && ("admin".equals(user.getRole())))/*32.64*/{_display_(Seq[Any](format.raw/*32.65*/("""
            """),_display_(/*33.14*/select(
                pForm("landlord.email"),
                options(users.Landlord.options),
                '_label -> "Landlord", '_default -> "-- Choose a landlord --",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*38.14*/("""
        """)))}/*39.11*/else/*39.16*/{_display_(Seq[Any](format.raw/*39.17*/("""
            """),_display_(/*40.14*/inputText(pForm("landlord.email").copy(value=Some(user.getEmail())), '_label -> "", 'hidden -> "hidden")),format.raw/*40.118*/("""
        """)))}),format.raw/*41.10*/("""
        
        """),_display_(/*43.10*/inputText(aForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*43.86*/("""
        """),_display_(/*44.10*/inputText(aForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*44.86*/("""
        """),_display_(/*45.10*/inputText(aForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*45.79*/("""
        """),_display_(/*46.10*/inputText(aForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*46.87*/("""
        
        """),format.raw/*48.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*51.10*/inputText(pForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*51.68*/("""
        """),_display_(/*52.10*/inputText(pForm("stock").copy(value=Some("1")), '_label -> "", 'hidden -> "hidden")),format.raw/*52.93*/("""
    
        """),format.raw/*54.9*/("""<div class="actions">
            <input type="submit" value="Add Property" class="btn btn-primary">
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.HomeController.properties(0)),format.raw/*56.58*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*60.6*/("""
""")))}))
      }
    }
  }

  def render(pForm:Form[models.products.Property],aForm:Form[models.products.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(pForm,aForm,user,env)

  def f:((Form[models.products.Property],Form[models.products.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (pForm,aForm,user,env) => apply(pForm,aForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 14:56:20 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addProperty.scala.html
                  HASH: f800f45533e6855daa0bb6a1c98866dab0091eac
                  MATRIX: 1047->1|1249->133|1293->131|1320->150|1347->152|1381->178|1420->180|1451->185|1521->230|1685->386|1724->388|1761->425|1798->435|1811->439|1842->449|1879->459|2111->664|2171->708|2211->710|2252->723|2331->775|2357->780|2405->801|2482->869|2522->871|2572->894|2654->967|2694->969|2747->994|2807->1023|2856->1041|2898->1055|2929->1059|2954->1063|2983->1064|3029->1079|3065->1088|3107->1103|3204->1179|3241->1189|3340->1267|3377->1277|3469->1348|3507->1359|3570->1413|3609->1414|3650->1428|3930->1687|3959->1698|3972->1703|4011->1704|4052->1718|4178->1822|4219->1832|4265->1851|4362->1927|4399->1937|4496->2013|4533->2023|4623->2092|4660->2102|4758->2179|4803->2197|4943->2310|5022->2368|5059->2378|5163->2461|5204->2475|5354->2598|5369->2604|5419->2633|5567->2751
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|54->23|55->24|55->24|55->24|55->24|56->25|57->26|59->28|59->28|60->29|60->29|61->30|61->30|63->32|63->32|63->32|64->33|69->38|70->39|70->39|70->39|71->40|71->40|72->41|74->43|74->43|75->44|75->44|76->45|76->45|77->46|77->46|79->48|82->51|82->51|83->52|83->52|85->54|87->56|87->56|87->56|91->60
                  -- GENERATED --
              */
          