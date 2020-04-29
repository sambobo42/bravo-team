package org.academiadecodigo.lockdown.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET , path = "/")
    public String serveTestPage(){
        return "restaurantList";
    }

}
