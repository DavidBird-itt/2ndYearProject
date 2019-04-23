
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
            """),_display_(/*9.14*/if((user != null) && (landlord == user))/*9.54*/{_display_(Seq[Any](format.raw/*9.55*/("""
            """),format.raw/*10.13*/("""<a href=""""),_display_(/*10.23*/routes/*10.29*/.HomeController.updateLandlord(user.getEmail)),format.raw/*10.74*/(""""><i class="fas fa-edit"></i></a>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""<h4>User Profile</h4>
      </div>
      <div class="panel-body">
        <div class="col-md-4 col-xs-12 col-sm-6 col-lg-4">
                """),_display_(/*16.18*/if(env.resource("public/images/projectImages/" + landlord.getEmail + "thumb.jpg").isDefined)/*16.110*/ {_display_(Seq[Any](format.raw/*16.112*/("""
                    """),format.raw/*17.21*/("""<img src="/assets/images/projectImages/"""),_display_(/*17.61*/(landlord.getEmail + "thumb.jpg")),format.raw/*17.94*/(""""/  id="profile-image1" class="img-circle img-responsive">
                    """)))}/*18.23*/else/*18.28*/{_display_(Seq[Any](format.raw/*18.29*/("""
                        """),format.raw/*19.25*/("""<img src="avatar.png" alt="Avatar" class="avatar"
                        id="profile-image1" class="img-circle img-responsive">
                    """)))}),format.raw/*21.22*/("""
          


        """),format.raw/*25.9*/("""</div>
        <div class="col-md-8 col-xs-4">
          <div class="container">
            <h2>"""),_display_(/*28.18*/landlord/*28.26*/.getFname()),format.raw/*28.37*/(""" """),_display_(/*28.39*/landlord/*28.47*/.getLname()),format.raw/*28.58*/("""</h2>
            <p><b>Landlord</b></p>


          </div>
          <hr>
          <ul class="container details">
            
            <li>
              <p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>"""),_display_(/*37.93*/landlord/*37.101*/.getEmail()),format.raw/*37.112*/("""</p>
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
  """),_display_(/*51.4*/if((user != null) && (("admin".equals(user.getRole())) || ("landlord".equals(user.getRole()))))/*51.99*/ {_display_(Seq[Any](format.raw/*51.101*/("""
      """),format.raw/*52.7*/("""<a href=""""),_display_(/*52.17*/routes/*52.23*/.HomeController.addProperty()),format.raw/*52.52*/("""">
          <span style="font-size:20px">(Add New Property)</span>
      </a>
  """)))}),format.raw/*55.4*/("""
"""),format.raw/*56.1*/("""</h1>
<br>
<div id="database-list">
  <table style="width:100%">
      """),_display_(/*60.8*/for(property<-pList) yield /*60.28*/ {_display_(Seq[Any](format.raw/*60.30*/("""
        """),_display_(/*61.10*/if(property.getLandlord() == landlord)/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""
          """),format.raw/*62.11*/("""<tr>
              <td>
                  <a href=""""),_display_(/*64.29*/routes/*64.35*/.HomeController.viewProperty(property.getId)),format.raw/*64.79*/("""" class="listing">
                  <img src=""""),_display_(/*65.30*/property/*65.38*/.getThumbnailPath),format.raw/*65.55*/("""" /> House for &euro;"""),_display_(/*65.77*/property/*65.85*/.getDisplayValue(property.getPrice)),format.raw/*65.120*/("""
              """),format.raw/*66.15*/("""</td>
                  <td class="desc">
                      <i class="fas fa-bed"></i> """),_display_(/*68.51*/property/*68.59*/.getNumBeds),format.raw/*68.70*/("""&nbsp;
                      <i class="fas fa-toilet"></i> """),_display_(/*69.54*/property/*69.62*/.getNumBaths),format.raw/*69.74*/("""&nbsp;

                      <i class="fas fa-leaf"></i>"""),_display_(/*71.51*/property/*71.59*/.getStock),format.raw/*71.68*/("""&nbsp;
                      """),_display_(/*72.24*/if((user != null) && (landlord == user))/*72.64*/ {_display_(Seq[Any](format.raw/*72.66*/("""
                          """),format.raw/*73.27*/("""&nbsp;
                          """),_display_(/*74.28*/if(property.getStock == 0)/*74.54*/ {_display_(Seq[Any](format.raw/*74.56*/("""
                              """),format.raw/*75.31*/("""<td><a href=""""),_display_(/*75.45*/routes/*75.51*/.ShoppingCtrl.addToBasket(property.getId)),format.raw/*75.92*/(""""
                                  class="btn btn-default btn-xs"><span
                                  class="glyphicon glyphicon-shopping-cart"></span></a>
                              </td>
                          """)))}/*79.29*/else/*79.34*/{_display_(Seq[Any](format.raw/*79.35*/("""
                              """),format.raw/*80.31*/("""<td><img src="/assets/images/sold.jpg"/></td>
                          """)))}),format.raw/*81.28*/("""

                          """),format.raw/*83.27*/("""&nbsp;
                          <a href=""""),_display_(/*84.37*/routes/*84.43*/.HomeController.updateProperty(property.getId)),format.raw/*84.89*/(""""><i class="fas fa-edit"></i></a>
                          &nbsp;
                          <a href=""""),_display_(/*86.37*/routes/*86.43*/.HomeController.deleteProperty(property.getId)),format.raw/*86.89*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                      """)))}),format.raw/*87.24*/("""
                  """),format.raw/*88.19*/("""</td>
              </a>
          </tr>
      """)))}),format.raw/*91.8*/("""
  """),format.raw/*92.3*/("""</table>
""")))}),format.raw/*93.2*/("""
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
                  DATE: Tue Apr 23 00:06:36 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/landlordProfile.scala.html
                  HASH: ca53c08e7e935ef9cae4087abf307d07f8079db8
                  MATRIX: 1043->1|1261->127|1290->148|1329->150|1357->152|1538->307|1586->347|1624->348|1665->361|1702->371|1717->377|1783->422|1861->469|1897->478|2066->620|2168->712|2209->714|2258->735|2325->775|2379->808|2478->889|2491->894|2530->895|2583->920|2764->1070|2813->1092|2938->1190|2955->1198|2987->1209|3016->1211|3033->1219|3065->1230|3330->1468|3348->1476|3381->1487|3624->1704|3728->1799|3769->1801|3803->1808|3840->1818|3855->1824|3905->1853|4017->1935|4045->1936|4143->2008|4179->2028|4219->2030|4256->2040|4303->2078|4342->2079|4381->2090|4460->2142|4475->2148|4540->2192|4615->2240|4632->2248|4670->2265|4719->2287|4736->2295|4793->2330|4836->2345|4955->2437|4972->2445|5004->2456|5091->2516|5108->2524|5141->2536|5226->2594|5243->2602|5273->2611|5330->2641|5379->2681|5419->2683|5474->2710|5535->2744|5570->2770|5610->2772|5669->2803|5710->2817|5725->2823|5787->2864|6030->3089|6043->3094|6082->3095|6141->3126|6245->3199|6301->3227|6371->3270|6386->3276|6453->3322|6583->3425|6598->3431|6665->3477|6785->3566|6832->3585|6910->3633|6940->3636|6980->3646
                  LINES: 28->1|33->2|33->2|33->2|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|52->21|56->25|59->28|59->28|59->28|59->28|59->28|59->28|68->37|68->37|68->37|82->51|82->51|82->51|83->52|83->52|83->52|83->52|86->55|87->56|91->60|91->60|91->60|92->61|92->61|92->61|93->62|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|97->66|99->68|99->68|99->68|100->69|100->69|100->69|102->71|102->71|102->71|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|106->75|106->75|106->75|110->79|110->79|110->79|111->80|112->81|114->83|115->84|115->84|115->84|117->86|117->86|117->86|118->87|119->88|122->91|123->92|124->93
                  -- GENERATED --
              */
          