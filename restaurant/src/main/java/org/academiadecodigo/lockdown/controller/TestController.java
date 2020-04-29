package org.academiadecodigo.lockdown.controller;


import org.academiadecodigo.lockdown.dao.GenericJpaDao;
import org.academiadecodigo.lockdown.model.RestaurantModel;
import org.academiadecodigo.lockdown.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

    private RestaurantServiceImpl restaurantService;

    @Autowired
    public void setRestaurantService(RestaurantServiceImpl restaurantService) {
        this.restaurantService = restaurantService;
    }

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

    @RequestMapping(method = RequestMethod.POST , path = "/register", params = "action=done")
    public String registerSubmit(@ModelAttribute RestaurantModel restaurant, RedirectAttributes redirectAttributes){
        restaurantService.save(restaurant);
        redirectAttributes.addFlashAttribute("lastAction", "Successfully Added");
        return "redirect:/list";
    }

    @RequestMapping(method = RequestMethod.GET , path = "/")
    public String serveTestPageFour(){
        return "home";
    }


}
