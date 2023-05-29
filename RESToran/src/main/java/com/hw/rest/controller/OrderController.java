package com.hw.rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hw.rest.responses.*;
import com.hw.rest.requests.*;
import com.hw.rest.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create-order")
    public ResponseEntity<Response> createOrder(@RequestBody CreateOrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.createOrder(orderRequest));
    }

    @PostMapping(path = "/get-order")
    public ResponseEntity<Response> getOrder(@RequestBody GetOrderRequest orderRequest) throws JsonProcessingException {
        return ResponseEntity.ok(orderService.getOrder(orderRequest));
    }

}