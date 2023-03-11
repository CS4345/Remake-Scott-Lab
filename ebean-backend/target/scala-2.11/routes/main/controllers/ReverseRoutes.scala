
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab - Copy/ebean-backend/conf/routes
// @DATE:Fri Mar 10 20:12:20 CST 2023

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:21
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def submitApplication(username:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "submitApplication/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:22
    def showApplicationForm(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "applicationForm/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getPositions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "positions")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def info(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "info")
    }
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def checkUpdateStatus(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/getAccountStatus")
    }
  
    // @LINE:13
    def registerNew(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:20
    def updateAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/update")
    }
  
    // @LINE:23
    def getUser(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:9
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
