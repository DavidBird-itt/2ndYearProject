
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

object viewApartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Apartment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(apartment: models.Apartment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
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
			&euro;"""),_display_(/*20.11*/apartment/*20.20*/.getDisplayValue(apartment.getPrice)),format.raw/*20.56*/("""
			"""),format.raw/*21.4*/("""<br><br>
			<script
			  src="https://checkout.stripe.com/checkout.js"
			  class="stripe-button"
			  data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
			  data-name="Deposit"
			  data-description="Deposit (&euro;"""),_display_(/*27.40*/apartment/*27.49*/.getPrice),format.raw/*27.58*/(""")"
			  data-amount=""""),_display_(/*28.20*/apartment/*28.29*/.convertStripeNum(apartment.getPrice)),format.raw/*28.66*/(""""
			</script>
		</div>
	</div>
""")))}))
      }
    }
  }

  def render(apartment:models.Apartment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(apartment,user)

  def f:((models.Apartment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (apartment,user) => apply(apartment,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 01 04:59:27 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/viewApartment.scala.html
                  HASH: 1407c909004465da1dba6a7ad3b3517c75aef3d4
                  MATRIX: 984->1|1132->57|1167->84|1206->86|1234->88|1319->147|1336->156|1369->169|1540->314|1558->323|1590->334|1622->339|1740->431|1758->440|1791->452|1823->457|1946->553|1964->562|2021->598|2052->602|2290->813|2308->822|2338->831|2387->853|2405->862|2463->899
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|51->20|51->20|51->20|52->21|58->27|58->27|58->27|59->28|59->28|59->28
                  -- GENERATED --
              */
          