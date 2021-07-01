package com.example.desplieguecheapshopbackend.domain.repository;

import com.example.desplieguecheapshopbackend.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
