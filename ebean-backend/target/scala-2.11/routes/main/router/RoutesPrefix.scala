
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/diego/Desktop/SMU/cs4345/Remake-Scott-Lab - Copy/ebean-backend/conf/routes
// @DATE:Fri Mar 10 20:12:20 CST 2023


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
