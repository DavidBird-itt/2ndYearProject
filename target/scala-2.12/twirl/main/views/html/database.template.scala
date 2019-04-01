
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Houses],List[models.Apartment],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.Houses], apartments: List[models.Apartment],  user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Database", user)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<h1>
        Houses
        """),_display_(/*5.10*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*5.101*/ {_display_(Seq[Any](format.raw/*5.103*/("""
            """),format.raw/*6.13*/("""<a href=""""),_display_(/*6.23*/routes/*6.29*/.HomeController.addHouse()),format.raw/*6.55*/("""">
                <span style="font-size:9px">(Add New House)</span>
            </a>
        """)))}),format.raw/*9.10*/("""
    """),format.raw/*10.5*/("""</h1>
    <br>
    <div id="database-list">
        <table style="width:100%">
            """),_display_(/*14.14*/for(house<-houses) yield /*14.32*/ {_display_(Seq[Any](format.raw/*14.34*/("""
                """),format.raw/*15.17*/("""<tr>
                    <td>
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.HomeController.viewHouse(house.getId)),format.raw/*17.79*/("""" class="listing">
                        <img src=""""),_display_(/*18.36*/house/*18.41*/.getThumbnailPath),format.raw/*18.58*/("""" /> House for &euro;"""),_display_(/*18.80*/house/*18.85*/.getDisplayValue(house.getPrice)),format.raw/*18.117*/("""
                    """),format.raw/*19.21*/("""</td>
                        <td class="desc">
                            <i class="fas fa-bed"></i> """),_display_(/*21.57*/house/*21.62*/.getNumBeds),format.raw/*21.73*/("""&nbsp;
                            <i class="fas fa-toilet"></i> """),_display_(/*22.60*/house/*22.65*/.getNumBaths),format.raw/*22.77*/("""&nbsp;
                            <i class="fas fa-leaf"></i> """),_display_(/*23.58*/house/*23.63*/.getGardenSize),format.raw/*23.77*/("""&nbsp;
                            <i class="fas fa-car"></i>&nbsp;
                            """),_display_(/*25.30*/if(house.getGarage)/*25.49*/ {_display_(Seq[Any](format.raw/*25.51*/("""
                                """),format.raw/*26.33*/("""Yes
                            """)))}/*27.31*/else/*27.36*/{_display_(Seq[Any](format.raw/*27.37*/("""
                                """),format.raw/*28.33*/("""No
                            """)))}),format.raw/*29.30*/("""
                            """),_display_(/*30.30*/if((user != null) && ("admin".equals(user.getRole())))/*30.84*/ {_display_(Seq[Any](format.raw/*30.86*/("""
                                """),format.raw/*31.33*/("""&nbsp;
                                <a href=""""),_display_(/*32.43*/routes/*32.49*/.HomeController.updateHouse(house.getId)),format.raw/*32.89*/("""">Edit</a>
                                &nbsp;
                                <a href=""""),_display_(/*34.43*/routes/*34.49*/.HomeController.deleteHouse(house.getId)),format.raw/*34.89*/("""" onclick="return confirmDel();">Delete</a>
                            """)))}),format.raw/*35.30*/("""
                        """),format.raw/*36.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""</table>
    </div>
    <br>
    <h1>Apartments</h1>
    <br>
    <div id="database-list">
        <table style="width:100%">
            """),_display_(/*47.14*/for(apartment<-apartments) yield /*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
                """),format.raw/*48.17*/("""<tr>
                    <td>
                        <a href=""""),_display_(/*50.35*/routes/*50.41*/.HomeController.viewApartment(apartment.getId)),format.raw/*50.87*/("""" class="listing">
                        <img src=""""),_display_(/*51.36*/apartment/*51.45*/.getThumbnailPath),format.raw/*51.62*/("""" /> Apartment for &euro;"""),_display_(/*51.88*/apartment/*51.97*/.getDisplayValue(apartment.getPrice)),format.raw/*51.133*/(""" """),format.raw/*51.134*/("""per month
                    </td>
                        <td class="desc">
                            <i class="fas fa-bed"></i> """),_display_(/*54.57*/apartment/*54.66*/.getNumBeds),format.raw/*54.77*/("""&nbsp;
                            <i class="fas fa-toilet"></i> """),_display_(/*55.60*/apartment/*55.69*/.getNumBaths),format.raw/*55.81*/("""&nbsp;
                        </td>
                    </a>
                </tr>
            """)))}),format.raw/*59.14*/("""
        """),format.raw/*60.9*/("""</table>
    </div>
    <br>
""")))}))
      }
    }
  }

  def render(houses:List[models.Houses],apartments:List[models.Apartment],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houses,apartments,user,env)

  def f:((List[models.Houses],List[models.Apartment],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houses,apartments,user,env) => apply(houses,apartments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 01 05:17:07 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/database.scala.html
                  HASH: 2151ff7e9294b549afbecac4487cb8014726c305
                  MATRIX: 1026->1|1238->121|1268->143|1307->145|1338->150|1393->179|1493->270|1533->272|1573->285|1609->295|1623->301|1669->327|1795->423|1827->428|1946->520|1980->538|2020->540|2065->557|2156->621|2171->627|2230->665|2311->719|2325->724|2363->741|2412->763|2426->768|2480->800|2529->821|2660->925|2674->930|2706->941|2799->1007|2813->1012|2846->1024|2937->1088|2951->1093|2986->1107|3110->1204|3138->1223|3178->1225|3239->1258|3291->1292|3304->1297|3343->1298|3404->1331|3467->1363|3524->1393|3587->1447|3627->1449|3688->1482|3764->1531|3779->1537|3840->1577|3959->1669|3974->1675|4035->1715|4139->1788|4192->1813|4289->1879|4325->1888|4491->2027|4533->2053|4573->2055|4618->2072|4709->2136|4724->2142|4791->2188|4872->2242|4890->2251|4928->2268|4981->2294|4999->2303|5057->2339|5087->2340|5248->2474|5266->2483|5298->2494|5391->2560|5409->2569|5442->2581|5570->2678|5606->2687
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|45->14|45->14|45->14|46->15|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|65->34|65->34|65->34|66->35|67->36|70->39|71->40|78->47|78->47|78->47|79->48|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|85->54|85->54|85->54|86->55|86->55|86->55|90->59|91->60
                  -- GENERATED --
              */
          