package com.example.worldpoliticsexplorer.Controller;

import com.example.worldpoliticsexplorer.Entity.Country;
import com.example.worldpoliticsexplorer.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/home")
    public String home() {
        return "index";
    }


    @GetMapping("/countries")
    public String getAllCountries(Model model) {
        List<Country> countries = countryService.getAllCountries();
        model.addAttribute("countries", countries);
        return "api";
    }
}
