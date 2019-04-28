
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

object searchQuery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.Property],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: List[models.products.Property], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
				
				</tr>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>         
""")))}),format.raw/*36.2*/(""" """))
      }
    }
  }

  def render(results:List[models.products.Property],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(results,user,env)

  def f:((List[models.products.Property],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (results,user,env) => apply(results,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 16:39:02 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/searchQuery.scala.html
                  HASH: e1fc330cad25b3ce907ae81b83bfc5b62535b6c5
                  MATRIX: 1017->1|1204->95|1231->97|1259->117|1298->119|1329->124|1769->537|1800->552|1840->554|1872->559|1916->576|2006->657|2046->659|2086->671|2156->714|2201->738|2242->761|2255->766|2294->767|2334->779|2441->855|2478->865|2510->870|2520->871|2547->877|2593->896|2603->897|2635->908|2681->927|2691->928|2724->940|2777->966|2825->993|2890->1027|2926->1036|2988->1068
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|64->33|65->34|67->36
                  -- GENERATED --
              */
          