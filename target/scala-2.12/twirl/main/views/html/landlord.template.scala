
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

object landlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Landlord],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landList: List[models.users.Landlord], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Landlord",user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
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
                """),_display_(/*29.18*/for(u<-landList) yield /*29.34*/ {_display_(Seq[Any](format.raw/*29.36*/("""
                    """),format.raw/*30.21*/("""<tr>
                        <td>"""),_display_(/*31.30*/u/*31.31*/.getEmail),format.raw/*31.40*/("""</td>
                        <td>"""),_display_(/*32.30*/u/*32.31*/.getRole),format.raw/*32.39*/("""</td>
                        <td>"""),_display_(/*33.30*/u/*33.31*/.getFName),format.raw/*33.40*/("""</td>
                        <td>"""),_display_(/*34.30*/u/*34.31*/.getPassword),format.raw/*34.43*/("""</td>
                    </tr>  
            """)))}),format.raw/*36.14*/("""
            """),format.raw/*37.13*/("""</tbody>
        </table>
        <p>
            <a href=""""),_display_(/*40.23*/routes/*40.29*/.HomeController.addLandlord()),format.raw/*40.58*/("""">
                    <button class="btn btn-primary">Add a new Administrator</button>
            </a>
        </p>
    </div>







""")))}))
      }
    }
  }

  def render(landList:List[models.users.Landlord],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(landList,user)

  def f:((List[models.users.Landlord],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (landList,user) => apply(landList,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 19 16:07:30 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/landlord.scala.html
                  HASH: d12f69066d71ff5b17e043bb05659051ef742070
                  MATRIX: 990->1|1148->67|1177->88|1216->90|1247->95|1345->168|1385->200|1424->202|1459->211|1532->258|1545->263|1580->278|1615->287|1657->299|1690->305|2292->880|2324->896|2364->898|2413->919|2474->953|2484->954|2514->963|2576->998|2586->999|2615->1007|2677->1042|2687->1043|2717->1052|2779->1087|2789->1088|2822->1100|2900->1147|2941->1160|3028->1220|3043->1226|3093->1255
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|67->36|68->37|71->40|71->40|71->40
                  -- GENERATED --
              */
          