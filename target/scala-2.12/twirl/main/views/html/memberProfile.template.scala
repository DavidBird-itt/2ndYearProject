
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
                            """),format.raw/*24.29*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*24.73*/(member.getEmail + "thumb.jpg")),format.raw/*24.104*/(""""/  id="profile-image1" class="img-circle img-responsive"></td>
                            """)))}/*25.31*/else/*25.36*/{_display_(Seq[Any](format.raw/*25.37*/("""
                                """),format.raw/*26.33*/("""<td><img src="/assets/images/productImages/avatar.png" alt="Avatar" class="avatar"
                                id="profile-image1" class="img-circle img-responsive"></td>
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
                      <p><i class = "fas fa-envelope"></i> """),_display_(/*42.61*/member/*42.67*/.getEmail()),format.raw/*42.78*/("""</p>
                    </li>
                    <li>
                      <p><i class="fas fa-phone"></i> """),_display_(/*45.56*/member/*45.62*/.getPhone()),format.raw/*45.73*/("""</p>
                    </li>
                  </ul>
                  <hr>
                  <div class="col-sm-5 col-xs-6 tital ">Date Joined: """),_display_(/*49.71*/member/*49.77*/.getDateJoined()),format.raw/*49.93*/("""</div>
                </div>
              </div>
            </div>
          </div>
        </div>
        </div>

        <div class="row">

          <div class="col-md-12">
            """),_display_(/*60.14*/if(flash.containsKey("success"))/*60.46*/ {_display_(Seq[Any](format.raw/*60.48*/("""
                """),format.raw/*61.17*/("""<div class="alert alert-success">
                    """),_display_(/*62.22*/flash/*62.27*/.get("success")),format.raw/*62.42*/("""
                """),format.raw/*63.17*/("""</div>
            """)))}),format.raw/*64.14*/(""" 
        
            """),_display_(/*66.14*/if(member.getBasket() != null)/*66.44*/ {_display_(Seq[Any](format.raw/*66.46*/("""
                """),format.raw/*67.17*/("""<table class="table table-bordered table-hover table-condensed">
                        <thead>
                        <!-- The header row-->
                        <tr>
                            
                            <th>Rent</th>
                            
                        </tr>
                        </thead>
                        <tbody>
                            """),_display_(/*77.30*/if(member.getBasket() != null)/*77.60*/ {_display_(Seq[Any](format.raw/*77.62*/("""
                                """),format.raw/*78.33*/("""<!-- Start of For loop - For each p in products add a row -->
                                """),_display_(/*79.34*/for(i <- member.getBasket().getBasketItems()) yield /*79.79*/ {_display_(Seq[Any](format.raw/*79.81*/("""
                                """),format.raw/*80.33*/("""<tr>
                                    <td>&euro; """),_display_(/*81.49*/("%.2f".format(i.getProperty.getPrice))),format.raw/*81.88*/("""</td>
        
                                </tr>
                                """)))}),format.raw/*84.34*/("""<!-- End of For loop -->
                          """)))}),format.raw/*85.28*/("""
                        """),format.raw/*86.25*/("""</tbody>
                    </table>
        
            
                <div class="row">
                    <div class="col-md-12">
                        <p class="text-right"><strong> Price of Rent &euro; """),_display_(/*92.78*/("%.2f".format(member.getBasket.getBasketTotal()))),format.raw/*92.128*/("""</strong></p>
                    </div>  
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*98.39*/routes/*98.45*/.ShoppingCtrl.emptyBasket()),format.raw/*98.72*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>Cancel Rent</a>
                        </p>
                    </div>  
                    <div class="col-md-6">
                      <script src="https://checkout.stripe.com/checkout.js"
                      class="stripe-button"
                      data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
                      data-name="Deposit"
                      data-description="Deposit (&euro;"""),_display_(/*107.57*/member/*107.63*/.getBasket.getBasketTotal()),format.raw/*107.90*/(""")"
                      data-amount=""""),_display_(/*108.37*/member/*108.43*/.convertStripeNum(member.getBasket().getBasketTotal())),format.raw/*108.97*/("""">
                    </script>
                    </div>  
                </div>
            </div>
        </div>
        
        <script>
          // JavaScript function returns true if user clicks yes, otherwise, false
          function confirmDel() """),format.raw/*117.33*/("""{"""),format.raw/*117.34*/("""
            """),format.raw/*118.13*/("""return confirm('Are you sure?');
          """),format.raw/*119.11*/("""}"""),format.raw/*119.12*/("""
        """),format.raw/*120.9*/("""</script>
        
      """)))}),format.raw/*122.8*/("""     
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
                  DATE: Sun Apr 28 20:52:15 CEST 2019
                  SOURCE: /home/wdd/collegeLastThisOneActually/PlayReminder/app/views/memberProfile.scala.html
                  HASH: 3d7cf355ea8209b92d4ebd6ad79f48c18c1c4463
                  MATRIX: 1008->1|1162->85|1198->115|1230->141|1283->83|1310->166|1337->168|1373->196|1412->198|1443->203|1663->396|1710->434|1749->435|1798->456|1835->466|1850->472|1914->515|2000->570|2071->613|2272->787|2372->877|2413->879|2470->908|2541->952|2594->983|2706->1077|2719->1082|2758->1083|2819->1116|3054->1320|3136->1374|3285->1496|3300->1502|3332->1513|3361->1515|3376->1521|3408->1532|3685->1782|3700->1788|3732->1799|3870->1910|3885->1916|3917->1927|4092->2075|4107->2081|4144->2097|4363->2289|4404->2321|4444->2323|4489->2340|4571->2395|4585->2400|4621->2415|4666->2432|4717->2452|4768->2476|4807->2506|4847->2508|4892->2525|5316->2922|5355->2952|5395->2954|5456->2987|5578->3082|5639->3127|5679->3129|5740->3162|5820->3215|5880->3254|5997->3340|6080->3392|6133->3417|6375->3632|6447->3682|6702->3910|6717->3916|6765->3943|7333->4483|7349->4489|7398->4516|7465->4555|7481->4561|7557->4615|7846->4875|7876->4876|7918->4889|7990->4932|8020->4933|8057->4942|8114->4968
                  LINES: 28->1|31->3|32->4|33->5|36->2|37->6|38->7|38->7|38->7|40->9|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|59->28|63->32|66->35|66->35|66->35|66->35|66->35|66->35|73->42|73->42|73->42|76->45|76->45|76->45|80->49|80->49|80->49|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|95->64|97->66|97->66|97->66|98->67|108->77|108->77|108->77|109->78|110->79|110->79|110->79|111->80|112->81|112->81|115->84|116->85|117->86|123->92|123->92|129->98|129->98|129->98|138->107|138->107|138->107|139->108|139->108|139->108|148->117|148->117|149->118|150->119|150->119|151->120|153->122
                  -- GENERATED --
              */
          