
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
                <th>Garden Size</th>
            </tr>
        </thead>
        <tbody>
            <!--Populating the database-->
            <tr>
                """),_display_(/*28.18*/for(i<-houses) yield /*28.32*/ {_display_(Seq[Any](format.raw/*28.34*/("""
                    
                        """),_display_(/*30.26*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*30.107*/ {_display_(Seq[Any](format.raw/*30.109*/("""
                        """),format.raw/*31.25*/("""<td><img src="/assets/images/projectImages"""),_display_(/*31.68*/(i.getId + " thumb.jpg")),format.raw/*31.92*/("""" /></td>
                        """)))}/*32.27*/else/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                        """),format.raw/*33.25*/("""<td><img src="/assets/images/projectImages/noImage.jpg" /></td>
                        """)))}),format.raw/*34.26*/("""

                    """),format.raw/*36.21*/("""<td>"""),_display_(/*36.26*/i/*36.27*/.getId),format.raw/*36.33*/("""</td>
                    <td>"""),_display_(/*37.26*/i/*37.27*/.getNumBeds),format.raw/*37.38*/("""</td>
                    <td>"""),_display_(/*38.26*/i/*38.27*/.getNumBaths),format.raw/*38.39*/("""</td>
                    <td>&euro; """),_display_(/*39.33*/("%.2f".format(i.getPrice))),format.raw/*39.60*/("""</td>
                    <td>"""),_display_(/*40.26*/i/*40.27*/.getGardenSize),format.raw/*40.41*/("""</td>

                    """),_display_(/*42.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*42.113*/ {_display_(Seq[Any](format.raw/*42.115*/("""
                    """),format.raw/*43.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.HomeController.updateHouse(i.getId)),format.raw/*45.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>
                """)))}),format.raw/*49.18*/("""

                """),_display_(/*51.18*/if((user != null) && ("admin".equals(user.getRole())))/*51.72*/ {_display_(Seq[Any](format.raw/*51.74*/("""
                    """),format.raw/*52.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*54.35*/routes/*54.41*/.HomeController.deleteHouse(i.getId)),format.raw/*54.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*58.18*/("""
            """),format.raw/*59.13*/("""</tr>
        """)))}),format.raw/*60.10*/("""
        """),format.raw/*61.9*/("""</tbody>
    </table>         

    """),_display_(/*64.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*64.97*/ {_display_(Seq[Any](format.raw/*64.99*/("""
    """),format.raw/*65.5*/("""<p>
        <a href=""""),_display_(/*66.19*/routes/*66.25*/.HomeController.addHouse()),format.raw/*66.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*70.6*/("""
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
                  DATE: Sun Mar 24 18:18:48 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 8a49ec94b36406dee812a35b2cb05f94a036fa5e
                  MATRIX: 1003->1|1178->83|1205->85|1235->107|1274->109|1305->114|1398->182|1438->214|1477->216|1512->225|1585->272|1598->277|1633->292|1669->301|1711->313|1748->323|2223->771|2253->785|2293->787|2367->834|2458->915|2499->917|2552->942|2622->985|2667->1009|2721->1045|2734->1050|2773->1051|2826->1076|2946->1165|2996->1187|3028->1192|3038->1193|3065->1199|3123->1230|3133->1231|3165->1242|3223->1273|3233->1274|3266->1286|3331->1324|3379->1351|3437->1382|3447->1383|3482->1397|3537->1425|3638->1516|3679->1518|3728->1539|3837->1621|3852->1627|3909->1663|4112->1835|4158->1854|4221->1908|4261->1910|4310->1931|4419->2013|4434->2019|4491->2055|4733->2266|4774->2279|4820->2294|4856->2303|4919->2340|5019->2431|5059->2433|5091->2438|5140->2460|5155->2466|5202->2492|5327->2587
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|71->40|71->40|71->40|73->42|73->42|73->42|74->43|76->45|76->45|76->45|80->49|82->51|82->51|82->51|83->52|85->54|85->54|85->54|89->58|90->59|91->60|92->61|95->64|95->64|95->64|96->65|97->66|97->66|97->66|101->70
                  -- GENERATED --
              */
          