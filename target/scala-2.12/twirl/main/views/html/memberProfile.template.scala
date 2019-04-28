
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

object memberProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.Member,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(member: models.users.Member, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.api.Play.current
/*4.2*/import models.shopping._
/*5.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Member Profile", user)/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
   
"""),format.raw/*9.1*/("""<div id ="profile">
        <div class="container-fluid">
          <div class="row">
            <div class="panel panel-default">
              <div class="panel-heading">
                  """),_display_(/*14.20*/if((user != null) && (member == user))/*14.58*/{_display_(Seq[Any](format.raw/*14.59*/("""
                    """),format.raw/*15.21*/("""<a href=""""),_display_(/*15.31*/routes/*15.37*/.HomeController.updateMember(user.getEmail)),format.raw/*15.80*/(""""><i class="fas fa-edit"></i></a>
                    """)))}),format.raw/*16.22*/("""
        
                
                """),format.raw/*19.17*/("""<h4>User Profile</h4>
              </div>
              <div class="panel-body">
                <div class="col-md-4 col-xs-12 col-sm-6 col-lg-4">
                        """),_display_(/*23.26*/if(env.resource("public/images/projectImages/" + member.getEmail + "thumb.jpg").isDefined)/*23.116*/ {_display_(Seq[Any](format.raw/*23.118*/("""
                            """),format.raw/*24.29*/("""<img src="/assets/images/projectImages/"""),_display_(/*24.69*/(member.getEmail + "thumb.jpg")),format.raw/*24.100*/(""""/  id="profile-image1" class="img-circle img-responsive">
                            """)))}/*25.31*/else/*25.36*/{_display_(Seq[Any](format.raw/*25.37*/("""
                                """),format.raw/*26.33*/("""<img src="avatar.png" alt="Avatar" class="avatar"
                                id="profile-image1" class="img-circle img-responsive">
                            """)))}),format.raw/*28.30*/("""
                  
        
        
                """),format.raw/*32.17*/("""</div>
                <div class="col-md-8 col-xs-4">
                  <div class="container">
                    <h2>"""),_display_(/*35.26*/member/*35.32*/.getFname()),format.raw/*35.43*/(""" """),_display_(/*35.45*/member/*35.51*/.getLname()),format.raw/*35.62*/("""</h2>
                    <p><b>Member</b></p>
        
        
                  </div>
                  <hr>
                  <ul class="container details">
                    
                    <li>
                      <p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>"""),_display_(/*44.101*/member/*44.107*/.getEmail()),format.raw/*44.118*/("""</p>
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

        <div class="row">

          <div class="col-md-12">
            """),_display_(/*59.14*/if(flash.containsKey("success"))/*59.46*/ {_display_(Seq[Any](format.raw/*59.48*/("""
                """),format.raw/*60.17*/("""<div class="alert alert-success">
                    """),_display_(/*61.22*/flash/*61.27*/.get("success")),format.raw/*61.42*/("""
                """),format.raw/*62.17*/("""</div>
            """)))}),format.raw/*63.14*/(""" 
        
            """),_display_(/*65.14*/if(member.getBasket() != null)/*65.44*/ {_display_(Seq[Any](format.raw/*65.46*/("""
                """),format.raw/*66.17*/("""<table class="table table-bordered table-hover table-condensed">
                        <thead>
                        <!-- The header row-->
                        <tr>
                            
                            <th>Rent</th>
                            
                        </tr>
                        </thead>
                        <tbody>
                            """),_display_(/*76.30*/if(member.getBasket() != null)/*76.60*/ {_display_(Seq[Any](format.raw/*76.62*/("""
                                """),format.raw/*77.33*/("""<!-- Start of For loop - For each p in products add a row -->
                                """),_display_(/*78.34*/for(i <- member.getBasket().getBasketItems()) yield /*78.79*/ {_display_(Seq[Any](format.raw/*78.81*/("""
                                """),format.raw/*79.33*/("""<tr>
                                    <td>&euro; """),_display_(/*80.49*/("%.2f".format(i.getProperty.getPrice))),format.raw/*80.88*/("""</td>
        
                                </tr>
                                """)))}),format.raw/*83.34*/("""<!-- End of For loop -->
                          """)))}),format.raw/*84.28*/("""
                        """),format.raw/*85.25*/("""</tbody>
                    </table>
        
            
                <div class="row">
                    <div class="col-md-12">
                        <p class="text-right"><strong> Price to rent the house a month &euro; """),_display_(/*91.96*/("%.2f".format(member.getBasket.getBasketTotal()))),format.raw/*91.146*/("""</strong></p>
                    </div>  
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*97.39*/routes/*97.45*/.ShoppingCtrl.emptyBasket()),format.raw/*97.72*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>Cancel Rent</a>
                        </p>
                    </div>  
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*103.39*/routes/*103.45*/.ShoppingCtrl.placeOrder()),format.raw/*103.71*/("""" class="btn btn-success btn-sm">
                            <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                        </p>
                    </div>  
                </div>
            </div>
        </div>
        
        <script>
          // JavaScript function returns true if user clicks yes, otherwise, false
          function confirmDel() """),format.raw/*113.33*/("""{"""),format.raw/*113.34*/("""
            """),format.raw/*114.13*/("""return confirm('Are you sure?');
          """),format.raw/*115.11*/("""}"""),format.raw/*115.12*/("""
        """),format.raw/*116.9*/("""</script>
        
      """)))}),format.raw/*118.8*/("""     
""")))}))
      }
    }
  }

  def render(member:models.users.Member,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(member,user,env)

  def f:((models.users.Member,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (member,user,env) => apply(member,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 15:04:15 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/memberProfile.scala.html
                  HASH: e1586d85ab2eed70367c45917d59d2cb052c1c62
                  MATRIX: 1008->1|1162->85|1198->115|1230->141|1283->83|1310->166|1337->168|1373->196|1412->198|1443->203|1663->396|1710->434|1749->435|1798->456|1835->466|1850->472|1914->515|2000->570|2071->613|2272->787|2372->877|2413->879|2470->908|2537->948|2590->979|2697->1068|2710->1073|2749->1074|2810->1107|3007->1273|3089->1327|3238->1449|3253->1455|3285->1466|3314->1468|3329->1474|3361->1485|3697->1793|3713->1799|3746->1810|4127->2164|4168->2196|4208->2198|4253->2215|4335->2270|4349->2275|4385->2290|4430->2307|4481->2327|4532->2351|4571->2381|4611->2383|4656->2400|5080->2797|5119->2827|5159->2829|5220->2862|5342->2957|5403->3002|5443->3004|5504->3037|5584->3090|5644->3129|5761->3215|5844->3267|5897->3292|6157->3525|6229->3575|6484->3803|6499->3809|6547->3836|6916->4177|6932->4183|6980->4209|7390->4590|7420->4591|7462->4604|7534->4647|7564->4648|7601->4657|7658->4683
                  LINES: 28->1|31->3|32->4|33->5|36->2|37->6|38->7|38->7|38->7|40->9|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|59->28|63->32|66->35|66->35|66->35|66->35|66->35|66->35|75->44|75->44|75->44|90->59|90->59|90->59|91->60|92->61|92->61|92->61|93->62|94->63|96->65|96->65|96->65|97->66|107->76|107->76|107->76|108->77|109->78|109->78|109->78|110->79|111->80|111->80|114->83|115->84|116->85|122->91|122->91|128->97|128->97|128->97|134->103|134->103|134->103|144->113|144->113|145->114|146->115|146->115|147->116|149->118
                  -- GENERATED --
              */
          