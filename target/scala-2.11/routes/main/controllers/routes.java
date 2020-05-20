
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/oriol/dev/explorations/PaDEL-descriptor-ws/conf/routes
// @DATE:Wed May 20 11:38:15 CEST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
