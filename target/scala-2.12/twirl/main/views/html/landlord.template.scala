
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

object landlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[user[List[models.users.LandLord], <error>],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.LandLord] user: models.Users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("LandLord",user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current LandLords</h1>

    <!-- Displays the flash message -->
    """),_display_(/*6.6*/if(flash.containsKey("success"))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
        """),format.raw/*7.9*/("""<div class="alert alert-success">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
        """),format.raw/*9.9*/("""</div>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<div class="col-sm-9">
        <h4>Here are all the current LandLords on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                <!-- The header row -->
                <tr>
                    <th>Email</th>
                    <th>Role</th>
                    <th>Name</th>
                    <th>Password</th>
                </tr>
            </thead>

            <tbody>
                <!-- Product row(s) -->

                <!-- Loop for creating rows from the users data -->
                """),_display_(/*29.18*/for(u<-users) yield /*29.31*/ {_display_(Seq[Any](format.raw/*29.33*/("""
                    """),format.raw/*30.21*/("""<tr>
                        <td>"""),_display_(/*31.30*/u/*31.31*/.getEmail),format.raw/*31.40*/("""</td>
                        <td>"""),_display_(/*32.30*/u/*32.31*/.getRole),format.raw/*32.39*/("""</td>
                        <td>"""),_display_(/*33.30*/u/*33.31*/.getName),format.raw/*33.39*/("""</td>
                        <td>"""),_display_(/*34.30*/u/*34.31*/.getPassword),format.raw/*34.43*/("""</td>

                    <td>
                        <a href=""""),_display_(/*37.35*/routes/*37.41*/.HomeController.updateAdmin(u.getEmail)),format.raw/*37.80*/("""" class="button-xs btn-danger">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>
                    </td>

                <td>
						<a href=""""),_display_(/*43.17*/routes/*43.23*/.HomeController.deleteAdmin(u.getEmail)),format.raw/*43.62*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
						</a>
                    </td>
                </tr>    
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""</tbody>
        </table>
        <p>
            <a href=""""),_display_(/*52.23*/routes/*52.29*/.HomeController.addLandLord()),format.raw/*52.58*/("""">
                    <button class="btn btn-primary">Add a new Administrator</button>
            </a>
        </p>
    </div>







""")))}))
      }
    }
  }

  def render(users:user[List[models.users.LandLord], <error>]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((user[List[models.users.LandLord], <error>]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 11 14:13:50 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/landlord.scala.html
                  HASH: 0237af53555917ed2772ad22e44c02bd5e02cc9a
                  MATRIX: 987->1|1141->63|1170->84|1209->86|1240->91|1338->164|1378->196|1417->198|1452->207|1525->254|1538->259|1573->274|1608->283|1650->295|1683->301|2285->876|2314->889|2354->891|2403->912|2464->946|2474->947|2504->956|2566->991|2576->992|2605->1000|2667->1035|2677->1036|2706->1044|2768->1079|2778->1080|2811->1092|2904->1158|2919->1164|2979->1203|3208->1405|3223->1411|3283->1450|3509->1645|3550->1658|3637->1718|3652->1724|3702->1753
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|79->48|80->49|83->52|83->52|83->52
                  -- GENERATED --
              */
          