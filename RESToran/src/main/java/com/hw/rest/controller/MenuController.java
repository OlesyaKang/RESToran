package com.hw.rest.controller;

import com.hw.rest.model.*;
import com.hw.rest.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MenuController {

    @Autowired
    private DishService dishService;

    @GetMapping("/menu")
    public List<Dish> getMenu() {
        return dishService.getAvailablePositions();
    }
}