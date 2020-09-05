package com.ae.countryservice.country.repository;


import com.ae.countryservice.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

  /**
   * @param name of country to find
   * @return country found
   */
  public CountryEntity findByName(String name);

  /**
   * @param code of country to find
   * @return country found
   */
  public CountryEntity findByCode(String code);
}
