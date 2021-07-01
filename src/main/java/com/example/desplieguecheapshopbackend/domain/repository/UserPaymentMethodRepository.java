package com.example.desplieguecheapshopbackend.domain.repository;

import com.example.desplieguecheapshopbackend.domain.model.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Long>{


}