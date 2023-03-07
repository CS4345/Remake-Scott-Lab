// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/dalla/Documents/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Fri Jan 27 14:16:32 CST 2023


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
