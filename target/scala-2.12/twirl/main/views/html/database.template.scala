
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


Seq[Any](format.raw/*2.1*/("""<head>
"""),_display_(/*3.2*/main("Database", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<h1>The Database</h1>

    <!-- Displays the flash message -->
    """),_display_(/*7.6*/if(flash.containsKey("success"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
            """),_display_(/*9.14*/flash/*9.19*/.get("success")),format.raw/*9.34*/("""
        """),format.raw/*10.9*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    
    </head>
    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th><i class="fas fa-images"></i></th>
                <th>ID</th>
                <th><i class="fas fa-bed"></i></th>
                <th><i class="fas fa-restroom"></i></th>
                <th><i class="fas fa-euro-sign"></i></th>
                <th><i class="fa fa-leaf"></i></th>
                <th><i class="fas fa-car"></i></th>
            </tr>
        </thead>
        <tbody>
            <!--Populating the database-->
            <tr>
                """),_display_(/*33.18*/for(i<-houses) yield /*33.32*/ {_display_(Seq[Any](format.raw/*33.34*/("""
                    """),_display_(/*34.22*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*34.104*/ {_display_(Seq[Any](format.raw/*34.106*/("""
                    """),format.raw/*35.21*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*35.65*/(i.getId + "thumb.jpg")),format.raw/*35.88*/(""""/></td>
                    """)))}/*36.23*/else/*36.28*/{_display_(Seq[Any](format.raw/*36.29*/("""
                    """),format.raw/*37.21*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                    """)))}),format.raw/*38.22*/("""

                    """),format.raw/*40.21*/("""<td>"""),_display_(/*40.26*/i/*40.27*/.getId),format.raw/*40.33*/("""</td>
                    <td>"""),_display_(/*41.26*/i/*41.27*/.getNumBeds),format.raw/*41.38*/("""</td>
                    <td>"""),_display_(/*42.26*/i/*42.27*/.getNumBaths),format.raw/*42.39*/("""</td>
                    <td>&euro; """),_display_(/*43.33*/("%.2f".format(i.getPrice))),format.raw/*43.60*/("""</td>
                    <td>"""),_display_(/*44.26*/i/*44.27*/.getGardenSize),format.raw/*44.41*/("""</td>
                    <td>"""),_display_(/*45.26*/i/*45.27*/.getGarage),format.raw/*45.37*/("""</td>

                    """),_display_(/*47.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*47.113*/ {_display_(Seq[Any](format.raw/*47.115*/("""
                    """),format.raw/*48.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*50.35*/routes/*50.41*/.HomeController.updateHouse(i.getId)),format.raw/*50.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>
                """)))}),format.raw/*54.18*/("""

                """),_display_(/*56.18*/if((user != null) && ("admin".equals(user.getRole())))/*56.72*/ {_display_(Seq[Any](format.raw/*56.74*/("""
                    """),format.raw/*57.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.HomeController.deleteHouse(i.getId)),format.raw/*59.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*63.18*/("""
            """),format.raw/*64.13*/("""</tr>
        """)))}),format.raw/*65.10*/("""
        """),format.raw/*66.9*/("""</tbody>
    </table>         

    """),_display_(/*69.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*69.97*/ {_display_(Seq[Any](format.raw/*69.99*/("""
    """),format.raw/*70.5*/("""<p>
        <a href=""""),_display_(/*71.19*/routes/*71.25*/.HomeController.addHouse()),format.raw/*71.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*75.6*/("""
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
                  DATE: Mon Mar 25 17:07:16 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/database.scala.html
                  HASH: d5605906f329bfa01902dd6f2c97b2f3982d71e9
                  MATRIX: 1003->1|1178->83|1211->91|1241->113|1280->115|1311->120|1404->188|1444->220|1483->222|1518->231|1591->278|1604->283|1639->298|1675->307|1717->319|1750->325|2704->1252|2734->1266|2774->1268|2823->1290|2915->1372|2956->1374|3005->1395|3076->1439|3120->1462|3169->1493|3182->1498|3221->1499|3270->1520|3385->1604|3435->1626|3467->1631|3477->1632|3504->1638|3562->1669|3572->1670|3604->1681|3662->1712|3672->1713|3705->1725|3770->1763|3818->1790|3876->1821|3886->1822|3921->1836|3979->1867|3989->1868|4020->1878|4075->1906|4176->1997|4217->1999|4266->2020|4375->2102|4390->2108|4447->2144|4650->2316|4696->2335|4759->2389|4799->2391|4848->2412|4957->2494|4972->2500|5029->2536|5271->2747|5312->2760|5358->2775|5394->2784|5457->2821|5557->2912|5597->2914|5629->2919|5678->2941|5693->2947|5740->2973|5865->3068
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|69->38|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|78->47|78->47|78->47|79->48|81->50|81->50|81->50|85->54|87->56|87->56|87->56|88->57|90->59|90->59|90->59|94->63|95->64|96->65|97->66|100->69|100->69|100->69|101->70|102->71|102->71|102->71|106->75
                  -- GENERATED --
              */
          