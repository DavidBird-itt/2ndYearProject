
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

object database_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Houses],List[models.Apartment],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

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
                """),_display_(/*65.18*/if((user != null) && ("customer".equals(user.getRole())))/*65.75*/ {_display_(Seq[Any](format.raw/*65.77*/("""
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
                  DATE: Mon Apr 01 03:57:08 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/database_old.scala.html
                  HASH: 14271468afba708e168714da8c711abe5629428d
                  MATRIX: 1030->1|1237->115|1270->123|1300->145|1339->147|1370->152|1457->214|1497->246|1536->248|1571->257|1644->304|1657->309|1692->324|1728->333|1770->345|1803->351|2753->1274|2783->1288|2823->1290|2872->1311|2913->1325|2928->1331|2975->1357|3026->1381|3118->1463|3159->1465|3208->1486|3246->1497|3261->1503|3303->1524|3376->1569|3421->1592|3474->1627|3487->1632|3526->1633|3575->1654|3690->1738|3740->1760|3772->1765|3782->1766|3809->1772|3868->1804|3878->1805|3910->1816|3968->1847|3978->1848|4011->1860|4076->1898|4124->1925|4182->1956|4192->1957|4227->1971|4285->2002|4295->2003|4326->2013|4381->2041|4482->2132|4523->2134|4572->2155|4681->2237|4696->2243|4753->2279|4956->2451|5002->2470|5065->2524|5105->2526|5154->2547|5263->2629|5278->2635|5335->2671|5577->2882|5622->2900|5688->2957|5728->2959|5777->2980|5818->2994|5833->3000|5888->3034|6057->3172|6102->3189|6165->3221|6201->3230|6444->3446|6474->3460|6514->3462|6563->3483|6601->3494|6616->3500|6660->3523|6711->3547|6803->3629|6844->3631|6893->3652|6964->3696|7008->3719|7057->3750|7070->3755|7109->3756|7158->3777|7273->3861|7322->3882|7382->3915|7392->3916|7424->3927|7513->3989|7523->3990|7556->4002|7621->4040|7669->4067|7755->4126|7765->4127|7800->4141|7855->4169|7879->4184|7918->4185|7967->4206|8044->4265|8057->4269|8096->4270|8149->4295|8211->4326|8261->4348|8363->4439|8405->4441|8455->4462|8565->4544|8581->4550|8639->4586|8842->4757|8889->4776|8953->4830|8994->4832|9044->4853|9154->4935|9170->4941|9228->4977|9471->5188|9529->5217|9576->5232|9613->5241|9794->5394|9824->5407|9865->5409|9911->5426|9965->5452|10058->5534|10100->5536|10150->5557|10222->5601|10267->5624|10317->5655|10331->5660|10371->5661|10421->5682|10537->5766|10587->5787|10648->5820|10659->5821|10692->5832|10782->5894|10793->5895|10827->5907|10893->5945|10942->5972|11015->6013|11052->6022|11127->6070|11228->6161|11269->6163|11302->6168|11352->6190|11368->6196|11416->6222|11542->6317
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|82->51|86->55|88->57|88->57|88->57|89->58|91->60|91->60|91->60|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|99->68|100->69|102->71|103->72|114->83|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|124->93|124->93|124->93|126->95|126->95|126->95|127->96|128->97|128->97|128->97|129->98|130->99|131->100|131->100|131->100|132->101|134->103|134->103|134->103|138->107|140->109|140->109|140->109|141->110|143->112|143->112|143->112|147->116|149->118|150->119|151->120|157->126|157->126|157->126|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|163->132|164->133|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|168->137|169->138|172->141|172->141|172->141|173->142|174->143|174->143|174->143|178->147
                  -- GENERATED --
              */
          