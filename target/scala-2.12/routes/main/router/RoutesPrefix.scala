// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/PlayReminder/conf/routes
// @DATE:Tue Feb 26 16:55:14 GMT 2019


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
