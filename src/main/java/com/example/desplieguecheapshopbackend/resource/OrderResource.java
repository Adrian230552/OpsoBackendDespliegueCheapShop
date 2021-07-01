package com.example.desplieguecheapshopbackend.resource;

import com.example.desplieguecheapshopbackend.domain.model.AuditModel;

public class OrderResource extends AuditModel {

    private Long id;
    private String date;
    private String delivery_address;
    private String delivery_date;
    private Double order_amount;


    public Long getId() {
        return id;
    }

    public OrderResource setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public OrderResource setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDeliveryAddress() {
        return delivery_address;
    }

    public OrderResource setDeliveryAddress(String delivery_address) {
        this.delivery_address = delivery_address;
        return this;
    }

    public String getDeliveryDate() {
        return delivery_date;
    }

    public OrderResource setDeliveryDate(String delivery_date) {
        this.delivery_date  = delivery_date;
        return this;
    }


    public Double getOrderAmount() {
        return order_amount;
    }

    public OrderResource setOrderAmount(Double order_amount) {
        this.order_amount = order_amount;
        return this;
    }


}