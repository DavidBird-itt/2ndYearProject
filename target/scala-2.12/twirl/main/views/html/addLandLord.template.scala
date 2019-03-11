
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

object addLandLord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Users.LandLord],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houseForm: Form[models.Users.LandLord], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add a LandLord", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new landlord</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addLandLordSubmit, 'class -> "form-horizontal", 'role -> "form")/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*14.10*/inputText(landLordForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*14.92*/("""
        """),_display_(/*15.10*/inputText(landLordForm("postcode"), '_label -> "Postcode", 'class -> "form-control")),format.raw/*15.94*/("""
        """),_display_(/*16.10*/inputText(landLordForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*16.93*/("""
        """),_display_(/*17.10*/inputText(landLordForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*17.95*/("""
        """),_display_(/*18.10*/inputText(landLordForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*18.88*/("""
    
        """),_display_(/*20.10*/inputText(houseForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.72*/("""
    
        """),format.raw/*22.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.database()),format.raw/*24.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*28.6*/("""
""")))}))
      }
    }
  }

  def render(houseForm:Form[models.Users.LandLord],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(houseForm,user)

  def f:((Form[models.Users.LandLord],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (houseForm,user) => apply(houseForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 11 14:13:50 GMT 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/addLandLord.scala.html
                  HASH: 6e1c21a34bc779caee13805fc955c8cba0f71243
                  MATRIX: 993->1|1131->69|1175->67|1202->86|1229->88|1265->116|1304->118|1335->123|1405->168|1512->266|1552->268|1588->305|1625->315|1638->319|1669->329|1706->339|1898->504|2001->586|2038->596|2143->680|2180->690|2284->773|2321->783|2427->868|2464->878|2563->956|2605->971|2688->1033|2729->1047|2876->1167|2891->1173|2938->1199|3086->1317
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|53->22|55->24|55->24|55->24|59->28
                  -- GENERATED --
              */
          