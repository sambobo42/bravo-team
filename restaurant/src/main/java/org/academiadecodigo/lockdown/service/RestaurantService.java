package org.academiadecodigo.lockdown.service;

import org.academiadecodigo.lockdown.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    public List<Restaurant> findAll();

    public Restaurant findById(int theId);

    public void save(Restaurant restaurant);

    public void deleteById(int theId);
}
