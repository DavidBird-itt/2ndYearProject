
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Houses],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.Houses], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
                """),_display_(/*27.18*/for(i<-houses) yield /*27.32*/ {_display_(Seq[Any](format.raw/*27.34*/("""
                    
                        """),_display_(/*29.26*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*29.107*/ {_display_(Seq[Any](format.raw/*29.109*/("""
                        """),format.raw/*30.25*/("""<td><img src="/assets/images/projectImages"""),_display_(/*30.68*/(i.getId + " thumb.jpg")),format.raw/*30.92*/("""" /></td>
                        """)))}/*31.27*/else/*31.32*/{_display_(Seq[Any](format.raw/*31.33*/("""
                        """),format.raw/*32.25*/("""<td><img src="/assets/images/projectImages/noImage.jpg" /></td>
                        """)))}),format.raw/*33.26*/("""

                    """),format.raw/*35.21*/("""<td>"""),_display_(/*35.26*/i/*35.27*/.getId),format.raw/*35.33*/("""</td>
                    <td>"""),_display_(/*36.26*/i/*36.27*/.getNumBeds),format.raw/*36.38*/("""</td>
                    <td>"""),_display_(/*37.26*/i/*37.27*/.getNumBaths),format.raw/*37.39*/("""</td>
                    <td>&euro; """),_display_(/*38.33*/("%.2f".format(i.getPrice))),format.raw/*38.60*/("""</td>

                    """),_display_(/*40.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*40.113*/ {_display_(Seq[Any](format.raw/*40.115*/("""
                    """),format.raw/*41.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.updateHouse(i.getId)),format.raw/*43.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>
                """)))}),format.raw/*47.18*/("""

                """),_display_(/*49.18*/if((user != null) && ("admin".equals(user.getRole())))/*49.72*/ {_display_(Seq[Any](format.raw/*49.74*/("""
                    """),format.raw/*50.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*52.35*/routes/*52.41*/.HomeController.deleteHouse(i.getId)),format.raw/*52.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*56.18*/("""
            """),format.raw/*57.13*/("""</tr>
        """)))}),format.raw/*58.10*/("""
        """),format.raw/*59.9*/("""</tbody>
    </table>         

    """),_display_(/*62.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*62.97*/ {_display_(Seq[Any](format.raw/*62.99*/("""
    """),format.raw/*63.5*/("""<p>
        <a href=""""),_display_(/*64.19*/routes/*64.25*/.HomeController.addHouse()),format.raw/*64.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*68.6*/("""
""")))}))
      }
    }
  }

  def render(houses:List[models.Houses],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houses,user,env)

  def f:((List[models.Houses],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houses,user,env) => apply(houses,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 16:44:00 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/database.scala.html
                  HASH: 248a3de259a612ee472bcec58cf7ec4e93fd7c61
                  MATRIX: 1003->1|1178->83|1205->85|1235->107|1274->109|1305->114|1398->182|1438->214|1477->216|1512->225|1585->272|1598->277|1633->292|1669->301|1711->313|1748->323|2186->734|2216->748|2256->750|2330->797|2421->878|2462->880|2515->905|2585->948|2630->972|2684->1008|2697->1013|2736->1014|2789->1039|2909->1128|2959->1150|2991->1155|3001->1156|3028->1162|3086->1193|3096->1194|3128->1205|3186->1236|3196->1237|3229->1249|3294->1287|3342->1314|3397->1342|3498->1433|3539->1435|3588->1456|3697->1538|3712->1544|3769->1580|3972->1752|4018->1771|4081->1825|4121->1827|4170->1848|4279->1930|4294->1936|4351->1972|4593->2183|4634->2196|4680->2211|4716->2220|4779->2257|4879->2348|4919->2350|4951->2355|5000->2377|5015->2383|5062->2409|5187->2504
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|58->27|58->27|58->27|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|71->40|71->40|71->40|72->41|74->43|74->43|74->43|78->47|80->49|80->49|80->49|81->50|83->52|83->52|83->52|87->56|88->57|89->58|90->59|93->62|93->62|93->62|94->63|95->64|95->64|95->64|99->68
                  -- GENERATED --
              */
          