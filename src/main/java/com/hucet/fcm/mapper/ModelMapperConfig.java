package com.hucet.fcm.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ModelMapperConfig {
    @Bean
    ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}

