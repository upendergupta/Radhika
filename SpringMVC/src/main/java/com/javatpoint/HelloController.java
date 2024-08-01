package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String display1(@RequestParam("name") String name, @RequestParam("pass") String pass , Model model) {

        /*String name=  http.getParameter("name");
        String password=http.getParameter("pass");*/
        String msg;
        if(name.equals("Radhika") || name.equals("Upender")){
            msg= "Hello " +  name;
            model.addAttribute("message",msg);
        }else{
            msg= "Sorry " +name +" you need enter the correct username/password";
            model.addAttribute("message",msg);
        }
        return "view";
    }






}
