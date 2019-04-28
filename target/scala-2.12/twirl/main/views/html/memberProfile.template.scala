
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
                  DATE: Sun Apr 28 17:39:26 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/memberProfile.scala.html
                  HASH: f2b267618da59452e939b44c0c6b34a402b7eb67
                  MATRIX: 1008->1|1162->85|1198->115|1230->141|1283->83|1310->166|1337->168|1373->196|1412->198|1443->203|1663->396|1710->434|1749->435|1798->456|1835->466|1850->472|1914->515|2000->570|2071->613|2272->787|2372->877|2413->879|2470->908|2537->948|2590->979|2697->1068|2710->1073|2749->1074|2810->1107|3007->1273|3089->1327|3238->1449|3253->1455|3285->1466|3314->1468|3329->1474|3361->1485|3638->1735|3653->1741|3685->1752|3823->1863|3838->1869|3870->1880|4045->2028|4060->2034|4097->2050|4316->2242|4357->2274|4397->2276|4442->2293|4524->2348|4538->2353|4574->2368|4619->2385|4670->2405|4721->2429|4760->2459|4800->2461|4845->2478|5269->2875|5308->2905|5348->2907|5409->2940|5531->3035|5592->3080|5632->3082|5693->3115|5773->3168|5833->3207|5950->3293|6033->3345|6086->3370|6328->3585|6400->3635|6655->3863|6670->3869|6718->3896|7286->4436|7302->4442|7351->4469|7418->4508|7434->4514|7510->4568|7799->4828|7829->4829|7871->4842|7943->4885|7973->4886|8010->4895|8067->4921
                  LINES: 28->1|31->3|32->4|33->5|36->2|37->6|38->7|38->7|38->7|40->9|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|59->28|63->32|66->35|66->35|66->35|66->35|66->35|66->35|73->42|73->42|73->42|76->45|76->45|76->45|80->49|80->49|80->49|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|95->64|97->66|97->66|97->66|98->67|108->77|108->77|108->77|109->78|110->79|110->79|110->79|111->80|112->81|112->81|115->84|116->85|117->86|123->92|123->92|129->98|129->98|129->98|138->107|138->107|138->107|139->108|139->108|139->108|148->117|148->117|149->118|150->119|150->119|151->120|153->122
                  -- GENERATED --
              */
          