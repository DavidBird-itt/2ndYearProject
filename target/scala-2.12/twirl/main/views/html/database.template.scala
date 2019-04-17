
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.Houses],List[models.products.Apartment],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.products.Houses], apartments: List[models.products.Apartment],  user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Database", user)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<h1>
        Houses
        """),_display_(/*5.10*/if((user != null) && (("admin".equals(user.getRole())) || ("landlord".equals(user.getRole()))))/*5.105*/ {_display_(Seq[Any](format.raw/*5.107*/("""
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
                            """),format.raw/*30.29*/("""<i class="fas fa-leaf"></i>"""),_display_(/*30.57*/house/*30.62*/.getStock),format.raw/*30.71*/("""&nbsp;
                            """),_display_(/*31.30*/if((user != null) && ("admin".equals(user.getRole())))/*31.84*/ {_display_(Seq[Any](format.raw/*31.86*/("""
                                """),format.raw/*32.33*/("""&nbsp;
                                """),_display_(/*33.34*/if(house.getStock == 0)/*33.57*/ {_display_(Seq[Any](format.raw/*33.59*/("""
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

  def render(houses:List[models.products.Houses],apartments:List[models.products.Apartment],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houses,apartments,user,env)

  def f:((List[models.products.Houses],List[models.products.Apartment],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houses,apartments,user,env) => apply(houses,apartments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 17 12:06:12 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: e63c7fffbc3691f787cd34390f3aeec434d38ccc
                  MATRIX: 1044->1|1274->139|1304->161|1343->163|1374->168|1429->197|1533->292|1573->294|1613->307|1649->317|1663->323|1709->349|1836->446|1868->451|1987->543|2021->561|2061->563|2106->580|2197->644|2212->650|2271->688|2352->742|2366->747|2404->764|2453->786|2467->791|2521->823|2570->844|2701->948|2715->953|2747->964|2840->1030|2854->1035|2887->1047|2978->1111|2992->1116|3027->1130|3056->1131|3182->1230|3210->1249|3250->1251|3311->1284|3363->1318|3376->1323|3415->1324|3476->1357|3539->1389|3596->1418|3651->1446|3665->1451|3695->1460|3758->1496|3821->1550|3861->1552|3922->1585|3989->1625|4021->1648|4061->1650|4126->1687|4167->1701|4182->1707|4241->1745|4508->1994|4521->1999|4560->2000|4625->2037|4735->2116|4797->2150|4873->2199|4888->2205|4949->2245|5091->2360|5106->2366|5167->2406|5293->2501|5346->2526|5443->2592|5479->2601|5563->2658|5664->2749|5705->2751|5746->2764|5783->2774|5798->2780|5849->2810|5981->2911|6013->2916|6132->3008|6174->3034|6214->3036|6259->3053|6350->3117|6365->3123|6432->3169|6513->3223|6531->3232|6569->3249|6622->3275|6640->3284|6698->3320|6728->3321|6889->3455|6907->3464|6939->3475|7032->3541|7050->3550|7083->3562|7146->3598|7209->3652|7249->3654|7310->3687|7386->3736|7401->3742|7470->3790|7612->3905|7627->3911|7696->3959|7822->4054|7875->4079|7972->4145|8008->4154
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|45->14|45->14|45->14|46->15|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|69->38|69->38|69->38|70->39|71->40|73->42|74->43|74->43|74->43|76->45|76->45|76->45|77->46|78->47|81->50|82->51|86->55|86->55|86->55|87->56|87->56|87->56|87->56|90->59|91->60|95->64|95->64|95->64|96->65|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|106->75|108->77|108->77|108->77|109->78|110->79|113->82|114->83
                  -- GENERATED --
              */
          