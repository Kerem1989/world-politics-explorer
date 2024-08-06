package com.example.worldpoliticsexplorer.Controller;

import com.example.worldpoliticsexplorer.Entity.Country;
import com.example.worldpoliticsexplorer.Repository.CountryRepository;
import com.example.worldpoliticsexplorer.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    @GetMapping("id/{id}")
    public ResponseEntity<Optional<Country>> findCountryById(@PathVariable int id) {
        Optional<Country> optionalCountry = countryService.getCountryById(id);
        if (optionalCountry.isPresent()) {
            return ResponseEntity.accepted().body(optionalCountry);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("name/{name}")
    public ResponseEntity<Optional<Country>> findCountryByName(@PathVariable String name){
        Optional<Country> country = countryService.getCountryByName(name);
        if (country.isPresent()) {
            return ResponseEntity.accepted().body(country);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("ideology/{ideology}")
    public ResponseEntity<List> findCountriesByIdeology(@PathVariable String ideology){
        List<Country> country = countryService.getCountriesByIdeology(ideology);
        return ResponseEntity.accepted().body(country);
    }

}
