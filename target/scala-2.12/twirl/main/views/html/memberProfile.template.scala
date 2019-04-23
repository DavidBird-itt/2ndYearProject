
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

object memberProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.Member,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(member: models.users.Member, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Member Profile", user)/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""
   
"""),format.raw/*4.1*/("""<div id ="profile">
        <div class="container-fluid">
          <div class="row">
            <div class="panel panel-default">
              <div class="panel-heading">
                  """),_display_(/*9.20*/if((user != null) && (member == user))/*9.58*/{_display_(Seq[Any](format.raw/*9.59*/("""
                    """),format.raw/*10.21*/("""<a href=""""),_display_(/*10.31*/routes/*10.37*/.HomeController.updateMember(user.getEmail)),format.raw/*10.80*/(""""><i class="fas fa-edit"></i></a>
                    """)))}),format.raw/*11.22*/("""
        
                
                """),format.raw/*14.17*/("""<h4>User Profile</h4>
              </div>
              <div class="panel-body">
                <div class="col-md-4 col-xs-12 col-sm-6 col-lg-4">
                        """),_display_(/*18.26*/if(env.resource("public/images/projectImages/" + member.getEmail + "thumb.jpg").isDefined)/*18.116*/ {_display_(Seq[Any](format.raw/*18.118*/("""
                            """),format.raw/*19.29*/("""<img src="/assets/images/projectImages/"""),_display_(/*19.69*/(member.getEmail + "thumb.jpg")),format.raw/*19.100*/(""""/  id="profile-image1" class="img-circle img-responsive">
                            """)))}/*20.31*/else/*20.36*/{_display_(Seq[Any](format.raw/*20.37*/("""
                                """),format.raw/*21.33*/("""<img src="avatar.png" alt="Avatar" class="avatar"
                                id="profile-image1" class="img-circle img-responsive">
                            """)))}),format.raw/*23.30*/("""
                  
        
        
                """),format.raw/*27.17*/("""</div>
                <div class="col-md-8 col-xs-4">
                  <div class="container">
                    <h2>"""),_display_(/*30.26*/member/*30.32*/.getFname()),format.raw/*30.43*/(""" """),_display_(/*30.45*/member/*30.51*/.getLname()),format.raw/*30.62*/("""</h2>
                    <p><b>Member</b></p>
        
        
                  </div>
                  <hr>
                  <ul class="container details">
                    
                    <li>
                      <p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>"""),_display_(/*39.101*/member/*39.107*/.getEmail()),format.raw/*39.118*/("""</p>
                    </li>
                  </ul>
                  <hr>
                  <div class="col-sm-5 col-xs-6 tital ">Date Of Joining: 15 Jun 2016</div>
                </div>
              </div>
            </div>
          </div>
        </div>
        </div>
         
""")))}))
      }
    }
  }

  def render(member:models.users.Member,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(member,user,env)

  def f:((models.users.Member,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (member,user,env) => apply(member,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 17:31:37 IST 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/memberProfile.scala.html
                  HASH: f0e42730b95b35bf0820dc3946c154360112aa53
                  MATRIX: 1008->1|1183->84|1219->112|1258->114|1289->119|1508->312|1554->350|1592->351|1641->372|1678->382|1693->388|1757->431|1843->486|1914->529|2115->703|2215->793|2256->795|2313->824|2380->864|2433->895|2540->984|2553->989|2592->990|2653->1023|2850->1189|2932->1243|3081->1365|3096->1371|3128->1382|3157->1384|3172->1390|3204->1401|3540->1709|3556->1715|3589->1726
                  LINES: 28->1|33->2|33->2|33->2|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|45->14|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|54->23|58->27|61->30|61->30|61->30|61->30|61->30|61->30|70->39|70->39|70->39
                  -- GENERATED --
              */
          