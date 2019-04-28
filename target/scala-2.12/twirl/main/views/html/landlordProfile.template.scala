
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

object landlordProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.users.Landlord,List[models.products.Property],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landlord: models.users.Landlord, pList: List[models.products.Property], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Profile", user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<div id ="profile">
<div class="container-fluid">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
          """),_display_(/*9.12*/if((user != null) && (landlord == user))/*9.52*/{_display_(Seq[Any](format.raw/*9.53*/("""
            """),format.raw/*10.13*/("""<a href=""""),_display_(/*10.23*/routes/*10.29*/.HomeController.updateLandlord(user.getEmail)),format.raw/*10.74*/(""""><i class="fas fa-edit"></i></a>
        """)))}),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""<h4>User Profile</h4>
      </div>
      <div class="panel-body">
        <div class="col-md-4 col-xs-12 col-sm-6 col-lg-4">
                """),_display_(/*16.18*/if(env.resource("public/images/projectImages/" + landlord.getEmail + "thumb.jpg").isDefined)/*16.110*/ {_display_(Seq[Any](format.raw/*16.112*/("""
                    """),format.raw/*17.21*/("""<img src="/assets/images/projectImages/"""),_display_(/*17.61*/(landlord.getEmail + "thumb.jpg")),format.raw/*17.94*/(""""/  id="profile-image1" class="img-circle img-responsive">
                    """)))}/*18.23*/else/*18.28*/{_display_(Seq[Any](format.raw/*18.29*/("""
                        """),format.raw/*19.25*/("""<img alt="User Pic" src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg" id="profile-image1" class="img-circle img-responsive">
                    """)))}),format.raw/*20.22*/("""
          


        """),format.raw/*24.9*/("""</div>
        <div class="col-md-8 col-xs-4">
          <div class="container">
            <h2>"""),_display_(/*27.18*/landlord/*27.26*/.getFname()),format.raw/*27.37*/(""" """),_display_(/*27.39*/landlord/*27.47*/.getLname()),format.raw/*27.58*/("""</h2>
            <p><b>Landlord</b></p>


          </div>
          <hr>
          <ul class="container details">
            
            <li>
              <p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>"""),_display_(/*36.93*/landlord/*36.101*/.getEmail()),format.raw/*36.112*/("""</p>
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
  """),_display_(/*50.4*/if((user != null) && (("admin".equals(user.getRole())) || ("landlord".equals(user.getRole()))))/*50.99*/ {_display_(Seq[Any](format.raw/*50.101*/("""
      """),format.raw/*51.7*/("""<a href=""""),_display_(/*51.17*/routes/*51.23*/.HomeController.addProperty()),format.raw/*51.52*/("""">
          <span style="font-size:20px">(Add New Property)</span>
      </a>
  """)))}),format.raw/*54.4*/("""
"""),format.raw/*55.1*/("""</h1>
<br>
<div id="database-list">
  <table style="width:100%">
      """),_display_(/*59.8*/for(property<-pList) yield /*59.28*/ {_display_(Seq[Any](format.raw/*59.30*/("""
        """),_display_(/*60.10*/if(property.getLandlord() == landlord)/*60.48*/{_display_(Seq[Any](format.raw/*60.49*/("""
          """),format.raw/*61.11*/("""<tr>
              <td>
                  <a href=""""),_display_(/*63.29*/routes/*63.35*/.HomeController.viewProperty(property.getId)),format.raw/*63.79*/("""" class="listing">
                  <img src=""""),_display_(/*64.30*/property/*64.38*/.getThumbnailPath),format.raw/*64.55*/("""" /> House for &euro;"""),_display_(/*64.77*/property/*64.85*/.getDisplayValue(property.getPrice)),format.raw/*64.120*/("""
              """),format.raw/*65.15*/("""</td>
                  <td class="desc">
                      <i class="fas fa-bed"></i> """),_display_(/*67.51*/property/*67.59*/.getNumBeds),format.raw/*67.70*/("""&nbsp;
                      <i class="fas fa-toilet"></i> """),_display_(/*68.54*/property/*68.62*/.getNumBaths),format.raw/*68.74*/("""&nbsp;

                      <i class="fas fa-leaf"></i>"""),_display_(/*70.51*/property/*70.59*/.getStock),format.raw/*70.68*/("""&nbsp;
                      """),_display_(/*71.24*/if((user != null) && (landlord == user))/*71.64*/ {_display_(Seq[Any](format.raw/*71.66*/("""
                          """),format.raw/*72.27*/("""&nbsp;
                          """),_display_(/*73.28*/if(property.getStock == 0)/*73.54*/ {_display_(Seq[Any](format.raw/*73.56*/("""
                              """),format.raw/*74.31*/("""<td><a href=""""),_display_(/*74.45*/routes/*74.51*/.ShoppingCtrl.addToBasket(property.getId)),format.raw/*74.92*/(""""
                                  class="btn btn-default btn-xs"><span
                                  class="glyphicon glyphicon-shopping-cart"></span></a>
                              </td>
                          """)))}/*78.29*/else/*78.34*/{_display_(Seq[Any](format.raw/*78.35*/("""
                              """),format.raw/*79.31*/("""<td><img src="/assets/images/sold.jpg"/></td>
                          """)))}),format.raw/*80.28*/("""

                          """),format.raw/*82.27*/("""&nbsp;
                          <a href=""""),_display_(/*83.37*/routes/*83.43*/.HomeController.updateProperty(property.getId)),format.raw/*83.89*/(""""><i class="fas fa-edit"></i></a>
                          &nbsp;
                          <a href=""""),_display_(/*85.37*/routes/*85.43*/.HomeController.deleteProperty(property.getId)),format.raw/*85.89*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                      """)))}),format.raw/*86.24*/("""
                  """),format.raw/*87.19*/("""</td>
              </a>
          </tr>
      """)))}),format.raw/*90.8*/("""
  """),format.raw/*91.3*/("""</table>
""")))}),format.raw/*92.2*/("""
""")))}))
      }
    }
  }

  def render(landlord:models.users.Landlord,pList:List[models.products.Property],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(landlord,pList,user,env)

  def f:((models.users.Landlord,List[models.products.Property],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (landlord,pList,user,env) => apply(landlord,pList,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 16:39:01 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/landlordProfile.scala.html
                  HASH: be460f3ca023be49e48001535c2b1b167cc787b7
                  MATRIX: 1043->1|1261->127|1290->148|1329->150|1357->152|1536->305|1584->345|1622->346|1663->359|1700->369|1715->375|1781->420|1855->463|1891->472|2060->614|2162->706|2203->708|2252->729|2319->769|2373->802|2472->883|2485->888|2524->889|2577->914|2793->1099|2842->1121|2967->1219|2984->1227|3016->1238|3045->1240|3062->1248|3094->1259|3359->1497|3377->1505|3410->1516|3653->1733|3757->1828|3798->1830|3832->1837|3869->1847|3884->1853|3934->1882|4046->1964|4074->1965|4172->2037|4208->2057|4248->2059|4285->2069|4332->2107|4371->2108|4410->2119|4489->2171|4504->2177|4569->2221|4644->2269|4661->2277|4699->2294|4748->2316|4765->2324|4822->2359|4865->2374|4984->2466|5001->2474|5033->2485|5120->2545|5137->2553|5170->2565|5255->2623|5272->2631|5302->2640|5359->2670|5408->2710|5448->2712|5503->2739|5564->2773|5599->2799|5639->2801|5698->2832|5739->2846|5754->2852|5816->2893|6059->3118|6072->3123|6111->3124|6170->3155|6274->3228|6330->3256|6400->3299|6415->3305|6482->3351|6612->3454|6627->3460|6694->3506|6814->3595|6861->3614|6939->3662|6969->3665|7009->3675
                  LINES: 28->1|33->2|33->2|33->2|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20|55->24|58->27|58->27|58->27|58->27|58->27|58->27|67->36|67->36|67->36|81->50|81->50|81->50|82->51|82->51|82->51|82->51|85->54|86->55|90->59|90->59|90->59|91->60|91->60|91->60|92->61|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|96->65|98->67|98->67|98->67|99->68|99->68|99->68|101->70|101->70|101->70|102->71|102->71|102->71|103->72|104->73|104->73|104->73|105->74|105->74|105->74|105->74|109->78|109->78|109->78|110->79|111->80|113->82|114->83|114->83|114->83|116->85|116->85|116->85|117->86|118->87|121->90|122->91|123->92
                  -- GENERATED --
              */
          