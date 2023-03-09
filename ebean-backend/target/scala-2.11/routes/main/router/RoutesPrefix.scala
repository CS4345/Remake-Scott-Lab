
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Thu Mar 09 11:18:51 CST 2023


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
