package com.example.desplieguecheapshopbackend.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaveUserPaymentMethodResource {

    @NotNull
    @NotBlank
    @Size(max = 16)
    private String cardNumber;

    @NotNull
    @NotBlank
    @Size(max = 250)
    private String ownerName;

    @NotNull
    @NotBlank
    @Size(max = 5)
    private String dueDate;

    @NotNull
    @NotBlank
    @Size(max = 3)
    private String cv;


    public String getCardNumber() {
        return cardNumber;
    }

    public SaveUserPaymentMethodResource setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public SaveUserPaymentMethodResource setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getDueDate() {
        return dueDate;
    }

    public SaveUserPaymentMethodResource setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public String getCv() {
        return cv;
    }

    public SaveUserPaymentMethodResource setCv(String cv) {
        this.cv = cv;
        return this;
    }
}
