package com.ae.league.city.service;

import com.ae.league.city.repository.CityRepository;
import com.ae.league.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository repository;

    @Autowired
    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<City> getAllCities() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public City getCityById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public City getCityByName(String name) {
        return repository.findByName(name);
    }

    @Override
    @Transactional
    public List<City> getCityByCountryCode(String code) {
        return repository.findByCountryCode(code);
    }

    @Override
    @Transactional
    public City createCity(City city) {
        if (getCityByName(city.getName()) != null) {
            return getCityByName(city.getName());
        }
        City newCity = City.builder()
                .name(city.getName())
                .build();
        return repository.save(newCity);
    }

    @Override
    @Transactional
    public City updateCity(City city) {
        if (getCityByName(city.getName()) != null) {
            City cityToUpdate = City.builder()
                    .name(city.getName())
                    .build();
            return repository.save(cityToUpdate);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteCity(Long id) {
        repository.deleteById(id);
    }
}
