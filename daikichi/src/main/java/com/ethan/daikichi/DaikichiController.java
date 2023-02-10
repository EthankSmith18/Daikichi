package com.ethan.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

  @RequestMapping("")
  public String index(){
    return "Hello JOAN";
  }

  @RequestMapping("/today")
  public String today(){
    return "Today you will find luck in all areas.";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow(){
    return "Tomorrow, an opportunity will arise!";
  }

}
