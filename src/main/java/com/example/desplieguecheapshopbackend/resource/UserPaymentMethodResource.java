package com.example.desplieguecheapshopbackend.resource;

import com.example.desplieguecheapshopbackend.domain.model.AuditModel;


public class UserPaymentMethodResource extends AuditModel {

    private Long id;
    private String cardNumber;
    private String ownerName;
    private String dueDate;
    private String cv;

    public Long getId() {
        return id;
    }

    public UserPaymentMethodResource setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public UserPaymentMethodResource setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public UserPaymentMethodResource setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getDueDate() {
        return dueDate;
    }

    public UserPaymentMethodResource setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public String getCv() {
        return cv;
    }

    public UserPaymentMethodResource setCv(String cv) {
        this.cv = cv;
        return this;
    }
}
