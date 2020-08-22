package com.ae.league.dto;

import lombok.Data;

import java.util.List;

@Data
public class CountryResponse {
    private Long id;
    private String code;
    private String name;
    private List<CityResponse> cities;
}
