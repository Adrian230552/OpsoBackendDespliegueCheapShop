package com.example.desplieguecheapshopbackend.domain.repository;
import com.example.desplieguecheapshopbackend.domain.model.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Long> {

}