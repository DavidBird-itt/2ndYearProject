
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

object addHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Houses],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houseForm: Form[models.Houses], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add House", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
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

  def render(houseForm:Form[models.Houses],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(houseForm,user)

  def f:((Form[models.Houses],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (houseForm,user) => apply(houseForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 16:55:15 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/addHouse.scala.html
                  HASH: 23d8e05a9f501117d70b1f9dc719964997bc9378
                  MATRIX: 982->1|1112->61|1156->59|1183->78|1210->80|1241->103|1280->105|1311->110|1377->151|1481->246|1521->248|1557->285|1594->295|1607->299|1638->309|1675->319|1867->484|1967->563|2004->573|2106->654|2143->664|2244->744|2281->754|2384->836|2421->846|2517->921|2559->936|2642->998|2683->1012|2830->1132|2845->1138|2892->1164|3040->1282
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|53->22|55->24|55->24|55->24|59->28
                  -- GENERATED --
              */
          