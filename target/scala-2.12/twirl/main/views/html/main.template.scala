
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

				"""),format.raw/*35.5*/("""</ul>

				<ul class="nav navbar-nav navbar-right">
				"""),_display_(/*38.6*/if((user != null) && ("member".equals(user.getRole())))/*38.61*/ {_display_(Seq[Any](format.raw/*38.63*/("""
					"""),format.raw/*39.6*/("""<li """),_display_(/*39.11*/if(pagename == "Member Proile")/*39.42*/{_display_(Seq[Any](format.raw/*39.43*/("""class="active"""")))}),format.raw/*39.58*/("""><a href=""""),_display_(/*39.69*/routes/*39.75*/.HomeController.memberProfile(user.getEmail())),format.raw/*39.121*/(""""><i class="fas fa-user"></i>Profile</a></li>
				""")))}),format.raw/*40.6*/("""
				"""),_display_(/*41.6*/if((user != null) && ("landlord".equals(user.getRole())))/*41.63*/ {_display_(Seq[Any](format.raw/*41.65*/("""
					"""),format.raw/*42.6*/("""<li """),_display_(/*42.11*/if(pagename == "Landlord Proile")/*42.44*/{_display_(Seq[Any](format.raw/*42.45*/("""class="active"""")))}),format.raw/*42.60*/("""><a href=""""),_display_(/*42.71*/routes/*42.77*/.HomeController.landlordProfile(user.getEmail())),format.raw/*42.125*/(""""><i class="fas fa-user"></i>Profile</a></li>
				""")))}),format.raw/*43.6*/("""
				"""),format.raw/*44.5*/("""<li """),_display_(/*44.10*/if(pagename == "Login")/*44.33*/{_display_(Seq[Any](format.raw/*44.34*/("""class="active"""")))}),format.raw/*44.49*/(""">
				"""),_display_(/*45.6*/if(user != null)/*45.22*/{_display_(Seq[Any](format.raw/*45.23*/("""
					"""),format.raw/*46.6*/("""<a href=""""),_display_(/*46.16*/routes/*46.22*/.LoginController.logout()),format.raw/*46.47*/("""">Logout</a></li>
				""")))}/*47.7*/else/*47.12*/{_display_(Seq[Any](format.raw/*47.13*/("""
					"""),format.raw/*48.6*/("""<a href=""""),_display_(/*48.16*/routes/*48.22*/.LoginController.login()),format.raw/*48.46*/("""">Login</a></li>
				""")))}),format.raw/*49.6*/("""
					
			"""),format.raw/*51.4*/("""</ul>
		
			
			  
			
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*64.7*/content),format.raw/*64.14*/("""
				"""),format.raw/*65.5*/("""</div>
			</div>
		</div>
	</div>
</body>
<script src=""""),_display_(/*70.15*/routes/*70.21*/.Assets.versioned(" javascripts/main.js")),format.raw/*70.62*/(""""> </script> </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 23:12:50 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: b9a11538782ffddf19d4143ab2c4ceae8e0f2066
                  MATRIX: 970->1|1122->60|1191->103|1219->111|1855->720|1870->726|1932->767|2133->941|2148->947|2192->970|2286->1037|2316->1058|2355->1059|2401->1074|2439->1085|2454->1091|2498->1114|2550->1139|2587->1167|2626->1168|2672->1183|2710->1194|2725->1200|2776->1229|2829->1256|2892->1310|2932->1312|2965->1318|2997->1323|3033->1350|3073->1352|3119->1367|3157->1378|3172->1384|3220->1411|3281->1442|3314->1448|3397->1505|3461->1560|3501->1562|3534->1568|3566->1573|3606->1604|3645->1605|3691->1620|3729->1631|3744->1637|3812->1683|3893->1734|3925->1740|3991->1797|4031->1799|4064->1805|4096->1810|4138->1843|4177->1844|4223->1859|4261->1870|4276->1876|4346->1924|4427->1975|4459->1980|4491->1985|4523->2008|4562->2009|4608->2024|4641->2031|4666->2047|4705->2048|4738->2054|4775->2064|4790->2070|4836->2095|4877->2119|4890->2124|4929->2125|4962->2131|4999->2141|5014->2147|5059->2171|5111->2193|5148->2203|5325->2354|5353->2361|5385->2366|5468->2422|5483->2428|5545->2469
                  LINES: 28->1|33->2|36->5|36->5|47->16|47->16|47->16|57->26|57->26|57->26|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|66->35|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|82->51|95->64|95->64|96->65|101->70|101->70|101->70
                  -- GENERATED --
              */
          