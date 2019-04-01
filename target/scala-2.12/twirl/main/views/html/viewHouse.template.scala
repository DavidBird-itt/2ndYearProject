
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
					"""),_display_(/*20.7*/house/*20.12*/.getGardenSize),format.raw/*20.26*/("""
				"""),format.raw/*21.5*/("""</th>
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
			&euro;"""),_display_(/*34.11*/house/*34.16*/.getDisplayValue(house.getPrice)),format.raw/*34.48*/("""<p>(deposit: <strong>$"""),_display_(/*34.71*/house/*34.76*/.getDepositValue),format.raw/*34.92*/("""</strong>)</p>
			<br>
			<script
			  src="https://checkout.stripe.com/checkout.js"
			  class="stripe-button"
			  data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
			  data-name="Deposit"
			  data-description="Deposit (&euro;"""),_display_(/*41.40*/house/*41.45*/.getDepositValue),format.raw/*41.61*/(""")"
			  data-amount=""""),_display_(/*42.20*/house/*42.25*/.convertStripeNum(house.getDepositValue)),format.raw/*42.65*/(""""
			</script>
		</div>
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
                  DATE: Mon Apr 01 12:54:22 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/viewHouse.scala.html
                  HASH: 0ff19cfd73625c7a365315bf2a0396f76a84ed58
                  MATRIX: 977->1|1118->50|1153->77|1192->79|1220->81|1305->140|1318->145|1351->158|1518->299|1532->304|1564->315|1596->320|1714->412|1728->417|1761->429|1793->434|1928->543|1942->548|1977->562|2009->567|2121->653|2149->672|2189->674|2223->681|2251->692|2264->697|2303->698|2337->705|2376->714|2408->719|2521->805|2535->810|2588->842|2638->865|2652->870|2689->886|2941->1111|2955->1116|2992->1132|3041->1154|3055->1159|3116->1199
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|51->20|51->20|51->20|52->21|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|65->34|65->34|65->34|65->34|65->34|65->34|72->41|72->41|72->41|73->42|73->42|73->42
                  -- GENERATED --
              */
          