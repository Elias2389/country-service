package com.ae.league.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
public class CountryResponse implements Serializable {
    private Long id;
    private String code;
    private String name;
    @JsonBackReference
    private List<CityResponse> cities;
}
