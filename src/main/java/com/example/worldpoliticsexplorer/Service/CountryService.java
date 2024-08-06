package com.example.worldpoliticsexplorer.Service;

import com.example.worldpoliticsexplorer.Entity.Country;
import com.example.worldpoliticsexplorer.Repository.CountryRepository;
import com.example.worldpoliticsexplorer.Entity.RestCountry;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CountryService {
    @Autowired
    private RestCountryService restCountryService;

    @Autowired
    private CountryRepository countryRepository;

    @PostConstruct
    public void initDatabase() {
        if (countryRepository.count() == 0) {
            List<RestCountry> restCountries = restCountryService.getAllCountries();
            List<Country> countries = restCountries.stream().map(rc -> {
                Country country = new Country();
                country.setName(rc.getName().getCommon());
                country.setPopulation(rc.getPopulation());
                for (String capital : rc.getCapital()) {
                    if (capital != null && !capital.isEmpty()) {
                        country.setCapital(capital);
                        break;
                    }
                }
                country.setRulingParty("Unknown");
                country.setIdeology("Unknown");
                return country;
            }).collect(Collectors.toList());
            countryRepository.saveAll(countries);
        }
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(int id) {
        return countryRepository.findById(id);
    }

    public Optional<Country> getCountryByName(String name) {
        return countryRepository.findCountryByName(name);
    }

    public List <Country> getCountriesByIdeology(String ideology){
        return countryRepository.findAllByIdeology(ideology);
    }
}
