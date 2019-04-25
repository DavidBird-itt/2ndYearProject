
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
  def apply/*1.2*/(property: List[models.products.Property], style: List[models.products.Style], user: models.users.User, env: play.api.Environment ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Database", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<h1>The Database</h1>

    <!-- Displays the flash message -->
    """),_display_(/*7.6*/if(flash.containsKey("success"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
            """),_display_(/*9.14*/flash/*9.19*/.get("success")),format.raw/*9.34*/("""
        """),format.raw/*10.9*/("""</div>
    """)))}),format.raw/*11.6*/("""
    
    """),format.raw/*13.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th>ID</th>
                <th>Bedrooms</th>
                <th>Bathrooms</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <!--Populating the database-->
            <tr>
                """),_display_(/*26.18*/for(i<-property) yield /*26.34*/ {_display_(Seq[Any](format.raw/*26.36*/("""        
                    """),format.raw/*27.21*/("""<td>"""),_display_(/*27.26*/i/*27.27*/.getId),format.raw/*27.33*/("""</td>
                    <td>"""),_display_(/*28.26*/i/*28.27*/.getNumBeds),format.raw/*28.38*/("""</td>
                    <td>"""),_display_(/*29.26*/i/*29.27*/.getNumBaths),format.raw/*29.39*/("""</td>
                    <td>&euro; """),_display_(/*30.33*/("%.2f".format(i.getPrice))),format.raw/*30.60*/("""</td>
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*33.35*/routes/*33.41*/.HomeController.updateProperty(i.getId)),format.raw/*33.80*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>

                    <!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*40.35*/routes/*40.41*/.HomeController.deleteProperty(i.getId)),format.raw/*40.80*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>

                    """),_display_(/*45.22*/if(i.getStock() == 1)/*45.43*/ {_display_(Seq[Any](format.raw/*45.45*/("""
                        """),format.raw/*46.25*/("""<td><a href=""""),_display_(/*46.39*/routes/*46.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*46.79*/(""""
                                class="btn btn-default btn-xs"><span
                                class="glyphicon glyphicon-shopping-cart"></span></a>
                        </td>
                            """)))}/*50.31*/else/*50.36*/{_display_(Seq[Any](format.raw/*50.37*/("""
                                """),format.raw/*51.33*/("""<td><img src="/assets/images/sold.jpg"/></td>
                            """)))}),format.raw/*52.30*/("""

            """),format.raw/*54.13*/("""</tr>
        """)))}),format.raw/*55.10*/("""
        """),format.raw/*56.9*/("""</tbody>
    </table>         

    <p>
        <a href=""""),_display_(/*60.19*/routes/*60.25*/.HomeController.addProperty()),format.raw/*60.54*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
""")))}))
      }
    }
  }

  def render(property:List[models.products.Property],style:List[models.products.Style],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(property,style,user,env)

  def f:((List[models.products.Property],List[models.products.Style],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (property,style,user,env) => apply(property,style,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 16:47:43 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/properties.scala.html
                  HASH: 007408d1e503efe229fdde45e8b0813e23d9cb19
                  MATRIX: 1044->1|1269->133|1296->135|1326->157|1365->159|1396->164|1489->232|1529->264|1568->266|1603->275|1676->322|1689->327|1724->342|1760->351|1802->363|1839->373|2246->753|2278->769|2318->771|2375->800|2407->805|2417->806|2444->812|2502->843|2512->844|2544->855|2602->886|2612->887|2645->899|2710->937|2758->964|2893->1072|2908->1078|2968->1117|3253->1375|3268->1381|3328->1420|3571->1636|3601->1657|3641->1659|3694->1684|3735->1698|3750->1704|3805->1738|4040->1955|4053->1960|4092->1961|4153->1994|4259->2069|4301->2083|4347->2098|4383->2107|4468->2165|4483->2171|4533->2200
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|64->33|64->33|64->33|71->40|71->40|71->40|76->45|76->45|76->45|77->46|77->46|77->46|77->46|81->50|81->50|81->50|82->51|83->52|85->54|86->55|87->56|91->60|91->60|91->60
                  -- GENERATED --
              */
          