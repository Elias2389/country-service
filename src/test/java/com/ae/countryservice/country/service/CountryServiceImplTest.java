package com.ae.countryservice.country.service;

import com.ae.countryservice.country.repository.CountryRepository;
import com.ae.countryservice.entity.CountryEntity;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class CountryServiceImplTest {

    @InjectMocks
    CountryServiceImpl countryService;

    @Mock
    CountryRepository repository;

    private List<CountryEntity> countries;

    @BeforeEach
    void setUp() {
        countries = CountryMockUtil.getAllCountries();
    }

    @Test
    public void shouldGetCountriesListWhenIsNotNull() {
        Mockito.when(repository.findAll()).thenReturn(countries);
        Assertions.assertEquals(countries, countryService.getAllCountries());
    }

    @Test
    public void shouldGetCountriesListWhenIsEmpty() {
        Mockito.when(repository.findAll()).thenReturn(Collections.emptyList());
        Assertions.assertNotEquals(Collections.emptyList(), countryService.getAllCountries());
    }


}