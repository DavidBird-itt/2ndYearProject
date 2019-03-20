// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/play/PlayReminder/conf/routes
// @DATE:Wed Mar 20 20:14:59 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_3: controllers.Assets,
  // @LINE:16
  LoginController_4: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_3: controllers.Assets,
    // @LINE:16
    LoginController_4: controllers.LoginController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_3, LoginController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_3, LoginController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.HomeController.payment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """database""", """controllers.HomeController.database"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addHouse""", """controllers.HomeController.addHouse"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addHouseSubmit""", """controllers.HomeController.addHouseSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteHouse/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteHouse(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateHouse/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateHouse(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """landlord""", """controllers.HomeController.landlord"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLandlord""", """controllers.HomeController.addLandlord"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLandlordSubmit""", """controllers.HomeController.addLandlordSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateLandlord/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateLandlord(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteLandlord/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteLandlord(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createAccount""", """controllers.HomeController.createAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMember""", """controllers.HomeController.addMember"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMemberSubmit""", """controllers.HomeController.addMemberSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateMember/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateMember(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteMember/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteMember(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_LoginController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login4_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """GET from LoginController""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_loginSubmit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit5_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout6_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_payment7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_HomeController_payment7_invoker = createInvoker(
    HomeController_1.payment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "payment",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_database8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("database")))
  )
  private[this] lazy val controllers_HomeController_database8_invoker = createInvoker(
    HomeController_1.database,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "database",
      Nil,
      "GET",
      this.prefix + """database""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_addHouse9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addHouse")))
  )
  private[this] lazy val controllers_HomeController_addHouse9_invoker = createInvoker(
    HomeController_1.addHouse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addHouse",
      Nil,
      "GET",
      this.prefix + """addHouse""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_addHouseSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addHouseSubmit")))
  )
  private[this] lazy val controllers_HomeController_addHouseSubmit10_invoker = createInvoker(
    HomeController_1.addHouseSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addHouseSubmit",
      Nil,
      "POST",
      this.prefix + """addHouseSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_deleteHouse11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteHouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteHouse11_invoker = createInvoker(
    HomeController_1.deleteHouse(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteHouse",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteHouse/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_updateHouse12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateHouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateHouse12_invoker = createInvoker(
    HomeController_1.updateHouse(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateHouse",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateHouse/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_landlord13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("landlord")))
  )
  private[this] lazy val controllers_HomeController_landlord13_invoker = createInvoker(
    HomeController_1.landlord,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "landlord",
      Nil,
      "GET",
      this.prefix + """landlord""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_addLandlord14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLandlord")))
  )
  private[this] lazy val controllers_HomeController_addLandlord14_invoker = createInvoker(
    HomeController_1.addLandlord,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addLandlord",
      Nil,
      "GET",
      this.prefix + """addLandlord""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_addLandlordSubmit15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLandlordSubmit")))
  )
  private[this] lazy val controllers_HomeController_addLandlordSubmit15_invoker = createInvoker(
    HomeController_1.addLandlordSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addLandlordSubmit",
      Nil,
      "POST",
      this.prefix + """addLandlordSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_updateLandlord16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateLandlord/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateLandlord16_invoker = createInvoker(
    HomeController_1.updateLandlord(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateLandlord",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateLandlord/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_deleteLandlord17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteLandlord/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteLandlord17_invoker = createInvoker(
    HomeController_1.deleteLandlord(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteLandlord",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteLandlord/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_createAccount18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createAccount")))
  )
  private[this] lazy val controllers_HomeController_createAccount18_invoker = createInvoker(
    HomeController_1.createAccount,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createAccount",
      Nil,
      "GET",
      this.prefix + """createAccount""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_addMember19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMember")))
  )
  private[this] lazy val controllers_HomeController_addMember19_invoker = createInvoker(
    HomeController_1.addMember,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMember",
      Nil,
      "GET",
      this.prefix + """addMember""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_addMemberSubmit20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMemberSubmit")))
  )
  private[this] lazy val controllers_HomeController_addMemberSubmit20_invoker = createInvoker(
    HomeController_1.addMemberSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMemberSubmit",
      Nil,
      "POST",
      this.prefix + """addMemberSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_updateMember21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateMember/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateMember21_invoker = createInvoker(
    HomeController_1.updateMember(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateMember",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateMember/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_deleteMember22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteMember/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteMember22_invoker = createInvoker(
    HomeController_1.deleteMember(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteMember",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteMember/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_LoginController_login4_route(params@_) =>
      call { 
        controllers_LoginController_login4_invoker.call(LoginController_4.login)
      }
  
    // @LINE:18
    case controllers_LoginController_loginSubmit5_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit5_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:20
    case controllers_LoginController_logout6_route(params@_) =>
      call { 
        controllers_LoginController_logout6_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:25
    case controllers_HomeController_payment7_route(params@_) =>
      call { 
        controllers_HomeController_payment7_invoker.call(HomeController_1.payment)
      }
  
    // @LINE:27
    case controllers_HomeController_database8_route(params@_) =>
      call { 
        controllers_HomeController_database8_invoker.call(HomeController_1.database)
      }
  
    // @LINE:29
    case controllers_HomeController_addHouse9_route(params@_) =>
      call { 
        controllers_HomeController_addHouse9_invoker.call(HomeController_1.addHouse)
      }
  
    // @LINE:30
    case controllers_HomeController_addHouseSubmit10_route(params@_) =>
      call { 
        controllers_HomeController_addHouseSubmit10_invoker.call(HomeController_1.addHouseSubmit)
      }
  
    // @LINE:31
    case controllers_HomeController_deleteHouse11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteHouse11_invoker.call(HomeController_1.deleteHouse(id))
      }
  
    // @LINE:32
    case controllers_HomeController_updateHouse12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateHouse12_invoker.call(HomeController_1.updateHouse(id))
      }
  
    // @LINE:34
    case controllers_HomeController_landlord13_route(params@_) =>
      call { 
        controllers_HomeController_landlord13_invoker.call(HomeController_1.landlord)
      }
  
    // @LINE:35
    case controllers_HomeController_addLandlord14_route(params@_) =>
      call { 
        controllers_HomeController_addLandlord14_invoker.call(HomeController_1.addLandlord)
      }
  
    // @LINE:36
    case controllers_HomeController_addLandlordSubmit15_route(params@_) =>
      call { 
        controllers_HomeController_addLandlordSubmit15_invoker.call(HomeController_1.addLandlordSubmit)
      }
  
    // @LINE:37
    case controllers_HomeController_updateLandlord16_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateLandlord16_invoker.call(HomeController_1.updateLandlord(id))
      }
  
    // @LINE:38
    case controllers_HomeController_deleteLandlord17_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteLandlord17_invoker.call(HomeController_1.deleteLandlord(id))
      }
  
    // @LINE:40
    case controllers_HomeController_createAccount18_route(params@_) =>
      call { 
        controllers_HomeController_createAccount18_invoker.call(HomeController_1.createAccount)
      }
  
    // @LINE:41
    case controllers_HomeController_addMember19_route(params@_) =>
      call { 
        controllers_HomeController_addMember19_invoker.call(HomeController_1.addMember)
      }
  
    // @LINE:42
    case controllers_HomeController_addMemberSubmit20_route(params@_) =>
      call { 
        controllers_HomeController_addMemberSubmit20_invoker.call(HomeController_1.addMemberSubmit)
      }
  
    // @LINE:43
    case controllers_HomeController_updateMember21_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateMember21_invoker.call(HomeController_1.updateMember(id))
      }
  
    // @LINE:44
    case controllers_HomeController_deleteMember22_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteMember22_invoker.call(HomeController_1.deleteMember(id))
      }
  }
}
