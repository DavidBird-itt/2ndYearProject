
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

object viewHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.products.Houses,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(house: models.products.Houses, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
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

  def render(house:models.products.Houses,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(house,user)

  def f:((models.products.Houses,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (house,user) => apply(house,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 19 16:26:10 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/viewHouse.scala.html
                  HASH: 65193bd4482cb991f0ca388f7802b47be7336536
                  MATRIX: 986->1|1136->59|1171->86|1210->88|1238->90|1323->149|1336->154|1369->167|1536->308|1550->313|1582->324|1614->329|1732->421|1746->426|1779->438|1811->443|1946->552|1960->557|1995->571|2024->572|2143->665|2171->684|2211->686|2245->693|2273->704|2286->709|2325->710|2359->717|2398->726|2430->731|2543->817|2557->822|2610->854|2660->877|2674->882|2711->898|2764->925|2826->978|2865->979|2896->983|3122->1182|3136->1187|3173->1203|3222->1225|3236->1230|3297->1270|3346->1289|3376->1292
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|51->20|51->20|51->20|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|65->34|65->34|65->34|65->34|65->34|65->34|67->36|67->36|67->36|68->37|73->42|73->42|73->42|74->43|74->43|74->43|76->45|77->46
                  -- GENERATED --
              */
          