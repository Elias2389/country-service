package com.ae.countryservice.country.service;

import com.ae.countryservice.country.repository.CountryRepository;
import com.ae.countryservice.util.CountryMockUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class CountryServiceImplTest {

    @InjectMocks
    CountryServiceImpl countryService;

    @Mock
    CountryRepository repository;


    @BeforeEach
    void setUp() {
    }

    @Test
    public void shouldGetCountriesListWhenIsNotNull() {
        Mockito.when(repository.findAll()).thenReturn(CountryMockUtil.getAllCountries());

        Assertions.assertEquals(CountryMockUtil.getAllCountries(), countryService.getAllCountries());

    }


    @AfterEach
    void tearDown() {
    }
}