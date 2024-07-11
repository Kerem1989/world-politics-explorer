package com.example.worldpoliticsexplorer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/countries")
public class CountryRestController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/countries")
    public Map<String, Country> getCountries() {
        List<Country> countries = countryService.getAllCountries();
        return countries.stream()
                .collect(Collectors.toMap(Country::getName, country -> new Country(
                        country.getName(),
                        country.getCapital(),
                        country.getPopulation(),
                        country.getRulingParty(),
                        country.getIdeology()
                )));
    }


}
