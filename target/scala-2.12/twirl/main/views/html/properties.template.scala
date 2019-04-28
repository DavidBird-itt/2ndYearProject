
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
                <th>Image</th>
                <th>ID</th>
                <th>Bedrooms</th>
                <th>Bathrooms</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <!--Populating the database-->
            <tr>
                """),_display_(/*27.18*/for(i<-property) yield /*27.34*/ {_display_(Seq[Any](format.raw/*27.36*/("""       
                    """),_display_(/*28.22*/if(i.getStock != 0)/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""
                        """),format.raw/*29.25*/("""<tr>
                            """),_display_(/*30.30*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*30.112*/ {_display_(Seq[Any](format.raw/*30.114*/("""
                                """),format.raw/*31.33*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*31.77*/(i.getId + "thumb.jpg")),format.raw/*31.100*/(""""/></td>
                            """)))}/*32.31*/else/*32.36*/{_display_(Seq[Any](format.raw/*32.37*/("""
                                """),format.raw/*33.33*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                            """)))}),format.raw/*34.30*/("""
                    """),format.raw/*35.21*/("""<td>"""),_display_(/*35.26*/i/*35.27*/.getId),format.raw/*35.33*/("""</td>
                    <td>"""),_display_(/*36.26*/i/*36.27*/.getNumBeds),format.raw/*36.38*/("""</td>
                    <td>"""),_display_(/*37.26*/i/*37.27*/.getNumBaths),format.raw/*37.39*/("""</td>
                    <td>&euro; """),_display_(/*38.33*/("%.2f".format(i.getPrice))),format.raw/*38.60*/("""</td>
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*41.35*/routes/*41.41*/.HomeController.updateProperty(i.getId)),format.raw/*41.80*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>

                    <!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*48.35*/routes/*48.41*/.HomeController.deleteProperty(i.getId)),format.raw/*48.80*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>

                    """),_display_(/*53.22*/if(i.getStock() == 1)/*53.43*/ {_display_(Seq[Any](format.raw/*53.45*/("""
                        """),format.raw/*54.25*/("""<td><a href=""""),_display_(/*54.39*/routes/*54.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*54.79*/(""""
                                class="btn btn-default btn-xs"><span
                                class="glyphicon glyphicon-shopping-cart"></span></a>
                        </td>
                            """)))}/*58.31*/else/*58.36*/{_display_(Seq[Any](format.raw/*58.37*/("""
                                """),format.raw/*59.33*/("""<td><img src="/assets/images/sold.jpg"/></td>
                            """)))}),format.raw/*60.30*/("""
                        """)))}),format.raw/*61.26*/("""
                    """)))}),format.raw/*62.22*/(""" """),format.raw/*62.23*/("""<!--End of For loop-->

            </tr>
        
        </tbody>
    </table>         

    <p>
        <a href=""""),_display_(/*70.19*/routes/*70.25*/.HomeController.addProperty()),format.raw/*70.54*/("""">
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
                  DATE: Sun Apr 28 19:12:15 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/properties.scala.html
                  HASH: b8cbe147feccf1de008a43d0850340b18adf7eec
                  MATRIX: 1044->1|1269->133|1296->135|1326->157|1365->159|1396->164|1489->232|1529->264|1568->266|1603->275|1676->322|1689->327|1724->342|1760->351|1802->363|1839->373|2277->784|2309->800|2349->802|2405->831|2433->850|2472->851|2525->876|2586->910|2678->992|2719->994|2780->1027|2851->1071|2896->1094|2953->1133|2966->1138|3005->1139|3066->1172|3189->1264|3238->1285|3270->1290|3280->1291|3307->1297|3365->1328|3375->1329|3407->1340|3465->1371|3475->1372|3508->1384|3573->1422|3621->1449|3756->1557|3771->1563|3831->1602|4116->1860|4131->1866|4191->1905|4434->2121|4464->2142|4504->2144|4557->2169|4598->2183|4613->2189|4668->2223|4903->2440|4916->2445|4955->2446|5016->2479|5122->2554|5179->2580|5232->2602|5261->2603|5405->2720|5420->2726|5470->2755
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|72->41|72->41|72->41|79->48|79->48|79->48|84->53|84->53|84->53|85->54|85->54|85->54|85->54|89->58|89->58|89->58|90->59|91->60|92->61|93->62|93->62|101->70|101->70|101->70
                  -- GENERATED --
              */
          