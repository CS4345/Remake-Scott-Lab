// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab/Frontend/conf/routes
// @DATE:Thu Mar 09 23:42:35 CST 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def submissionHandler(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submitApplication")
    }
  
    // @LINE:16
    def applyHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "applicationForm")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:14
    def updateHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateInfo")
    }
  
    // @LINE:12
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
