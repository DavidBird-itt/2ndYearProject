// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/PlayReminder/conf/routes
// @DATE:Sun Mar 31 11:01:54 IST 2019


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
