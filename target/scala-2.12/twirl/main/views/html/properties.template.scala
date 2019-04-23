
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

object properties extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.Property],List[models.products.Style],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(properties: List[models.products.Property], style:List[models.products.Style], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Properties", user)/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""
    """),format.raw/*3.5*/("""<h1>
        Property
        """),_display_(/*5.10*/if((user != null) && (("admin".equals(user.getRole())) || ("landlord".equals(user.getRole()))))/*5.105*/ {_display_(Seq[Any](format.raw/*5.107*/("""
            """),format.raw/*6.13*/("""<a href=""""),_display_(/*6.23*/routes/*6.29*/.HomeController.addProperty()),format.raw/*6.58*/("""">
                <span style="font-size:20px">(Add New Property)</span>
            </a>
        """)))}),format.raw/*9.10*/("""
    """),format.raw/*10.5*/("""</h1>

    <div class="col-sm-3">
		<h4>Styles</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*15.33*/routes/*15.39*/.HomeController.properties(0)),format.raw/*15.68*/("""" class="list-group-item">All Styles</a>
		        """),_display_(/*16.12*/for(s<-style) yield /*16.25*/ {_display_(Seq[Any](format.raw/*16.27*/("""
			        """),format.raw/*17.12*/("""<a href = """"),_display_(/*17.24*/routes/*17.30*/.HomeController.properties(s.getId())),format.raw/*17.67*/("""" class="list-group-item catheight">"""),_display_(/*17.104*/s/*17.105*/.getName),format.raw/*17.113*/("""
                        """),format.raw/*18.25*/("""<span class="badge">"""),_display_(/*18.46*/s/*18.47*/.getProperty.size),format.raw/*18.64*/("""</span> 
                    </a>
			    """)))}),format.raw/*20.9*/("""
            """),format.raw/*21.13*/("""</ul>
    </div>

    <div class = "col-sm-9">
    <br>
    <div id="database-list">
        <table style="width:100%">
            """),_display_(/*28.14*/for(property<-properties) yield /*28.39*/ {_display_(Seq[Any](format.raw/*28.41*/("""
                """),format.raw/*29.17*/("""<tr>
                    <td>
                        <a href=""""),_display_(/*31.35*/routes/*31.41*/.HomeController.viewProperty(property.getId)),format.raw/*31.85*/("""" class="listing">
                        <img src="property.getThumbnailPath" /> House for &euro;"""),_display_(/*32.82*/property/*32.90*/.getDisplayValue(property.getPrice)),format.raw/*32.125*/("""
                    """),format.raw/*33.21*/("""</td>
                        <td class="desc">
                            <i class="fas fa-bed"></i> """),_display_(/*35.57*/property/*35.65*/.getNumBeds),format.raw/*35.76*/("""&nbsp;
                            <i class="fas fa-toilet"></i> """),_display_(/*36.60*/property/*36.68*/.getNumBaths),format.raw/*36.80*/("""&nbsp;
                          
                            <i class="fas fa-leaf"></i>"""),_display_(/*38.57*/property/*38.65*/.getStock),format.raw/*38.74*/("""&nbsp;
                            """),_display_(/*39.30*/if((user != null) && ("admin".equals(user.getRole())))/*39.84*/ {_display_(Seq[Any](format.raw/*39.86*/("""
                                """),format.raw/*40.33*/("""&nbsp;
                                """),_display_(/*41.34*/if(property.getStock == 0)/*41.60*/ {_display_(Seq[Any](format.raw/*41.62*/("""
                                    """),format.raw/*42.37*/("""<td><a href=""""),_display_(/*42.51*/routes/*42.57*/.ShoppingCtrl.addToBasket(property.getId)),format.raw/*42.98*/(""""
                                        class="btn btn-default btn-xs"><span
                                        class="glyphicon glyphicon-shopping-cart"></span></a>
                                    </td>
                                """)))}/*46.35*/else/*46.40*/{_display_(Seq[Any](format.raw/*46.41*/("""
                                    """),format.raw/*47.37*/("""<td><img src="/assets/images/sold.jpg"/></td>
                                """)))}),format.raw/*48.34*/("""

                                """),format.raw/*50.33*/("""&nbsp;
                                <a href=""""),_display_(/*51.43*/routes/*51.49*/.HomeController.updateProperty(property.getId)),format.raw/*51.95*/(""""><i class="fas fa-edit"></i></a>
                                &nbsp;
                                <a href=""""),_display_(/*53.43*/routes/*53.49*/.HomeController.deleteProperty(property.getId)),format.raw/*53.95*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                            """)))}),format.raw/*54.30*/("""
                        """),format.raw/*55.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*58.14*/("""
        """),format.raw/*59.9*/("""</table>
    </div>
</div>
""")))}))
      }
    }
  }

  def render(properties:List[models.products.Property],style:List[models.products.Style],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(properties,style,user,env)

  def f:((List[models.products.Property],List[models.products.Style],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (properties,style,user,env) => apply(properties,style,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 10:29:44 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/properties.scala.html
                  HASH: 094e65d402379262b2ffce268fde0a0b87e13403
                  MATRIX: 1044->1|1269->134|1301->158|1340->160|1371->165|1428->196|1532->291|1572->293|1612->306|1648->316|1662->322|1711->351|1841->451|1873->456|2017->573|2032->579|2082->608|2161->660|2190->673|2230->675|2270->687|2309->699|2324->705|2382->742|2447->779|2458->780|2488->788|2541->813|2589->834|2599->835|2637->852|2709->894|2750->907|2910->1040|2951->1065|2991->1067|3036->1084|3127->1148|3142->1154|3207->1198|3334->1298|3351->1306|3408->1341|3457->1362|3588->1466|3605->1474|3637->1485|3730->1551|3747->1559|3780->1571|3897->1661|3914->1669|3944->1678|4007->1714|4070->1768|4110->1770|4171->1803|4238->1843|4273->1869|4313->1871|4378->1908|4419->1922|4434->1928|4496->1969|4763->2218|4776->2223|4815->2224|4880->2261|4990->2340|5052->2374|5128->2423|5143->2429|5210->2475|5352->2590|5367->2596|5434->2642|5560->2737|5613->2762|5710->2828|5746->2837
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|59->28|59->28|59->28|60->29|62->31|62->31|62->31|63->32|63->32|63->32|64->33|66->35|66->35|66->35|67->36|67->36|67->36|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|77->46|77->46|77->46|78->47|79->48|81->50|82->51|82->51|82->51|84->53|84->53|84->53|85->54|86->55|89->58|90->59
                  -- GENERATED --
              */
          