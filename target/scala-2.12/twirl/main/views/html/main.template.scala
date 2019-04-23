
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
				<li """),_display_(/*30.10*/if(pagename == "Properties")/*30.38*/{_display_(Seq[Any](format.raw/*30.39*/("""class="active"""")))}),format.raw/*30.54*/("""><a href=""""),_display_(/*30.65*/routes/*30.71*/.HomeController.properties(0)),format.raw/*30.100*/("""">Properties</a></li>
				"""),_display_(/*31.6*/if((user != null) && ("admin".equals(user.getRole())))/*31.60*/ {_display_(Seq[Any](format.raw/*31.62*/("""
					"""),format.raw/*32.6*/("""<li """),_display_(/*32.11*/if(pagename == "Landlords")/*32.38*/ {_display_(Seq[Any](format.raw/*32.40*/("""class="active"""")))}),format.raw/*32.55*/("""><a href=""""),_display_(/*32.66*/routes/*32.72*/.HomeController.viewUsers()),format.raw/*32.99*/("""">View Landlords</a></li>
				""")))}),format.raw/*33.6*/("""
				
				"""),format.raw/*35.5*/("""<li """),_display_(/*35.10*/if(pagename == "Login")/*35.33*/{_display_(Seq[Any](format.raw/*35.34*/("""class="active"""")))}),format.raw/*35.49*/(""">
				"""),_display_(/*36.6*/if(user != null)/*36.22*/{_display_(Seq[Any](format.raw/*36.23*/("""
					"""),format.raw/*37.6*/("""<a href=""""),_display_(/*37.16*/routes/*37.22*/.LoginController.logout()),format.raw/*37.47*/("""">Logout</a></li>
					<li """),_display_(/*38.11*/if(pagename == "Profile")/*38.36*/{_display_(Seq[Any](format.raw/*38.37*/("""class="active"""")))}),format.raw/*38.52*/("""><a href=""""),_display_(/*38.63*/routes/*38.69*/.HomeController.index()),format.raw/*38.92*/("""">Profile</a> </li>
				""")))}/*39.7*/else/*39.12*/{_display_(Seq[Any](format.raw/*39.13*/("""
					"""),format.raw/*40.6*/("""<a href=""""),_display_(/*40.16*/routes/*40.22*/.LoginController.login()),format.raw/*40.46*/("""">Login</a>
					
				""")))}),format.raw/*42.6*/("""
					
			"""),format.raw/*44.4*/("""</ul>
		
			
			  
			
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*57.7*/content),format.raw/*57.14*/("""
				"""),format.raw/*58.5*/("""</div>
			</div>
		</div>
	</div>
</body>
<script src=""""),_display_(/*63.15*/routes/*63.21*/.Assets.versioned(" javascripts/main.js")),format.raw/*63.62*/(""""> </script> </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 00:29:29 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: fb22ec1248f70be055410dfaf86b5581b09499d8
                  MATRIX: 970->1|1122->60|1191->103|1219->111|1855->720|1870->726|1932->767|2133->941|2148->947|2192->970|2286->1037|2316->1058|2355->1059|2401->1074|2439->1085|2454->1091|2498->1114|2550->1139|2587->1167|2626->1168|2672->1183|2710->1194|2725->1200|2776->1229|2829->1256|2892->1310|2932->1312|2965->1318|2997->1323|3033->1350|3073->1352|3119->1367|3157->1378|3172->1384|3220->1411|3281->1442|3318->1452|3350->1457|3382->1480|3421->1481|3467->1496|3500->1503|3525->1519|3564->1520|3597->1526|3634->1536|3649->1542|3695->1567|3750->1595|3784->1620|3823->1621|3869->1636|3907->1647|3922->1653|3966->1676|4009->1702|4022->1707|4061->1708|4094->1714|4131->1724|4146->1730|4191->1754|4244->1777|4281->1787|4458->1938|4486->1945|4518->1950|4601->2006|4616->2012|4678->2053
                  LINES: 28->1|33->2|36->5|36->5|47->16|47->16|47->16|57->26|57->26|57->26|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|73->42|75->44|88->57|88->57|89->58|94->63|94->63|94->63
                  -- GENERATED --
              */
          