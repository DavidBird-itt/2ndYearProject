// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/collegeLastThisOneActually/PlayReminder/conf/routes
// @DATE:Sun Apr 28 20:52:14 CEST 2019


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
