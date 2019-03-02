
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Houses],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.Houses], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Database", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<h1>The Database</h1>

    <!-- Displays the flash message -->
    """),_display_(/*7.6*/if(flash.containsKey("success"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
            """),_display_(/*9.14*/flash/*9.19*/.get("success")),format.raw/*9.34*/("""
        """),format.raw/*10.9*/("""</div>
    """)))}),format.raw/*11.6*/("""
    
    """),format.raw/*13.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th>ID</th>
                <th>Address</th>
                <th>Postcode</th>
                <th>Bedrooms</th>
                <th>Bathrooms</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <!--Populating the database-->
            <tr>
                """),_display_(/*28.18*/for(i<-houses) yield /*28.32*/ {_display_(Seq[Any](format.raw/*28.34*/("""        
                    """),format.raw/*29.21*/("""<td>"""),_display_(/*29.26*/i/*29.27*/.getId),format.raw/*29.33*/("""</td>
                    <td>"""),_display_(/*30.26*/i/*30.27*/.getAddress),format.raw/*30.38*/("""</td>
                    <td>"""),_display_(/*31.26*/i/*31.27*/.getPostcode),format.raw/*31.39*/("""</td>
                    <td>"""),_display_(/*32.26*/i/*32.27*/.getNumBeds),format.raw/*32.38*/("""</td>
                    <td>"""),_display_(/*33.26*/i/*33.27*/.getNumBaths),format.raw/*33.39*/("""</td>
                    <td>&euro; """),_display_(/*34.33*/("%.2f".format(i.getPrice))),format.raw/*34.60*/("""</td>
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*37.35*/routes/*37.41*/.HomeController.updateHouse(i.getId)),format.raw/*37.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>

                    <!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.deleteHouse(i.getId)),format.raw/*44.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
            </tr>
        """)))}),format.raw/*49.10*/("""
        """),format.raw/*50.9*/("""</tbody>
    </table>         

    <p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.HomeController.addHouse()),format.raw/*54.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    
""")))}))
      }
    }
  }

  def render(houses:List[models.Houses],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(houses,user)

  def f:((List[models.Houses],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (houses,user) => apply(houses,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 02 17:41:30 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: df10048885b8969300deed22c856292786416e79
                  MATRIX: 982->1|1130->56|1157->58|1187->80|1226->82|1257->87|1350->155|1390->187|1429->189|1464->198|1537->245|1550->250|1585->265|1621->274|1663->286|1700->296|2174->743|2204->757|2244->759|2301->788|2333->793|2343->794|2370->800|2428->831|2438->832|2470->843|2528->874|2538->875|2571->887|2629->918|2639->919|2671->930|2729->961|2739->962|2772->974|2837->1012|2885->1039|3020->1147|3035->1153|3092->1189|3377->1447|3392->1453|3449->1489|3701->1710|3737->1719|3822->1777|3837->1783|3884->1809
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|68->37|68->37|68->37|75->44|75->44|75->44|80->49|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          