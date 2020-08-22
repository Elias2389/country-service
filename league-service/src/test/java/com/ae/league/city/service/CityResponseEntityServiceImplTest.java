package com.ae.league.city.service;

import com.ae.league.city.repository.CityRepository;
import com.ae.league.entity.CityEntity;
import com.ae.league.entity.CountryEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class CityResponseEntityServiceImplTest {

    @Mock
    private CityRepository repository;

    private CityService cityService;
    private List<CityEntity> cities;
    private CityEntity city;
    private CityEntity city2;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);

        cityService = new CityServiceImpl(repository);

        city = getCity();
        city2 = getCity2();
        cities = getMockCities();
    }

    @Test
    public void return_list_of_cities_when_exist_data() {
        Mockito.when(cityService.getAllCities()).thenReturn(cities);
        Assertions.assertThat(cityService.getAllCities()).isEqualTo(cities);
    }

    @Test
    public void return_city_after_create() {
        Mockito.when(cityService.createCity(city)).thenReturn(city);
        Assertions.assertThat(cityService.createCity(getCity())).isEqualTo(city);
    }

    @Test
    public void return_city_by_id() {
        Mockito.when(Optional.ofNullable(cityService.getCityById(1L))).thenReturn(Optional.of(city));
        Assertions.assertThat(Optional.ofNullable(cityService.getCityById(1L))).isEqualTo(Optional.of(city));
    }

    @Test
    public void return_city_by_name() {
        Mockito.when(cityService.getCityByName("Madrid")).thenReturn(city);
        Assertions.assertThat(cityService.getCityByName("Madrid")).isEqualTo(getCity());
    }

    private List<CityEntity> getMockCities() {
        List<CityEntity> cities = new ArrayList<>();
        cities.add(getCity());
        cities.add(getCity2());

        return cities;
    }

    private CityEntity getCity() {
        CountryEntity country = CountryEntity.builder().id(1L).name("Spain").build();
        return CityEntity.builder().id(1L).name("Madrid").country(country).build();
    }

    private CityEntity getCity2() {
        CountryEntity country2 = CountryEntity.builder().id(2L).name("Germany").build();
        return CityEntity.builder().id(2L).name("Berlin").country(country2).build();

    }
}