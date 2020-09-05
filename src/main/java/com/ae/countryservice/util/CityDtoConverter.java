package com.ae.countryservice.util;

import com.ae.countryservice.dto.CityResponse;
import com.ae.countryservice.entity.CityEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CityDtoConverter {

    private final ModelMapper modelMapper;
    private final CountryDtoConverter countryDtoConverter;

    @Autowired
    public CityDtoConverter(ModelMapper modelMapper, CountryDtoConverter countryDtoConverter) {
        this.modelMapper = modelMapper;
        this.countryDtoConverter = countryDtoConverter;
    }

    /**
    * Converter city entity to city response
    * @param cityEntity to converter
    * @return city response
    */
    public CityResponse converterCityToDto(CityEntity cityEntity) {
        return modelMapper.map(cityEntity, CityResponse.class);
    }

    /**
    * Converter list of city entity to city response
    * @param cityEntities list
    * @return list of city response
    */
    public List<CityResponse> converterCityToDto(List<CityEntity> cityEntities) {
        return cityEntities.stream()
                .map(this::converterCityToDto)
                .collect(Collectors.toList());
    }

}