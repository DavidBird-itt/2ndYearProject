
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
                        <img src=""""),_display_(/*32.36*/property/*32.44*/.getThumbnailPath()),format.raw/*32.63*/("""" /> House for &euro;"""),_display_(/*32.85*/property/*32.93*/.getDisplayValue(property.getPrice)),format.raw/*32.128*/("""
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
                            """)))}),format.raw/*49.30*/("""
                                """),_display_(/*50.34*/if((user != null) && ("admin".equals(user.getRole())))/*50.88*/{_display_(Seq[Any](format.raw/*50.89*/("""
                                """),format.raw/*51.33*/("""&nbsp;
                                <td><a href=""""),_display_(/*52.47*/routes/*52.53*/.HomeController.updateProperty(property.getId)),format.raw/*52.99*/(""""><i class="fas fa-edit"></i></a></td>
                                &nbsp;
                                <td></td><a href=""""),_display_(/*54.52*/routes/*54.58*/.HomeController.deleteProperty(property.getId)),format.raw/*54.104*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a></td>
                            """)))}),format.raw/*55.30*/("""
                        """),format.raw/*56.25*/("""</td>
                    </a>
                </tr>
            """)))}),format.raw/*59.14*/("""
        """),format.raw/*60.9*/("""</table>
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
                  DATE: Sun Apr 28 21:24:13 IST 2019
                  SOURCE: /home/wdd/temp/PlayReminder/app/views/properties.scala.html
                  HASH: f53cab0492daa439f4cc318825dd6434b042a5ed
                  MATRIX: 1044->1|1269->134|1301->158|1340->160|1371->165|1428->196|1532->291|1572->293|1612->306|1648->316|1662->322|1711->351|1841->451|1873->456|2017->573|2032->579|2082->608|2161->660|2190->673|2230->675|2270->687|2309->699|2324->705|2382->742|2447->779|2458->780|2488->788|2541->813|2589->834|2599->835|2637->852|2709->894|2750->907|2910->1040|2951->1065|2991->1067|3036->1084|3127->1148|3142->1154|3207->1198|3288->1252|3305->1260|3345->1279|3394->1301|3411->1309|3468->1344|3517->1365|3648->1469|3665->1477|3697->1488|3790->1554|3807->1562|3840->1574|3957->1664|3974->1672|4004->1681|4067->1717|4131->1772|4171->1774|4232->1807|4299->1847|4334->1873|4374->1875|4439->1912|4480->1926|4495->1932|4557->1973|4824->2222|4837->2227|4876->2228|4941->2265|5051->2344|5112->2374|5173->2408|5236->2462|5275->2463|5336->2496|5416->2549|5431->2555|5498->2601|5654->2730|5669->2736|5737->2782|5868->2882|5921->2907|6018->2973|6054->2982
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|40->9|41->10|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|59->28|59->28|59->28|60->29|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|66->35|66->35|66->35|67->36|67->36|67->36|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|77->46|77->46|77->46|78->47|79->48|80->49|81->50|81->50|81->50|82->51|83->52|83->52|83->52|85->54|85->54|85->54|86->55|87->56|90->59|91->60
                  -- GENERATED --
              */
          