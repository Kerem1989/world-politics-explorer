package com.example.worldpoliticsexplorer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RestCountryService {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_COUNTRIES_API_URL = "https://restcountries.com/v3.1/all?fields=name,capital,population";

    public List<RestCountry> getAllCountries() {
        RestCountry[] countries = restTemplate.getForObject(REST_COUNTRIES_API_URL, RestCountry[].class);
        return Arrays.asList(countries);
    }
}
