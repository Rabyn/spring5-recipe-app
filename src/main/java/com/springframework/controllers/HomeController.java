package com.springframework.controllers;

/*
 * Created by Rabindra on 8/17/18
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("Hello All this is a test.");
        return "index";
    }
}
