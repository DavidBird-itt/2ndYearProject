// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/college2/PlayReminder/conf/routes
// @DATE:Mon Apr 01 02:44:18 CEST 2019


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
