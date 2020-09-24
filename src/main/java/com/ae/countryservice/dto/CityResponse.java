package com.ae.countryservice.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CityResponse implements Serializable {
    private Long id;
    private String name;
}
