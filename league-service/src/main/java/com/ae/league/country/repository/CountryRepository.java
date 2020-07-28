package com.ae.league.country.repository;


import com.ae.league.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

  /**
   * @param name of country to find
   * @return country found
   */
  public Country findByName(String name);
}
