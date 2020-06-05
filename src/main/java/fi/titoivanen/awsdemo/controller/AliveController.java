package fi.titoivanen.awsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String sayHello() {
    return "Hello from AliveController! try /alive.";
  }

  @RequestMapping(value = "/alive", method = RequestMethod.GET)
  public String isAlive() {
    return "Hello from AliveController. This is updated alive endpoint.";
  }
}
