package com.ae.league.city.service;

import com.ae.league.entity.CityEntity;

import java.util.List;

public interface CityService {

  /**
   *  @return list of cities
   *  */
  public List<CityEntity> getAllCities();

  /**
   * @param id of city to get
   * @return city founded
   */
  public CityEntity getCityById(Long id);

  /**
   * @param name of city to get
   * @return city founded
   */
  public CityEntity getCityByName(String name);

  /**
   * @param code of country
   * @return city list of cities
   */
  public List<CityEntity> getCityByCountryCode(String code);

  /**
   * @param city to make creation
   * @return city created
   */
  public CityEntity createCity(CityEntity city);

  /**
   * @param city to update
   * @return city updated
   */
  public CityEntity updateCity(CityEntity city);

  /**
   *  @param id of city to delete
   *  */
  public void deleteCity(Long id);
}
