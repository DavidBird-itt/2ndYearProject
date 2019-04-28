
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Shopping Basket", user)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""


"""),format.raw/*11.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*14.4*/if(flash.containsKey("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
			  """),format.raw/*15.6*/("""<div class="alert alert-success">
			      """),_display_(/*16.11*/flash/*16.16*/.get("success")),format.raw/*16.31*/("""
			  """),format.raw/*17.6*/("""</div>
		""")))}),format.raw/*18.4*/(""" 

        """),format.raw/*20.9*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    
                    <th>Item Price</th>
                    
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*30.22*/if(user.getBasket() != null)/*30.50*/ {_display_(Seq[Any](format.raw/*30.52*/("""
                        """),format.raw/*31.25*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*32.26*/for(i <- user.getBasket().getBasketItems()) yield /*32.69*/ {_display_(Seq[Any](format.raw/*32.71*/("""
                        """),format.raw/*33.25*/("""<tr>
                            <td>&euro; """),_display_(/*34.41*/("%.2f".format(i.getPrice))),format.raw/*34.68*/("""</td>

                        </tr>
                        """)))}),format.raw/*37.26*/("""<!-- End of For loop -->
                  """)))}),format.raw/*38.20*/("""
                """),format.raw/*39.17*/("""</tbody>
            </table>

		
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*45.69*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*45.115*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*51.31*/routes/*51.37*/.ShoppingCtrl.emptyBasket()),format.raw/*51.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*57.31*/routes/*57.37*/.ShoppingCtrl.placeOrder()),format.raw/*57.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*67.24*/("""{"""),format.raw/*67.25*/("""
		"""),format.raw/*68.3*/("""return confirm('Are you sure?');
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/("""
"""),format.raw/*70.1*/("""</script>
""")))}))
      }
    }
  }

  def render(user:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 16:39:02 IST 2019
                  SOURCE: /home/wdd/Desktop/PlayReminder/app/views/basket.scala.html
                  HASH: c8fe4e35066e8b06766b47c3dc9595e6efcbcfea
                  MATRIX: 962->1|1062->32|1098->62|1130->88|1183->29|1211->113|1238->115|1275->144|1314->146|1344->149|1417->196|1458->228|1498->230|1531->236|1602->280|1616->285|1652->300|1685->306|1725->316|1763->327|2113->650|2150->678|2190->680|2243->705|2357->792|2416->835|2456->837|2509->862|2581->907|2629->934|2722->996|2797->1040|2842->1057|3033->1221|3101->1267|3308->1447|3323->1453|3371->1480|3693->1775|3708->1781|3755->1807|4082->2106|4111->2107|4141->2110|4202->2144|4230->2145|4258->2146
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|39->8|39->8|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|51->20|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|65->34|65->34|68->37|69->38|70->39|76->45|76->45|82->51|82->51|82->51|88->57|88->57|88->57|98->67|98->67|99->68|100->69|100->69|101->70
                  -- GENERATED --
              */
          