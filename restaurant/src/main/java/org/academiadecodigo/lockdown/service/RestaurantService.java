package org.academiadecodigo.lockdown.service;


import org.academiadecodigo.lockdown.model.RestaurantModel;

import java.util.List;

public interface RestaurantService {

    public List<RestaurantModel> findAll();

    public RestaurantModel findById(int theId);

    public void save(RestaurantModel restaurant);

    public void deleteById(int theId);
}
