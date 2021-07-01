package com.example.desplieguecheapshopbackend.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "suppliers")
public class Supplier extends com.example.desplieguecheapshopbackend.domain.model.AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String description;

    @NotNull
    private Long number;

    public Long getId() {
        return id;
    }

    public Supplier setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Supplier setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Supplier setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getNumber() {
        return number;
    }

    public Supplier setNumber(Long number) {
        this.number = number;
        return this;
    }
}
