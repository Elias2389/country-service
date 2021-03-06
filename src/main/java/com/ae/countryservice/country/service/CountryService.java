package com.ae.countryservice.country.service;


import com.ae.countryservice.dto.CountryRequest;
import com.ae.countryservice.entity.CountryEntity;

import java.util.List;

public interface CountryService {

    /**
     *  @return list of countries
     *  */
    public List<CountryEntity> getAllCountries();

    /**
     * @param id of Country to get
     * @return Country founded
     */
    public CountryEntity getCountryById(Long id);

    /**
     * @param name of Country to get
     * @return Country founded
     */
    public CountryEntity getCountryByName(String name);

    /**
     * @param code of Country to get
     * @return Country founded
     */
    public CountryEntity getCountryByCode(String code);

    /**
     * @param country to make creation
     * @return Country created
     */
    public CountryEntity createCountry(CountryRequest country);

    /**
     * @param country to update
     * @return Country updated
     */
    public CountryEntity updateCountry(CountryEntity country);

    /**
     *  @param id of Country to delete
     *  */
    public void deleteCountry(Long id);
}
