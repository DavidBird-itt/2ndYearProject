
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
	<title>ADK """),_display_(/*5.14*/pagename),format.raw/*5.22*/("""</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Bootsrap and Font Awesome-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
		integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Custom styles for this template (In the public Folder) -->
    <link href=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.65*/("""" rel="stylesheet">

</head>

<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href=""""),_display_(/*24.36*/routes/*24.42*/.HomeController.index()),format.raw/*24.65*/("""">ADK Houses</a>
			</div>
			<ul class="nav navbar-nav">
				<li """),_display_(/*27.10*/if(pagename== "Home")/*27.31*/{_display_(Seq[Any](format.raw/*27.32*/("""class="active"""")))}),format.raw/*27.47*/("""><a href=""""),_display_(/*27.58*/routes/*27.64*/.HomeController.index()),format.raw/*27.87*/("""">Home</a></li>
				<li """),_display_(/*28.10*/if(pagename == "Properties")/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/("""class="active"""")))}),format.raw/*28.54*/("""><a href=""""),_display_(/*28.65*/routes/*28.71*/.HomeController.properties(0)),format.raw/*28.100*/("""">Properties</a></li>
				"""),_display_(/*29.6*/if((user != null) && ("admin".equals(user.getRole())))/*29.60*/ {_display_(Seq[Any](format.raw/*29.62*/("""
					"""),format.raw/*30.6*/("""<li """),_display_(/*30.11*/if(pagename == "Landlords")/*30.38*/ {_display_(Seq[Any](format.raw/*30.40*/("""class="active"""")))}),format.raw/*30.55*/("""><a href=""""),_display_(/*30.66*/routes/*30.72*/.HomeController.viewUsers()),format.raw/*30.99*/("""">View Users</a></li>
				""")))}),format.raw/*31.6*/("""
				"""),format.raw/*32.5*/("""</ul>

				<ul class="nav navbar-nav navbar-right">
				"""),_display_(/*35.6*/if((user != null) && ("member".equals(user.getRole())))/*35.61*/ {_display_(Seq[Any](format.raw/*35.63*/("""
					"""),format.raw/*36.6*/("""<li """),_display_(/*36.11*/if(pagename == "Member Proile")/*36.42*/{_display_(Seq[Any](format.raw/*36.43*/("""class="active"""")))}),format.raw/*36.58*/("""><a href=""""),_display_(/*36.69*/routes/*36.75*/.HomeController.memberProfile(user.getEmail())),format.raw/*36.121*/(""""><i class="fas fa-user"></i>Profile</a></li>
				""")))}),format.raw/*37.6*/("""
				"""),_display_(/*38.6*/if((user != null) && ("landlord".equals(user.getRole())))/*38.63*/ {_display_(Seq[Any](format.raw/*38.65*/("""
					"""),format.raw/*39.6*/("""<li """),_display_(/*39.11*/if(pagename == "Landlord Proile")/*39.44*/{_display_(Seq[Any](format.raw/*39.45*/("""class="active"""")))}),format.raw/*39.60*/("""><a href=""""),_display_(/*39.71*/routes/*39.77*/.HomeController.landlordProfile(user.getEmail())),format.raw/*39.125*/(""""><i class="fas fa-user"></i>Profile</a></li>
				""")))}),format.raw/*40.6*/("""
				"""),format.raw/*41.5*/("""<li """),_display_(/*41.10*/if(pagename == "Login")/*41.33*/{_display_(Seq[Any](format.raw/*41.34*/("""class="active"""")))}),format.raw/*41.49*/(""">
				"""),_display_(/*42.6*/if(user != null)/*42.22*/{_display_(Seq[Any](format.raw/*42.23*/("""
					"""),format.raw/*43.6*/("""<a href=""""),_display_(/*43.16*/routes/*43.22*/.LoginController.logout()),format.raw/*43.47*/("""">Logout</a></li>
				""")))}/*44.7*/else/*44.12*/{_display_(Seq[Any](format.raw/*44.13*/("""
					"""),format.raw/*45.6*/("""<a href=""""),_display_(/*45.16*/routes/*45.22*/.LoginController.login()),format.raw/*45.46*/("""">Login</a></li>
				""")))}),format.raw/*46.6*/("""
					
			"""),format.raw/*48.4*/("""</ul>
		
			
			  
			
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*61.7*/content),format.raw/*61.14*/("""
				"""),format.raw/*62.5*/("""</div>
			</div>
		</div>
	</div>
</body>
<script src=""""),_display_(/*67.15*/routes/*67.21*/.Assets.versioned(" javascripts/main.js")),format.raw/*67.62*/(""""> </script> </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 15:04:15 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: 160836f0b6a5a5b5bd98ce9ddd5ba10102ec8eda
                  MATRIX: 970->1|1122->60|1191->103|1219->111|1855->720|1870->726|1932->767|2131->939|2146->945|2190->968|2284->1035|2314->1056|2353->1057|2399->1072|2437->1083|2452->1089|2496->1112|2548->1137|2585->1165|2624->1166|2670->1181|2708->1192|2723->1198|2774->1227|2827->1254|2890->1308|2930->1310|2963->1316|2995->1321|3031->1348|3071->1350|3117->1365|3155->1376|3170->1382|3218->1409|3275->1436|3307->1441|3390->1498|3454->1553|3494->1555|3527->1561|3559->1566|3599->1597|3638->1598|3684->1613|3722->1624|3737->1630|3805->1676|3886->1727|3918->1733|3984->1790|4024->1792|4057->1798|4089->1803|4131->1836|4170->1837|4216->1852|4254->1863|4269->1869|4339->1917|4420->1968|4452->1973|4484->1978|4516->2001|4555->2002|4601->2017|4634->2024|4659->2040|4698->2041|4731->2047|4768->2057|4783->2063|4829->2088|4870->2112|4883->2117|4922->2118|4955->2124|4992->2134|5007->2140|5052->2164|5104->2186|5141->2196|5318->2347|5346->2354|5378->2359|5461->2415|5476->2421|5538->2462
                  LINES: 28->1|33->2|36->5|36->5|47->16|47->16|47->16|55->24|55->24|55->24|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|63->32|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|79->48|92->61|92->61|93->62|98->67|98->67|98->67
                  -- GENERATED --
              */
          