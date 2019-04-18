
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

object landlordProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.Landlord,List[models.products.Houses],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landlord: models.users.Landlord, hList: List[models.products.Houses], user: models.users.User ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Profile", user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div id ="profile">
<div class="container-fluid">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4>User Profile</h4>
      </div>
      <div class="panel-body">
        <div class="col-md-4 col-xs-12 col-sm-6 col-lg-4">
          <img alt="User Pic" src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg"
            id="profile-image1" class="img-circle img-responsive">


        </div>
        <div class="col-md-8 col-xs-4">
          <div class="container">
            <h2>"""),_display_(/*20.18*/landlord/*20.26*/.getFname()),format.raw/*20.37*/(""" """),_display_(/*20.39*/landlord/*20.47*/.getLname()),format.raw/*20.58*/("""</h2>
            <p>an <b> Employee</b></p>


          </div>
          <hr>
          <ul class="container details">
            
            <li>
              <p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>"""),_display_(/*29.93*/landlord/*29.101*/.getEmail()),format.raw/*29.112*/("""</p>
            </li>
          </ul>
          <hr>
          <div class="col-sm-5 col-xs-6 tital ">Date Of Joining: 15 Jun 2016</div>
        </div>
      </div>
    </div>
  </div>
</div>
</div>

<h1>
  Houses
  """),_display_(/*43.4*/if((user != null) && (("admin".equals(user.getRole())) || ("landlord".equals(user.getRole()))))/*43.99*/ {_display_(Seq[Any](format.raw/*43.101*/("""
      """),format.raw/*44.7*/("""<a href=""""),_display_(/*44.17*/routes/*44.23*/.HomeController.addHouse()),format.raw/*44.49*/("""">
          <span style="font-size:20px">(Add New House)</span>
      </a>
  """)))}),format.raw/*47.4*/("""
