
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
                <span style="font-size:20px">(Add New House)</span>
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
                            <i class="fas fa-leaf"></i> """),_display_(/*23.58*/house/*23.63*/.getGardenSize),format.raw/*23.77*/(""" """),format.raw/*23.78*/("""m²&nbsp;
                            <i class="fas fa-car"></i>&nbsp;
                            """),_display_(/*25.30*/if(house.getGarage)/*25.49*/ {_display_(Seq[Any](format.raw/*25.51*/("""
                                """),format.raw/*26.33*/("""Yes
                            """)))}/*27.31*/else/*27.36*/{_display_(Seq[Any](format.raw/*27.37*/("""
                                """),format.raw/*28.33*/("""No
                            """)))}),format.raw/*29.30*/("""
                            """),_display_(/*30.30*/if((user != null) && ("admin".equals(user.getRole())))/*30.84*/ {_display_(Seq[Any](format.raw/*30.86*/("""
                                """),format.raw/*31.33*/("""&nbsp;
                                <a href=""""),_display_(/*32.43*/routes/*32.49*/.HomeController.updateHouse(house.getId)),format.raw/*32.89*/(""""><i class="fas fa-edit"></i></a>
                                &nbsp;
                                <a href=""""),_display_(/*34.43*/routes/*34.49*/.HomeController.deleteHouse(house.getId)),format.raw/*34.89*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                            """)))}),format.raw/*35.30*/("""
                        """),format.raw/*36.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""</table>
    </div>
    <br>
    <h1>Apartments
        """),_display_(/*44.10*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*44.101*/ {_display_(Seq[Any](format.raw/*44.103*/("""
            """),format.raw/*45.13*/("""<a href=""""),_display_(/*45.23*/routes/*45.29*/.HomeController.addApartment()),format.raw/*45.59*/("""">
                <span style="font-size:20px">(Add New Apartment)</span>
            </a>
        """)))}),format.raw/*48.10*/("""
    """),format.raw/*49.5*/("""</h1>
    <br>
    <div id="database-list">
        <table style="width:100%">
            """),_display_(/*53.14*/for(apartment<-apartments) yield /*53.40*/ {_display_(Seq[Any](format.raw/*53.42*/("""
                """),format.raw/*54.17*/("""<tr>
                    <td>
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.HomeController.viewApartment(apartment.getId)),format.raw/*56.87*/("""" class="listing">
                        <img src=""""),_display_(/*57.36*/apartment/*57.45*/.getThumbnailPath),format.raw/*57.62*/("""" /> Apartment for &euro;"""),_display_(/*57.88*/apartment/*57.97*/.getDisplayValue(apartment.getPrice)),format.raw/*57.133*/(""" """),format.raw/*57.134*/("""per month
                    </td>
                        <td class="desc">
                            <i class="fas fa-bed"></i> """),_display_(/*60.57*/apartment/*60.66*/.getNumBeds),format.raw/*60.77*/("""&nbsp;
                            <i class="fas fa-toilet"></i> """),_display_(/*61.60*/apartment/*61.69*/.getNumBaths),format.raw/*61.81*/("""&nbsp;
                            """),_display_(/*62.30*/if((user != null) && ("admin".equals(user.getRole())))/*62.84*/ {_display_(Seq[Any](format.raw/*62.86*/("""
                                """),format.raw/*63.33*/("""&nbsp;
                                <a href=""""),_display_(/*64.43*/routes/*64.49*/.HomeController.updateApartment(apartment.getId)),format.raw/*64.97*/(""""><i class="fas fa-edit"></i></a>
                                &nbsp;
                                <a href=""""),_display_(/*66.43*/routes/*66.49*/.HomeController.deleteApartment(apartment.getId)),format.raw/*66.97*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                            """)))}),format.raw/*67.30*/("""
                        """),format.raw/*68.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*71.14*/("""
        """),format.raw/*72.9*/("""</table>
    </div>
    <br>""")))}))
      }
    }
  }

  def render(houses:List[models.Houses],apartments:List[models.Apartment],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houses,apartments,user,env)

  def f:((List[models.Houses],List[models.Apartment],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houses,apartments,user,env) => apply(houses,apartments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 14 14:34:45 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 45a2176f41b379d0565bd83cd8ccc79c8bd60d4d
                  MATRIX: 1026->1|1238->121|1268->143|1307->145|1338->150|1393->179|1493->270|1533->272|1573->285|1609->295|1623->301|1669->327|1796->424|1828->429|1947->521|1981->539|2021->541|2066->558|2157->622|2172->628|2231->666|2312->720|2326->725|2364->742|2413->764|2427->769|2481->801|2530->822|2661->926|2675->931|2707->942|2800->1008|2814->1013|2847->1025|2938->1089|2952->1094|2987->1108|3016->1109|3142->1208|3170->1227|3210->1229|3271->1262|3323->1296|3336->1301|3375->1302|3436->1335|3499->1367|3556->1397|3619->1451|3659->1453|3720->1486|3796->1535|3811->1541|3872->1581|4014->1696|4029->1702|4090->1742|4216->1837|4269->1862|4366->1928|4402->1937|4486->1994|4587->2085|4628->2087|4669->2100|4706->2110|4721->2116|4772->2146|4904->2247|4936->2252|5055->2344|5097->2370|5137->2372|5182->2389|5273->2453|5288->2459|5355->2505|5436->2559|5454->2568|5492->2585|5545->2611|5563->2620|5621->2656|5651->2657|5812->2791|5830->2800|5862->2811|5955->2877|5973->2886|6006->2898|6069->2934|6132->2988|6172->2990|6233->3023|6309->3072|6324->3078|6393->3126|6535->3241|6550->3247|6619->3295|6745->3390|6798->3415|6895->3481|6931->3490
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|45->14|45->14|45->14|46->15|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|65->34|65->34|65->34|66->35|67->36|70->39|71->40|75->44|75->44|75->44|76->45|76->45|76->45|76->45|79->48|80->49|84->53|84->53|84->53|85->54|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|95->64|95->64|95->64|97->66|97->66|97->66|98->67|99->68|102->71|103->72
                  -- GENERATED --
              */
          