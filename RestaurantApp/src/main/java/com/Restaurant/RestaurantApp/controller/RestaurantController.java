package com.Restaurant.RestaurantApp.controller;

import com.Restaurant.RestaurantApp.model.Restaurant;
import com.Restaurant.RestaurantApp.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Restaurant-app")
public class RestaurantController {

    private  RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService){ // Dependancy injection
        this.restaurantService=restaurantService;
    }
    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/find-all")
    public List<Restaurant> findAll(){
        return restaurantService.findall();
    }
}
