package org.academiadecodigo.lockdown.controller;


import org.academiadecodigo.lockdown.model.RestaurantModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String serveRegisterForm(Model model) {
        model.addAttribute("restaurant", new RestaurantModel());
        return "html-form";
    }

    @RequestMapping(method = RequestMethod.POST , path = "/register")
    public String registerSubmit(@ModelAttribute RestaurantModel restaurant){
        return "redirect:/list";
    }

}
