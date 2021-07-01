package com.example.desplieguecheapshopbackend.service;

import com.example.desplieguecheapshopbackend.domain.model.Tracking;
import com.example.desplieguecheapshopbackend.domain.repository.TrackingRepository;
import com.example.desplieguecheapshopbackend.domain.service.TrackingService;
import com.example.desplieguecheapshopbackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TrackingServiceImpl implements TrackingService {

    @Autowired
    private TrackingRepository trackingRepository;
    @Override
    public Page<Tracking> getAllTrackings(Pageable pageable) {
        return trackingRepository.findAll(pageable);
    }

    @Override
    public Tracking getTrackingById(Long trackingId) {
        return trackingRepository.findById(trackingId)
                .orElseThrow(() -> new ResourceNotFoundException("Post", "Id", trackingId));
    }

    @Override
    public Tracking createTracking(Tracking tracking) {
        return trackingRepository.save(tracking);
    }

    @Override
    public Tracking updateTracking(Long trackingId, Tracking trackingRequest) {
        Tracking tracking = trackingRepository.findById(trackingId)
                .orElseThrow(() -> new ResourceNotFoundException("Tracking", "Id", trackingId));
        return trackingRepository.save(
                tracking.setDate(trackingRequest.getDate())
                        .setDescription(trackingRequest.getDescription())
                        .setPlace(trackingRequest.getPlace()));
    }

    @Override
    public ResponseEntity<?> deleteTracking(Long trackingId) {
        Tracking tracking = trackingRepository.findById(trackingId)
                .orElseThrow(() -> new ResourceNotFoundException("Tracking", "Id", trackingId));
        trackingRepository.delete(tracking);
        return ResponseEntity.ok().build();
    }
}