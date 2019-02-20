
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
				color:white;
				text-align:center;
				padding-bottom:1em;
			"""),format.raw/*15.4*/("""}"""),format.raw/*15.5*/("""
			"""),format.raw/*16.4*/("""#slide-show """),format.raw/*16.16*/("""{"""),format.raw/*16.17*/("""
				"""),format.raw/*17.5*/("""background-color:#d5f1ef;
				height:350px;
				/*margin-left:150px;*/
			"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/("""
			"""),format.raw/*21.4*/("""#slide-show img """),format.raw/*21.20*/("""{"""),format.raw/*21.21*/("""
				"""),format.raw/*22.5*/("""height:100%;
				width:350px;
				float:left;
			"""),format.raw/*25.4*/("""}"""),format.raw/*25.5*/("""
			"""),format.raw/*26.4*/("""#slide-show .property-text """),format.raw/*26.31*/("""{"""),format.raw/*26.32*/("""
				"""),format.raw/*27.5*/("""background-color:green;
				height:70%;
			"""),format.raw/*29.4*/("""}"""),format.raw/*29.5*/("""
			"""),format.raw/*30.4*/("""#search-form select """),format.raw/*30.24*/("""{"""),format.raw/*30.25*/("""
				"""),format.raw/*31.5*/("""color:black;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
			"""),format.raw/*33.4*/(""".title """),format.raw/*33.11*/("""{"""),format.raw/*33.12*/("""
				"""),format.raw/*34.5*/("""display:block;
				color:white;
				text-align:center;
				background-color:rgba(0,0,0,0.2);
				padding:0.7em;
				font-size:1.2em;
				margin-bottom:0.4em;
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""
		"""),format.raw/*42.3*/("""</style>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*50.60*/routes/*50.66*/.HomeController.index()),format.raw/*50.89*/("""">ADK Houses</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*53.34*/if(pagename== "Home")/*53.55*/{_display_(Seq[Any](format.raw/*53.56*/("""class="active"""")))}),format.raw/*53.71*/("""><a href=""""),_display_(/*53.82*/routes/*53.88*/.HomeController.index()),format.raw/*53.111*/("""">Home</a></li>
                            <li """),_display_(/*54.34*/if(pagename == "Payment")/*54.59*/{_display_(Seq[Any](format.raw/*54.60*/("""class="active"""")))}),format.raw/*54.75*/("""><a href=""""),_display_(/*54.86*/routes/*54.92*/.HomeController.payment()),format.raw/*54.117*/("""">Payment</a></li>
							<li """),_display_(/*55.13*/if(pagename == "Database")/*55.39*/{_display_(Seq[Any](format.raw/*55.40*/("""class="active"""")))}),format.raw/*55.55*/("""><a href=""""),_display_(/*55.66*/routes/*55.72*/.HomeController.database()),format.raw/*55.98*/("""">Database</a></li>
							<li """),_display_(/*56.13*/if(pagename == "Login")/*56.36*/{_display_(Seq[Any](format.raw/*56.37*/("""class="active"""")))}),format.raw/*56.52*/(""">
								"""),_display_(/*57.10*/if(user != null)/*57.26*/ {_display_(Seq[Any](format.raw/*57.28*/("""
									"""),format.raw/*58.10*/("""<a href=""""),_display_(/*58.20*/routes/*58.26*/.LoginController.logout()),format.raw/*58.51*/("""">Log Out</a></li>
								""")))}/*59.11*/else/*59.16*/{_display_(Seq[Any](format.raw/*59.17*/("""
									"""),format.raw/*60.10*/("""<a href=""""),_display_(/*60.20*/routes/*60.26*/.LoginController.login()),format.raw/*60.50*/("""">Log In</a>
								""")))}),format.raw/*61.10*/("""
                        """),format.raw/*62.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*65.10*/content),format.raw/*65.17*/("""
    """),format.raw/*66.5*/("""</body>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("javascripts/main.js")),format.raw/*67.65*/(""""></script>
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
                  DATE: Tue Feb 19 14:36:50 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: 5a9bbee27fa2456ee826010f256d342186e9ffb8
                  MATRIX: 970->1|1122->60|1193->105|1221->113|1361->225|1390->226|1422->231|1542->324|1570->325|1601->329|1641->341|1670->342|1702->347|1803->421|1831->422|1862->426|1906->442|1935->443|1967->448|2043->497|2071->498|2102->502|2157->529|2186->530|2218->535|2288->578|2316->579|2347->583|2395->603|2424->604|2456->609|2499->625|2527->626|2558->630|2593->637|2622->638|2654->643|2842->804|2870->805|2900->808|3376->1257|3391->1263|3435->1286|3595->1419|3625->1440|3664->1441|3710->1456|3748->1467|3763->1473|3808->1496|3884->1545|3918->1570|3957->1571|4003->1586|4041->1597|4056->1603|4103->1628|4161->1659|4196->1685|4235->1686|4281->1701|4319->1712|4334->1718|4381->1744|4440->1776|4472->1799|4511->1800|4557->1815|4595->1826|4620->1842|4660->1844|4698->1854|4735->1864|4750->1870|4796->1895|4843->1924|4856->1929|4895->1930|4933->1940|4970->1950|4985->1956|5030->1980|5083->2002|5136->2027|5228->2092|5256->2099|5288->2104|5341->2130|5356->2136|5417->2176
                  LINES: 28->1|33->2|36->5|36->5|41->10|41->10|42->11|46->15|46->15|47->16|47->16|47->16|48->17|51->20|51->20|52->21|52->21|52->21|53->22|56->25|56->25|57->26|57->26|57->26|58->27|60->29|60->29|61->30|61->30|61->30|62->31|63->32|63->32|64->33|64->33|64->33|65->34|72->41|72->41|73->42|81->50|81->50|81->50|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|93->62|96->65|96->65|97->66|98->67|98->67|98->67
                  -- GENERATED --
              */
          