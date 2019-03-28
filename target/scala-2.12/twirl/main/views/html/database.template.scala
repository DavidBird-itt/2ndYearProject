
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
                """),format.raw/*65.17*/("""</a>
            </tr>
        """)))}),format.raw/*67.10*/("""
        """),format.raw/*68.9*/("""</tbody>
    </table> 




<h1>Idea 2</h1>
    <table class="table table-bordered table-hover table-condensed">
        <tbody>
            <!--Populating the database-->
            <h4>Houses</h4>
                """),_display_(/*79.18*/for(i<-houses) yield /*79.32*/ {_display_(Seq[Any](format.raw/*79.34*/("""
                    """),format.raw/*80.21*/("""<tr href=""""),_display_(/*80.32*/routes/*80.38*/.HomeController.index()),format.raw/*80.61*/("""">
                    """),_display_(/*81.22*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*81.104*/ {_display_(Seq[Any](format.raw/*81.106*/("""
                    """),format.raw/*82.21*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*82.65*/(i.getId + "thumb.jpg")),format.raw/*82.88*/(""""/></td>
                    """)))}/*83.23*/else/*83.28*/{_display_(Seq[Any](format.raw/*83.29*/("""
                    """),format.raw/*84.21*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                    """)))}),format.raw/*85.22*/("""
                    """),format.raw/*86.21*/("""<td><i class= "fas fa-bed"></i> """),_display_(/*86.54*/i/*86.55*/.getNumBeds),format.raw/*86.66*/("""</td>
                    <td><i class= "fas fa-toilet"></i> """),_display_(/*87.57*/i/*87.58*/.getNumBaths),format.raw/*87.70*/("""</td>
                    <td>&euro; """),_display_(/*88.33*/("%.2f".format(i.getPrice))),format.raw/*88.60*/("""</td>
                    <td><i class ="fas fa-leaf"></i>"""),_display_(/*89.54*/i/*89.55*/.getGardenSize),format.raw/*89.69*/("""</td>

                    """),_display_(/*91.22*/if(i.getGarage)/*91.37*/{_display_(Seq[Any](format.raw/*91.38*/("""
                    """),format.raw/*92.21*/("""<td><i class ="fas fa-car"></i></td>
                    """)))}/*93.23*/else/*93.27*/{_display_(Seq[Any](format.raw/*93.28*/("""
                        """),format.raw/*94.25*/("""<td></td>
                    """)))}),format.raw/*95.22*/("""
                    """),_display_(/*96.22*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*96.113*/ {_display_(Seq[Any](format.raw/*96.115*/("""
                    """),format.raw/*97.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*99.35*/routes/*99.41*/.HomeController.updateHouse(i.getId)),format.raw/*99.77*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"></span>
                        </a>
                    </td>
                """)))}),format.raw/*103.18*/("""

                """),_display_(/*105.18*/if((user != null) && ("admin".equals(user.getRole())))/*105.72*/ {_display_(Seq[Any](format.raw/*105.74*/("""
                    """),format.raw/*106.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.HomeController.deleteHouse(i.getId)),format.raw/*108.77*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*112.18*/("""
               
            """),format.raw/*114.13*/("""</tr>
        """)))}),format.raw/*115.10*/("""
        """),format.raw/*116.9*/("""</tbody>
        </table>

    <table class="table table-bordered table-hover table-condensed">
        <tbody>
        <h4>Apartments</h4>
            """),_display_(/*122.14*/for(i<-aList) yield /*122.27*/ {_display_(Seq[Any](format.raw/*122.29*/("""
                """),format.raw/*123.17*/("""<tr>
                    """),_display_(/*124.22*/if(env.resource("public/images/projectImages/" + i.getId + "thumb.jpg").isDefined)/*124.104*/ {_display_(Seq[Any](format.raw/*124.106*/("""
                    """),format.raw/*125.21*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*125.65*/(i.getId + "thumb.jpg")),format.raw/*125.88*/(""""/></td>
                    """)))}/*126.23*/else/*126.28*/{_display_(Seq[Any](format.raw/*126.29*/("""
                    """),format.raw/*127.21*/("""<td><img src="/assets/images/projectImages/noImage.jpg"/></td>
                    """)))}),format.raw/*128.22*/("""
                    """),format.raw/*129.21*/("""<td><i class= "fas fa-bed"></i> """),_display_(/*129.54*/i/*129.55*/.getNumBeds),format.raw/*129.66*/("""</td>
                    <td><i class= "fas fa-toilet"></i> """),_display_(/*130.57*/i/*130.58*/.getNumBaths),format.raw/*130.70*/("""</td>
                    <td>&euro; """),_display_(/*131.33*/("%.2f".format(i.getPrice))),format.raw/*131.60*/("""</td>
                </tr>
            """)))}),format.raw/*133.14*/("""
        """),format.raw/*134.9*/("""</tbody>
    </table>        
            
    """),_display_(/*137.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*137.97*/ {_display_(Seq[Any](format.raw/*137.99*/("""
    """),format.raw/*138.5*/("""<p>
        <a href=""""),_display_(/*139.19*/routes/*139.25*/.HomeController.addHouse()),format.raw/*139.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*143.6*/("""

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
                  DATE: Thu Mar 28 16:32:53 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: f859a5448dcd7412664e73ab91ac22f5cc4f3d79
                  MATRIX: 1026->1|1233->115|1266->123|1296->145|1335->147|1366->152|1453->214|1493->246|1532->248|1567->257|1640->304|1653->309|1688->324|1724->333|1766->345|1799->351|2749->1274|2779->1288|2819->1290|2868->1311|2909->1325|2924->1331|2971->1357|3022->1381|3114->1463|3155->1465|3204->1486|3242->1497|3257->1503|3299->1524|3372->1569|3417->1592|3470->1627|3483->1632|3522->1633|3571->1654|3686->1738|3736->1760|3768->1765|3778->1766|3805->1772|3864->1804|3874->1805|3906->1816|3964->1847|3974->1848|4007->1860|4072->1898|4120->1925|4178->1956|4188->1957|4223->1971|4281->2002|4291->2003|4322->2013|4377->2041|4478->2132|4519->2134|4568->2155|4677->2237|4692->2243|4749->2279|4952->2451|4998->2470|5061->2524|5101->2526|5150->2547|5259->2629|5274->2635|5331->2671|5573->2882|5618->2899|5681->2931|5717->2940|5960->3156|5990->3170|6030->3172|6079->3193|6117->3204|6132->3210|6176->3233|6227->3257|6319->3339|6360->3341|6409->3362|6480->3406|6524->3429|6573->3460|6586->3465|6625->3466|6674->3487|6789->3571|6838->3592|6898->3625|6908->3626|6940->3637|7029->3699|7039->3700|7072->3712|7137->3750|7185->3777|7271->3836|7281->3837|7316->3851|7371->3879|7395->3894|7434->3895|7483->3916|7560->3975|7573->3979|7612->3980|7665->4005|7727->4036|7776->4058|7877->4149|7918->4151|7967->4172|8076->4254|8091->4260|8148->4296|8351->4467|8398->4486|8462->4540|8503->4542|8553->4563|8663->4645|8679->4651|8737->4687|8980->4898|9038->4927|9085->4942|9122->4951|9303->5104|9333->5117|9374->5119|9420->5136|9474->5162|9567->5244|9609->5246|9659->5267|9731->5311|9776->5334|9826->5365|9840->5370|9880->5371|9930->5392|10046->5476|10096->5497|10157->5530|10168->5531|10201->5542|10291->5604|10302->5605|10336->5617|10402->5655|10451->5682|10524->5723|10561->5732|10636->5780|10737->5871|10778->5873|10811->5878|10861->5900|10877->5906|10925->5932|11051->6027
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|82->51|86->55|88->57|88->57|88->57|89->58|91->60|91->60|91->60|95->64|96->65|98->67|99->68|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|115->84|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|120->89|120->89|120->89|122->91|122->91|122->91|123->92|124->93|124->93|124->93|125->94|126->95|127->96|127->96|127->96|128->97|130->99|130->99|130->99|134->103|136->105|136->105|136->105|137->106|139->108|139->108|139->108|143->112|145->114|146->115|147->116|153->122|153->122|153->122|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|159->128|160->129|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|164->133|165->134|168->137|168->137|168->137|169->138|170->139|170->139|170->139|174->143
                  -- GENERATED --
              */
          