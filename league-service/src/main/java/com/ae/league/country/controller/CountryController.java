package com.ae.league.country.controller;

import com.ae.league.country.service.CountryService;

import com.ae.league.dto.CountryRequest;
import com.ae.league.dto.CountryResponse;
import com.ae.league.entity.CountryEntity;
import com.ae.league.util.CountryDtoConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<CountryResponse> getCountryById(@PathVariable("id") Long id) {
        CountryEntity country = service.getCountryById(id);
        return new ResponseEntity<>(converter.converterCountryToDto(country), HttpStatus.OK);
    }

    /**
     * @param name of Country to get
     * @return Country founded
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<CountryResponse> getCountryByName(@PathVariable("name") String name) {
        CountryEntity country = service.getCountryByName(name);
        return new ResponseEntity<>(converter.converterCountryToDto(country), HttpStatus.OK);
    }

    /**
     * @param code of Country to get
     * @return Country founded
     */
    @GetMapping("/code/{code}")
    public ResponseEntity<CountryResponse> getCountryByCode(@PathVariable("code") String code) {
        CountryEntity country = service.getCountryByCode(code);
        return new ResponseEntity<>(converter.converterCountryToDto(country), HttpStatus.OK);
    }

    /**
     * @param country to make creation
     * @return Country created
     */
    @PostMapping
    public ResponseEntity<CountryResponse> createCountry(@Valid @RequestBody CountryRequest country) {
        CountryEntity countryCreated = service.createCountry(country);

        return new ResponseEntity<>(converter.converterCountryToDto(countryCreated), HttpStatus.OK);
    }

    /**
     * @param country to update
     * @return Country updated
     */
    @PutMapping
    public ResponseEntity<CountryResponse> updateCountry(@RequestBody CountryEntity country) {
        CountryEntity updateCountry = CountryEntity.builder()
                .name(country.getName())
                .cities(country.getCities())
                .build();

        CountryEntity countryUpdated = service.updateCountry(updateCountry);

        return new ResponseEntity<>(converter.converterCountryToDto(countryUpdated), HttpStatus.OK);
    }

    /**
     *  @param id of Country to delete
     *  */
    public void deleteCountry(Long id) {
        service.deleteCountry(id);
    }
}
