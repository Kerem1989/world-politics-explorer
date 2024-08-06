package com.example.worldpoliticsexplorer.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String capital;
    private int population;

    private String rulingParty;

    private String ideology;

    public Country() {
    }

    public Country(String name, String capital, int population, String rulingParty, String ideology) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.rulingParty = rulingParty;
        this.ideology = ideology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getRulingParty() {
        return rulingParty;
    }

    public void setRulingParty(String rulingParty) {
        this.rulingParty = rulingParty;
    }

    public String getIdeology() {
        return ideology;
    }

    public void setIdeology(String ideology) {
        this.ideology = ideology;
    }
}
