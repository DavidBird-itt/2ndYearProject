
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

object CRUD extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("CRUD")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
    """),format.raw/*2.5*/("""<h1>The Database</h1>
    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Location</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <!--Populating the database-->

                <tr>
                    <td>1</td>
                    <td>Hello</td>
                    <td>123 Sommerville</td>
                    <td>Dublin 24</td>
                    <td>300</td>
                </tr>
            
        </tbody>
    </table>         

    
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 17 11:10:51 GMT 2019
                  SOURCE: /home/wdd/temp/PlayReminder/app/views/CRUD.scala.html
                  HASH: 1f03c1ecbff44b08d08ba63817e9ec1e8ff4212c
                  MATRIX: 1029->1|1049->13|1087->14|1118->19
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          