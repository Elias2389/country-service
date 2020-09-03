package com.ae.league.city.controller;

import com.ae.league.city.service.CityService;
import com.ae.league.dto.CityResponse;
import com.ae.league.entity.CityEntity;
import com.ae.league.util.CityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService service;
    private final CityDtoConverter cityDtoConverter;

    @Autowired
    public CityController(CityService service, CityDtoConverter cityDtoConverter) {
        this.service = service;
        this.cityDtoConverter = cityDtoConverter;
    }

  /**
   * Fin All cities
   * @return cities
   * */
  @GetMapping
  public ResponseEntity<List<CityResponse>> getAllCities() {
        List<CityEntity> cities = service.getAllCities();
        return new ResponseEntity<>(cityDtoConverter.converterCityToDto(cities), HttpStatus.OK);
    }

  /**
   * @param id of city to find
   * @return city found
   */
  @GetMapping("/id/{id}")
  public ResponseEntity<CityResponse> getCityById(@PathVariable("id") Long id) {
        CityEntity city = service.getCityById(id);
        return new ResponseEntity<>(cityDtoConverter.converterCityToDto(city), HttpStatus.OK);
    }

  /**
   * @param name of city to find
   * @return city found
   */
  @GetMapping("/name/{name}")
  public ResponseEntity<CityResponse> getCityByName(@PathVariable("name") String name) {
        CityEntity city = service.getCityByName(name);
        return new ResponseEntity<>(cityDtoConverter.converterCityToDto(city), HttpStatus.OK);
    }

  /**
   * @param code to filter
   * @return cities filtered
   */
  @GetMapping("/country/{code}")
  public ResponseEntity<List<CityResponse>> getCityByCountryCode(@PathVariable("code") String code) {
        List<CityEntity> cities = service.getCityByCountryCode(code);
        return new ResponseEntity<>(cityDtoConverter.converterCityToDto(cities), HttpStatus.OK);
    }

  /**
   * @param city to create
   * @return city created
   */
  @PostMapping
  public ResponseEntity<CityResponse> createCity(@RequestBody CityEntity city) {
        CityEntity cityCreated = service.createCity(city);
        return new ResponseEntity<>(cityDtoConverter.converterCityToDto(cityCreated), HttpStatus.CREATED);
    }

  /**
   * @param city to update
   * @return city updated
   */
  @PutMapping
  public ResponseEntity<CityEntity> updateCity(@RequestBody CityEntity city) {
        CityEntity cityUpdated = service.updateCity(city);
        return new ResponseEntity<>(cityUpdated, HttpStatus.OK);
    }

      /**
       * Delete City
       *  @param id of city to delete
       *  */
  @DeleteMapping
    public void deleteCity(Long id) {
        service.deleteCity(id);
    }

}
