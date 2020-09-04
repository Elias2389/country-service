package com.ae.league.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

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