"""),format.raw/*48.1*/("""</h1>
<br>
<div id="database-list">
  <table style="width:100%">
      """),_display_(/*52.8*/for(house<-hList) yield /*52.25*/ {_display_(Seq[Any](format.raw/*52.27*/("""
        """),_display_(/*53.10*/if(house.getLandlord() == landlord)/*53.45*/{_display_(Seq[Any](format.raw/*53.46*/("""
          """),format.raw/*54.11*/("""<tr>
              <td>
                  <a href=""""),_display_(/*56.29*/routes/*56.35*/.HomeController.viewHouse(house.getId)),format.raw/*56.73*/("""" class="listing">
                  <img src=""""),_display_(/*57.30*/house/*57.35*/.getThumbnailPath),format.raw/*57.52*/("""" /> House for &euro;"""),_display_(/*57.74*/house/*57.79*/.getDisplayValue(house.getPrice)),format.raw/*57.111*/("""
              """),format.raw/*58.15*/("""</td>
                  <td class="desc">
                      <i class="fas fa-bed"></i> """),_display_(/*60.51*/house/*60.56*/.getNumBeds),format.raw/*60.67*/("""&nbsp;
                      <i class="fas fa-toilet"></i> """),_display_(/*61.54*/house/*61.59*/.getNumBaths),format.raw/*61.71*/("""&nbsp;
                      <i class="fas fa-leaf"></i> """),_display_(/*62.52*/house/*62.57*/.getGardenSize),format.raw/*62.71*/(""" """),format.raw/*62.72*/("""m²&nbsp;
                      <i class="fas fa-car"></i>&nbsp;
                      """),_display_(/*64.24*/if(house.getGarage)/*64.43*/ {_display_(Seq[Any](format.raw/*64.45*/("""
                          """),format.raw/*65.27*/("""Yes
                      """)))}/*66.25*/else/*66.30*/{_display_(Seq[Any](format.raw/*66.31*/("""
                          """),format.raw/*67.27*/("""No
                      """)))}),format.raw/*68.24*/("""
                      """),format.raw/*69.23*/("""<i class="fas fa-leaf"></i>"""),_display_(/*69.51*/house/*69.56*/.getStock),format.raw/*69.65*/("""&nbsp;
                      """),_display_(/*70.24*/if((user != null) && ("admin".equals(user.getRole())))/*70.78*/ {_display_(Seq[Any](format.raw/*70.80*/("""
                          """),format.raw/*71.27*/("""&nbsp;
                          """),_display_(/*72.28*/if(house.getStock == 0)/*72.51*/ {_display_(Seq[Any](format.raw/*72.53*/("""
                              """),format.raw/*73.31*/("""<td><a href=""""),_display_(/*73.45*/routes/*73.51*/.ShoppingCtrl.addToBasket(house.getId)),format.raw/*73.89*/(""""
                                  class="btn btn-default btn-xs"><span
                                  class="glyphicon glyphicon-shopping-cart"></span></a>
                              </td>
                          """)))}/*77.29*/else/*77.34*/{_display_(Seq[Any](format.raw/*77.35*/("""
                              """),format.raw/*78.31*/("""<td><img src="/assets/images/sold.jpg"/></td>
                          """)))}),format.raw/*79.28*/("""

                          """),format.raw/*81.27*/("""&nbsp;
                          <a href=""""),_display_(/*82.37*/routes/*82.43*/.HomeController.updateHouse(house.getId)),format.raw/*82.83*/(""""><i class="fas fa-edit"></i></a>
                          &nbsp;
                          <a href=""""),_display_(/*84.37*/routes/*84.43*/.HomeController.deleteHouse(house.getId)),format.raw/*84.83*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                      """)))}),format.raw/*85.24*/("""
                  """),format.raw/*86.19*/("""</td>
              </a>
          </tr>
      """)))}),format.raw/*89.8*/("""
  """),format.raw/*90.3*/("""</table>
""")))}),format.raw/*91.2*/("""
""")))}))
      }
    }
  }

  def render(landlord:models.users.Landlord,hList:List[models.products.Houses],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(landlord,hList,user)

  def f:((models.users.Landlord,List[models.products.Houses],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (landlord,hList,user) => apply(landlord,hList,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 17 18:42:43 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/landlordProfile.scala.html
                  HASH: 7c3ae7a67f45084908b291c1752f0ed183f9e242
                  MATRIX: 1020->1|1210->99|1239->120|1278->122|1306->124|1902->693|1919->701|1951->712|1980->714|1997->722|2029->733|2298->975|2316->983|2349->994|2592->1211|2696->1306|2737->1308|2771->1315|2808->1325|2823->1331|2870->1357|2979->1436|3007->1437|3105->1509|3138->1526|3178->1528|3215->1538|3259->1573|3298->1574|3337->1585|3416->1637|3431->1643|3490->1681|3565->1729|3579->1734|3617->1751|3666->1773|3680->1778|3734->1810|3777->1825|3896->1917|3910->1922|3942->1933|4029->1993|4043->1998|4076->2010|4161->2068|4175->2073|4210->2087|4239->2088|4353->2175|4381->2194|4421->2196|4476->2223|4522->2251|4535->2256|4574->2257|4629->2284|4686->2310|4737->2333|4792->2361|4806->2366|4836->2375|4893->2405|4956->2459|4996->2461|5051->2488|5112->2522|5144->2545|5184->2547|5243->2578|5284->2592|5299->2598|5358->2636|5601->2861|5614->2866|5653->2867|5712->2898|5816->2971|5872->2999|5942->3042|5957->3048|6018->3088|6148->3191|6163->3197|6224->3237|6344->3326|6391->3345|6469->3393|6499->3396|6539->3406
                  LINES: 28->1|33->2|33->2|33->2|35->4|51->20|51->20|51->20|51->20|51->20|51->20|60->29|60->29|60->29|74->43|74->43|74->43|75->44|75->44|75->44|75->44|78->47|79->48|83->52|83->52|83->52|84->53|84->53|84->53|85->54|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|89->58|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|93->62|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|104->73|104->73|104->73|104->73|108->77|108->77|108->77|109->78|110->79|112->81|113->82|113->82|113->82|115->84|115->84|115->84|116->85|117->86|120->89|121->90|122->91
                  -- GENERATED --
              */
          