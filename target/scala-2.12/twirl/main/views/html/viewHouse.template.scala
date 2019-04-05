
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

object viewHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Houses,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(house: models.Houses, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("View Property", user)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
	"""),format.raw/*3.2*/("""<div id="house-desc">
		<img class="house-thumbnail" src=""""),_display_(/*4.38*/house/*4.43*/.getImagePath),format.raw/*4.56*/("""" />
		<div id="description">House</div>
		<table>
			<tr>
				<th>
					<span class="icon"><i class="fas fa-bed"></i> Bedrooms</span>
					"""),_display_(/*10.7*/house/*10.12*/.getNumBeds),format.raw/*10.23*/("""
				"""),format.raw/*11.5*/("""</th>
				<th>
					<span class="icon"><i class="fas fa-toilet"></i> Bathrooms</span>
					"""),_display_(/*14.7*/house/*14.12*/.getNumBaths),format.raw/*14.24*/("""
				"""),format.raw/*15.5*/("""</th>
			</tr>
			<tr>
				<th>
					<span class="icon"><i class="fas fa-leaf"></i> Garden Size</span>
					"""),_display_(/*20.7*/house/*20.12*/.getGardenSize),format.raw/*20.26*/(""" """),format.raw/*20.27*/("""m²
				</th>
				<th>
					<span class="icon"><i class="fas fa-car"></i> Garage</span>
					"""),_display_(/*24.7*/if(house.getGarage)/*24.26*/ {_display_(Seq[Any](format.raw/*24.28*/("""
						"""),format.raw/*25.7*/("""Yes
					""")))}/*26.8*/else/*26.13*/{_display_(Seq[Any](format.raw/*26.14*/("""
						"""),format.raw/*27.7*/("""No
					""")))}),format.raw/*28.7*/("""
				"""),format.raw/*29.5*/("""</th>
			</tr>
		</table>
		<div id="price">
			<div id="title">Price</div>
			&euro;"""),_display_(/*34.11*/house/*34.16*/.getDisplayValue(house.getPrice)),format.raw/*34.48*/("""<p>(deposit: <strong>€"""),_display_(/*34.71*/house/*34.76*/.getDepositValue),format.raw/*34.92*/("""</strong>)</p>
			<br>
			"""),_display_(/*36.5*/if((user !=null) &&("member".equals(user.getRole())))/*36.58*/{_display_(Seq[Any](format.raw/*36.59*/("""
			"""),format.raw/*37.4*/("""<script
			  src="https://checkout.stripe.com/checkout.js"
			  class="stripe-button"
			  data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
			  data-name="Deposit"
			  data-description="Deposit (&euro;"""),_display_(/*42.40*/house/*42.45*/.getDepositValue),format.raw/*42.61*/(""")"
			  data-amount=""""),_display_(/*43.20*/house/*43.25*/.convertStripeNum(house.getDepositValue)),format.raw/*43.65*/(""""
			</script>
			""")))}),format.raw/*45.5*/("""
		"""),format.raw/*46.3*/("""</div>
	</div>
""")))}))
      }
    }
  }

  def render(house:models.Houses,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(house,user)

  def f:((models.Houses,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (house,user) => apply(house,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 12:03:24 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/viewHouse.scala.html
                  HASH: 4fc0fb4c55805d513b8ddc99167183ac0a19f3f3
                  MATRIX: 977->1|1118->50|1153->77|1192->79|1220->81|1305->140|1318->145|1351->158|1518->299|1532->304|1564->315|1596->320|1714->412|1728->417|1761->429|1793->434|1928->543|1942->548|1977->562|2006->563|2125->656|2153->675|2193->677|2227->684|2255->695|2268->700|2307->701|2341->708|2380->717|2412->722|2525->808|2539->813|2592->845|2642->868|2656->873|2693->889|2746->916|2808->969|2847->970|2878->974|3104->1173|3118->1178|3155->1194|3204->1216|3218->1221|3279->1261|3328->1280|3358->1283
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|51->20|51->20|51->20|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|65->34|65->34|65->34|65->34|65->34|65->34|67->36|67->36|67->36|68->37|73->42|73->42|73->42|74->43|74->43|74->43|76->45|77->46
                  -- GENERATED --
              */
          