
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
			"""),format.raw/*49.4*/("""#house-desc, #database-list """),format.raw/*49.32*/("""{"""),format.raw/*49.33*/("""
				"""),format.raw/*50.5*/("""margin-left:auto;
				margin-right:auto;
			"""),format.raw/*52.4*/("""}"""),format.raw/*52.5*/("""
			"""),format.raw/*53.4*/("""#house-desc """),format.raw/*53.16*/("""{"""),format.raw/*53.17*/("""
				"""),format.raw/*54.5*/("""width:60%;
				background-color:rgba(0,0,0,0.1);
				padding-bottom:10px;
				margin-bottom:20px;
			"""),format.raw/*58.4*/("""}"""),format.raw/*58.5*/("""
			"""),format.raw/*59.4*/("""#house-desc .house-thumbnail """),format.raw/*59.33*/("""{"""),format.raw/*59.34*/("""
				"""),format.raw/*60.5*/("""width:100%;
			"""),format.raw/*61.4*/("""}"""),format.raw/*61.5*/("""
			"""),format.raw/*62.4*/("""#house-desc #description """),format.raw/*62.29*/("""{"""),format.raw/*62.30*/("""
				"""),format.raw/*63.5*/("""text-align:center;
				width:100%;
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/("""
			"""),format.raw/*66.4*/("""#house-desc #panel """),format.raw/*66.23*/("""{"""),format.raw/*66.24*/("""
				"""),format.raw/*67.5*/("""width:50%;
				text-align:center;
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""
			"""),format.raw/*70.4*/("""#house-desc table,tr """),format.raw/*70.25*/("""{"""),format.raw/*70.26*/("""
				"""),format.raw/*71.5*/("""border:0;
				margin:0;
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/("""
			"""),format.raw/*74.4*/("""#house-desc table """),format.raw/*74.22*/("""{"""),format.raw/*74.23*/("""
				"""),format.raw/*75.5*/("""width:100%;
			"""),format.raw/*76.4*/("""}"""),format.raw/*76.5*/("""
			"""),format.raw/*77.4*/("""#house-desc th """),format.raw/*77.19*/("""{"""),format.raw/*77.20*/("""
				"""),format.raw/*78.5*/("""text-align:center;
				width:50%;
				font-weight:normal;
			"""),format.raw/*81.4*/("""}"""),format.raw/*81.5*/("""
			"""),format.raw/*82.4*/("""#house-desc th .icon """),format.raw/*82.25*/("""{"""),format.raw/*82.26*/("""
				"""),format.raw/*83.5*/("""display:block;
				width:100%;
				font-weight:bold;
			"""),format.raw/*86.4*/("""}"""),format.raw/*86.5*/("""
			"""),format.raw/*87.4*/("""#house-desc #price """),format.raw/*87.23*/("""{"""),format.raw/*87.24*/("""
				"""),format.raw/*88.5*/("""text-align:center;
				font-size:1.1em;
			"""),format.raw/*90.4*/("""}"""),format.raw/*90.5*/("""
			"""),format.raw/*91.4*/("""#house-desc #price #title """),format.raw/*91.30*/("""{"""),format.raw/*91.31*/("""
				"""),format.raw/*92.5*/("""font-size:1.3em;
				font-weight:bold;
			"""),format.raw/*94.4*/("""}"""),format.raw/*94.5*/("""
			"""),format.raw/*95.4*/("""#database-list """),format.raw/*95.19*/("""{"""),format.raw/*95.20*/("""
				"""),format.raw/*96.5*/("""width:70%;
				background-color:rgba(0,0,0,0.1);
			"""),format.raw/*98.4*/("""}"""),format.raw/*98.5*/("""
			"""),format.raw/*99.4*/("""#database-list table tr:nth-child(even) """),format.raw/*99.44*/("""{"""),format.raw/*99.45*/("""
				"""),format.raw/*100.5*/("""background-color:rgba(0,0,0,0.1);
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
			"""),format.raw/*102.4*/("""#database-list td """),format.raw/*102.22*/("""{"""),format.raw/*102.23*/("""
				"""),format.raw/*103.5*/("""padding:5px;
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/("""
			"""),format.raw/*105.4*/("""#database-list td .listing """),format.raw/*105.31*/("""{"""),format.raw/*105.32*/("""
				"""),format.raw/*106.5*/("""color:inherit;
				text-decoration:none;
			"""),format.raw/*108.4*/("""}"""),format.raw/*108.5*/("""
			"""),format.raw/*109.4*/("""#database-list td .listing:hover """),format.raw/*109.37*/("""{"""),format.raw/*109.38*/("""
				"""),format.raw/*110.5*/("""color:green;
			"""),format.raw/*111.4*/("""}"""),format.raw/*111.5*/("""
			"""),format.raw/*112.4*/("""#database-list .desc """),format.raw/*112.25*/("""{"""),format.raw/*112.26*/("""
				"""),format.raw/*113.5*/("""text-align:right;
				padding-right:30px;
			"""),format.raw/*115.4*/("""}"""),format.raw/*115.5*/("""
		"""),format.raw/*116.3*/("""</style>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*124.60*/routes/*124.66*/.HomeController.index()),format.raw/*124.89*/("""">ADK Houses</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*127.34*/if(pagename== "Home")/*127.55*/{_display_(Seq[Any](format.raw/*127.56*/("""class="active"""")))}),format.raw/*127.71*/("""><a href=""""),_display_(/*127.82*/routes/*127.88*/.HomeController.index()),format.raw/*127.111*/("""">Home</a></li>
                            <!--<li """),_display_(/*128.38*/if(pagename == "Payment")/*128.63*/{_display_(Seq[Any](format.raw/*128.64*/("""class="active"""")))}),format.raw/*128.79*/("""><a href=""""),_display_(/*128.90*/routes/*128.96*/.HomeController.payment()),format.raw/*128.121*/("""">Payment</a></li>-->
							<li """),_display_(/*129.13*/if(pagename == "Database")/*129.39*/{_display_(Seq[Any](format.raw/*129.40*/("""class="active"""")))}),format.raw/*129.55*/("""><a href=""""),_display_(/*129.66*/routes/*129.72*/.HomeController.database()),format.raw/*129.98*/("""">House List</a></li>
							"""),_display_(/*130.9*/if((user != null) && ("admin".equals(user.getRole())))/*130.63*/ {_display_(Seq[Any](format.raw/*130.65*/("""
								"""),format.raw/*131.9*/("""<li """),_display_(/*131.14*/if(pagename == "Landlords")/*131.41*/ {_display_(Seq[Any](format.raw/*131.43*/("""class="active"""")))}),format.raw/*131.58*/("""><a href=""""),_display_(/*131.69*/routes/*131.75*/.HomeController.viewUsers()),format.raw/*131.102*/("""">View Landlords</a></li>
							""")))}),format.raw/*132.9*/("""
							"""),_display_(/*133.9*/if((user != null) && ("Member".equals(user.getRole())))/*133.64*/ {_display_(Seq[Any](format.raw/*133.66*/("""
								"""),format.raw/*134.9*/("""<li """),_display_(/*134.14*/if(pagename == "RentDue")/*134.39*/ {_display_(Seq[Any](format.raw/*134.41*/("""class="active"""")))}),format.raw/*134.56*/("""><a href=""""),_display_(/*134.67*/routes/*134.73*/.RentCtrl.viewRent()),format.raw/*134.93*/("""">Rent Due</a></li>	
							""")))}),format.raw/*135.9*/("""
							"""),format.raw/*136.8*/("""<li """),_display_(/*136.13*/if(pagename == "Login")/*136.36*/{_display_(Seq[Any](format.raw/*136.37*/("""class="active"""")))}),format.raw/*136.52*/(""">
							"""),_display_(/*137.9*/if(user != null)/*137.25*/{_display_(Seq[Any](format.raw/*137.26*/("""
								"""),format.raw/*138.9*/("""<a href=""""),_display_(/*138.19*/routes/*138.25*/.LoginController.logout()),format.raw/*138.50*/("""">Log Out</a></li>
							""")))}/*139.10*/else/*139.15*/{_display_(Seq[Any](format.raw/*139.16*/("""
									"""),format.raw/*140.10*/("""<a href=""""),_display_(/*140.20*/routes/*140.26*/.LoginController.login()),format.raw/*140.50*/("""">Log In</a>
							""")))}),format.raw/*141.9*/("""
								
                        """),format.raw/*143.25*/("""</ul>
                    </div>
                </nav>

				<div class = "container-fluid">
					<div class = "row">
						<div class = "col-sm-12">
							<div class = "midcol">
        						"""),_display_(/*151.16*/content),format.raw/*151.23*/("""
							"""),format.raw/*152.8*/("""</div>
						</div>
					</div>
				</div>
    </body>
    <script src=""""),_display_(/*157.19*/routes/*157.25*/.Assets.versioned("javascripts/main.js")),format.raw/*157.65*/(""""></script>
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
                  DATE: Mon Apr 01 13:00:43 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: f4521f35c285d15519a5c935ea57a9827f85e4f4
                  MATRIX: 970->1|1122->60|1193->105|1221->113|1361->225|1390->226|1422->231|1525->307|1553->308|1584->312|1624->324|1653->325|1685->330|1786->404|1814->405|1845->409|1889->425|1918->426|1950->431|2026->480|2054->481|2085->485|2140->512|2169->513|2201->518|2271->561|2299->562|2330->566|2378->586|2407->587|2439->592|2482->608|2510->609|2541->613|2582->626|2611->627|2643->632|2686->648|2714->649|2745->653|2780->660|2809->661|2841->666|3029->827|3057->828|3089->833|3127->843|3156->844|3188->849|3261->895|3289->896|3320->900|3376->928|3405->929|3437->934|3508->978|3536->979|3567->983|3607->995|3636->996|3668->1001|3796->1102|3824->1103|3855->1107|3912->1136|3941->1137|3973->1142|4015->1157|4043->1158|4074->1162|4127->1187|4156->1188|4188->1193|4253->1231|4281->1232|4312->1236|4359->1255|4388->1256|4420->1261|4484->1298|4512->1299|4543->1303|4592->1324|4621->1325|4653->1330|4707->1357|4735->1358|4766->1362|4812->1380|4841->1381|4873->1386|4915->1401|4943->1402|4974->1406|5017->1421|5046->1422|5078->1427|5166->1488|5194->1489|5225->1493|5274->1514|5303->1515|5335->1520|5418->1576|5446->1577|5477->1581|5524->1600|5553->1601|5585->1606|5655->1649|5683->1650|5714->1654|5768->1680|5797->1681|5829->1686|5898->1728|5926->1729|5957->1733|6000->1748|6029->1749|6061->1754|6140->1806|6168->1807|6199->1811|6267->1851|6296->1852|6329->1857|6394->1894|6423->1895|6455->1899|6502->1917|6532->1918|6565->1923|6609->1939|6638->1940|6670->1944|6726->1971|6756->1972|6789->1977|6861->2021|6890->2022|6922->2026|6984->2059|7014->2060|7047->2065|7091->2081|7120->2082|7152->2086|7202->2107|7232->2108|7265->2113|7338->2158|7367->2159|7398->2162|8069->2805|8085->2811|8130->2834|8291->2967|8322->2988|8362->2989|8409->3004|8448->3015|8464->3021|8510->3044|8591->3097|8626->3122|8666->3123|8713->3138|8752->3149|8768->3155|8816->3180|8878->3214|8914->3240|8954->3241|9001->3256|9040->3267|9056->3273|9104->3299|9161->3329|9225->3383|9266->3385|9303->3394|9336->3399|9373->3426|9414->3428|9461->3443|9500->3454|9516->3460|9566->3487|9631->3521|9667->3530|9732->3585|9773->3587|9810->3596|9843->3601|9878->3626|9919->3628|9966->3643|10005->3654|10021->3660|10063->3680|10123->3709|10159->3717|10192->3722|10225->3745|10265->3746|10312->3761|10349->3771|10375->3787|10415->3788|10452->3797|10490->3807|10506->3813|10553->3838|10600->3866|10614->3871|10654->3872|10693->3882|10731->3892|10747->3898|10793->3922|10845->3943|10908->3977|11131->4172|11160->4179|11196->4187|11297->4260|11313->4266|11375->4306
                  LINES: 28->1|33->2|36->5|36->5|41->10|41->10|42->11|45->14|45->14|46->15|46->15|46->15|47->16|50->19|50->19|51->20|51->20|51->20|52->21|55->24|55->24|56->25|56->25|56->25|57->26|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|66->35|66->35|67->36|74->43|74->43|76->45|76->45|76->45|77->46|79->48|79->48|80->49|80->49|80->49|81->50|83->52|83->52|84->53|84->53|84->53|85->54|89->58|89->58|90->59|90->59|90->59|91->60|92->61|92->61|93->62|93->62|93->62|94->63|96->65|96->65|97->66|97->66|97->66|98->67|100->69|100->69|101->70|101->70|101->70|102->71|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|108->77|108->77|108->77|109->78|112->81|112->81|113->82|113->82|113->82|114->83|117->86|117->86|118->87|118->87|118->87|119->88|121->90|121->90|122->91|122->91|122->91|123->92|125->94|125->94|126->95|126->95|126->95|127->96|129->98|129->98|130->99|130->99|130->99|131->100|132->101|132->101|133->102|133->102|133->102|134->103|135->104|135->104|136->105|136->105|136->105|137->106|139->108|139->108|140->109|140->109|140->109|141->110|142->111|142->111|143->112|143->112|143->112|144->113|146->115|146->115|147->116|155->124|155->124|155->124|158->127|158->127|158->127|158->127|158->127|158->127|158->127|159->128|159->128|159->128|159->128|159->128|159->128|159->128|160->129|160->129|160->129|160->129|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|162->131|162->131|162->131|162->131|162->131|162->131|163->132|164->133|164->133|164->133|165->134|165->134|165->134|165->134|165->134|165->134|165->134|165->134|166->135|167->136|167->136|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|171->140|172->141|174->143|182->151|182->151|183->152|188->157|188->157|188->157
                  -- GENERATED --
              */
          