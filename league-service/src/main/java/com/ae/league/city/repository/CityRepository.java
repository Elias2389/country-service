package com.ae.league.city.repository;

import com.ae.league.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

  /**
   * @param name to find city
   * @return city found
   */
  public City findByName(String name);

  /**
   * @param code of country to find cities
   * @return city found
   */
  public List<City> findByCountryCode(String code);

}
