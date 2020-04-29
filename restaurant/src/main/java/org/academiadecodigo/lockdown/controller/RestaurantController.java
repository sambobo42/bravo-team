package org.academiadecodigo.lockdown.controller;

import org.academiadecodigo.lockdown.entity.Restaurant;
import org.academiadecodigo.lockdown.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/list")
public class RestaurantController {


    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // get employees from db
        List<Restaurant> theRestaurants = RestaurantService.findAll();

        // add to the spring model
        theModel.addAttribute("restaurants", theRestaurants); //todo

        return "employees/list-employees"; //todo
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Restaurant restaurant = new Restaurant();

        theModel.addAttribute("restaurant", restaurant); //todo

        return "employees/employee-form"; //todo
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("restaurant") Restaurant restaurant) {

        // save the employee
        restaurantService.save(restaurant);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list"; //todo
    }



}
