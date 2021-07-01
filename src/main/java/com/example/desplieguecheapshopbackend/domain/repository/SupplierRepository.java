package com.example.desplieguecheapshopbackend.domain.repository;

import com.example.desplieguecheapshopbackend.domain.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
