
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
				<a class="navbar-brand" href=""""),_display_(/*26.36*/routes/*26.42*/.HomeController.index()),format.raw/*26.65*/("""">ADK Houses</a>
			</div>
			<ul class="nav navbar-nav">
				<li """),_display_(/*29.10*/if(pagename== "Home")/*29.31*/{_display_(Seq[Any](format.raw/*29.32*/("""class="active"""")))}),format.raw/*29.47*/("""><a href=""""),_display_(/*29.58*/routes/*29.64*/.HomeController.index()),format.raw/*29.87*/("""">Home</a></li>
				<li """),_display_(/*30.10*/if(pagename == "Properties")/*30.38*/{_display_(Seq[Any](format.raw/*30.39*/("""class="active"""")))}),format.raw/*30.54*/("""><a href=""""),_display_(/*30.65*/routes/*30.71*/.HomeController.properties()),format.raw/*30.99*/("""">Properties</a></li>
				"""),_display_(/*31.6*/if((user != null) && ("admin".equals(user.getRole())))/*31.60*/ {_display_(Seq[Any](format.raw/*31.62*/("""
					"""),format.raw/*32.6*/("""<li """),_display_(/*32.11*/if(pagename == "Landlords")/*32.38*/ {_display_(Seq[Any](format.raw/*32.40*/("""class="active"""")))}),format.raw/*32.55*/("""><a href=""""),_display_(/*32.66*/routes/*32.72*/.HomeController.viewUsers()),format.raw/*32.99*/("""">View Landlords</a></li>
				""")))}),format.raw/*33.6*/("""
				"""),format.raw/*34.5*/("""<li """),_display_(/*34.10*/if(pagename == "Profile")/*34.35*/{_display_(Seq[Any](format.raw/*34.36*/("""class="active"""")))}),format.raw/*34.51*/("""><a href=""""),_display_(/*34.62*/routes/*34.68*/.HomeController.landlordProfile(user.getEmail())),format.raw/*34.116*/("""">Profile</a></li>
				<li """),_display_(/*35.10*/if(pagename == "Login")/*35.33*/{_display_(Seq[Any](format.raw/*35.34*/("""class="active"""")))}),format.raw/*35.49*/(""">
				"""),_display_(/*36.6*/if(user != null)/*36.22*/{_display_(Seq[Any](format.raw/*36.23*/("""
					"""),format.raw/*37.6*/("""<a href=""""),_display_(/*37.16*/routes/*37.22*/.LoginController.logout()),format.raw/*37.47*/("""">Log Out</a></li>
				""")))}/*38.7*/else/*38.12*/{_display_(Seq[Any](format.raw/*38.13*/("""
						"""),format.raw/*39.7*/("""<a href=""""),_display_(/*39.17*/routes/*39.23*/.LoginController.login()),format.raw/*39.47*/("""">Log In</a>
				""")))}),format.raw/*40.6*/("""
					
			"""),format.raw/*42.4*/("""</ul>
		
			
			  
			
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*55.7*/content),format.raw/*55.14*/("""
				"""),format.raw/*56.5*/("""</div>
			</div>
		</div>
	</div>
</body>
<script src=""""),_display_(/*61.15*/routes/*61.21*/.Assets.versioned(" javascripts/main.js")),format.raw/*61.62*/(""""> </script> </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 19 16:56:14 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: 5afbf403078c49353d141175f373a02e7c20eafb
                  MATRIX: 970->1|1122->60|1191->103|1219->111|1855->720|1870->726|1932->767|2133->941|2148->947|2192->970|2286->1037|2316->1058|2355->1059|2401->1074|2439->1085|2454->1091|2498->1114|2550->1139|2587->1167|2626->1168|2672->1183|2710->1194|2725->1200|2774->1228|2827->1255|2890->1309|2930->1311|2963->1317|2995->1322|3031->1349|3071->1351|3117->1366|3155->1377|3170->1383|3218->1410|3279->1441|3311->1446|3343->1451|3377->1476|3416->1477|3462->1492|3500->1503|3515->1509|3585->1557|3640->1585|3672->1608|3711->1609|3757->1624|3790->1631|3815->1647|3854->1648|3887->1654|3924->1664|3939->1670|3985->1695|4027->1720|4040->1725|4079->1726|4113->1733|4150->1743|4165->1749|4210->1773|4258->1791|4295->1801|4472->1952|4500->1959|4532->1964|4615->2020|4630->2026|4692->2067
                  LINES: 28->1|33->2|36->5|36->5|47->16|47->16|47->16|57->26|57->26|57->26|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|73->42|86->55|86->55|87->56|92->61|92->61|92->61
                  -- GENERATED --
              */
          