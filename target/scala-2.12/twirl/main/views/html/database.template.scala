
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Houses],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.Houses], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
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
                """),_display_(/*26.18*/for(i<-houses) yield /*26.32*/ {_display_(Seq[Any](format.raw/*26.34*/("""        
                    """),format.raw/*27.21*/("""<td>"""),_display_(/*27.26*/i/*27.27*/.getId),format.raw/*27.33*/("""</td>
                    <td>"""),_display_(/*28.26*/i/*28.27*/.getNumBeds),format.raw/*28.38*/("""</td>
                    <td>"""),_display_(/*29.26*/i/*29.27*/.getNumBaths),format.raw/*29.39*/("""</td>
                    <td>&euro; """),_display_(/*30.33*/("%.2f".format(i.getPrice))),format.raw/*30.60*/("""</td>

                    """),_display_(/*32.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*32.113*/ {_display_(Seq[Any](format.raw/*32.115*/("""
                    """),format.raw/*33.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*35.35*/routes/*35.41*/.HomeController.updateHouse(i.getId)),format.raw/*35.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>
                """)))}),format.raw/*39.18*/("""

                """),_display_(/*41.18*/if((user != null) && ("admin".equals(user.getRole())))/*41.72*/ {_display_(Seq[Any](format.raw/*41.74*/("""
                    """),format.raw/*42.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.deleteHouse(i.getId)),format.raw/*44.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*48.18*/("""
            """),format.raw/*49.13*/("""</tr>
        """)))}),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""</tbody>
    </table>         

    """),_display_(/*54.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*54.97*/ {_display_(Seq[Any](format.raw/*54.99*/("""
    """),format.raw/*55.5*/("""<p>
        <a href=""""),_display_(/*56.19*/routes/*56.25*/.HomeController.addHouse()),format.raw/*56.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*60.6*/("""
""")))}))
      }
    }
  }

  def render(houses:List[models.Houses],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(houses,user)

  def f:((List[models.Houses],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (houses,user) => apply(houses,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 11:51:55 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 4205a1f8ece2368144433fd0b758c89445969798
                  MATRIX: 982->1|1130->56|1157->58|1187->80|1226->82|1257->87|1350->155|1390->187|1429->189|1464->198|1537->245|1550->250|1585->265|1621->274|1663->286|1700->296|2107->676|2137->690|2177->692|2234->721|2266->726|2276->727|2303->733|2361->764|2371->765|2403->776|2461->807|2471->808|2504->820|2569->858|2617->885|2672->913|2773->1004|2814->1006|2863->1027|2972->1109|2987->1115|3044->1151|3247->1323|3293->1342|3356->1396|3396->1398|3445->1419|3554->1501|3569->1507|3626->1543|3868->1754|3909->1767|3955->1782|3991->1791|4054->1828|4154->1919|4194->1921|4226->1926|4275->1948|4290->1954|4337->1980|4462->2075
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|63->32|63->32|63->32|64->33|66->35|66->35|66->35|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|79->48|80->49|81->50|82->51|85->54|85->54|85->54|86->55|87->56|87->56|87->56|91->60
                  -- GENERATED --
              */
          