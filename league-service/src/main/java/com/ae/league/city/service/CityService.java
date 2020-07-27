package com.ae.league.city.service;

import com.ae.league.entity.City;

import java.util.List;

public interface CityService {

  /**
   *  @return list of cities
   *  */
  public List<City> getAllCities();

  /**
   * @param id of city to get
   * @return city founded
   */
  public City getCityById(Long id);

  /**
   * @param city to make creation
   * @return city created
   */
  public City createCity(City city);

  /**
   * @param city to update
   * @return city updated
   */
  public City updateCity(City city);

  /**
   *  @param id of city to delete
   *  */
  public void deleteCity(Long id);
}
