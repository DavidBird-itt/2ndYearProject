// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/play/PlayReminder/conf/routes
// @DATE:Tue Apr 16 15:10:09 IST 2019


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
