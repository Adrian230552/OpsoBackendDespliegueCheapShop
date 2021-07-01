package com.example.desplieguecheapshopbackend.domain.service;

import com.example.desplieguecheapshopbackend.domain.model.UserPaymentMethod;
import org.springframework.http.ResponseEntity;

public interface UserPaymentMethodService {


    UserPaymentMethod getUserPaymentMethodById(Long userPaymentMethodId);

    UserPaymentMethod createUserPaymentMethod(UserPaymentMethod userPaymentMethod);

    UserPaymentMethod updateUserPaymentMethod(Long userPaymentMethodId, UserPaymentMethod userPaymentMethodDetails);

    ResponseEntity<?> deleteUserPaymentMethod(Long userPaymentMethodId);
}
