
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<title>ADK """),_display_(/*5.15*/pagename),format.raw/*5.23*/("""</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<style>
			#search-form """),format.raw/*10.17*/("""{"""),format.raw/*10.18*/("""
				"""),format.raw/*11.5*/("""background-color:#1f9a95;
				text-align:center;
				padding-bottom:1em;
			"""),format.raw/*14.4*/("""}"""),format.raw/*14.5*/("""
			"""),format.raw/*15.4*/("""#slide-show """),format.raw/*15.16*/("""{"""),format.raw/*15.17*/("""
				"""),format.raw/*16.5*/("""background-color:#d5f1ef;
				height:350px;
				/*margin-left:150px;*/
			"""),format.raw/*19.4*/("""}"""),format.raw/*19.5*/("""
			"""),format.raw/*20.4*/("""#slide-show img """),format.raw/*20.20*/("""{"""),format.raw/*20.21*/("""
				"""),format.raw/*21.5*/("""height:100%;
				width:350px;
				float:left;
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/("""
			"""),format.raw/*25.4*/("""#slide-show .property-text """),format.raw/*25.31*/("""{"""),format.raw/*25.32*/("""
				"""),format.raw/*26.5*/("""background-color:green;
				height:70%;
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
			"""),format.raw/*29.4*/("""#search-form select """),format.raw/*29.24*/("""{"""),format.raw/*29.25*/("""
				"""),format.raw/*30.5*/("""color:black;
			"""),format.raw/*31.4*/("""}"""),format.raw/*31.5*/("""
			"""),format.raw/*32.4*/(""".white-label """),format.raw/*32.17*/("""{"""),format.raw/*32.18*/("""
				"""),format.raw/*33.5*/("""color:white;
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""
			"""),format.raw/*35.4*/(""".title """),format.raw/*35.11*/("""{"""),format.raw/*35.12*/("""
				"""),format.raw/*36.5*/("""display:block;
				color:white;
				text-align:center;
				background-color:rgba(0,0,0,0.2);
				padding:0.7em;
				font-size:1.2em;
				margin-bottom:0.4em;
			"""),format.raw/*43.4*/("""}"""),format.raw/*43.5*/("""

			"""),format.raw/*45.4*/(""".midcol h1"""),format.raw/*45.14*/("""{"""),format.raw/*45.15*/("""
				"""),format.raw/*46.5*/("""text-align: center;
				font-weight: bold;
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/("""
		"""),format.raw/*49.3*/("""</style>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*57.60*/routes/*57.66*/.HomeController.index()),format.raw/*57.89*/("""">ADK Houses</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*60.34*/if(pagename== "Home")/*60.55*/{_display_(Seq[Any](format.raw/*60.56*/("""class="active"""")))}),format.raw/*60.71*/("""><a href=""""),_display_(/*60.82*/routes/*60.88*/.HomeController.index()),format.raw/*60.111*/("""">Home</a></li>
                            <li """),_display_(/*61.34*/if(pagename == "Payment")/*61.59*/{_display_(Seq[Any](format.raw/*61.60*/("""class="active"""")))}),format.raw/*61.75*/("""><a href=""""),_display_(/*61.86*/routes/*61.92*/.HomeController.payment()),format.raw/*61.117*/("""">Payment</a></li>
							<li """),_display_(/*62.13*/if(pagename == "Database")/*62.39*/{_display_(Seq[Any](format.raw/*62.40*/("""class="active"""")))}),format.raw/*62.55*/("""><a href=""""),_display_(/*62.66*/routes/*62.72*/.HomeController.database()),format.raw/*62.98*/("""">Database</a></li>
							<li """),_display_(/*63.13*/if(pagename == "Login")/*63.36*/{_display_(Seq[Any](format.raw/*63.37*/("""class="active"""")))}),format.raw/*63.52*/(""">
							"""),_display_(/*64.9*/if((user != null) && ("LandLord".equals(user.getRole())))/*64.66*/ {_display_(Seq[Any](format.raw/*64.68*/("""
								"""),format.raw/*65.9*/("""<li """),_display_(/*65.14*/if(pagename == "Landlords")/*65.41*/ {_display_(Seq[Any](format.raw/*65.43*/("""class="active"""")))}),format.raw/*65.58*/("""><a href=""""),_display_(/*65.69*/routes/*65.75*/.HomeController.landlord()),format.raw/*65.101*/("""">View Landlords</a></li>
							""")))}),format.raw/*66.9*/("""
							"""),_display_(/*67.9*/if((user != null) && ("Member".equals(user.getRole())))/*67.64*/ {_display_(Seq[Any](format.raw/*67.66*/("""
								"""),format.raw/*68.9*/("""<li """),_display_(/*68.14*/if(pagename == "RentDue")/*68.39*/ {_display_(Seq[Any](format.raw/*68.41*/("""class="active"""")))}),format.raw/*68.56*/("""><a href=""""),_display_(/*68.67*/routes/*68.73*/.RentCtrl.viewRent()),format.raw/*68.93*/("""">Rent Due</a></li>	
							""")))}),format.raw/*69.9*/("""
							"""),_display_(/*70.9*/if(user != null)/*70.25*/{_display_(Seq[Any](format.raw/*70.26*/("""
								"""),format.raw/*71.9*/("""<a href=""""),_display_(/*71.19*/routes/*71.25*/.LoginController.logout()),format.raw/*71.50*/("""">Log Out</a></li>
							""")))}/*72.10*/else/*72.15*/{_display_(Seq[Any](format.raw/*72.16*/("""
									"""),format.raw/*73.10*/("""<a href=""""),_display_(/*73.20*/routes/*73.26*/.LoginController.login()),format.raw/*73.50*/("""">Log In</a>
							""")))}),format.raw/*74.9*/("""
								
                        """),format.raw/*76.25*/("""</ul>
                    </div>
                </nav>

				<div class = "container-fluid">
					<div class = "row">
						<div class = "col-sm-12">
							<div class = "midcol">
        						"""),_display_(/*84.16*/content),format.raw/*84.23*/("""
							"""),format.raw/*85.8*/("""</div>
						</div>
					</div>
				</div>
    </body>
    <script src=""""),_display_(/*90.19*/routes/*90.25*/.Assets.versioned("javascripts/main.js")),format.raw/*90.65*/(""""></script>
</html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 27 09:06:27 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: 9a3cceaaaa5b1977cf77dbc296eed12805868bc0
                  MATRIX: 970->1|1122->60|1193->105|1221->113|1361->225|1390->226|1422->231|1525->307|1553->308|1584->312|1624->324|1653->325|1685->330|1786->404|1814->405|1845->409|1889->425|1918->426|1950->431|2026->480|2054->481|2085->485|2140->512|2169->513|2201->518|2271->561|2299->562|2330->566|2378->586|2407->587|2439->592|2482->608|2510->609|2541->613|2582->626|2611->627|2643->632|2686->648|2714->649|2745->653|2780->660|2809->661|2841->666|3029->827|3057->828|3089->833|3127->843|3156->844|3188->849|3261->895|3289->896|3319->899|3989->1542|4004->1548|4048->1571|4208->1704|4238->1725|4277->1726|4323->1741|4361->1752|4376->1758|4421->1781|4497->1830|4531->1855|4570->1856|4616->1871|4654->1882|4669->1888|4716->1913|4774->1944|4809->1970|4848->1971|4894->1986|4932->1997|4947->2003|4994->2029|5053->2061|5085->2084|5124->2085|5170->2100|5206->2110|5272->2167|5312->2169|5348->2178|5380->2183|5416->2210|5456->2212|5502->2227|5540->2238|5555->2244|5603->2270|5667->2304|5702->2313|5766->2368|5806->2370|5842->2379|5874->2384|5908->2409|5948->2411|5994->2426|6032->2437|6047->2443|6088->2463|6147->2492|6182->2501|6207->2517|6246->2518|6282->2527|6319->2537|6334->2543|6380->2568|6426->2596|6439->2601|6478->2602|6516->2612|6553->2622|6568->2628|6613->2652|6664->2673|6726->2707|6948->2902|6976->2909|7011->2917|7111->2990|7126->2996|7187->3036
                  LINES: 28->1|33->2|36->5|36->5|41->10|41->10|42->11|45->14|45->14|46->15|46->15|46->15|47->16|50->19|50->19|51->20|51->20|51->20|52->21|55->24|55->24|56->25|56->25|56->25|57->26|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|66->35|66->35|67->36|74->43|74->43|76->45|76->45|76->45|77->46|79->48|79->48|80->49|88->57|88->57|88->57|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|100->69|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|107->76|115->84|115->84|116->85|121->90|121->90|121->90
                  -- GENERATED --
              */
          