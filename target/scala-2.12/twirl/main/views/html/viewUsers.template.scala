
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
                    """),_display_(/*32.22*/if(env.resource("public/images/projectImages/" + u.getEmail + "thumb.jpg").isDefined)/*32.107*/ {_display_(Seq[Any](format.raw/*32.109*/("""
                        """),format.raw/*33.25*/("""<td><img src="/assets/images/projectImages/"""),_display_(/*33.69*/(u.getEmail + "thumb.jpg")),format.raw/*33.95*/(""""/></td>
                    """)))}/*34.23*/else/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
                        """),format.raw/*35.25*/("""<td><img src="/assets/images/projectImages/noImageThumb.jpg"/></td>
                    """)))}),format.raw/*36.22*/("""

                """),format.raw/*38.17*/("""<td>"""),_display_(/*38.22*/u/*38.23*/.getEmail),format.raw/*38.32*/("""</td>
                <td>"""),_display_(/*39.22*/u/*39.23*/.getRole),format.raw/*39.31*/("""</td>
                <td>"""),_display_(/*40.22*/u/*40.23*/.getFname),format.raw/*40.32*/("""</td>
                <td>"""),_display_(/*41.22*/u/*41.23*/.getPassword),format.raw/*41.35*/("""</td>

                """),_display_(/*43.18*/if((user != null) && ("admin".equals(user.getRole())))/*43.72*/ {_display_(Seq[Any](format.raw/*43.74*/("""
                    """),format.raw/*44.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.deleteLandlord(u.getEmail())),format.raw/*46.85*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*53.35*/routes/*53.41*/.HomeController.updateLandlord(u.getEmail())),format.raw/*53.85*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"></span>
                        </a>
                    </td>
                """)))}),format.raw/*57.18*/("""

                """),format.raw/*59.17*/("""</tr>
                """)))}),format.raw/*60.18*/("""
        """),format.raw/*61.9*/("""</tbody>
    </table>
    <p>
        <a href=""""),_display_(/*64.19*/routes/*64.25*/.HomeController.addLandlord()),format.raw/*64.54*/("""">
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
                <th>Email</th>
                <th>Role</th>
                <th>Name</th>
                <th>Password</th>
            </tr>
        </thead>

        <tbody>
            <!-- Product row(s) -->

            <!-- Loop for creating rows from the users data -->
            """),_display_(/*88.14*/for(u<-aList) yield /*88.27*/ {_display_(Seq[Any](format.raw/*88.29*/(""" 
                """),format.raw/*89.17*/("""<tr>
                <td>"""),_display_(/*90.22*/u/*90.23*/.getEmail),format.raw/*90.32*/("""</td>
                <td>"""),_display_(/*91.22*/u/*91.23*/.getRole),format.raw/*91.31*/("""</td>
                <td>"""),_display_(/*92.22*/u/*92.23*/.getFname),format.raw/*92.32*/("""</td>
                <td>"""),_display_(/*93.22*/u/*93.23*/.getPassword),format.raw/*93.35*/("""</td>

                """),_display_(/*95.18*/if((user != null) && ("admin".equals(user.getRole())))/*95.72*/ {_display_(Seq[Any](format.raw/*95.74*/("""
                    """),format.raw/*96.21*/("""<!-- Delete button -->
                    <td>
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.HomeController.deleteAdmin(u.getEmail())),format.raw/*98.82*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                
                    <!-- Update button -->
                    <td>
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.HomeController.updateAdmin(u.getEmail())),format.raw/*105.82*/("""" class="button-xs btn-danger">
                            <span class="glyphicon-pencil"></span>
                        </a>
                    </td>
                """)))}),format.raw/*109.18*/("""

                """),format.raw/*111.17*/("""</tr>
                """)))}),format.raw/*112.18*/("""
        """),format.raw/*113.9*/("""</tbody>
    </table>

    <div class="col-sm-9">
        <h4>Here are all the current Members on the system.</h4>
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
                """),_display_(/*133.18*/for(u<-mList) yield /*133.31*/ {_display_(Seq[Any](format.raw/*133.33*/(""" 
                    """),format.raw/*134.21*/("""<tr>
                    <td>"""),_display_(/*135.26*/u/*135.27*/.getEmail),format.raw/*135.36*/("""</td>
                    <td>"""),_display_(/*136.26*/u/*136.27*/.getRole),format.raw/*136.35*/("""</td>
                    <td>"""),_display_(/*137.26*/u/*137.27*/.getFname),format.raw/*137.36*/("""</td>
                    <td>"""),_display_(/*138.26*/u/*138.27*/.getPassword),format.raw/*138.39*/("""</td>
    
                    """),_display_(/*140.22*/if((user != null) && ("admin".equals(user.getRole())))/*140.76*/ {_display_(Seq[Any](format.raw/*140.78*/("""
                        """),format.raw/*141.25*/("""<!-- Delete button -->
                        <td>
                            <a href=""""),_display_(/*143.39*/routes/*143.45*/.HomeController.deleteMember(u.getEmail())),format.raw/*143.87*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    
                        <!-- Update button -->
                        <td>
                            <a href=""""),_display_(/*150.39*/routes/*150.45*/.HomeController.updateMember(u.getEmail())),format.raw/*150.87*/("""" class="button-xs btn-danger">
                                <span class="glyphicon-pencil"></span>
                            </a>
                        </td>
                    """)))}),format.raw/*154.22*/("""
    
                    """),format.raw/*156.21*/("""</tr>
                    """)))}),format.raw/*157.22*/("""
            """),format.raw/*158.13*/("""</tbody>
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
                  DATE: Sun Apr 28 20:52:15 CEST 2019
                  SOURCE: /home/wdd/collegeLastThisOneActually/PlayReminder/app/views/viewUsers.scala.html
                  HASH: 30a3b02f1a662b7a2571cc09bea411e5edd90451
                  MATRIX: 1063->1|1315->161|1344->182|1383->184|1410->185|1500->250|1540->282|1579->284|1606->285|1670->324|1683->329|1718->344|1745->345|1783->353|1812->355|2385->901|2417->917|2457->919|2503->937|2556->963|2651->1048|2692->1050|2745->1075|2816->1119|2863->1145|2912->1176|2925->1181|2964->1182|3017->1207|3137->1296|3183->1314|3215->1319|3225->1320|3255->1329|3309->1356|3319->1357|3348->1365|3402->1392|3412->1393|3442->1402|3496->1429|3506->1430|3539->1442|3590->1466|3653->1520|3693->1522|3742->1543|3851->1625|3866->1631|3931->1675|4271->1988|4286->1994|4351->2038|4553->2209|4599->2227|4653->2250|4689->2259|4764->2307|4779->2313|4829->2342|5474->2960|5503->2973|5543->2975|5589->2993|5642->3019|5652->3020|5682->3029|5736->3056|5746->3057|5775->3065|5829->3092|5839->3093|5869->3102|5923->3129|5933->3130|5966->3142|6017->3166|6080->3220|6120->3222|6169->3243|6278->3325|6293->3331|6355->3372|6696->3685|6712->3691|6775->3732|6978->3903|7025->3921|7080->3944|7117->3953|7753->4561|7783->4574|7824->4576|7875->4598|7933->4628|7944->4629|7975->4638|8034->4669|8045->4670|8075->4678|8134->4709|8145->4710|8176->4719|8235->4750|8246->4751|8280->4763|8340->4795|8404->4849|8445->4851|8499->4876|8617->4966|8633->4972|8697->5014|9066->5355|9082->5361|9146->5403|9365->5590|9420->5616|9479->5643|9521->5656
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|67->36|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|84->53|84->53|84->53|88->57|90->59|91->60|92->61|95->64|95->64|95->64|119->88|119->88|119->88|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|126->95|126->95|126->95|127->96|129->98|129->98|129->98|136->105|136->105|136->105|140->109|142->111|143->112|144->113|164->133|164->133|164->133|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|171->140|171->140|171->140|172->141|174->143|174->143|174->143|181->150|181->150|181->150|185->154|187->156|188->157|189->158
                  -- GENERATED --
              */
          