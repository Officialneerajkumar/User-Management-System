package com.Restaurant.RestaurantApp.service;

import com.Restaurant.RestaurantApp.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurants= new ArrayList<>();

    static {
        restaurants.add(new Restaurant("Paradise","Orai",43586,"Jayke Ki yatra",150));
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public List<Restaurant> findall(){
        return restaurants;
    }
}
