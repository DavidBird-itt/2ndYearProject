
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

object searchQuery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.Houses],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: List[models.products.Houses], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Search", user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Search Results</h1>

    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th>Image</th>
                <th>ID</th>
                <th>Bedrooms</th>
                <th>Bathrooms</th>
                <th>Price</th>
                <th>Garden Size</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*19.14*/for(i<-results) yield /*19.29*/ {_display_(Seq[Any](format.raw/*19.31*/("""
				"""),format.raw/*20.5*/("""<tr>
			        """),_display_(/*21.13*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*21.94*/ {_display_(Seq[Any](format.raw/*21.96*/("""
			        """),format.raw/*22.12*/("""<td><img src="/assets/images/projectImages"""),_display_(/*22.55*/(i.getId + " thumb.jpg")),format.raw/*22.79*/("""" /></td>
			        """)))}/*23.14*/else/*23.19*/{_display_(Seq[Any](format.raw/*23.20*/("""
			        """),format.raw/*24.12*/("""<td><img src="/assets/images/projectImages/noImage.jpg" /></td>
			        """)))}),format.raw/*25.13*/("""

				    """),format.raw/*27.9*/("""<td>"""),_display_(/*27.14*/i/*27.15*/.getId),format.raw/*27.21*/("""</td>
				    <td>"""),_display_(/*28.14*/i/*28.15*/.getNumBeds),format.raw/*28.26*/("""</td>
				    <td>"""),_display_(/*29.14*/i/*29.15*/.getNumBaths),format.raw/*29.27*/("""</td>
				    <td>&euro; """),_display_(/*30.21*/("%.2f".format(i.getPrice))),format.raw/*30.48*/("""</td>
				    <td>"""),_display_(/*31.14*/i/*31.15*/.getGardenSize),format.raw/*31.29*/("""</td>
				</tr>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>         
""")))}),format.raw/*36.2*/(""" """))
      }
    }
  }

  def render(results:List[models.products.Houses],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(results,user,env)

  def f:((List[models.products.Houses],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (results,user,env) => apply(results,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 15:44:14 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/searchQuery.scala.html
                  HASH: 9a3b56ca6529d933b1f499ad427b73af60d96853
                  MATRIX: 1015->1|1200->93|1227->95|1255->115|1294->117|1325->122|1765->535|1796->550|1836->552|1868->557|1912->574|2002->655|2042->657|2082->669|2152->712|2197->736|2238->759|2251->764|2290->765|2330->777|2437->853|2474->863|2506->868|2516->869|2543->875|2589->894|2599->895|2631->906|2677->925|2687->926|2720->938|2773->964|2821->991|2867->1010|2877->1011|2912->1025|2972->1054|3008->1063|3070->1095
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|62->31|62->31|62->31|64->33|65->34|67->36
                  -- GENERATED --
              */
          