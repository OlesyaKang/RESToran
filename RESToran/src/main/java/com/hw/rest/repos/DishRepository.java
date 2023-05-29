package com.hw.rest.repos;

import com.hw.rest.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DishRepository extends CrudRepository<Dish, Integer> {
    List<Dish> findAll();
}
