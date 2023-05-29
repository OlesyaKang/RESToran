package com.hw.rest.requests;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {

    private int user_id;

    private List<PositionRequest> positions;

    private String special_requests;

}