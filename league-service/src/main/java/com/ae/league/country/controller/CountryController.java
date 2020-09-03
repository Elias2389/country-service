package com.ae.league.country.controller;

import com.ae.league.country.service.CountryService;

import com.ae.league.dto.CountryResponse;
import com.ae.league.entity.CountryEntity;
import com.ae.league.util.CountryDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService service;
    private final CountryDtoConverter converter;

    @Autowired
    public CountryController(CountryService service, CountryDtoConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    /**
     *  @return list of countries
     *  */
    @GetMapping
    public ResponseEntity<List<CountryResponse> > getAllCities() {
        List<CountryEntity> countries = service.getAllCountries();
        return new ResponseEntity<>(converter.converterCountryToDto(countries), HttpStatus.OK);
    }

    /**
     * @param id of Country to get
     * @return Country founded
     */
    @GetMapping("/id/{id}")
    public ResponseEntity<CountryEntity> getCountryById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.getCountryById(id), HttpStatus.OK);
    }

    /**
     * @param name of Country to get
     * @return Country founded
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<CountryEntity> getCountryByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(service.getCountryByName(name), HttpStatus.OK);
    }

    /**
     * @param code of Country to get
     * @return Country founded
     */
    @GetMapping("/code/{code}")
    public ResponseEntity<CountryEntity> getCountryByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(service.getCountryByCode(code), HttpStatus.OK);
    }

    /**
     * @param country to make creation
     * @return Country created
     */
    @PostMapping
    public ResponseEntity<CountryEntity> createCountry(@RequestBody CountryEntity country) {
        CountryEntity newCountry = CountryEntity.builder()
                .name(country.getName())
                .cities(country.getCities())
                .build();

        return new ResponseEntity<>(service.createCountry(newCountry), HttpStatus.OK);
    }

    /**
     * @param country to update
     * @return Country updated
     */
    @PutMapping
    public ResponseEntity<CountryEntity> updateCountry(@RequestBody CountryEntity country) {
        CountryEntity updateCountry = CountryEntity.builder()
                .name(country.getName())
                .cities(country.getCities())
                .build();

        return new ResponseEntity<>(service.updateCountry(updateCountry), HttpStatus.OK);
    }

    /**
     *  @param id of Country to delete
     *  */
    public void deleteCountry(Long id) {
        service.deleteCountry(id);
    }
}
