
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
			"""),_display_(/*23.5*/if((user != null) && (property.getLandlord() == user) )/*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
				"""),_display_(/*24.6*/if(property.getStock() != 0)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
					"""),format.raw/*25.6*/("""<p>This Property is still currently on the market</p>
				""")))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
					"""),format.raw/*27.6*/("""<p>This Property is being rented</p>
					<p>Press button to Cancel this and add it back to the market</p>
					<p>
						<a href=""""),_display_(/*30.17*/routes/*30.23*/.HomeController.cancelRent(property.getId())),format.raw/*30.67*/("""">
							<button class="btn btn-primary">Cancel Rent</button>
						</a>
					</p>
				""")))}),format.raw/*34.6*/("""
			""")))}),format.raw/*35.5*/("""
			"""),_display_(/*36.5*/if((user !=null) &&("member".equals(user.getRole())))/*36.58*/{_display_(Seq[Any](format.raw/*36.59*/("""
				"""),format.raw/*37.5*/("""<a href=""""),_display_(/*37.15*/routes/*37.21*/.ShoppingCtrl.addToBasket(property.getId())),format.raw/*37.64*/("""">
					<button class="btn btn-primary">Rent the House</button>
				</a>
			""")))}),format.raw/*40.5*/("""
		"""),format.raw/*41.3*/("""</div>
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
                  DATE: Sun Apr 28 21:11:35 IST 2019
                  SOURCE: /home/wdd/temp/PlayReminder/app/views/viewProperty.scala.html
                  HASH: a9c3b00f08393cd45421e9b7b1c715667d9edffe
                  MATRIX: 991->1|1146->64|1181->91|1220->93|1248->95|1333->154|1349->162|1382->175|1549->316|1566->324|1598->335|1630->340|1748->432|1765->440|1798->452|1830->457|1946->546|1963->554|2019->589|2069->612|2086->620|2124->636|2177->663|2241->718|2281->720|2313->726|2350->754|2390->756|2423->762|2500->822|2513->827|2552->828|2585->834|2744->966|2759->972|2824->1016|2943->1105|2978->1110|3009->1115|3071->1168|3110->1169|3142->1174|3179->1184|3194->1190|3258->1233|3365->1310|3395->1313
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|41->10|41->10|41->10|42->11|45->14|45->14|45->14|46->15|52->21|52->21|52->21|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|61->30|61->30|61->30|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|71->40|72->41
                  -- GENERATED --
              */
          