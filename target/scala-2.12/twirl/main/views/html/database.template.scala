
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

  def render(houses:List[models.products.Houses],apartments:List[models.products.Apartment],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houses,apartments,user,env)

  def f:((List[models.products.Houses],List[models.products.Apartment],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houses,apartments,user,env) => apply(houses,apartments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 15:44:13 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 1ce205383abcb078940775393c0ebd1a28fcc1f6
                  MATRIX: 1044->1|1274->139|1304->161|1343->163|1374->168|1429->197|1533->292|1573->294|1613->307|1649->317|1663->323|1709->349|1836->446|1868->451|1987->543|2021->561|2061->563|2106->580|2197->644|2212->650|2271->688|2352->742|2366->747|2404->764|2453->786|2467->791|2521->823|2570->844|2701->948|2715->953|2747->964|2840->1030|2854->1035|2887->1047|2978->1111|2992->1116|3027->1130|3056->1131|3182->1230|3210->1249|3250->1251|3311->1284|3363->1318|3376->1323|3415->1324|3476->1357|3539->1389|3596->1418|3651->1446|3665->1451|3694->1459|3757->1495|3820->1549|3860->1551|3921->1584|3988->1624|4022->1649|4062->1651|4127->1688|4168->1702|4183->1708|4242->1746|4509->1995|4522->2000|4561->2001|4626->2038|4736->2117|4798->2151|4874->2200|4889->2206|4950->2246|5092->2361|5107->2367|5168->2407|5294->2502|5347->2527|5444->2593|5480->2602|5564->2659|5665->2750|5706->2752|5747->2765|5784->2775|5799->2781|5850->2811|5982->2912|6014->2917|6133->3009|6175->3035|6215->3037|6260->3054|6351->3118|6366->3124|6433->3170|6514->3224|6532->3233|6570->3250|6623->3276|6641->3285|6699->3321|6729->3322|6890->3456|6908->3465|6940->3476|7033->3542|7051->3551|7084->3563|7147->3599|7210->3653|7250->3655|7311->3688|7387->3737|7402->3743|7471->3791|7613->3906|7628->3912|7697->3960|7823->4055|7876->4080|7973->4146|8009->4155
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|45->14|45->14|45->14|46->15|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|69->38|69->38|69->38|70->39|71->40|73->42|74->43|74->43|74->43|76->45|76->45|76->45|77->46|78->47|81->50|82->51|86->55|86->55|86->55|87->56|87->56|87->56|87->56|90->59|91->60|95->64|95->64|95->64|96->65|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|106->75|108->77|108->77|108->77|109->78|110->79|113->82|114->83
                  -- GENERATED --
              */
          