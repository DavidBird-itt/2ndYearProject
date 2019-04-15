
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
                            """),format.raw/*30.29*/("""<i class="fas fa-leaf"></i>"""),_display_(/*30.57*/house/*30.62*/.getSold),format.raw/*30.70*/("""&nbsp;
                            """),_display_(/*31.30*/if((user != null) && ("admin".equals(user.getRole())))/*31.84*/ {_display_(Seq[Any](format.raw/*31.86*/("""
                                """),format.raw/*32.33*/("""&nbsp;
                                """),_display_(/*33.34*/if(house.getSold == true)/*33.59*/ {_display_(Seq[Any](format.raw/*33.61*/("""
                                    """),format.raw/*34.37*/("""<td><a href=""""),_display_(/*34.51*/routes/*34.57*/.ShoppingCtrl.addToBasket(house.getId)),format.raw/*34.95*/(""""
                                        class="btn btn-default btn-xs"><span
                                        class="glyphicon glyphicon-shopping-cart"></span></a>
                                    </td>
                                """)))}/*38.35*/else/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""
                                    """),format.raw/*39.37*/("""<td><img src="/assets/images/sold.jpg"/></td>
                                """)))}),format.raw/*40.34*/("""
                                
                                """),format.raw/*42.33*/("""&nbsp;
                                <a href=""""),_display_(/*43.43*/routes/*43.49*/.HomeController.updateHouse(house.getId)),format.raw/*43.89*/(""""><i class="fas fa-edit"></i></a>
                                &nbsp;
                                <a href=""""),_display_(/*45.43*/routes/*45.49*/.HomeController.deleteHouse(house.getId)),format.raw/*45.89*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                            """)))}),format.raw/*46.30*/("""
                        """),format.raw/*47.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""</table>
    </div>
    <br>
    <h1>Apartments
        """),_display_(/*55.10*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*55.101*/ {_display_(Seq[Any](format.raw/*55.103*/("""
            """),format.raw/*56.13*/("""<a href=""""),_display_(/*56.23*/routes/*56.29*/.HomeController.addApartment()),format.raw/*56.59*/("""">
                <span style="font-size:20px">(Add New Apartment)</span>
            </a>
        """)))}),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""</h1>
    <br>
    <div id="database-list">
        <table style="width:100%">
            """),_display_(/*64.14*/for(apartment<-apartments) yield /*64.40*/ {_display_(Seq[Any](format.raw/*64.42*/("""
                """),format.raw/*65.17*/("""<tr>
                    <td>
                        <a href=""""),_display_(/*67.35*/routes/*67.41*/.HomeController.viewApartment(apartment.getId)),format.raw/*67.87*/("""" class="listing">
                        <img src=""""),_display_(/*68.36*/apartment/*68.45*/.getThumbnailPath),format.raw/*68.62*/("""" /> Apartment for &euro;"""),_display_(/*68.88*/apartment/*68.97*/.getDisplayValue(apartment.getPrice)),format.raw/*68.133*/(""" """),format.raw/*68.134*/("""per month
                    </td>
                        <td class="desc">
                            <i class="fas fa-bed"></i> """),_display_(/*71.57*/apartment/*71.66*/.getNumBeds),format.raw/*71.77*/("""&nbsp;
                            <i class="fas fa-toilet"></i> """),_display_(/*72.60*/apartment/*72.69*/.getNumBaths),format.raw/*72.81*/("""&nbsp;
                            """),_display_(/*73.30*/if((user != null) && ("admin".equals(user.getRole())))/*73.84*/ {_display_(Seq[Any](format.raw/*73.86*/("""
                                """),format.raw/*74.33*/("""&nbsp;
                                <a href=""""),_display_(/*75.43*/routes/*75.49*/.HomeController.updateApartment(apartment.getId)),format.raw/*75.97*/(""""><i class="fas fa-edit"></i></a>
                                &nbsp;
                                <a href=""""),_display_(/*77.43*/routes/*77.49*/.HomeController.deleteApartment(apartment.getId)),format.raw/*77.97*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                            """)))}),format.raw/*78.30*/("""
                        """),format.raw/*79.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*82.14*/("""
        """),format.raw/*83.9*/("""</table>
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
                  DATE: Mon Apr 15 16:42:04 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: f9ebd12dbf8e1dc3e50e0ff36cc4449abf8365af
                  MATRIX: 1026->1|1238->121|1268->143|1307->145|1338->150|1393->179|1493->270|1533->272|1573->285|1609->295|1623->301|1669->327|1796->424|1828->429|1947->521|1981->539|2021->541|2066->558|2157->622|2172->628|2231->666|2312->720|2326->725|2364->742|2413->764|2427->769|2481->801|2530->822|2661->926|2675->931|2707->942|2800->1008|2814->1013|2847->1025|2938->1089|2952->1094|2987->1108|3016->1109|3142->1208|3170->1227|3210->1229|3271->1262|3323->1296|3336->1301|3375->1302|3436->1335|3499->1367|3556->1396|3611->1424|3625->1429|3654->1437|3717->1473|3780->1527|3820->1529|3881->1562|3948->1602|3982->1627|4022->1629|4087->1666|4128->1680|4143->1686|4202->1724|4469->1973|4482->1978|4521->1979|4586->2016|4696->2095|4790->2161|4866->2210|4881->2216|4942->2256|5084->2371|5099->2377|5160->2417|5286->2512|5339->2537|5436->2603|5472->2612|5556->2669|5657->2760|5698->2762|5739->2775|5776->2785|5791->2791|5842->2821|5974->2922|6006->2927|6125->3019|6167->3045|6207->3047|6252->3064|6343->3128|6358->3134|6425->3180|6506->3234|6524->3243|6562->3260|6615->3286|6633->3295|6691->3331|6721->3332|6882->3466|6900->3475|6932->3486|7025->3552|7043->3561|7076->3573|7139->3609|7202->3663|7242->3665|7303->3698|7379->3747|7394->3753|7463->3801|7605->3916|7620->3922|7689->3970|7815->4065|7868->4090|7965->4156|8001->4165
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|45->14|45->14|45->14|46->15|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|69->38|69->38|69->38|70->39|71->40|73->42|74->43|74->43|74->43|76->45|76->45|76->45|77->46|78->47|81->50|82->51|86->55|86->55|86->55|87->56|87->56|87->56|87->56|90->59|91->60|95->64|95->64|95->64|96->65|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|106->75|108->77|108->77|108->77|109->78|110->79|113->82|114->83
                  -- GENERATED --
              */
          