package com.ae.countryservice.country.controller;

import com.ae.countryservice.data.config.RestTemplateClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountryControllerTest {

    @Autowired
    RestTemplateClient client;

    @BeforeEach
    void setUp() {
    }
}