
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

object database extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Houses],List[models.Apartment],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houses: List[models.Houses], aList: List[models.Apartment],  user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<head>
"""),_display_(/*3.2*/main("Database", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<h1>Idea 1</h1>

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
            
                """),_display_(/*33.18*/for(i<-houses) yield /*33.32*/ {_display_(Seq[Any](format.raw/*33.34*/("""
                    """),format.raw/*34.21*/("""<tr><a href=""""),_display_(/*34.35*/routes/*34.41*/.HomeController.addHouse()),format.raw/*34.67*/("""">
                    """),_display_(/*35.22*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*35.104*/ {_display_(Seq[Any](format.raw/*35.106*/("""
                    """),format.raw/*36.21*/("""<td href=""""),_display_(/*36.32*/routes/*36.38*/.HomeController.index),format.raw/*36.59*/(""""><a><img src="/assets/images/projectImages/"""),_display_(/*36.104*/(i.getId + "thumb.jpg")),format.raw/*36.127*/(""""/></a></td>
                    """)))}/*37.23*/else/*37.28*/{_display_(Seq[Any](format.raw/*37.29*/("""
                    """),format.raw/*38.21*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                    """)))}),format.raw/*39.22*/("""

                    """),format.raw/*41.21*/("""<td>"""),_display_(/*41.26*/i/*41.27*/.getId),format.raw/*41.33*/("""</td>
                    <td> """),_display_(/*42.27*/i/*42.28*/.getNumBeds),format.raw/*42.39*/("""</td>
                    <td>"""),_display_(/*43.26*/i/*43.27*/.getNumBaths),format.raw/*43.39*/("""</td>
                    <td>&euro; """),_display_(/*44.33*/("%.2f".format(i.getPrice))),format.raw/*44.60*/("""</td>
                    <td>"""),_display_(/*45.26*/i/*45.27*/.getGardenSize),format.raw/*45.41*/("""</td>
                    <td>"""),_display_(/*46.26*/i/*46.27*/.getGarage),format.raw/*46.37*/("""</td>

                    """),_display_(/*48.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*48.113*/ {_display_(Seq[Any](format.raw/*48.115*/("""
                    """),format.raw/*49.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*51.35*/routes/*51.41*/.HomeController.updateHouse(i.getId)),format.raw/*51.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>
                """)))}),format.raw/*55.18*/("""

                """),_display_(/*57.18*/if((user != null) && ("admin".equals(user.getRole())))/*57.72*/ {_display_(Seq[Any](format.raw/*57.74*/("""
                    """),format.raw/*58.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*60.35*/routes/*60.41*/.HomeController.deleteHouse(i.getId)),format.raw/*60.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*64.18*/("""
                """),_display_(/*65.18*/if((user != null) && ("admin".equals(user.getRole())) || "customer".equals(user.getRole()))/*65.109*/ {_display_(Seq[Any](format.raw/*65.111*/("""
                    """),format.raw/*66.21*/("""<td><a href=""""),_display_(/*66.35*/routes/*66.41*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*66.75*/("""" class="btn btn-default btn-xs">
                        <span class="glyphicon glyphicon-shopping-cart"></span></a></td>
              """)))}),format.raw/*68.16*/("""
                """),format.raw/*69.17*/("""</a>
            </tr>
        """)))}),format.raw/*71.10*/("""
        """),format.raw/*72.9*/("""</tbody>
    </table> 




<h1>Idea 2</h1>
    <table class="table table-bordered table-hover table-condensed">
        <tbody>
            <!--Populating the database-->
            <h4>Houses</h4>
                """),_display_(/*83.18*/for(i<-houses) yield /*83.32*/ {_display_(Seq[Any](format.raw/*83.34*/("""
                    """),format.raw/*84.21*/("""<tr href=""""),_display_(/*84.32*/routes/*84.38*/.HomeController.index()),format.raw/*84.61*/("""">
                    """),_display_(/*85.22*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*85.104*/ {_display_(Seq[Any](format.raw/*85.106*/("""
                    """),format.raw/*86.21*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*86.65*/(i.getId + "thumb.jpg")),format.raw/*86.88*/(""""/></td>
                    """)))}/*87.23*/else/*87.28*/{_display_(Seq[Any](format.raw/*87.29*/("""
                    """),format.raw/*88.21*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                    """)))}),format.raw/*89.22*/("""
                    """),format.raw/*90.21*/("""<td><i class= "fas fa-bed"></i> """),_display_(/*90.54*/i/*90.55*/.getNumBeds),format.raw/*90.66*/("""</td>
                    <td><i class= "fas fa-toilet"></i> """),_display_(/*91.57*/i/*91.58*/.getNumBaths),format.raw/*91.70*/("""</td>
                    <td>&euro; """),_display_(/*92.33*/("%.2f".format(i.getPrice))),format.raw/*92.60*/("""</td>
                    <td><i class ="fas fa-leaf"></i>"""),_display_(/*93.54*/i/*93.55*/.getGardenSize),format.raw/*93.69*/("""</td>

                    """),_display_(/*95.22*/if(i.getGarage)/*95.37*/{_display_(Seq[Any](format.raw/*95.38*/("""
                    """),format.raw/*96.21*/("""<td><i class ="fas fa-car"></i></td>
                    """)))}/*97.23*/else/*97.27*/{_display_(Seq[Any](format.raw/*97.28*/("""
                        """),format.raw/*98.25*/("""<td></td>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*100.113*/ {_display_(Seq[Any](format.raw/*100.115*/("""
                    """),format.raw/*101.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*103.35*/routes/*103.41*/.HomeController.updateHouse(i.getId)),format.raw/*103.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"></span>
                        </a>
                    </td>
                """)))}),format.raw/*107.18*/("""

                """),_display_(/*109.18*/if((user != null) && ("admin".equals(user.getRole())))/*109.72*/ {_display_(Seq[Any](format.raw/*109.74*/("""
                    """),format.raw/*110.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*112.35*/routes/*112.41*/.HomeController.deleteHouse(i.getId)),format.raw/*112.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*116.18*/("""
               
            """),format.raw/*118.13*/("""</tr>
        """)))}),format.raw/*119.10*/("""
        """),format.raw/*120.9*/("""</tbody>
        </table>

    <table class="table table-bordered table-hover table-condensed">
        <tbody>
        <h4>Apartments</h4>
            """),_display_(/*126.14*/for(i<-aList) yield /*126.27*/ {_display_(Seq[Any](format.raw/*126.29*/("""
                """),format.raw/*127.17*/("""<tr>
                    """),_display_(/*128.22*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*128.104*/ {_display_(Seq[Any](format.raw/*128.106*/("""
                    """),format.raw/*129.21*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*129.65*/(i.getId + "thumb.jpg")),format.raw/*129.88*/(""""/></td>
                    """)))}/*130.23*/else/*130.28*/{_display_(Seq[Any](format.raw/*130.29*/("""
                    """),format.raw/*131.21*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                    """)))}),format.raw/*132.22*/("""
                    """),format.raw/*133.21*/("""<td><i class= "fas fa-bed"></i> """),_display_(/*133.54*/i/*133.55*/.getNumBeds),format.raw/*133.66*/("""</td>
                    <td><i class= "fas fa-toilet"></i> """),_display_(/*134.57*/i/*134.58*/.getNumBaths),format.raw/*134.70*/("""</td>
                    <td>&euro; """),_display_(/*135.33*/("%.2f".format(i.getPrice))),format.raw/*135.60*/("""</td>
                </tr>
            """)))}),format.raw/*137.14*/("""
        """),format.raw/*138.9*/("""</tbody>
    </table>        
            
    """),_display_(/*141.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*141.97*/ {_display_(Seq[Any](format.raw/*141.99*/("""
    """),format.raw/*142.5*/("""<p>
        <a href=""""),_display_(/*143.19*/routes/*143.25*/.HomeController.addHouse()),format.raw/*143.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*147.6*/("""

""")))}))
      }
    }
  }

  def render(houses:List[models.Houses],aList:List[models.Apartment],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houses,aList,user,env)

  def f:((List[models.Houses],List[models.Apartment],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houses,aList,user,env) => apply(houses,aList,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 19:53:08 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/database.scala.html
                  HASH: 3fb631adc276339cae22a325bc0a7d42e72bcd2d
                  MATRIX: 1026->1|1233->115|1266->123|1296->145|1335->147|1366->152|1453->214|1493->246|1532->248|1567->257|1640->304|1653->309|1688->324|1724->333|1766->345|1799->351|2749->1274|2779->1288|2819->1290|2868->1311|2909->1325|2924->1331|2971->1357|3022->1381|3114->1463|3155->1465|3204->1486|3242->1497|3257->1503|3299->1524|3372->1569|3417->1592|3470->1627|3483->1632|3522->1633|3571->1654|3686->1738|3736->1760|3768->1765|3778->1766|3805->1772|3864->1804|3874->1805|3906->1816|3964->1847|3974->1848|4007->1860|4072->1898|4120->1925|4178->1956|4188->1957|4223->1971|4281->2002|4291->2003|4322->2013|4377->2041|4478->2132|4519->2134|4568->2155|4677->2237|4692->2243|4749->2279|4952->2451|4998->2470|5061->2524|5101->2526|5150->2547|5259->2629|5274->2635|5331->2671|5573->2882|5618->2900|5719->2991|5760->2993|5809->3014|5850->3028|5865->3034|5920->3068|6089->3206|6134->3223|6197->3255|6233->3264|6476->3480|6506->3494|6546->3496|6595->3517|6633->3528|6648->3534|6692->3557|6743->3581|6835->3663|6876->3665|6925->3686|6996->3730|7040->3753|7089->3784|7102->3789|7141->3790|7190->3811|7305->3895|7354->3916|7414->3949|7424->3950|7456->3961|7545->4023|7555->4024|7588->4036|7653->4074|7701->4101|7787->4160|7797->4161|7832->4175|7887->4203|7911->4218|7950->4219|7999->4240|8076->4299|8089->4303|8128->4304|8181->4329|8243->4360|8293->4382|8395->4473|8437->4475|8487->4496|8597->4578|8613->4584|8671->4620|8874->4791|8921->4810|8985->4864|9026->4866|9076->4887|9186->4969|9202->4975|9260->5011|9503->5222|9561->5251|9608->5266|9645->5275|9826->5428|9856->5441|9897->5443|9943->5460|9997->5486|10090->5568|10132->5570|10182->5591|10254->5635|10299->5658|10349->5689|10363->5694|10403->5695|10453->5716|10569->5800|10619->5821|10680->5854|10691->5855|10724->5866|10814->5928|10825->5929|10859->5941|10925->5979|10974->6006|11047->6047|11084->6056|11159->6104|11260->6195|11301->6197|11334->6202|11384->6224|11400->6230|11448->6256|11574->6351
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|82->51|86->55|88->57|88->57|88->57|89->58|91->60|91->60|91->60|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|99->68|100->69|102->71|103->72|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|124->93|124->93|124->93|126->95|126->95|126->95|127->96|128->97|128->97|128->97|129->98|130->99|131->100|131->100|131->100|132->101|134->103|134->103|134->103|138->107|140->109|140->109|140->109|141->110|143->112|143->112|143->112|147->116|149->118|150->119|151->120|157->126|157->126|157->126|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|163->132|164->133|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|168->137|169->138|172->141|172->141|172->141|173->142|174->143|174->143|174->143|178->147
                  -- GENERATED --
              */
          