// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/play/PlayReminder/conf/routes
// @DATE:Tue Apr 16 15:10:09 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def database: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.database",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "database"})
        }
      """
    )
  
    // @LINE:48
    def createAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createAccount"})
        }
      """
    )
  
    // @LINE:43
    def addLandlord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addLandlord",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addLandlord"})
        }
      """
    )
  
    // @LINE:33
    def addHouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addHouseSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addHouseSubmit"})
        }
      """
    )
  
    // @LINE:50
    def addMemberSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addMemberSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addMemberSubmit"})
        }
      """
    )
  
    // @LINE:40
    def updateApartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateApartment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateApartment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:46
    def deleteLandlord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteLandlord",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteLandlord/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:45
    def updateLandlord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateLandlord",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateLandlord/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:37
    def addApartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addApartment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addApartment"})
        }
      """
    )
  
    // @LINE:54
    def addAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addAdmin"})
        }
      """
    )
  
    // @LINE:42
    def viewUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewUsers"})
        }
      """
    )
  
    // @LINE:56
    def updateAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:44
    def addLandlordSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addLandlordSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addLandlordSubmit"})
        }
      """
    )
  
    // @LINE:57
    def deleteAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:52
    def deleteMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteMember",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteMember/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:35
    def updateHouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateHouse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateHouse/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:51
    def updateMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateMember",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateMember/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def viewHouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewHouse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "house/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:30
    def searchDB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.searchDB",
      """
        function(min0,max1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchQuery" + _qS([(min0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("min", min0)), (max1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("max", max1))])})
        }
      """
    )
  
    // @LINE:38
    def addApartmentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addApartmentSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addApartmentSubmit"})
        }
      """
    )
  
    // @LINE:34
    def deleteHouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteHouse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteHouse/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def deleteApartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteApartment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteApartment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:49
    def addMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addMember",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addMember"})
        }
      """
    )
  
    // @LINE:32
    def addHouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addHouse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addHouse"})
        }
      """
    )
  
    // @LINE:26
    def viewApartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewApartment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "apartment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:55
    def addAdminSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addAdminSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addAdminSubmit"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:20
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:64
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:63
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:61
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:59
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
    // @LINE:62
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }


}
