package org.academiadecodigo.lockdown.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET , path = "/list")
    public String serveTestPage(){
        return "restaurantList";
    }

    @RequestMapping(method = RequestMethod.GET , path = "/page")
    public String serveTestPageTwo(){
        return "restaurantPage";
    }

    @RequestMapping(method = RequestMethod.GET , path = "/register")
    public String serveTestPageThree(){
        return "html-form";
    }

}
