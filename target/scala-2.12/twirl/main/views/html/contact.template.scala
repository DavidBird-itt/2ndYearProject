
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Landlord],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landlords: List[models.users.Landlord], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Contact", user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

""")))}))
      }
    }
  }

  def render(landlords:List[models.users.Landlord],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(landlords,user,env)

  def f:((List[models.users.Landlord],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (landlords,user,env) => apply(landlords,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 16 15:50:18 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/contact.scala.html
                  HASH: 6959af416023ff72d83bcf20bb61c6fb1a3c0c63
                  MATRIX: 1010->1|1196->95|1225->116|1264->118
                  LINES: 28->1|33->2|33->2|33->2
                  -- GENERATED --
              */
          