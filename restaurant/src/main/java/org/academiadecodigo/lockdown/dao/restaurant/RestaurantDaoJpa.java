package org.academiadecodigo.lockdown.dao.restaurant;

import org.academiadecodigo.lockdown.dao.GenericJpaDao;
import org.academiadecodigo.lockdown.model.RestaurantModel;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDaoJpa extends GenericJpaDao<RestaurantModel> {

    public RestaurantDaoJpa() {
        super(RestaurantModel.class);
    }
}
