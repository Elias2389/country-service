package com.ae.countryservice.util;

import com.ae.countryservice.entity.CityEntity;
import com.ae.countryservice.entity.CountryEntity;

import java.util.ArrayList;
import java.util.List;

public final class CountryMockUtil {

    public CountryMockUtil() {
    }

    public static List<CountryEntity> getAllCountries() {
        List<CountryEntity> countryEntities = new ArrayList<>();
        countryEntities.add(
                getCountry()
        );
        return countryEntities;
    }

    public static CountryEntity getCountry() {
        return new CountryEntity(1234L, "es", "Spain", getCities());
    }

    public static List<CityEntity> getCities() {
        List<CityEntity> cities = new ArrayList<>();
        cities.add(getCity());
        cities.add(getOtherCiy());
        return cities;
    }

    public static CityEntity getCity() {
        return new CityEntity(12223L, "Madrid", null);
    }

    public static CityEntity getOtherCiy() {
        return new CityEntity(12224L, "Barcelona", null);
    }

}
