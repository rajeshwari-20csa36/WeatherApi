package com.ust.service;

import com.ust.dto.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestClient restClient;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;



    public WeatherResponse getCurrentWeather(String location) {
        String url = String.format("%s?key=%s&q=%s", apiUrl, apiKey, location);
        return restClient.get()
                .uri(url)
                .retrieve()
                .body(WeatherResponse.class);
    }
}
