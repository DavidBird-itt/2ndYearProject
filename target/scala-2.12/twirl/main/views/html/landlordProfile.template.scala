
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
              
                        <img alt="User Pic" src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg" id="profile-image1" class="img-circle img-responsive">
                    
          


        </div>
        <div class="col-md-8 col-xs-4">
          <div class="container">
            <h2>"""),_display_(/*25.18*/landlord/*25.26*/.getFname()),format.raw/*25.37*/(""" """),_display_(/*25.39*/landlord/*25.47*/.getLname()),format.raw/*25.58*/("""</h2>
            <p><b>Landlord</b></p>


          </div>
          <hr>
          <ul class="container details">
            
            <li>
              <p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>"""),_display_(/*34.93*/landlord/*34.101*/.getEmail()),format.raw/*34.112*/("""</p>
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
  """),_display_(/*48.4*/if((user != null) && (("admin".equals(user.getRole())) || ("landlord".equals(user.getRole()))))/*48.99*/ {_display_(Seq[Any](format.raw/*48.101*/("""
      """),format.raw/*49.7*/("""<a href=""""),_display_(/*49.17*/routes/*49.23*/.HomeController.addProperty()),format.raw/*49.52*/("""">
          <span style="font-size:20px">(Add New Property)</span>
      </a>
  """)))}),format.raw/*52.4*/("""
"""),format.raw/*53.1*/("""</h1>
<br>
<div id="database-list">
  <table style="width:100%">
      """),_display_(/*57.8*/for(property<-pList) yield /*57.28*/ {_display_(Seq[Any](format.raw/*57.30*/("""
        """),_display_(/*58.10*/if(property.getLandlord() == landlord)/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""
          """),format.raw/*59.11*/("""<tr>
              <td>
                  <a href=""""),_display_(/*61.29*/routes/*61.35*/.HomeController.viewProperty(property.getId)),format.raw/*61.79*/("""" class="listing">
                  <img src=""""),_display_(/*62.30*/property/*62.38*/.getThumbnailPath),format.raw/*62.55*/("""" /> House for &euro;"""),_display_(/*62.77*/property/*62.85*/.getDisplayValue(property.getPrice)),format.raw/*62.120*/("""
              """),format.raw/*63.15*/("""</td>
                  <td class="desc">
                      <i class="fas fa-bed"></i> """),_display_(/*65.51*/property/*65.59*/.getNumBeds),format.raw/*65.70*/("""&nbsp;
                      <i class="fas fa-toilet"></i> """),_display_(/*66.54*/property/*66.62*/.getNumBaths),format.raw/*66.74*/("""&nbsp;

                      <i class="fas fa-leaf"></i>"""),_display_(/*68.51*/property/*68.59*/.getStock),format.raw/*68.68*/("""&nbsp;
                
                          &nbsp;
                          <a href=""""),_display_(/*71.37*/routes/*71.43*/.HomeController.updateProperty(property.getId)),format.raw/*71.89*/(""""><i class="fas fa-edit"></i></a>
                          &nbsp;
                          <a href=""""),_display_(/*73.37*/routes/*73.43*/.HomeController.deleteProperty(property.getId)),format.raw/*73.89*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                      
                  </td>
              </a>
          </tr>
      """)))}),format.raw/*78.8*/("""
  """),format.raw/*79.3*/("""</table>
""")))}),format.raw/*80.2*/("""
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
                  DATE: Sun Apr 28 21:23:40 IST 2019
                  SOURCE: /home/wdd/temp/PlayReminder/app/views/landlordProfile.scala.html
                  HASH: a3e3d6f186efb06bf2d0444871fd11c3ac6e0d7d
                  MATRIX: 1043->1|1261->127|1290->148|1329->150|1357->152|1536->305|1584->345|1622->346|1663->359|1700->369|1715->375|1781->420|1855->463|1891->472|2386->940|2403->948|2435->959|2464->961|2481->969|2513->980|2778->1218|2796->1226|2829->1237|3072->1454|3176->1549|3217->1551|3251->1558|3288->1568|3303->1574|3353->1603|3465->1685|3493->1686|3591->1758|3627->1778|3667->1780|3704->1790|3751->1828|3790->1829|3829->1840|3908->1892|3923->1898|3988->1942|4063->1990|4080->1998|4118->2015|4167->2037|4184->2045|4241->2080|4284->2095|4403->2187|4420->2195|4452->2206|4539->2266|4556->2274|4589->2286|4674->2344|4691->2352|4721->2361|4841->2454|4856->2460|4923->2506|5053->2609|5068->2615|5135->2661|5320->2816|5350->2819|5390->2829
                  LINES: 28->1|33->2|33->2|33->2|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|56->25|56->25|56->25|56->25|56->25|56->25|65->34|65->34|65->34|79->48|79->48|79->48|80->49|80->49|80->49|80->49|83->52|84->53|88->57|88->57|88->57|89->58|89->58|89->58|90->59|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|94->63|96->65|96->65|96->65|97->66|97->66|97->66|99->68|99->68|99->68|102->71|102->71|102->71|104->73|104->73|104->73|109->78|110->79|111->80
                  -- GENERATED --
              */
          