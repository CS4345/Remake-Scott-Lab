
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Thu Mar 09 11:18:51 CST 2023

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def info: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.info",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def updateAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/update"})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:13
    def registerNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerNew",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:17
    def checkUpdateStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.checkUpdateStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAccountStatus"})
        }
      """
    )
  
  }


}
