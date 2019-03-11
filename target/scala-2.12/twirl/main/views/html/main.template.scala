
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
		"""),format.raw/*44.3*/("""</style>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*52.60*/routes/*52.66*/.HomeController.index()),format.raw/*52.89*/("""">ADK Houses</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*55.34*/if(pagename== "Home")/*55.55*/{_display_(Seq[Any](format.raw/*55.56*/("""class="active"""")))}),format.raw/*55.71*/("""><a href=""""),_display_(/*55.82*/routes/*55.88*/.HomeController.index()),format.raw/*55.111*/("""">Home</a></li>
                            <li """),_display_(/*56.34*/if(pagename == "Payment")/*56.59*/{_display_(Seq[Any](format.raw/*56.60*/("""class="active"""")))}),format.raw/*56.75*/("""><a href=""""),_display_(/*56.86*/routes/*56.92*/.HomeController.payment()),format.raw/*56.117*/("""">Payment</a></li>
							<li """),_display_(/*57.13*/if(pagename == "Database")/*57.39*/{_display_(Seq[Any](format.raw/*57.40*/("""class="active"""")))}),format.raw/*57.55*/("""><a href=""""),_display_(/*57.66*/routes/*57.72*/.HomeController.database()),format.raw/*57.98*/("""">Database</a></li>
							<li """),_display_(/*58.13*/if(pagename == "Login")/*58.36*/{_display_(Seq[Any](format.raw/*58.37*/("""class="active"""")))}),format.raw/*58.52*/(""">
								"""),_display_(/*59.10*/if((user != null) && ("LandLord".equals(user.getRole())))/*59.67*/ {_display_(Seq[Any](format.raw/*59.69*/("""
									"""),format.raw/*60.10*/("""<li """),_display_(/*60.15*/if(pagename == "LandLords")/*60.42*/ {_display_(Seq[Any](format.raw/*60.44*/("""class="active"""")))}),format.raw/*60.59*/("""><a href=""""),_display_(/*60.70*/routes/*60.76*/.HomeController.usersLandLord()),format.raw/*60.107*/("""">View LandLords</a></li>
									<a href=""""),_display_(/*61.20*/routes/*61.26*/.LoginController.logout()),format.raw/*61.51*/("""">Log Out</a></li>
								""")))}/*62.11*/else/*62.16*/{_display_(Seq[Any](format.raw/*62.17*/("""
									"""),format.raw/*63.10*/("""<a href=""""),_display_(/*63.20*/routes/*63.26*/.LoginController.login()),format.raw/*63.50*/("""">Log In</a>
								""")))}),format.raw/*64.10*/("""
                        """),format.raw/*65.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*68.10*/content),format.raw/*68.17*/("""
    """),format.raw/*69.5*/("""</body>
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("javascripts/main.js")),format.raw/*70.65*/(""""></script>
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
                  DATE: Mon Mar 11 13:20:54 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/main.scala.html
                  HASH: 04e47118dbf2feefd41a0f2e39980d2ca39e2574
                  MATRIX: 970->1|1122->60|1193->105|1221->113|1361->225|1390->226|1422->231|1525->307|1553->308|1584->312|1624->324|1653->325|1685->330|1786->404|1814->405|1845->409|1889->425|1918->426|1950->431|2026->480|2054->481|2085->485|2140->512|2169->513|2201->518|2271->561|2299->562|2330->566|2378->586|2407->587|2439->592|2482->608|2510->609|2541->613|2582->626|2611->627|2643->632|2686->648|2714->649|2745->653|2780->660|2809->661|2841->666|3029->827|3057->828|3087->831|3563->1280|3578->1286|3622->1309|3782->1442|3812->1463|3851->1464|3897->1479|3935->1490|3950->1496|3995->1519|4071->1568|4105->1593|4144->1594|4190->1609|4228->1620|4243->1626|4290->1651|4348->1682|4383->1708|4422->1709|4468->1724|4506->1735|4521->1741|4568->1767|4627->1799|4659->1822|4698->1823|4744->1838|4782->1849|4848->1906|4888->1908|4926->1918|4958->1923|4994->1950|5034->1952|5080->1967|5118->1978|5133->1984|5186->2015|5258->2060|5273->2066|5319->2091|5366->2120|5379->2125|5418->2126|5456->2136|5493->2146|5508->2152|5553->2176|5606->2198|5659->2223|5751->2288|5779->2295|5811->2300|5864->2326|5879->2332|5940->2372
                  LINES: 28->1|33->2|36->5|36->5|41->10|41->10|42->11|45->14|45->14|46->15|46->15|46->15|47->16|50->19|50->19|51->20|51->20|51->20|52->21|55->24|55->24|56->25|56->25|56->25|57->26|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|66->35|66->35|67->36|74->43|74->43|75->44|83->52|83->52|83->52|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|96->65|99->68|99->68|100->69|101->70|101->70|101->70
                  -- GENERATED --
              */
          