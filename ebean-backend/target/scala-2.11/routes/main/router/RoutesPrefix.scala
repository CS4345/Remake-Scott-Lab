
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ericvudeptrai/Desktop/Sprint1/Repo/Remake-Scott-Lab/ebean-backend/conf/routes
// @DATE:Fri Mar 10 15:01:48 CST 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
