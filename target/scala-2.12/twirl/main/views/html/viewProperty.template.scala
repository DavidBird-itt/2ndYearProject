
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

object viewProperty extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.products.Property,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(property: models.products.Property, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("View Property", user)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
	"""),format.raw/*3.2*/("""<div id="house-desc">
		<img class="house-thumbnail" src=""""),_display_(/*4.38*/property/*4.46*/.getImagePath),format.raw/*4.59*/("""" />
		<div id="description">House</div>
		<table>
			<tr>
				<th>
					<span class="icon"><i class="fas fa-bed"></i> Bedrooms</span>
					"""),_display_(/*10.7*/property/*10.15*/.getNumBeds),format.raw/*10.26*/("""
				"""),format.raw/*11.5*/("""</th>
				<th>
					<span class="icon"><i class="fas fa-toilet"></i> Bathrooms</span>
					"""),_display_(/*14.7*/property/*14.15*/.getNumBaths),format.raw/*14.27*/("""
				"""),format.raw/*15.5*/("""</th>
			</tr>
		
		</table>
		<div id="price">
			<div id="title">Price</div>
			&euro;"""),_display_(/*21.11*/property/*21.19*/.getDisplayValue(property.getPrice)),format.raw/*21.54*/("""<p>(deposit: <strong>€"""),_display_(/*21.77*/property/*21.85*/.getDepositValue),format.raw/*21.101*/("""</strong>)</p>
			<br>
			"""),_display_(/*23.5*/if((user !=null) &&("member".equals(user.getRole())))/*23.58*/{_display_(Seq[Any](format.raw/*23.59*/("""
			"""),format.raw/*24.4*/("""<script
			  src="https://checkout.stripe.com/checkout.js"
			  class="stripe-button"
			  data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
			  data-name="Deposit"
			  data-description="Deposit (&euro;"""),_display_(/*29.40*/property/*29.48*/.getDepositValue),format.raw/*29.64*/(""")"
			  data-amount=""""),_display_(/*30.20*/property/*30.28*/.convertStripeNum(property.getDepositValue)),format.raw/*30.71*/(""""
			</script>
			""")))}),format.raw/*32.5*/("""
		"""),format.raw/*33.3*/("""</div>
	</div>
""")))}))
      }
    }
  }

  def render(property:models.products.Property,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(property,user)

  def f:((models.products.Property,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (property,user) => apply(property,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 00:12:10 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/viewProperty.scala.html
                  HASH: 539af492df75ac074d3eb9c967a91db997e291ce
                  MATRIX: 991->1|1146->64|1181->91|1220->93|1248->95|1333->154|1349->162|1382->175|1549->316|1566->324|1598->335|1630->340|1748->432|1765->440|1798->452|1830->457|1946->546|1963->554|2019->589|2069->612|2086->620|2124->636|2177->663|2239->716|2278->717|2309->721|2535->920|2552->928|2589->944|2638->966|2655->974|2719->1017|2768->1036|2798->1039
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|52->21|52->21|52->21|52->21|52->21|52->21|54->23|54->23|54->23|55->24|60->29|60->29|60->29|61->30|61->30|61->30|63->32|64->33
                  -- GENERATED --
              */
          