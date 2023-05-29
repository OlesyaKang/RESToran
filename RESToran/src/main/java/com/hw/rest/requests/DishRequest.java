package com.hw.rest.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DishRequest {

    private String name;

    private String description;

    private BigDecimal price;

    private int quantity;

    private boolean is_available;

}