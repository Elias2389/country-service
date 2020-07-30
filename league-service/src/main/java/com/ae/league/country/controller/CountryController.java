package com.ae.league.country.controller;

import com.ae.league.country.service.CountryService;

import com.ae.league.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<List<Country> > getAllCities() {
        return null;
    }

    /**
     * @param id of Country to get
     * @return Country founded
     */
    public ResponseEntity<Country> getCountryById(Long id) {
        return null;
    }

    /**
     * @param name of Country to get
     * @return Country founded
     */
    public ResponseEntity<Country> getCountryByName(String name) {
        return null;
    }

    /**
     * @param country to make creation
     * @return Country created
     */
    public ResponseEntity<Country> createCountry(Country country) {
        return null;
    }

    /**
     * @param country to update
     * @return Country updated
     */
    public ResponseEntity<Country> updateCountry(Country country) {
        return null;
    }

    /**
     *  @param id of Country to delete
     *  */
    public void deleteCountry(Long id) {

    }
}
