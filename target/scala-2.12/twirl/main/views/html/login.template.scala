
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display errors -->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),format.raw/*10.17*/("""e.message<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""

    """),format.raw/*15.5*/("""<!-- Displaying the form itself -->
    """),_display_(/*16.6*/helper/*16.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*16.76*/ {_display_(Seq[Any](format.raw/*16.78*/("""
        """),format.raw/*17.37*/("""
        """),_display_(/*18.10*/CSRF/*18.14*/.formField),format.raw/*18.24*/("""

        """),format.raw/*20.9*/("""<div class="form-group">
            """),_display_(/*21.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*22.72*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="form-group">
            """),_display_(/*25.14*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*26.75*/("""
        """),format.raw/*27.9*/("""</div>

        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn primary">
        </div>
    """)))}),format.raw/*32.6*/(""" """),format.raw/*32.24*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 19 15:32:00 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/login.scala.html
                  HASH: 177b870b66cc32328e51c5754ea1b0975c0f38bf
                  MATRIX: 984->1|1119->65|1163->82|1190->84|1217->103|1256->105|1287->110|1362->160|1399->189|1438->191|1473->200|1544->245|1591->277|1630->279|1675->296|1734->324|1770->333|1810->343|1843->349|1910->390|1925->396|1998->460|2038->462|2075->499|2112->509|2125->513|2156->523|2193->533|2258->571|2395->687|2431->696|2511->749|2654->871|2690->880|2855->1015|2884->1033
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|44->13|46->15|47->16|47->16|47->16|47->16|48->17|49->18|49->18|49->18|51->20|52->21|53->22|54->23|56->25|57->26|58->27|63->32|63->32
                  -- GENERATED --
              */
          