
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.ItemOnSale],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.ItemOnSale], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""
"""),_display_(/*2.2*/main("On Sale", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
	"""),format.raw/*3.2*/("""<h1>On sale here</h1>

	"""),format.raw/*5.71*/("""
	"""),_display_(/*6.3*/if(flash.containsKey("success"))/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
		"""),format.raw/*7.3*/("""<div class="alert alert-success">
			"""),_display_(/*8.5*/flash/*8.10*/.get("success")),format.raw/*8.25*/("""
		"""),format.raw/*9.3*/("""</div>
	""")))}),format.raw/*10.3*/("""

	"""),format.raw/*12.2*/("""<div class="col-sm-3">
		<h4>Categories</h4>
		<div class="list-group">
			<a href=""""),_display_(/*15.14*/routes/*15.20*/.HomeController.onsale(0)),format.raw/*15.45*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*16.5*/for(c<-categories) yield /*16.23*/ {_display_(Seq[Any](format.raw/*16.25*/("""
				"""),format.raw/*17.5*/("""<a href=""""),_display_(/*17.15*/routes/*17.21*/.HomeController.onsale(c.getId)),format.raw/*17.52*/("""" class="list-group-item catheight">"""),_display_(/*17.89*/c/*17.90*/.getName),format.raw/*17.98*/("""
					"""),format.raw/*18.6*/("""<span class="badge">"""),_display_(/*18.27*/c/*18.28*/.getItems.size),format.raw/*18.42*/("""</span>
				</a>
			""")))}),format.raw/*20.5*/("""
		"""),format.raw/*21.3*/("""</div>
	</div>

	<div class="col-sm-9">
		<h4>Note that all products are second hand, unless otherwise stated.</h4>
		<table class="table table-bordered table-hover table-condensed">
			<thead>
				<!-- The header row-->
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Category</th>
					<th>Description</th>
					<th>Stock</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				"""),format.raw/*39.60*/("""
				"""),_display_(/*40.6*/for(i<-items) yield /*40.19*/ {_display_(Seq[Any](format.raw/*40.21*/("""
					"""),format.raw/*41.6*/("""<tr>
						<td>"""),_display_(/*42.12*/i/*42.13*/.getId),format.raw/*42.19*/("""</td>
						<td>"""),_display_(/*43.12*/i/*43.13*/.getName),format.raw/*43.21*/("""</td>
						<td>"""),_display_(/*44.12*/i/*44.13*/.getCategory.getName),format.raw/*44.33*/("""</td>
						<td>"""),_display_(/*45.12*/i/*45.13*/.getDescription),format.raw/*45.28*/("""</td>
						<td>"""),_display_(/*46.12*/i/*46.13*/.getStock),format.raw/*46.22*/("""</td>
						<td>&euro; """),_display_(/*47.19*/("%.2f".format(i.getPrice))),format.raw/*47.46*/("""</td>
						<!-- Update button -->
						<td>
							<a href=""""),_display_(/*50.18*/routes/*50.24*/.HomeController.updateItem(i.getId)),format.raw/*50.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
						</td>
						<!-- Delete button -->
						<td>
							<a href=""""),_display_(/*56.18*/routes/*56.24*/.HomeController.deleteItem(i.getId)),format.raw/*56.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
						</td>
					</tr>
				""")))}),format.raw/*61.6*/("""
			"""),format.raw/*62.4*/("""</tbody>
		</table>
		<p>
			<a href=""""),_display_(/*65.14*/routes/*65.20*/.HomeController.addItem()),format.raw/*65.45*/("""">
				<button class="btn btn-primary">Add an item</button>
			</a>
		</p>
	</div>
""")))}),format.raw/*70.2*/("""	



"""))
      }
    }
  }

  def render(items:List[models.ItemOnSale],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user)

  def f:((List[models.ItemOnSale],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user) => apply(items,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 01 17:48:10 GMT 2018
                  SOURCE: /home/jvk/wdd1labs/LabWork/WDD1PlayLab/app/views/onsale.scala.html
                  HASH: b6e19f1b873d20601004090554b94bdb7a75c772
                  MATRIX: 1006->1|1193->93|1221->96|1250->117|1288->118|1317->121|1370->216|1399->220|1439->252|1478->254|1508->258|1572->297|1585->302|1620->317|1650->321|1690->331|1722->336|1837->424|1852->430|1898->455|1974->505|2008->523|2048->525|2081->531|2118->541|2133->547|2185->578|2249->615|2259->616|2288->624|2322->631|2370->652|2380->653|2415->667|2468->690|2499->694|2937->1159|2970->1166|2999->1179|3039->1181|3073->1188|3117->1205|3127->1206|3154->1212|3199->1230|3209->1231|3238->1239|3283->1257|3293->1258|3334->1278|3379->1296|3389->1297|3425->1312|3470->1330|3480->1331|3510->1340|3562->1365|3610->1392|3703->1458|3718->1464|3774->1499|3977->1675|3992->1681|4048->1716|4242->1880|4274->1885|4343->1927|4358->1933|4404->1958|4523->2047
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|42->10|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|71->39|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|82->50|82->50|82->50|88->56|88->56|88->56|93->61|94->62|97->65|97->65|97->65|102->70
                  -- GENERATED --
              */
          