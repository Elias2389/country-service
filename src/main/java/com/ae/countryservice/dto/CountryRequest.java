package com.ae.countryservice.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
public class CountryRequest {
    @Nullable
    private Long id;
    @NotBlank(message = "code is mandatory")
    private String code;
    @NotBlank(message = "name is mandatory")
    private String name;
    @Nullable
    private List<CityRequest> cities;
}
