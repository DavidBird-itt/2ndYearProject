
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
				<a class="navbar-brand" href=""""),_display_(/*25.36*/routes/*25.42*/.HomeController.index()),format.raw/*25.65*/("""">ADK Houses</a>
			</div>
			<ul class="nav navbar-nav">
				<li """),_display_(/*28.10*/if(pagename== "Home")/*28.31*/{_display_(Seq[Any](format.raw/*28.32*/("""class="active"""")))}),format.raw/*28.47*/("""><a href=""""),_display_(/*28.58*/routes/*28.64*/.HomeController.index()),format.raw/*28.87*/("""">Home</a></li>
				<li """),_display_(/*29.10*/if(pagename == "Database")/*29.36*/{_display_(Seq[Any](format.raw/*29.37*/("""class="active"""")))}),format.raw/*29.52*/("""><a href=""""),_display_(/*29.63*/routes/*29.69*/.HomeController.database()),format.raw/*29.95*/("""">House List</a></li>
				"""),_display_(/*30.6*/if((user != null) && ("admin".equals(user.getRole())))/*30.60*/ {_display_(Seq[Any](format.raw/*30.62*/("""
					"""),format.raw/*31.6*/("""<li """),_display_(/*31.11*/if(pagename == "Landlords")/*31.38*/ {_display_(Seq[Any](format.raw/*31.40*/("""class="active"""")))}),format.raw/*31.55*/("""><a href=""""),_display_(/*31.66*/routes/*31.72*/.HomeController.viewUsers()),format.raw/*31.99*/("""">View Landlords</a></li>
				""")))}),format.raw/*32.6*/("""
				"""),format.raw/*33.5*/("""<li """),_display_(/*33.10*/if(pagename == "Login")/*33.33*/{_display_(Seq[Any](format.raw/*33.34*/("""class="active"""")))}),format.raw/*33.49*/(""">
				"""),_display_(/*34.6*/if(user != null)/*34.22*/{_display_(Seq[Any](format.raw/*34.23*/("""
					"""),format.raw/*35.6*/("""<a href=""""),_display_(/*35.16*/routes/*35.22*/.LoginController.logout()),format.raw/*35.47*/("""">Log Out</a></li>
				""")))}/*36.7*/else/*36.12*/{_display_(Seq[Any](format.raw/*36.13*/("""
						"""),format.raw/*37.7*/("""<a href=""""),_display_(/*37.17*/routes/*37.23*/.LoginController.login()),format.raw/*37.47*/("""">Log In</a>
				""")))}),format.raw/*38.6*/("""
					
			"""),format.raw/*40.4*/("""</ul>
		
			
			  
			
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*53.7*/content),format.raw/*53.14*/("""
				"""),format.raw/*54.5*/("""</div>
			</div>
		</div>
	</div>
</body>
<script src=""""),_display_(/*59.15*/routes/*59.21*/.Assets.versioned(" javascripts/main.js")),format.raw/*59.62*/(""""> </script> </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 15 16:32:37 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: 4ab4194a1b0b217bb6d7474fbef0e2884ce16b4b
                  MATRIX: 970->1|1122->60|1191->103|1219->111|1855->720|1870->726|1932->767|2132->940|2147->946|2191->969|2285->1036|2315->1057|2354->1058|2400->1073|2438->1084|2453->1090|2497->1113|2549->1138|2584->1164|2623->1165|2669->1180|2707->1191|2722->1197|2769->1223|2822->1250|2885->1304|2925->1306|2958->1312|2990->1317|3026->1344|3066->1346|3112->1361|3150->1372|3165->1378|3213->1405|3274->1436|3306->1441|3338->1446|3370->1469|3409->1470|3455->1485|3488->1492|3513->1508|3552->1509|3585->1515|3622->1525|3637->1531|3683->1556|3725->1581|3738->1586|3777->1587|3811->1594|3848->1604|3863->1610|3908->1634|3956->1652|3993->1662|4170->1813|4198->1820|4230->1825|4313->1881|4328->1887|4390->1928
                  LINES: 28->1|33->2|36->5|36->5|47->16|47->16|47->16|56->25|56->25|56->25|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|71->40|84->53|84->53|85->54|90->59|90->59|90->59
                  -- GENERATED --
              */
          