
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

object landlordProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.users.Landlord,List[models.products.Houses],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landlord: models.users.Landlord, hList: List[models.products.Houses], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
      """),format.raw/*52.7*/("""<a href=""""),_display_(/*52.17*/routes/*52.23*/.HomeController.addHouse()),format.raw/*52.49*/("""">
          <span style="font-size:20px">(Add New House)</span>
      </a>
  """)))}),format.raw/*55.4*/("""
"""),format.raw/*56.1*/("""</h1>
<br>
<div id="database-list">
  <table style="width:100%">
      """),_display_(/*60.8*/for(house<-hList) yield /*60.25*/ {_display_(Seq[Any](format.raw/*60.27*/("""
        """),_display_(/*61.10*/if(house.getLandlord() == landlord)/*61.45*/{_display_(Seq[Any](format.raw/*61.46*/("""
          """),format.raw/*62.11*/("""<tr>
              <td>
                  <a href=""""),_display_(/*64.29*/routes/*64.35*/.HomeController.viewHouse(house.getId)),format.raw/*64.73*/("""" class="listing">
                  <img src=""""),_display_(/*65.30*/house/*65.35*/.getThumbnailPath),format.raw/*65.52*/("""" /> House for &euro;"""),_display_(/*65.74*/house/*65.79*/.getDisplayValue(house.getPrice)),format.raw/*65.111*/("""
              """),format.raw/*66.15*/("""</td>
                  <td class="desc">
                      <i class="fas fa-bed"></i> """),_display_(/*68.51*/house/*68.56*/.getNumBeds),format.raw/*68.67*/("""&nbsp;
                      <i class="fas fa-toilet"></i> """),_display_(/*69.54*/house/*69.59*/.getNumBaths),format.raw/*69.71*/("""&nbsp;
                      <i class="fas fa-leaf"></i> """),_display_(/*70.52*/house/*70.57*/.getGardenSize),format.raw/*70.71*/(""" """),format.raw/*70.72*/("""m²&nbsp;
                      <i class="fas fa-car"></i>&nbsp;
                      """),_display_(/*72.24*/if(house.getGarage)/*72.43*/ {_display_(Seq[Any](format.raw/*72.45*/("""
                          """),format.raw/*73.27*/("""Yes
                      """)))}/*74.25*/else/*74.30*/{_display_(Seq[Any](format.raw/*74.31*/("""
                          """),format.raw/*75.27*/("""No
                      """)))}),format.raw/*76.24*/("""
                      """),format.raw/*77.23*/("""<i class="fas fa-leaf"></i>"""),_display_(/*77.51*/house/*77.56*/.getStock),format.raw/*77.65*/("""&nbsp;
                      """),_display_(/*78.24*/if((user != null) && (landlord == user))/*78.64*/ {_display_(Seq[Any](format.raw/*78.66*/("""
                          """),format.raw/*79.27*/("""&nbsp;
                          """),_display_(/*80.28*/if(house.getStock == 0)/*80.51*/ {_display_(Seq[Any](format.raw/*80.53*/("""
                              """),format.raw/*81.31*/("""<td><a href=""""),_display_(/*81.45*/routes/*81.51*/.ShoppingCtrl.addToBasket(house.getId)),format.raw/*81.89*/(""""
                                  class="btn btn-default btn-xs"><span
                                  class="glyphicon glyphicon-shopping-cart"></span></a>
                              </td>
                          """)))}/*85.29*/else/*85.34*/{_display_(Seq[Any](format.raw/*85.35*/("""
                              """),format.raw/*86.31*/("""<td><img src="/assets/images/sold.jpg"/></td>
                          """)))}),format.raw/*87.28*/("""

                          """),format.raw/*89.27*/("""&nbsp;
                          <a href=""""),_display_(/*90.37*/routes/*90.43*/.HomeController.updateHouse(house.getId)),format.raw/*90.83*/(""""><i class="fas fa-edit"></i></a>
                          &nbsp;
                          <a href=""""),_display_(/*92.37*/routes/*92.43*/.HomeController.deleteHouse(house.getId)),format.raw/*92.83*/("""" onclick="return confirmDel();"><i class="fas fa-trash"></i></a>
                      """)))}),format.raw/*93.24*/("""
                  """),format.raw/*94.19*/("""</td>
              </a>
          </tr>
      """)))}),format.raw/*97.8*/("""
  """),format.raw/*98.3*/("""</table>
""")))}),format.raw/*99.2*/("""
""")))}))
      }
    }
  }

  def render(landlord:models.users.Landlord,hList:List[models.products.Houses],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(landlord,hList,user,env)

  def f:((models.users.Landlord,List[models.products.Houses],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (landlord,hList,user,env) => apply(landlord,hList,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 19 17:07:20 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/landlordProfile.scala.html
                  HASH: 6c4d4149b8181f2d52615282c4662c4a4710481d
                  MATRIX: 1041->1|1257->125|1286->146|1325->148|1353->150|1534->305|1582->345|1620->346|1661->359|1698->369|1713->375|1779->420|1857->467|1893->476|2062->618|2164->710|2205->712|2254->733|2321->773|2375->806|2474->887|2487->892|2526->893|2579->918|2760->1068|2809->1090|2934->1188|2951->1196|2983->1207|3012->1209|3029->1217|3061->1228|3326->1466|3344->1474|3377->1485|3620->1702|3724->1797|3765->1799|3799->1806|3836->1816|3851->1822|3898->1848|4007->1927|4035->1928|4133->2000|4166->2017|4206->2019|4243->2029|4287->2064|4326->2065|4365->2076|4444->2128|4459->2134|4518->2172|4593->2220|4607->2225|4645->2242|4694->2264|4708->2269|4762->2301|4805->2316|4924->2408|4938->2413|4970->2424|5057->2484|5071->2489|5104->2501|5189->2559|5203->2564|5238->2578|5267->2579|5381->2666|5409->2685|5449->2687|5504->2714|5550->2742|5563->2747|5602->2748|5657->2775|5714->2801|5765->2824|5820->2852|5834->2857|5864->2866|5921->2896|5970->2936|6010->2938|6065->2965|6126->2999|6158->3022|6198->3024|6257->3055|6298->3069|6313->3075|6372->3113|6615->3338|6628->3343|6667->3344|6726->3375|6830->3448|6886->3476|6956->3519|6971->3525|7032->3565|7162->3668|7177->3674|7238->3714|7358->3803|7405->3822|7483->3870|7513->3873|7553->3883
                  LINES: 28->1|33->2|33->2|33->2|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|52->21|56->25|59->28|59->28|59->28|59->28|59->28|59->28|68->37|68->37|68->37|82->51|82->51|82->51|83->52|83->52|83->52|83->52|86->55|87->56|91->60|91->60|91->60|92->61|92->61|92->61|93->62|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|97->66|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|101->70|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|112->81|112->81|112->81|116->85|116->85|116->85|117->86|118->87|120->89|121->90|121->90|121->90|123->92|123->92|123->92|124->93|125->94|128->97|129->98|130->99
                  -- GENERATED --
              */
          