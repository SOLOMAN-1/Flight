package com.flight.flight.config;
 // Adjust based on your package structure

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JPAStreamerConfig {

    @Bean
    public JPAStreamer jpaStreamer(EntityManagerFactory entityManagerFactory) {
        return JPAStreamer.of(entityManagerFactory);
    }
}

