package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    public Pet() {

    }

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

    public String listVaccinations(List<String> vaccineList){
        String tempVacString = "";
       for(String vaccine: vaccineList){
           tempVacString += vaccine + ", ";
       }
        System.out.println("print out beofre substring=" +tempVacString);
        tempVacString = tempVacString.substring(0, tempVacString.length()-3);
        System.out.println("print out after substring=" +tempVacString);

        return tempVacString;

    }


}
