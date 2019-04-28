
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.products.Property],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recent: List[models.products.Property], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home", user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
		"""),format.raw/*3.3*/("""<div class="just">
		<div id="search-form">
			<form action="/searchQuery" method="get">
				<span class="title">Search Properties</span>

				<!--Area<br>
				<select>
					<option value="dublin1">Dublin 1</option>
					<option value="dublin2">Dublin 2</option>
					<option value="dublin3">Dublin 3</option>
					<option value="dublin4">Dublin 4</option>
					<option value="dublin5">Dublin 5</option>
					<option value="dublin6">Dublin 6</option>
					<option value="dublin7">Dublin 7</option>
					<option value="dublin8">Dublin 8</option>
					<option value="dublin9">Dublin 9</option>
					<option value="dublin10">Dublin 10</option>
					<option value="dublin11">Dublin 11</option>
					<option value="dublin12">Dublin 12</option>
					<option value="dublin13">Dublin 13</option>
					<option value="dublin14">Dublin 14</option>
					<option value="dublin15">Dublin 15</option>
					<option value="dublin16">Dublin 16</option>
					<option value="dublin17">Dublin 17</option>
					<option value="dublin18">Dublin 18</option>
					<option value="dublin19">Dublin 19</option>
					<option value="dublin20">Dublin 20</option>
					<option value="dublin21">Dublin 21</option>
					<option value="dublin22">Dublin 22</option>
					<option value="dublin23">Dublin 23</option>
					<option value="dublin24">Dublin 24</option>
				</select>
				<br><br>-->
				Minimum Price<br>
				€ <input type="number" placeholder="Enter minimum price" name="min" min="0" max="1000000000" required/>

				<br><br>
				Maximum Price<br>
				€ <input type="number" placeholder="Enter maximum price" name="max" min="0" max="1000000000" required/>

				<br><br>
				<input type="submit" value="Search" />
			</form>
		</div>
	</div>
	<br>
	<div class="just">
		<h2>Recently Added Houses</h2>
	</div>
	<div class="just">
		<div id="house-list">
			"""),_display_(/*54.5*/for(house<-recent) yield /*54.23*/ {_display_(Seq[Any](format.raw/*54.25*/("""
				"""),format.raw/*55.5*/("""<div class="house-block">

					<a href=""""),_display_(/*57.16*/routes/*57.22*/.HomeController.viewProperty(house.getId)),format.raw/*57.63*/(""""><img src=""""),_display_(/*57.76*/house/*57.81*/.getThumbnailPath()),format.raw/*57.100*/("""" /></a>
					<div class="desc">
						€"""),_display_(/*59.9*/house/*59.14*/.getDisplayValue(house.getPrice)),format.raw/*59.46*/("""
						"""),format.raw/*60.7*/("""<br>
						<br>
						<a href=""""),_display_(/*62.17*/routes/*62.23*/.HomeController.viewProperty(house.getId)),format.raw/*62.64*/("""">View House</a>
					</div>
				</div>
			""")))}),format.raw/*65.5*/("""
		"""),format.raw/*66.3*/("""</div>
	</div>
	""")))}))
      }
    }
  }

  def render(recent:List[models.products.Property],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(recent,user)

  def f:((List[models.products.Property],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (recent,user) => apply(recent,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:33:24 CEST 2019
                  SOURCE: /home/wdd/collegeLastThisOneActually/PlayReminder/app/views/index.scala.html
                  HASH: 0fb4c6f051111cd20ba3ca149998b94aceddca18
                  MATRIX: 990->1|1149->68|1175->86|1213->87|1242->90|3099->1921|3133->1939|3173->1941|3205->1946|3274->1988|3289->1994|3351->2035|3391->2048|3405->2053|3446->2072|3513->2113|3527->2118|3580->2150|3614->2157|3673->2189|3688->2195|3750->2236|3824->2280|3854->2283
                  LINES: 28->1|33->2|33->2|33->2|34->3|85->54|85->54|85->54|86->55|88->57|88->57|88->57|88->57|88->57|88->57|90->59|90->59|90->59|91->60|93->62|93->62|93->62|96->65|97->66
                  -- GENERATED --
              */
          