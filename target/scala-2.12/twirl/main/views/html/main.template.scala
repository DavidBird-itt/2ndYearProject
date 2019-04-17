
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
				<li """),_display_(/*30.10*/if(pagename == "Database")/*30.36*/{_display_(Seq[Any](format.raw/*30.37*/("""class="active"""")))}),format.raw/*30.52*/("""><a href=""""),_display_(/*30.63*/routes/*30.69*/.HomeController.database()),format.raw/*30.95*/("""">House List</a></li>
				"""),_display_(/*31.6*/if((user != null) && ("admin".equals(user.getRole())))/*31.60*/ {_display_(Seq[Any](format.raw/*31.62*/("""
					"""),format.raw/*32.6*/("""<li """),_display_(/*32.11*/if(pagename == "Landlords")/*32.38*/ {_display_(Seq[Any](format.raw/*32.40*/("""class="active"""")))}),format.raw/*32.55*/("""><a href=""""),_display_(/*32.66*/routes/*32.72*/.HomeController.viewUsers()),format.raw/*32.99*/("""">View Landlords</a></li>
				""")))}),format.raw/*33.6*/("""
				"""),format.raw/*34.5*/("""<li """),_display_(/*34.10*/if(pagename == "Login")/*34.33*/{_display_(Seq[Any](format.raw/*34.34*/("""class="active"""")))}),format.raw/*34.49*/(""">
				"""),_display_(/*35.6*/if(user != null)/*35.22*/{_display_(Seq[Any](format.raw/*35.23*/("""
					"""),format.raw/*36.6*/("""<a href=""""),_display_(/*36.16*/routes/*36.22*/.LoginController.logout()),format.raw/*36.47*/("""">Log Out</a></li>
				""")))}/*37.7*/else/*37.12*/{_display_(Seq[Any](format.raw/*37.13*/("""
						"""),format.raw/*38.7*/("""<a href=""""),_display_(/*38.17*/routes/*38.23*/.LoginController.login()),format.raw/*38.47*/("""">Log In</a>
				""")))}),format.raw/*39.6*/("""
					
			"""),format.raw/*41.4*/("""</ul>
		
			
			  
			
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*54.7*/content),format.raw/*54.14*/("""
				"""),format.raw/*55.5*/("""</div>
			</div>
		</div>
	</div>
</body>
<script src=""""),_display_(/*60.15*/routes/*60.21*/.Assets.versioned(" javascripts/main.js")),format.raw/*60.62*/(""""> </script> </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 17 12:00:54 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: c14a1c488f31f189a284f5f6515192ad872506f8
                  MATRIX: 970->1|1122->60|1191->103|1219->111|1855->720|1870->726|1932->767|2133->941|2148->947|2192->970|2286->1037|2316->1058|2355->1059|2401->1074|2439->1085|2454->1091|2498->1114|2550->1139|2585->1165|2624->1166|2670->1181|2708->1192|2723->1198|2770->1224|2823->1251|2886->1305|2926->1307|2959->1313|2991->1318|3027->1345|3067->1347|3113->1362|3151->1373|3166->1379|3214->1406|3275->1437|3307->1442|3339->1447|3371->1470|3410->1471|3456->1486|3489->1493|3514->1509|3553->1510|3586->1516|3623->1526|3638->1532|3684->1557|3726->1582|3739->1587|3778->1588|3812->1595|3849->1605|3864->1611|3909->1635|3957->1653|3994->1663|4171->1814|4199->1821|4231->1826|4314->1882|4329->1888|4391->1929
                  LINES: 28->1|33->2|36->5|36->5|47->16|47->16|47->16|57->26|57->26|57->26|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|70->39|72->41|85->54|85->54|86->55|91->60|91->60|91->60
                  -- GENERATED --
              */
          