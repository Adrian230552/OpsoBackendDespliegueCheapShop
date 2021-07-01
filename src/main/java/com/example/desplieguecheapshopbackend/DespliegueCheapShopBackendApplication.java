package com.example.desplieguecheapshopbackend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DespliegueCheapShopBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DespliegueCheapShopBackendApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
