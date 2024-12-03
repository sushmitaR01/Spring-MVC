package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BadLuckComp {
  public   BadLuckComp(){
      System.out.println("Running in a BadLuckComp");

  }
  @RequestMapping("/save")
  public String onSave(){
      System.out.println("Running in a onSave");
      return "index.jsp";
  }
    @RequestMapping("/press")
    public String onPress()
    {
        System.out.println("running onPress in WindowComponent");
        return "index.jsp";
    }
}
