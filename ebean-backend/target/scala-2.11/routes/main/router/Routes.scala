
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/conf/routes
// @DATE:Fri Mar 10 15:01:48 CST 2023

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:21
  ApplicationController_2: controllers.ApplicationController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:21
    ApplicationController_2: controllers.ApplicationController
  ) = this(errorHandler, HomeController_0, UserController_1, ApplicationController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, ApplicationController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """info""", """controllers.HomeController.info()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getAccountStatus""", """controllers.UserController.checkUpdateStatus()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/update""", """controllers.UserController.updateAccount()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitApplication""", """controllers.ApplicationController.submitApplication()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """applicationForm/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.showApplicationForm(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """username<[^/]+>""", """controllers.UserController.getUser(username:String)"""),
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
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_info3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("info")))
  )
  private[this] lazy val controllers_HomeController_info3_invoker = createInvoker(
    HomeController_0.info(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "info",
      Nil,
      "GET",
      """""",
      this.prefix + """info"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_checkUpdateStatus4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getAccountStatus")))
  )
  private[this] lazy val controllers_UserController_checkUpdateStatus4_invoker = createInvoker(
    UserController_1.checkUpdateStatus(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "checkUpdateStatus",
      Nil,
      "GET",
      """ Update User Account Completion Status {"shouldUpdate": true/false}""",
      this.prefix + """users/getAccountStatus"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_updateAccount5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/update")))
  )
  private[this] lazy val controllers_UserController_updateAccount5_invoker = createInvoker(
    UserController_1.updateAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateAccount",
      Nil,
      "POST",
      """ Sending update to backend and perform update account""",
      this.prefix + """users/update"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ApplicationController_submitApplication6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitApplication")))
  )
  private[this] lazy val controllers_ApplicationController_submitApplication6_invoker = createInvoker(
    ApplicationController_2.submitApplication(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "submitApplication",
      Nil,
      "POST",
      """""",
      this.prefix + """submitApplication"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ApplicationController_showApplicationForm7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("applicationForm/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_showApplicationForm7_invoker = createInvoker(
    ApplicationController_2.showApplicationForm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "showApplicationForm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """applicationForm/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UserController_getUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser8_invoker = createInvoker(
    UserController_1.getUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """users/""" + "$" + """username<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:13
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:14
    case controllers_HomeController_info3_route(params) =>
      call { 
        controllers_HomeController_info3_invoker.call(HomeController_0.info())
      }
  
    // @LINE:17
    case controllers_UserController_checkUpdateStatus4_route(params) =>
      call { 
        controllers_UserController_checkUpdateStatus4_invoker.call(UserController_1.checkUpdateStatus())
      }
  
    // @LINE:20
    case controllers_UserController_updateAccount5_route(params) =>
      call { 
        controllers_UserController_updateAccount5_invoker.call(UserController_1.updateAccount())
      }
  
    // @LINE:21
    case controllers_ApplicationController_submitApplication6_route(params) =>
      call { 
        controllers_ApplicationController_submitApplication6_invoker.call(ApplicationController_2.submitApplication())
      }
  
    // @LINE:22
    case controllers_ApplicationController_showApplicationForm7_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showApplicationForm7_invoker.call(ApplicationController_2.showApplicationForm(username))
      }
  
    // @LINE:23
    case controllers_UserController_getUser8_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_UserController_getUser8_invoker.call(UserController_1.getUser(username))
      }
  }
}
