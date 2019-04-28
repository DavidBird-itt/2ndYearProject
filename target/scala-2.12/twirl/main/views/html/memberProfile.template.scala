
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
        
          
            """),_display_(/*67.14*/if(member.getBasket() != null)/*67.44*/ {_display_(Seq[Any](format.raw/*67.46*/("""
                """),format.raw/*68.17*/("""<table class="table table-bordered table-hover table-condensed">
                        <thead>
                        <!-- The header row-->
                        <tr>
                            
                            <th>Rent</th>
                            
                        </tr>
                        </thead>
                        <tbody>
                            """),_display_(/*78.30*/if(member.getBasket() != null)/*78.60*/ {_display_(Seq[Any](format.raw/*78.62*/("""
                                """),format.raw/*79.33*/("""<!-- Start of For loop - For each p in products add a row -->
                                """),_display_(/*80.34*/for(i <- member.getBasket().getBasketItems()) yield /*80.79*/ {_display_(Seq[Any](format.raw/*80.81*/("""
                                  """),_display_(/*81.36*/if(i.getProperty().getStock() == 1)/*81.71*/ {_display_(Seq[Any](format.raw/*81.73*/("""
                                    """),_display_(/*82.38*/routes/*82.44*/.ShoppingCtrl.emptyBasket()),format.raw/*82.71*/("""
                                  """)))}),format.raw/*83.36*/("""
                                """),format.raw/*84.33*/("""<tr>
                                    <td>&euro; """),_display_(/*85.49*/("%.2f".format(i.getProperty.getPrice))),format.raw/*85.88*/("""</td>
        
                                </tr>
                                """)))}),format.raw/*88.34*/("""<!-- End of For loop -->
                          """)))}),format.raw/*89.28*/("""
                        """),format.raw/*90.25*/("""</tbody>
                    </table>
        
            
                <div class="row">
                    <div class="col-md-12">
                        <p class="text-right"><strong> Price of Rent &euro; """),_display_(/*96.78*/("%.2f".format(member.getBasket.getBasketTotal()))),format.raw/*96.128*/("""</strong></p>
                    </div>  
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*102.39*/routes/*102.45*/.ShoppingCtrl.emptyBasket()),format.raw/*102.72*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>Cancel Rent</a>
                        </p>
                    </div>  
                    <div class="col-md-6">
                      <script src="https://checkout.stripe.com/checkout.js"
                      class="stripe-button"
                      data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
                      data-name="Deposit"
                      data-description="Deposit (&euro;"""),_display_(/*111.57*/member/*111.63*/.getBasket.getBasketTotal()),format.raw/*111.90*/(""")"
                      data-amount=""""),_display_(/*112.37*/member/*112.43*/.convertStripeNum(member.getBasket().getBasketTotal())),format.raw/*112.97*/("""">
                    </script>
                    </div>  
                </div>
            </div>
        </div>
        
        <script>
          // JavaScript function returns true if user clicks yes, otherwise, false
          function confirmDel() """),format.raw/*121.33*/("""{"""),format.raw/*121.34*/("""
            """),format.raw/*122.13*/("""return confirm('Are you sure?');
          """),format.raw/*123.11*/("""}"""),format.raw/*123.12*/("""
        """),format.raw/*124.9*/("""</script>
        
      """)))}),format.raw/*126.8*/("""     
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
                  DATE: Sun Apr 28 21:07:35 IST 2019
                  SOURCE: /home/wdd/temp/PlayReminder/app/views/memberProfile.scala.html
                  HASH: 90b54c56cb9e91cda1a3a6c5392cc796445541fe
                  MATRIX: 1008->1|1162->85|1198->115|1230->141|1283->83|1310->166|1337->168|1373->196|1412->198|1443->203|1663->396|1710->434|1749->435|1798->456|1835->466|1850->472|1914->515|2000->570|2071->613|2272->787|2372->877|2413->879|2470->908|2537->948|2590->979|2697->1068|2710->1073|2749->1074|2810->1107|3007->1273|3089->1327|3238->1449|3253->1455|3285->1466|3314->1468|3329->1474|3361->1485|3638->1735|3653->1741|3685->1752|3823->1863|3838->1869|3870->1880|4045->2028|4060->2034|4097->2050|4316->2242|4357->2274|4397->2276|4442->2293|4524->2348|4538->2353|4574->2368|4619->2385|4670->2405|4732->2440|4771->2470|4811->2472|4856->2489|5280->2886|5319->2916|5359->2918|5420->2951|5542->3046|5603->3091|5643->3093|5706->3129|5750->3164|5790->3166|5855->3204|5870->3210|5918->3237|5985->3273|6046->3306|6126->3359|6186->3398|6303->3484|6386->3536|6439->3561|6681->3776|6753->3826|7009->4054|7025->4060|7074->4087|7642->4627|7658->4633|7707->4660|7774->4699|7790->4705|7866->4759|8155->5019|8185->5020|8227->5033|8299->5076|8329->5077|8366->5086|8423->5112
                  LINES: 28->1|31->3|32->4|33->5|36->2|37->6|38->7|38->7|38->7|40->9|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|59->28|63->32|66->35|66->35|66->35|66->35|66->35|66->35|73->42|73->42|73->42|76->45|76->45|76->45|80->49|80->49|80->49|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|95->64|98->67|98->67|98->67|99->68|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|115->84|116->85|116->85|119->88|120->89|121->90|127->96|127->96|133->102|133->102|133->102|142->111|142->111|142->111|143->112|143->112|143->112|152->121|152->121|153->122|154->123|154->123|155->124|157->126
                  -- GENERATED --
              */
          