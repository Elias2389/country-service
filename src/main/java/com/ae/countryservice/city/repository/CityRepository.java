package com.ae.countryservice.city.repository;

import com.ae.countryservice.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

  /**
   * @param name to find city
   * @return city found
   */
  public CityEntity findByName(String name);

  /**
   * @param code of country to find cities
   * @return city found
   */
  public List<CityEntity> findByCountryCode(String code);

}
