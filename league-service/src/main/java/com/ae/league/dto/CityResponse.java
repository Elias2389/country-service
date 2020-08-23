package com.ae.league.dto;


import lombok.Data;

@Data
public class CityResponse {
    private Long id;
    private String name;
    private CountryResponse countryResponse;
}
