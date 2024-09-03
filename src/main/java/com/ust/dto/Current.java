package com.ust.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties(ignoreUnknown = true)
public record Current(
        @JsonProperty("temp_c") double temperatureCelsius,
        @JsonProperty("temp_f") double temperatureFahrenheit,
        @JsonProperty("condition") Condition condition,
        int humidity,
        @JsonProperty("wind_kph") double windSpeedKph,
        @JsonProperty("wind_mph") double windSpeedMph) {
}
