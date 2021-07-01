package com.example.desplieguecheapshopbackend.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaveOrderResource {


    //
    @NotNull
    @NotBlank
    @Size(max=75)
    private  String date;

    @NotNull
    @NotBlank
    @Size(max=300)
    private String delivery_address;

    @NotNull
    private Double order_amount;

    @NotNull
    @NotBlank
    @Size(max=300)
    private String delivery_date;



    //


    public String getDate() {
        return date;
    }

    public SaveOrderResource setDate(String date) {
        this.date = date;
        return this;
    }
    //
    public String getDeliveryAddress() {
        return delivery_address;
    }

    public SaveOrderResource setDeliveryAddress(String delivery_address) {
        this.delivery_address = delivery_address;
        return this;
    }

    public String getDeliveryDate() {
        return delivery_date;
    }

    public SaveOrderResource setDeliveryDate(String delivery_date) {
        this.delivery_date = delivery_date;
        return this;
    }
    //

    public Double getOrderAmount() {
        return order_amount;
    }

    public SaveOrderResource setOrderAmount(Double order_amount) {
        this.order_amount = order_amount;
        return this;
    }

}
