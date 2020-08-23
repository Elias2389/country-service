package com.ae.league.config;

import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ServiceConfig {

    @Bean
    public ModelMapper provideModelMapper() {
        return new ModelMapper();
    }
}
