
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

object viewUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[models.users.Landlord],List[models.users.Admin],List[models.users.Member],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landList: List[models.users.Landlord], aList: List[models.users.Admin], mList: List[models.users.Member], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.HomeController.deleteLandlord(u.getEmail())),format.raw/*47.85*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*54.35*/routes/*54.41*/.HomeController.updateLandlord(u.getEmail())),format.raw/*54.85*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"></span>
                        </a>
                    </td>
                """)))}),format.raw/*58.18*/("""

                """),format.raw/*60.17*/("""</tr>
                """)))}),format.raw/*61.18*/("""
        """),format.raw/*62.9*/("""</tbody>
    </table>
    <p>
        <a href=""""),_display_(/*65.19*/routes/*65.25*/.HomeController.addLandlord()),format.raw/*65.54*/("""">
            <button class="btn btn-primary">Add a new Landlord</button>
        </a>
    </p>
</div>


<div class="col-sm-9">
    <h4>Here are all the current Admins on the system.</h4>
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
            """),_display_(/*90.14*/for(u<-aList) yield /*90.27*/ {_display_(Seq[Any](format.raw/*90.29*/(""" 
                """),format.raw/*91.17*/("""<tr>
                <td>"""),_display_(/*92.22*/u/*92.23*/.getEmail),format.raw/*92.32*/("""</td>
                <td>"""),_display_(/*93.22*/u/*93.23*/.getRole),format.raw/*93.31*/("""</td>
                <td>"""),_display_(/*94.22*/u/*94.23*/.getFname),format.raw/*94.32*/("""</td>
                <td>"""),_display_(/*95.22*/u/*95.23*/.getPassword),format.raw/*95.35*/("""</td>

                """),_display_(/*97.18*/if((user != null) && ("admin".equals(user.getRole())))/*97.72*/ {_display_(Seq[Any](format.raw/*97.74*/("""
                    """),format.raw/*98.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*100.35*/routes/*100.41*/.HomeController.deleteAdmin(u.getEmail())),format.raw/*100.82*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*107.35*/routes/*107.41*/.HomeController.updateAdmin(u.getEmail())),format.raw/*107.82*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"></span>
                        </a>
                    </td>
                """)))}),format.raw/*111.18*/("""

                """),format.raw/*113.17*/("""</tr>
                """)))}),format.raw/*114.18*/("""
        """),format.raw/*115.9*/("""</tbody>
    </table>

    <div class="col-sm-9">
        <h4>Here are all the current Members on the system.</h4>
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
                """),_display_(/*136.18*/for(u<-mList) yield /*136.31*/ {_display_(Seq[Any](format.raw/*136.33*/(""" 
                    """),format.raw/*137.21*/("""<tr>
                    <td>"""),_display_(/*138.26*/u/*138.27*/.getEmail),format.raw/*138.36*/("""</td>
                    <td>"""),_display_(/*139.26*/u/*139.27*/.getRole),format.raw/*139.35*/("""</td>
                    <td>"""),_display_(/*140.26*/u/*140.27*/.getFname),format.raw/*140.36*/("""</td>
                    <td>"""),_display_(/*141.26*/u/*141.27*/.getPassword),format.raw/*141.39*/("""</td>
    
                    """),_display_(/*143.22*/if((user != null) && ("admin".equals(user.getRole())))/*143.76*/ {_display_(Seq[Any](format.raw/*143.78*/("""
                        """),format.raw/*144.25*/("""<!-- Delete button -->
                        <td>
                            <a href=""""),_display_(/*146.39*/routes/*146.45*/.HomeController.deleteMember(u.getEmail())),format.raw/*146.87*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    
                        <!-- Update button -->
                        <td>
                            <a href=""""),_display_(/*153.39*/routes/*153.45*/.HomeController.updateMember(u.getEmail())),format.raw/*153.87*/("""" class="button-xs btn-danger">
                                <span class="glyphicon-pencil"></span>
                            </a>
                        </td>
                    """)))}),format.raw/*157.22*/("""
    
                    """),format.raw/*159.21*/("""</tr>
                    """)))}),format.raw/*160.22*/("""
            """),format.raw/*161.13*/("""</tbody>
        </table>





""")))}))
      }
    }
  }

  def render(landList:List[models.users.Landlord],aList:List[models.users.Admin],mList:List[models.users.Member],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(landList,aList,mList,user,env)

  def f:((List[models.users.Landlord],List[models.users.Admin],List[models.users.Member],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (landList,aList,mList,user,env) => apply(landList,aList,mList,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 01 13:34:19 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/viewUsers.scala.html
                  HASH: 7ebea6a1b6aa78184c2ce9df634b92af6a55464b
                  MATRIX: 1063->1|1315->161|1344->182|1383->184|1410->185|1500->250|1540->282|1579->284|1606->285|1670->324|1683->329|1718->344|1745->345|1783->353|1812->355|2385->901|2417->917|2457->919|2503->937|2557->964|2652->1049|2693->1051|2742->1072|2813->1116|2860->1142|2909->1173|2922->1178|2961->1179|3010->1200|3130->1289|3176->1307|3208->1312|3218->1313|3248->1322|3302->1349|3312->1350|3341->1358|3395->1385|3405->1386|3435->1395|3489->1422|3499->1423|3532->1435|3583->1459|3646->1513|3686->1515|3735->1536|3844->1618|3859->1624|3924->1668|4264->1981|4279->1987|4344->2031|4546->2202|4592->2220|4646->2243|4682->2252|4757->2300|4772->2306|4822->2335|5498->2984|5527->2997|5567->2999|5613->3017|5666->3043|5676->3044|5706->3053|5760->3080|5770->3081|5799->3089|5853->3116|5863->3117|5893->3126|5947->3153|5957->3154|5990->3166|6041->3190|6104->3244|6144->3246|6193->3267|6303->3349|6319->3355|6382->3396|6723->3709|6739->3715|6802->3756|7005->3927|7052->3945|7107->3968|7144->3977|7815->4620|7845->4633|7886->4635|7937->4657|7995->4687|8006->4688|8037->4697|8096->4728|8107->4729|8137->4737|8196->4768|8207->4769|8238->4778|8297->4809|8308->4810|8342->4822|8402->4854|8466->4908|8507->4910|8561->4935|8679->5025|8695->5031|8759->5073|9128->5414|9144->5420|9208->5462|9427->5649|9482->5675|9541->5702|9583->5715
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|68->37|70->39|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|85->54|85->54|85->54|89->58|91->60|92->61|93->62|96->65|96->65|96->65|121->90|121->90|121->90|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|128->97|128->97|128->97|129->98|131->100|131->100|131->100|138->107|138->107|138->107|142->111|144->113|145->114|146->115|167->136|167->136|167->136|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|172->141|172->141|172->141|174->143|174->143|174->143|175->144|177->146|177->146|177->146|184->153|184->153|184->153|188->157|190->159|191->160|192->161
                  -- GENERATED --
              */
          