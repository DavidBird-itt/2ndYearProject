
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

object addHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Houses],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houseForm: Form[models.Houses]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add House")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addHouseSubmit, 'class -> "form-horizontal", 'role -> "form")/*8.101*/ {_display_(Seq[Any](format.raw/*8.103*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*14.10*/inputText(houseForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*14.89*/("""
        """),_display_(/*15.10*/inputText(houseForm("postcode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*15.91*/("""
        """),_display_(/*16.10*/inputText(houseForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*16.90*/("""
        """),_display_(/*17.10*/inputText(houseForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*17.92*/("""
        """),_display_(/*18.10*/inputText(houseForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*18.85*/("""
    
        """),_display_(/*20.10*/inputText(houseForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.72*/("""
    
        """),format.raw/*22.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.database()),format.raw/*24.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*28.6*/("""
""")))}))
      }
    }
  }

  def render(houseForm:Form[models.Houses]): play.twirl.api.HtmlFormat.Appendable = apply(houseForm)

  def f:((Form[models.Houses]) => play.twirl.api.HtmlFormat.Appendable) = (houseForm) => apply(houseForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 18 17:34:59 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/addHouse.scala.html
                  HASH: 1cbdae0d7f3705261e90a8f8208e1bce600b9803
                  MATRIX: 964->1|1069->36|1113->34|1140->53|1167->55|1192->72|1231->74|1262->79|1328->120|1432->215|1472->217|1508->254|1545->264|1558->268|1589->278|1626->288|1818->453|1918->532|1955->542|2057->623|2094->633|2195->713|2232->723|2335->805|2372->815|2468->890|2510->905|2593->967|2634->981|2781->1101|2796->1107|2843->1133|2991->1251
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|53->22|55->24|55->24|55->24|59->28
                  -- GENERATED --
              */
          