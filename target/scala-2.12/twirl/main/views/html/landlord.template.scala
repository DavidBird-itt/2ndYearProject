
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

object landlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Landlord],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landList: List[models.users.Landlord], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Landlord",user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<h1>Current LandLords</h1>

<!-- Displays the flash message -->
"""),_display_(/*6.2*/if(flash.containsKey("success"))/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
"""),format.raw/*7.1*/("""<div class="alert alert-success">
    """),_display_(/*8.6*/flash/*8.11*/.get("success")),format.raw/*8.26*/("""
"""),format.raw/*9.1*/("""</div>
""")))}),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""<div class="col-sm-9">
    <h4>Here are all the current LandLords on the system.</h4>
    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!-- The header row -->
            <tr>
                <th>Image</th>
                <th>Email</th>
                <th>Role</th>
                <th>Name</th>
                <th>Password</th>
            </tr>
        </thead>

        <tbody>
            <!-- Product row(s) -->

            <!-- Loop for creating rows from the users data -->
            """),_display_(/*30.14*/for(u<-landList) yield /*30.30*/ {_display_(Seq[Any](format.raw/*30.32*/(""" 
                """),format.raw/*31.17*/("""<tr>

                    """),_display_(/*33.22*/if(env.resource("public/images/projectImages/" + u.getEmail + "thumb.jpg").isDefined)/*33.107*/ {_display_(Seq[Any](format.raw/*33.109*/("""
                    """),format.raw/*34.21*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*34.65*/(u.getEmail + "thumb.jpg")),format.raw/*34.91*/(""""/></td>
                    """)))}/*35.23*/else/*35.28*/{_display_(Seq[Any](format.raw/*35.29*/("""
                    """),format.raw/*36.21*/("""<td><img src="/assets/images/projectImages/noImageThumb.jpg"/></td>
                    """)))}),format.raw/*37.22*/("""

                """),format.raw/*39.17*/("""<td>"""),_display_(/*39.22*/u/*39.23*/.getEmail),format.raw/*39.32*/("""</td>
                <td>"""),_display_(/*40.22*/u/*40.23*/.getRole),format.raw/*40.31*/("""</td>
                <td>"""),_display_(/*41.22*/u/*41.23*/.getFname),format.raw/*41.32*/("""</td>
                <td>"""),_display_(/*42.22*/u/*42.23*/.getPassword),format.raw/*42.35*/("""</td>

                """),_display_(/*44.18*/if((user != null) && ("admin".equals(user.getRole())))/*44.72*/ {_display_(Seq[Any](format.raw/*44.74*/("""
                    """),format.raw/*45.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.HomeController.deleteLandlord(u.getEmail)),format.raw/*47.83*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                """)))}),format.raw/*51.18*/("""

                """),_display_(/*53.18*/if((user != null) && ("admin".equals(user.getRole())))/*53.72*/ {_display_(Seq[Any](format.raw/*53.74*/("""
                    """),format.raw/*54.21*/("""<!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.HomeController.updateLandlord(u.getEmail)),format.raw/*56.83*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"><</span>
                        </a>
                    </td>
                """)))}),format.raw/*60.18*/("""

                """),format.raw/*62.17*/("""</tr>
                """)))}),format.raw/*63.18*/("""
        """),format.raw/*64.9*/("""</tbody>
    </table>
    <p>
        <a href=""""),_display_(/*67.19*/routes/*67.25*/.HomeController.addLandlord()),format.raw/*67.54*/("""">
            <button class="btn btn-primary">Add a new Landlord</button>
        </a>
    </p>
</div>







""")))}))
      }
    }
  }

  def render(landList:List[models.users.Landlord],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(landList,user,env)

  def f:((List[models.users.Landlord],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (landList,user,env) => apply(landList,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 01 10:59:45 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/landlord.scala.html
                  HASH: 9d59941ad8862d64942b4cf8752d162b43c2e2bf
                  MATRIX: 1011->1|1196->94|1225->115|1264->117|1291->118|1381->183|1421->215|1460->217|1487->218|1551->257|1564->262|1599->277|1626->278|1664->286|1693->288|2266->834|2298->850|2338->852|2384->870|2438->897|2533->982|2574->984|2623->1005|2694->1049|2741->1075|2790->1106|2803->1111|2842->1112|2891->1133|3011->1222|3057->1240|3089->1245|3099->1246|3129->1255|3183->1282|3193->1283|3222->1291|3276->1318|3286->1319|3316->1328|3370->1355|3380->1356|3413->1368|3464->1392|3527->1446|3567->1448|3616->1469|3725->1551|3740->1557|3803->1599|4045->1810|4091->1829|4154->1883|4194->1885|4243->1906|4352->1988|4367->1994|4430->2036|4633->2208|4679->2226|4733->2249|4769->2258|4844->2306|4859->2312|4909->2341
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|68->37|70->39|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|82->51|84->53|84->53|84->53|85->54|87->56|87->56|87->56|91->60|93->62|94->63|95->64|98->67|98->67|98->67
                  -- GENERATED --
              */
          