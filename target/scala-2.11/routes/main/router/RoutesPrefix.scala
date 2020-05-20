
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/oriol/dev/explorations/PaDEL-descriptor-ws/conf/routes
// @DATE:Wed May 20 11:38:15 CEST 2020


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
