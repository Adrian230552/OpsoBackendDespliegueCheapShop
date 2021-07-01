package com.example.desplieguecheapshopbackend.domain.service;

import com.example.desplieguecheapshopbackend.domain.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface SupplierService {
    Page<Supplier> getAllSuppliers(Pageable pageable);
    Supplier getSupplierById(Long supplierId);
    Supplier createSupplier(Supplier supplier);
    Supplier updateSupplier(Long supplierId, Supplier supplierRequest);
    ResponseEntity<?> deleteSupplier(Long supplierId);
}
