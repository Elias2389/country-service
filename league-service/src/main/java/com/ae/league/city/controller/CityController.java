package com.ae.league.city.controller;

import com.ae.league.city.service.CityService;
import com.ae.league.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService service;

    @Autowired
    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<City>> getAllCities() {
        List<City> cities = service.getAllCities();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
}
