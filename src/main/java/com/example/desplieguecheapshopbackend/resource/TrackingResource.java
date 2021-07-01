
package com.example.desplieguecheapshopbackend.resource;
import com.example.desplieguecheapshopbackend.domain.model.AuditModel;

public class TrackingResource extends AuditModel {

    private long id;

    private String date;

    private String description;

    private String place;


    public long getId() {
        return id;
    }

    public TrackingResource setId(long id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public TrackingResource setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TrackingResource setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public TrackingResource setPlace(String place) {
        this.place = place;
        return this;
    }
}