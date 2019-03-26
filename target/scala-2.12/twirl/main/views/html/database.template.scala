
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
            
                """),_display_(/*79.18*/for(i<-houses) yield /*79.32*/ {_display_(Seq[Any](format.raw/*79.34*/("""
                    """),format.raw/*80.21*/("""<tr href=""""),_display_(/*80.32*/routes/*80.38*/.HomeController.index()),format.raw/*80.61*/(""""><a>
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
                            <span class="glyphicon-pencil"><</span>
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
               
            """),format.raw/*114.13*/("""</a></tr>
        """)))}),format.raw/*115.10*/("""
        """),format.raw/*116.9*/("""</tbody>
    </table>        

    """),_display_(/*119.6*/if((user != null) && ("admin".equals(user.getRole()) || "landlord".equals(user.getRole())))/*119.97*/ {_display_(Seq[Any](format.raw/*119.99*/("""
    """),format.raw/*120.5*/("""<p>
        <a href=""""),_display_(/*121.19*/routes/*121.25*/.HomeController.addHouse()),format.raw/*121.51*/("""">
            <button class="btn btn-primary">Add a House</button>
        </a>
    </p>
    """)))}),format.raw/*125.6*/("""
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
                  DATE: Tue Mar 26 20:55:24 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/database.scala.html
                  HASH: 2df848fd55fdb42a908b08bfbc6b104fe9723764
                  MATRIX: 1003->1|1178->83|1211->91|1241->113|1280->115|1311->120|1398->182|1438->214|1477->216|1512->225|1585->272|1598->277|1633->292|1669->301|1711->313|1744->319|2694->1242|2724->1256|2764->1258|2813->1279|2854->1293|2869->1299|2916->1325|2967->1349|3059->1431|3100->1433|3149->1454|3187->1465|3202->1471|3244->1492|3317->1537|3362->1560|3415->1595|3428->1600|3467->1601|3516->1622|3631->1706|3681->1728|3713->1733|3723->1734|3750->1740|3809->1772|3819->1773|3851->1784|3909->1815|3919->1816|3952->1828|4017->1866|4065->1893|4123->1924|4133->1925|4168->1939|4226->1970|4236->1971|4267->1981|4322->2009|4423->2100|4464->2102|4513->2123|4622->2205|4637->2211|4694->2247|4897->2419|4943->2438|5006->2492|5046->2494|5095->2515|5204->2597|5219->2603|5276->2639|5518->2850|5563->2867|5626->2899|5662->2908|5890->3109|5920->3123|5960->3125|6009->3146|6047->3157|6062->3163|6106->3186|6160->3213|6252->3295|6293->3297|6342->3318|6413->3362|6457->3385|6506->3416|6519->3421|6558->3422|6607->3443|6722->3527|6771->3548|6831->3581|6841->3582|6873->3593|6962->3655|6972->3656|7005->3668|7070->3706|7118->3733|7204->3792|7214->3793|7249->3807|7304->3835|7328->3850|7367->3851|7416->3872|7493->3931|7506->3935|7545->3936|7598->3961|7660->3992|7709->4014|7810->4105|7851->4107|7900->4128|8009->4210|8024->4216|8081->4252|8285->4424|8332->4443|8396->4497|8437->4499|8487->4520|8597->4602|8613->4608|8671->4644|8914->4855|8972->4884|9023->4903|9060->4912|9123->4948|9224->5039|9265->5041|9298->5046|9348->5068|9364->5074|9412->5100|9538->5195
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|82->51|86->55|88->57|88->57|88->57|89->58|91->60|91->60|91->60|95->64|96->65|98->67|99->68|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|115->84|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|120->89|120->89|120->89|122->91|122->91|122->91|123->92|124->93|124->93|124->93|125->94|126->95|127->96|127->96|127->96|128->97|130->99|130->99|130->99|134->103|136->105|136->105|136->105|137->106|139->108|139->108|139->108|143->112|145->114|146->115|147->116|150->119|150->119|150->119|151->120|152->121|152->121|152->121|156->125
                  -- GENERATED --
              */
          