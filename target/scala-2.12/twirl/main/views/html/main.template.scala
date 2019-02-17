
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
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="icon" type="image/png" href=""""),_display_(/*8.43*/routes/*8.49*/.Assets.versioned("images/favicon.png")),format.raw/*8.88*/("""">
	<style>
	 .footer """),format.raw/*10.11*/("""{"""),format.raw/*10.12*/(""" """),format.raw/*10.13*/("""font-weight: bold; color: white; background-color: black; i"""),format.raw/*10.72*/("""}"""),format.raw/*10.73*/("""
	 """),format.raw/*11.3*/(""".sidecol """),format.raw/*11.12*/("""{"""),format.raw/*11.13*/(""" """),format.raw/*11.14*/("""font-weight: bold; background-color: steelblue; """),format.raw/*11.62*/("""}"""),format.raw/*11.63*/("""
	 """),format.raw/*12.3*/(""".sidecol h2 """),format.raw/*12.15*/("""{"""),format.raw/*12.16*/(""" """),format.raw/*12.17*/("""font-weight: bold; """),format.raw/*12.36*/("""}"""),format.raw/*12.37*/("""
	 """),format.raw/*13.3*/(""".midcol h1 """),format.raw/*13.14*/("""{"""),format.raw/*13.15*/(""" """),format.raw/*13.16*/("""text-align: center; font-weight: bold; """),format.raw/*13.55*/("""}"""),format.raw/*13.56*/("""
	 """),format.raw/*14.3*/(""".midcol h3 """),format.raw/*14.14*/("""{"""),format.raw/*14.15*/(""" """),format.raw/*14.16*/("""text-align: center; color: steelblue; """),format.raw/*14.54*/("""}"""),format.raw/*14.55*/("""
	 """),format.raw/*15.3*/(""".redtext """),format.raw/*15.12*/("""{"""),format.raw/*15.13*/(""" """),format.raw/*15.14*/("""color: red; """),format.raw/*15.26*/("""}"""),format.raw/*15.27*/("""
	"""),format.raw/*16.2*/("""</style>
	<title>OFM """),_display_(/*17.14*/pagename),format.raw/*17.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*26.12*/if(pagename == "Home")/*26.34*/{_display_(Seq[Any](format.raw/*26.35*/("""class="active"""")))}),format.raw/*26.50*/("""><a href=""""),_display_(/*26.61*/routes/*26.67*/.HomeController.index()),format.raw/*26.90*/("""">Home</a></li>
		    <li """),_display_(/*27.12*/if(pagename == "On Sale")/*27.37*/{_display_(Seq[Any](format.raw/*27.38*/("""class="active"""")))}),format.raw/*27.53*/("""><a href=""""),_display_(/*27.64*/routes/*27.70*/.HomeController.onsale()),format.raw/*27.94*/("""">On Sale</a></li>
		    <li """),_display_(/*28.12*/if(pagename == "About Us")/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/("""class="active"""")))}),format.raw/*28.54*/("""><a href=""""),_display_(/*28.65*/routes/*28.71*/.HomeController.about()),format.raw/*28.94*/("""">About us</a></li>
		    <li """),_display_(/*29.12*/if(pagename == "Log In")/*29.36*/{_display_(Seq[Any](format.raw/*29.37*/("""class="active"""")))}),format.raw/*29.52*/(""">
				"""),_display_(/*30.6*/if(user != null)/*30.22*/ {_display_(Seq[Any](format.raw/*30.24*/("""
					"""),format.raw/*31.6*/("""<a href=""""),_display_(/*31.16*/routes/*31.22*/.LoginController.logout()),format.raw/*31.47*/("""">Log Out</a>
				""")))}/*32.7*/else/*32.12*/{_display_(Seq[Any](format.raw/*32.13*/("""
					"""),format.raw/*33.6*/("""<a href=""""),_display_(/*33.16*/routes/*33.22*/.LoginController.login()),format.raw/*33.46*/("""">Log In</a>
				""")))}),format.raw/*34.6*/("""					
			"""),format.raw/*35.4*/("""</li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
                """),_display_(/*51.18*/content),format.raw/*51.25*/("""
            """),format.raw/*52.13*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*70.16*/routes/*70.22*/.Assets.versioned("javascripts/main.js")),format.raw/*70.62*/(""""></script>
    </body>
</html>


"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 01 17:56:18 GMT 2018
                  SOURCE: /home/jvk/wdd1labs/LabWork/WDD1PlayLab/app/views/main.scala.html
                  HASH: 994431a372070f01bff9a5f921fd668e318919e3
                  MATRIX: 970->1|1122->60|1423->335|1437->341|1496->380|1546->402|1575->403|1604->404|1691->463|1720->464|1750->467|1787->476|1816->477|1845->478|1921->526|1950->527|1980->530|2020->542|2049->543|2078->544|2125->563|2154->564|2184->567|2223->578|2252->579|2281->580|2348->619|2377->620|2407->623|2446->634|2475->635|2504->636|2570->674|2599->675|2629->678|2666->687|2695->688|2724->689|2764->701|2793->702|2822->704|2871->726|2900->734|3166->973|3197->995|3236->996|3282->1011|3320->1022|3335->1028|3379->1051|3433->1078|3467->1103|3506->1104|3552->1119|3590->1130|3605->1136|3650->1160|3707->1190|3742->1216|3781->1217|3827->1232|3865->1243|3880->1249|3924->1272|3982->1303|4015->1327|4054->1328|4100->1343|4133->1350|4158->1366|4198->1368|4231->1374|4268->1384|4283->1390|4329->1415|4366->1435|4379->1440|4418->1441|4451->1447|4488->1457|4503->1463|4548->1487|4596->1505|4632->1514|5180->2035|5208->2042|5249->2055|5884->2663|5899->2669|5960->2709
                  LINES: 28->1|33->2|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|48->17|48->17|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|66->35|82->51|82->51|83->52|101->70|101->70|101->70
                  -- GENERATED --
              */
          