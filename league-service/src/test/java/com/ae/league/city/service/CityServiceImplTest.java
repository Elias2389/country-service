package com.ae.league.city.service;

import com.ae.league.city.repository.CityRepository;
import com.ae.league.entity.City;
import com.ae.league.entity.Country;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityServiceImplTest {

    @Mock
    private CityRepository repository;

    private CityService cityService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);

        cityService = new CityServiceImpl(repository);
    }

    @Test
    public void return_list_of_cities_when_exist_data() {
        Mockito.when(cityService.getAllCities()).thenReturn(getMockCities());
        Assertions.assertThat(cityService.getAllCities()).isEqualTo(getMockCities());
    }

    private List<City> getMockCities() {
        City city = City.builder().id(1L).name("Spain").country(null).build();
        City city2 = City.builder().id(1L).name("Germany").country(null).build();

        List<City> cities = new ArrayList<>();
        cities.add(city);
        cities.add(city2);

        return cities;
    }
}