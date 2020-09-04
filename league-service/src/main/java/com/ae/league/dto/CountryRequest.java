package com.ae.league.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
