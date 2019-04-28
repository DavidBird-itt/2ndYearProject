
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

object propertiesAdam extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.Property],List[models.products.Style],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

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
                            """),_display_(/*39.30*/if((user != null) && ("member".equals(user.getRole())))/*39.85*/ {_display_(Seq[Any](format.raw/*39.87*/("""
                                """),format.raw/*40.33*/("""&nbsp;
                                """),_display_(/*41.34*/if(property.getStock == 1)/*41.60*/ {_display_(Seq[Any](format.raw/*41.62*/("""
                                    """),format.raw/*42.37*/("""<td><a href=""""),_display_(/*42.51*/routes/*42.57*/.ShoppingCtrl.addToBasket(property.getId)),format.raw/*42.98*/(""""
                                        class="btn btn-default btn-xs"><span
                                        class="glyphicon glyphicon-shopping-cart"></span></a>
                                    </td>
                                """)))}/*46.35*/else/*46.40*/{_display_(Seq[Any](format.raw/*46.41*/("""
                                    """),format.raw/*47.37*/("""<td><img src="/assets/images/sold.jpg"/></td>
                                """)))}),format.raw/*48.34*/("""
                                """),format.raw/*49.33*/("""&nbsp;
                                <a href=""""),_display_(/*50.43*/routes/*50.49*/.HomeController.updateProperty(property.getId)),format.raw/*50.95*/(""""><i class="fas fa-edit"></i></a>
                                &nbsp;
                                <a href=""""),_display_(/*52.43*/routes/*52.49*/.HomeController.deleteProperty(property.getId)),format.raw/*52.95*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                            """)))}),format.raw/*53.30*/("""
                        """),format.raw/*54.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*57.14*/("""
        """),format.raw/*58.9*/("""</table>
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
                  DATE: Sun Apr 28 15:04:15 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/propertiesAdam.scala.html
                  HASH: 2561850df75d7e20f90ac6df447c00349c53b7d9
                  MATRIX: 1048->1|1273->134|1305->158|1344->160|1375->165|1432->196|1536->291|1576->293|1616->306|1652->316|1666->322|1715->351|1845->451|1877->456|2021->573|2036->579|2086->608|2165->660|2194->673|2234->675|2274->687|2313->699|2328->705|2386->742|2451->779|2462->780|2492->788|2545->813|2593->834|2603->835|2641->852|2713->894|2754->907|2914->1040|2955->1065|2995->1067|3040->1084|3131->1148|3146->1154|3211->1198|3338->1298|3355->1306|3412->1341|3461->1362|3592->1466|3609->1474|3641->1485|3734->1551|3751->1559|3784->1571|3901->1661|3918->1669|3948->1678|4011->1714|4075->1769|4115->1771|4176->1804|4243->1844|4278->1870|4318->1872|4383->1909|4424->1923|4439->1929|4501->1970|4768->2219|4781->2224|4820->2225|4885->2262|4995->2341|5056->2374|5132->2423|5147->2429|5214->2475|5356->2590|5371->2596|5438->2642|5564->2737|5617->2762|5714->2828|5750->2837
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|59->28|59->28|59->28|60->29|62->31|62->31|62->31|63->32|63->32|63->32|64->33|66->35|66->35|66->35|67->36|67->36|67->36|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|77->46|77->46|77->46|78->47|79->48|80->49|81->50|81->50|81->50|83->52|83->52|83->52|84->53|85->54|88->57|89->58
                  -- GENERATED --
              */
          