package com.ae.countryservice.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class CityRequest {
    @Nullable
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private CountryRequest country;
}
