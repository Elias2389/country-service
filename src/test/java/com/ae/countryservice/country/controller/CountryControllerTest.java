package com.ae.countryservice.country.controller;

import com.ae.countryservice.country.service.CountryService;
import com.ae.countryservice.dto.CountryResponse;
import com.ae.countryservice.entity.CountryEntity;
import com.ae.countryservice.util.CountryMockUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountryControllerTest {

    @Autowired
    RestTemplate testClient;

    @MockBean
    CountryService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void shouldCountryList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<CountryEntity> entity = new HttpEntity<>(headers);

        //ResponseEntity<List<CountryResponse>> response = testClient.getForObject();
    }
}