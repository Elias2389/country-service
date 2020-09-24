package com.ae.countryservice.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
public class CountryResponse implements Serializable {
    private Long id;
    private String code;
    private String name;
    private List<CityResponse> cities;
}
