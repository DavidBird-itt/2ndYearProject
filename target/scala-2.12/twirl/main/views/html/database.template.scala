
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Houses],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.Houses]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Database")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
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

  def render(houses:List[models.Houses]): play.twirl.api.HtmlFormat.Appendable = apply(houses)

  def f:((List[models.Houses]) => play.twirl.api.HtmlFormat.Appendable) = (houses) => apply(houses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 18 17:35:24 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 75e4d455f361f2932a4169ed9ccb563250e0bba6
                  MATRIX: 964->1|1087->31|1114->33|1138->49|1177->51|1208->56|1301->124|1341->156|1380->158|1415->167|1488->214|1501->219|1536->234|1572->243|1614->255|1646->260|2120->707|2150->721|2190->723|2247->752|2279->757|2289->758|2316->764|2374->795|2384->796|2416->807|2474->838|2484->839|2517->851|2575->882|2585->883|2617->894|2675->925|2685->926|2718->938|2783->976|2831->1003|2966->1111|2981->1117|3038->1153|3323->1411|3338->1417|3395->1453|3647->1674|3683->1683|3768->1741|3783->1747|3830->1773
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|67->36|67->36|67->36|74->43|74->43|74->43|79->48|80->49|84->53|84->53|84->53
                  -- GENERATED --
              */
          