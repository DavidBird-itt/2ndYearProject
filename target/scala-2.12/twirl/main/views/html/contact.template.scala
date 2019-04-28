
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
    """),format.raw/*3.5*/("""<div class="container">
        <form>
      
          <label for="fname">First Name</label>
          <input type="text" id="fname" name="firstname" placeholder="Your name..">
      
          <label for="lname">Last Name</label>
          <input type="text" id="lname" name="lastname" placeholder="Your last name..">

          <label for="email">Email</label>
          <input type="text" id="email" name="email" placeholder="Your email..">
      
          <label for="country">County</label>
          <select id="country" name="country">
            <option value="australia">Dublin</option>
            <option value="canada">Wicklow</option>
            <option value="usa">Kildare</option>
          </select>
      
          <label for="subject">Subject</label>
          <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
      
          <div class="actions">
            <input type="submit" value="Submit" class="btn btn-primary">
            <a href=""""),_display_(/*27.23*/routes/*27.29*/.HomeController.index()),format.raw/*27.52*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>

        </form>
      </div>
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
                  DATE: Sun Apr 28 20:52:15 CEST 2019
                  SOURCE: /home/wdd/collegeLastThisOneActually/PlayReminder/app/views/contact.scala.html
                  HASH: 28c61a51f04cb744c9b1f12690c33fb74cbcc10c
                  MATRIX: 1010->1|1196->95|1225->116|1264->118|1295->123|2343->1144|2358->1150|2402->1173
                  LINES: 28->1|33->2|33->2|33->2|34->3|58->27|58->27|58->27
                  -- GENERATED --
              */
          