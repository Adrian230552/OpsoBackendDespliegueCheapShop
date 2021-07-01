package com.example.desplieguecheapshopbackend.domain.repository;

import com.example.desplieguecheapshopbackend.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
