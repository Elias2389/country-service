package com.ae.league.country.controller;

import com.ae.league.country.service.CountryService;

import com.ae.league.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService service;

    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }

    /**
     *  @return list of countries
     *  */
    @GetMapping
    public ResponseEntity<List<Country> > getAllCities() {
        return new ResponseEntity<>(service.getAllCountries(), HttpStatus.OK);
    }

    /**
     * @param id of Country to get
     * @return Country founded
     */
    @GetMapping("/id/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.getCountryById(id), HttpStatus.OK);
    }

    /**
     * @param name of Country to get
     * @return Country founded
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(service.getCountryByName(name), HttpStatus.OK);
    }

    /**
     * @param code of Country to get
     * @return Country founded
     */
    @GetMapping("/code/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(service.getCountryByCode(code), HttpStatus.OK);
    }

    /**
     * @param country to make creation
     * @return Country created
     */
    @PostMapping
    public ResponseEntity<Country> createCountry(@RequestBody Country country) {
        Country newCountry = Country.builder()
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
    public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
        Country updateCountry = Country.builder()
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
