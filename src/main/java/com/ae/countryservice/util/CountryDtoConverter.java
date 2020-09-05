package com.ae.countryservice.util;

import com.ae.countryservice.dto.CountryResponse;
import com.ae.countryservice.entity.CountryEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CountryDtoConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public CountryDtoConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    /**
    * Converter country entity to country response
    * @param countryEntity to converter
    * @return city response
    */
    public CountryResponse converterCountryToDto(CountryEntity countryEntity) {
        return modelMapper.map(countryEntity, CountryResponse.class);
    }

    /**
    * Converter list of country entity to country response
    * @param countryEntities list
    * @return list of city response
    */
    public List<CountryResponse> converterCountryToDto(List<CountryEntity> countryEntities) {
        return countryEntities.stream()
                .map(this::converterCountryToDto)
                .collect(Collectors.toList());
    }

}