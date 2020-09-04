package com.ae.league.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CityResponse implements Serializable {
    private Long id;
    private String name;
    @JsonManagedReference
    private CountryResponse country;
}
