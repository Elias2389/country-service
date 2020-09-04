package com.ae.league.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CountryRequest {
    private Long id;
    private String code;
    private String name;
    private List<CityRequest> cities;
}
