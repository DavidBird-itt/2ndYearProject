
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
                """),_display_(/*29.18*/if(property.getStock() != 0)/*29.46*/{_display_(Seq[Any](format.raw/*29.47*/(""" 
                """),format.raw/*30.17*/("""<tr>
                    <td>
                        <a href=""""),_display_(/*32.35*/routes/*32.41*/.HomeController.viewProperty(property.getId)),format.raw/*32.85*/("""" class="listing">
                        <img src=""""),_display_(/*33.36*/property/*33.44*/.getThumbnailPath()),format.raw/*33.63*/("""" /> House for &euro;"""),_display_(/*33.85*/property/*33.93*/.getDisplayValue(property.getPrice)),format.raw/*33.128*/("""
                    """),format.raw/*34.21*/("""</td>
                        <td class="desc">
                            <i class="fas fa-bed"></i> """),_display_(/*36.57*/property/*36.65*/.getNumBeds),format.raw/*36.76*/("""&nbsp;
                            <i class="fas fa-toilet"></i> """),_display_(/*37.60*/property/*37.68*/.getNumBaths),format.raw/*37.80*/("""&nbsp;
                          
                            <i class="fas fa-leaf"></i>"""),_display_(/*39.57*/property/*39.65*/.getStock),format.raw/*39.74*/("""&nbsp;
                            """),_display_(/*40.30*/if((user != null) && ("member".equals(user.getRole())))/*40.85*/ {_display_(Seq[Any](format.raw/*40.87*/("""
                                """),format.raw/*41.33*/("""&nbsp;
                                """),_display_(/*42.34*/if(property.getStock == 1)/*42.60*/ {_display_(Seq[Any](format.raw/*42.62*/("""
                                    """),format.raw/*43.37*/("""<td><a href=""""),_display_(/*43.51*/routes/*43.57*/.ShoppingCtrl.addToBasket(property.getId)),format.raw/*43.98*/(""""
                                        class="btn btn-default btn-xs"><span
                                        class="glyphicon glyphicon-shopping-cart"></span></a>
                                    </td>
                                """)))}/*47.35*/else/*47.40*/{_display_(Seq[Any](format.raw/*47.41*/("""
                                    """),format.raw/*48.37*/("""<td><img src="/assets/images/sold.jpg"/></td>
                                """)))}),format.raw/*49.34*/("""
                            """)))}),format.raw/*50.30*/("""
                                """),_display_(/*51.34*/if((user != null) && ("admin".equals(user.getRole())))/*51.88*/{_display_(Seq[Any](format.raw/*51.89*/("""
                                """),format.raw/*52.33*/("""&nbsp;
                                <td><a href=""""),_display_(/*53.47*/routes/*53.53*/.HomeController.updateProperty(property.getId)),format.raw/*53.99*/(""""><i class="fas fa-edit"></i></a></td>
                                &nbsp;
                                <td></td><a href=""""),_display_(/*55.52*/routes/*55.58*/.HomeController.deleteProperty(property.getId)),format.raw/*55.104*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a></td>
                            """)))}),format.raw/*56.30*/("""
                        """),format.raw/*57.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*60.14*/("""
            """)))}),format.raw/*61.14*/("""
        """),format.raw/*62.9*/("""</table>
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
                  DATE: Sun Apr 28 21:38:04 IST 2019
                  SOURCE: /home/wdd/temp/PlayReminder/app/views/properties.scala.html
                  HASH: ba813c743aebda940022e13e6dc7d550cd136e41
                  MATRIX: 1044->1|1269->134|1301->158|1340->160|1371->165|1428->196|1532->291|1572->293|1612->306|1648->316|1662->322|1711->351|1841->451|1873->456|2017->573|2032->579|2082->608|2161->660|2190->673|2230->675|2270->687|2309->699|2324->705|2382->742|2447->779|2458->780|2488->788|2541->813|2589->834|2599->835|2637->852|2709->894|2750->907|2910->1040|2951->1065|2991->1067|3036->1085|3073->1113|3112->1114|3158->1132|3249->1196|3264->1202|3329->1246|3410->1300|3427->1308|3467->1327|3516->1349|3533->1357|3590->1392|3639->1413|3770->1517|3787->1525|3819->1536|3912->1602|3929->1610|3962->1622|4079->1712|4096->1720|4126->1729|4189->1765|4253->1820|4293->1822|4354->1855|4421->1895|4456->1921|4496->1923|4561->1960|4602->1974|4617->1980|4679->2021|4946->2270|4959->2275|4998->2276|5063->2313|5173->2392|5234->2422|5295->2456|5358->2510|5397->2511|5458->2544|5538->2597|5553->2603|5620->2649|5776->2778|5791->2784|5859->2830|5990->2930|6043->2955|6140->3021|6185->3035|6221->3044
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|59->28|59->28|59->28|60->29|60->29|60->29|61->30|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|67->36|67->36|67->36|68->37|68->37|68->37|70->39|70->39|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|74->43|78->47|78->47|78->47|79->48|80->49|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|86->55|86->55|86->55|87->56|88->57|91->60|92->61|93->62
                  -- GENERATED --
              */
          