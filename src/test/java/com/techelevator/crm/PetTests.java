package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    public Pet pets = new Pet();

    @Test
    public void listVaccinations_normalStringList_ExpectCommaDeliminatedString(){
        //Arrange
        List<String> test = new ArrayList<>();
        test.add("Rabies");
        test.add("Distemper");
        test.add("Parvo");

        //Act
       //List<String> result = pets.listVaccinations(new String[] {"Rabies", "Distemper", "Parvo"});;




        //Assert
        //assertEquals("Rabies, Distemper, Parvo",)


    }
}
