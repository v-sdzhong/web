package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

      @RequestMapping("/index")
      public  String  home(){
            return "index";
      }
    @RequestMapping("/welcome")
    public  String  welcome(){
        return "welcome";
    }

}
