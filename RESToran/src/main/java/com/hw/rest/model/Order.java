package com.hw.rest.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Data
@Entity
@Table(name = "ORDER_DATA")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ORDER_ID")
    private int order_id;

    @Column(name = "USER_ID")
    private int user_id;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SPECIAL_REQUESTS")
    private String special_requests;

    @Column(name = "CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT")
    private Timestamp updatedAt;

}