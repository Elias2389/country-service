package com.ae.league.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CountryRequest {
    @Nullable
    private Long id;
    @NotNull
    private String code;
    @NotNull
    private String name;
    @Nullable
    private List<CityRequest> cities;
}
