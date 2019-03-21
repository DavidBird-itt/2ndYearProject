// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/PlayReminder/conf/routes
// @DATE:Thu Mar 21 12:59:02 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def database(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "database")
    }
  
    // @LINE:40
    def createAccount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createAccount")
    }
  
    // @LINE:35
    def addLandlord(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addLandlord")
    }
  
    // @LINE:30
    def addHouseSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addHouseSubmit")
    }
  
    // @LINE:42
    def addMemberSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addMemberSubmit")
    }
  
    // @LINE:38
    def deleteLandlord(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteLandlord/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:37
    def updateLandlord(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateLandlord/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:25
    def payment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:36
    def addLandlordSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addLandlordSubmit")
    }
  
    // @LINE:44
    def deleteMember(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:32
    def updateHouse(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateHouse/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:43
    def updateMember(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:31
    def deleteHouse(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteHouse/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def landlord(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "landlord")
    }
  
    // @LINE:41
    def addMember(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addMember")
    }
  
    // @LINE:29
    def addHouse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addHouse")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:16
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
