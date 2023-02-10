package com.ethan.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {

  @RequestMapping("/daikichi")
  public String index(){
    return "Hello JOAN";
  }

  @RequestMapping("/daikichi/today")
  public String today(){
    return "Today you will find luck in all areas.";
  }

  @RequestMapping("/daikichi/tomorrow")
  public String tomorrow(){
    return "Tomorrow, an opportunity will arise!";
  }

}
