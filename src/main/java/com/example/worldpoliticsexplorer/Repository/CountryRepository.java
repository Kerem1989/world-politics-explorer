package com.example.worldpoliticsexplorer.Repository;


import com.example.worldpoliticsexplorer.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    Optional <Country> findCountryByName(String name);
    List<Country> findAllByIdeology(String ideology);
}
