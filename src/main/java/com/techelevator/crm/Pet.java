package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    public Pet() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Pet(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String listVaccinations() {
        List<String> vaccineList = vaccinations;
        List<String> vaccinesComma = new ArrayList<>();
        for (String vaccine : vaccineList) {
            vaccinesComma.add(vaccine);
        }
        String vaccinesCommaString = String.join(", ", vaccinesComma);
//        System.out.println(vaccinesCommaString);
        return vaccinesCommaString;
        }
    }
