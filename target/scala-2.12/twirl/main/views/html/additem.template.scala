
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

object additem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.ItemOnSale], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Item", user)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.102*/ {_display_(Seq[Any](format.raw/*11.104*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        """),format.raw/*16.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*20.24*/select),format.raw/*20.30*/(""" """),format.raw/*20.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*23.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*23.86*/("""
            """),_display_(/*24.14*/select(
                itemForm("category.id"),
                options(Category.options),
                '_label -> "Category", '_default -> "-- Choose a category --", 
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*29.14*/("""
            """),_display_(/*30.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*30.100*/("""
            """),_display_(/*31.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*31.88*/("""
            """),_display_(/*32.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*32.88*/("""

            """),_display_(/*34.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*34.75*/("""

            """),format.raw/*36.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*42.27*/routes/*42.33*/.HomeController.onsale(0)),format.raw/*42.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*46.6*/(""" """),format.raw/*46.24*/("""
""")))}),format.raw/*47.2*/(""" """),format.raw/*47.20*/("""

"""))
      }
    }
  }

  def render(itemForm:Form[models.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 01 17:48:10 GMT 2018
                  SOURCE: /home/jvk/wdd1labs/LabWork/WDD1PlayLab/app/views/additem.scala.html
                  HASH: 0a17afdddb317c68a7cfaa698f5f90fd60c7a3d7
                  MATRIX: 985->1|1118->64|1162->62|1189->80|1216->82|1246->104|1284->105|1315->110|1634->403|1740->499|1781->501|1818->538|1855->637|1892->647|1905->651|1936->661|1973->671|2347->1018|2374->1024|2403->1025|2655->1250|2748->1322|2789->1336|3064->1590|3105->1604|3213->1690|3254->1704|3349->1778|3390->1792|3485->1866|3527->1881|3609->1942|3651->1956|4043->2321|4058->2327|4104->2352|4264->2482|4293->2500|4325->2502|4354->2520
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|47->16|51->20|51->20|51->20|54->23|54->23|55->24|60->29|61->30|61->30|62->31|62->31|63->32|63->32|65->34|65->34|67->36|73->42|73->42|73->42|77->46|77->46|78->47|78->47
                  -- GENERATED --
              */
          