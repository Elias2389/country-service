package com.ae.countryservice.city.service;

import com.ae.countryservice.city.repository.CityRepository;
import com.ae.countryservice.entity.CityEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository repository;

    @Autowired
    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CityEntity> getAllCities() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public CityEntity getCityById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public CityEntity getCityByName(String name) {
        return repository.findByName(name);
    }

    @Override
    @Transactional
    public List<CityEntity> getCityByCountryCode(String code) {
        return repository.findByCountryCode(code);
    }

    @Override
    @Transactional
    public CityEntity createCity(CityEntity city) {
        if (getCityByName(city.getName()) != null) {
            return getCityByName(city.getName());
        }
        CityEntity newCity = CityEntity.builder()
                .name(city.getName())
                .build();
        return repository.save(newCity);
    }

    @Override
    @Transactional
    public CityEntity updateCity(CityEntity city) {
        if (getCityByName(city.getName()) != null) {
            CityEntity cityToUpdate = CityEntity.builder()
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
