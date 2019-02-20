
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
    """),format.raw/*12.5*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*27.18*/for(i<-houses) yield /*27.32*/ {_display_(Seq[Any](format.raw/*27.34*/("""        
                    """),format.raw/*28.21*/("""<td>"""),_display_(/*28.26*/i/*28.27*/.getId),format.raw/*28.33*/("""</td>
                    <td>"""),_display_(/*29.26*/i/*29.27*/.getAddress),format.raw/*29.38*/("""</td>
                    <td>"""),_display_(/*30.26*/i/*30.27*/.getPostcode),format.raw/*30.39*/("""</td>
                    <td>"""),_display_(/*31.26*/i/*31.27*/.getNumBeds),format.raw/*31.38*/("""</td>
                    <td>"""),_display_(/*32.26*/i/*32.27*/.getNumBaths),format.raw/*32.39*/("""</td>
                    <td>&euro; """),_display_(/*33.33*/("%.2f".format(i.getPrice))),format.raw/*33.60*/("""</td>
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*36.35*/routes/*36.41*/.HomeController.updateHouse(i.getId)),format.raw/*36.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>

                    <!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.deleteHouse(i.getId)),format.raw/*43.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
            </tr>
        """)))}),format.raw/*48.10*/("""
        """),format.raw/*49.9*/("""</tbody>
    </table>         

    <p>
        <a href=""""),_display_(/*53.19*/routes/*53.25*/.HomeController.addHouse()),format.raw/*53.51*/("""">
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
                  DATE: Tue Feb 19 14:36:14 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 3903bc721598e8c7c8854f4a87f2d419f15340ea
                  MATRIX: 982->1|1130->56|1157->58|1187->80|1226->82|1257->87|1350->155|1390->187|1429->189|1464->198|1537->245|1550->250|1585->265|1621->274|1663->286|1695->291|2169->738|2199->752|2239->754|2296->783|2328->788|2338->789|2365->795|2423->826|2433->827|2465->838|2523->869|2533->870|2566->882|2624->913|2634->914|2666->925|2724->956|2734->957|2767->969|2832->1007|2880->1034|3015->1142|3030->1148|3087->1184|3372->1442|3387->1448|3444->1484|3696->1705|3732->1714|3817->1772|3832->1778|3879->1804
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|67->36|67->36|67->36|74->43|74->43|74->43|79->48|80->49|84->53|84->53|84->53
                  -- GENERATED --
              */
          