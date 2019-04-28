
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
                    """),_display_(/*27.22*/if(i.getStock != 0)/*27.41*/{_display_(Seq[Any](format.raw/*27.42*/("""
                    """),format.raw/*28.21*/("""<td>"""),_display_(/*28.26*/i/*28.27*/.getId),format.raw/*28.33*/("""</td>
                    <td>"""),_display_(/*29.26*/i/*29.27*/.getNumBeds),format.raw/*29.38*/("""</td>
                    <td>"""),_display_(/*30.26*/i/*30.27*/.getNumBaths),format.raw/*30.39*/("""</td>
                    <td>&euro; """),_display_(/*31.33*/("%.2f".format(i.getPrice))),format.raw/*31.60*/("""</td>
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*34.35*/routes/*34.41*/.HomeController.updateProperty(i.getId)),format.raw/*34.80*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>

                    <!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*41.35*/routes/*41.41*/.HomeController.deleteProperty(i.getId)),format.raw/*41.80*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>

                    """),_display_(/*46.22*/if(i.getStock() == 1)/*46.43*/ {_display_(Seq[Any](format.raw/*46.45*/("""
                        """),format.raw/*47.25*/("""<td><a href=""""),_display_(/*47.39*/routes/*47.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*47.79*/(""""
                                class="btn btn-default btn-xs"><span
                                class="glyphicon glyphicon-shopping-cart"></span></a>
                        </td>
                            """)))}/*51.31*/else/*51.36*/{_display_(Seq[Any](format.raw/*51.37*/("""
                                """),format.raw/*52.33*/("""<td><img src="/assets/images/sold.jpg"/></td>
                            """)))}),format.raw/*53.30*/("""
                        """)))}),format.raw/*54.26*/("""
                    """)))}),format.raw/*55.22*/(""" """),format.raw/*55.23*/("""<!--End of For loop-->

            </tr>
        
        </tbody>
    </table>         

    <p>
        <a href=""""),_display_(/*63.19*/routes/*63.25*/.HomeController.addProperty()),format.raw/*63.54*/("""">
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
                  DATE: Sun Apr 28 16:39:02 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/properties.scala.html
                  HASH: 9546389461ae35f3d7970428f4c675be580bd0fa
                  MATRIX: 1044->1|1269->133|1296->135|1326->157|1365->159|1396->164|1489->232|1529->264|1568->266|1603->275|1676->322|1689->327|1724->342|1760->351|1802->363|1839->373|2246->753|2278->769|2318->771|2374->800|2402->819|2441->820|2490->841|2522->846|2532->847|2559->853|2617->884|2627->885|2659->896|2717->927|2727->928|2760->940|2825->978|2873->1005|3008->1113|3023->1119|3083->1158|3368->1416|3383->1422|3443->1461|3686->1677|3716->1698|3756->1700|3809->1725|3850->1739|3865->1745|3920->1779|4155->1996|4168->2001|4207->2002|4268->2035|4374->2110|4431->2136|4484->2158|4513->2159|4657->2276|4672->2282|4722->2311
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|65->34|65->34|65->34|72->41|72->41|72->41|77->46|77->46|77->46|78->47|78->47|78->47|78->47|82->51|82->51|82->51|83->52|84->53|85->54|86->55|86->55|94->63|94->63|94->63
                  -- GENERATED --
              */
          