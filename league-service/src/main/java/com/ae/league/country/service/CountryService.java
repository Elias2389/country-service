package com.ae.league.country.service;

import com.ae.league.entity.Country;

import java.util.List;

public interface CountryService {

    /**
     *  @return list of countries
     *  */
    public List<Country> getAllCities();

    /**
     * @param id of Country to get
     * @return Country founded
     */
    public Country getCountryById(Long id);

    /**
     * @param name of Country to get
     * @return Country founded
     */
    public Country getCountryByName(String name);

    /**
     * @param country to make creation
     * @return Country created
     */
    public Country createCountry(Country country);

    /**
     * @param country to update
     * @return Country updated
     */
    public Country updateCountry(Country country);

    /**
     *  @param id of Country to delete
     *  */
    public void deleteCountry(Long id);
}
