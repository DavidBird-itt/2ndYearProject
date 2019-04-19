
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

object viewApartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.products.Apartment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(apartment: models.products.Apartment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("View Property", user)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
	"""),format.raw/*3.2*/("""<div id="house-desc">
		<img class="house-thumbnail" src=""""),_display_(/*4.38*/apartment/*4.47*/.getImagePath),format.raw/*4.60*/("""" />
		<div id="description">Apartment</div>
		<table>
			<tr>
				<th>
					<span class="icon"><i class="fas fa-bed"></i> Bedrooms</span>
					"""),_display_(/*10.7*/apartment/*10.16*/.getNumBeds),format.raw/*10.27*/("""
				"""),format.raw/*11.5*/("""</th>
				<th>
					<span class="icon"><i class="fas fa-toilet"></i> Bathrooms</span>
					"""),_display_(/*14.7*/apartment/*14.16*/.getNumBaths),format.raw/*14.28*/("""
				"""),format.raw/*15.5*/("""</th>
			</tr>
		</table>
		<div id="price">
			<div id="title">Price Per Month</div>
			&euro;"""),_display_(/*20.11*/apartment/*20.20*/.getDisplayValue(apartment.getPrice)),format.raw/*20.56*/("""<p>(deposit: <strong>€"""),_display_(/*20.79*/apartment/*20.88*/.getDepositValue),format.raw/*20.104*/("""</strong>)</p>
			<br><br>
			"""),_display_(/*22.5*/if((user !=null) &&("member".equals(user.getRole())))/*22.58*/{_display_(Seq[Any](format.raw/*22.59*/("""
			"""),format.raw/*23.4*/("""<script
			  src="https://checkout.stripe.com/checkout.js"
			  class="stripe-button"
			  data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
			  data-name="Deposit"
			  data-description="Deposit (&euro;"""),_display_(/*28.40*/apartment/*28.49*/.getPrice),format.raw/*28.58*/(""")"
			  data-amount=""""),_display_(/*29.20*/apartment/*29.29*/.convertStripeNum(apartment.getPrice)),format.raw/*29.66*/(""""
			</script>
			""")))}),format.raw/*31.5*/("""
		"""),format.raw/*32.3*/("""</div>
	</div>
""")))}))
      }
    }
  }

  def render(apartment:models.products.Apartment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(apartment,user)

  def f:((models.products.Apartment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (apartment,user) => apply(apartment,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 19 16:26:10 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/viewApartment.scala.html
                  HASH: a70898bd6696aa652613bbf242a505041cff8f1a
                  MATRIX: 993->1|1150->66|1185->93|1224->95|1252->97|1337->156|1354->165|1387->178|1558->323|1576->332|1608->343|1640->348|1758->440|1776->449|1809->461|1841->466|1964->562|1982->571|2039->607|2089->630|2107->639|2145->655|2202->686|2264->739|2303->740|2334->744|2560->943|2578->952|2608->961|2657->983|2675->992|2733->1029|2782->1048|2812->1051
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|51->20|51->20|51->20|51->20|51->20|51->20|53->22|53->22|53->22|54->23|59->28|59->28|59->28|60->29|60->29|60->29|62->31|63->32
                  -- GENERATED --
              */
          