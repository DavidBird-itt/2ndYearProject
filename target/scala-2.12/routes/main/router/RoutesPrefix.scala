// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/PlayReminder/conf/routes
// @DATE:Fri Mar 29 16:08:04 GMT 2019


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
