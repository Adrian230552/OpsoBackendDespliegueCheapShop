package com.example.desplieguecheapshopbackend.service;


import com.example.desplieguecheapshopbackend.domain.model.UserPaymentMethod;
import com.example.desplieguecheapshopbackend.domain.repository.UserPaymentMethodRepository;
import com.example.desplieguecheapshopbackend.domain.service.UserPaymentMethodService;
import com.example.desplieguecheapshopbackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentMethodServiceImpl implements UserPaymentMethodService {

    @Autowired
    private UserPaymentMethodRepository userPaymentMethodRepository;



    public UserPaymentMethod getUserPaymentMethodById(Long userPaymentMethodId) {
        return userPaymentMethodRepository.findById(userPaymentMethodId)
                .orElseThrow(() -> new ResourceNotFoundException("UserPaymentMethod", "Id", userPaymentMethodId));
    }

    public UserPaymentMethod createUserPaymentMethod(UserPaymentMethod userPaymentMethod) {
        return userPaymentMethodRepository.save(userPaymentMethod);
    }


    public UserPaymentMethod updateUserPaymentMethod(Long userPaymentMethodId, UserPaymentMethod userPaymentMethodRequest) {
        UserPaymentMethod userPaymentMethod = userPaymentMethodRepository.findById(userPaymentMethodId)
                .orElseThrow(() -> new ResourceNotFoundException("UserPaymentMethod", "Id", userPaymentMethodId));
        return userPaymentMethodRepository.save(
                userPaymentMethod.setCardNumber(userPaymentMethod.getCardNumber())
                .setOwnerName(userPaymentMethod.getOwnerName())
                .setDueDate(userPaymentMethod.getDueDate())
                .setCv(userPaymentMethod.getCv()));

    }


    public ResponseEntity<?> deleteUserPaymentMethod(Long userPaymentMethodId) {
        UserPaymentMethod userPaymentMethod = userPaymentMethodRepository.findById(userPaymentMethodId)
                .orElseThrow(() -> new ResourceNotFoundException("UserPaymentMethod", "Id", userPaymentMethodId));
        userPaymentMethodRepository.delete(userPaymentMethod);
        return ResponseEntity.ok().build();
    }
}
