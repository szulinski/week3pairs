package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PetTests {

    @Test
    public void listVaccinations_normalStringList_ExpectCommaDeliminatedString(){
        Pet pet = new Pet();
//        Arrange + Act
        List<String> test = new ArrayList<>();
        test.add("Rabies");
        test.add("Distemper");
        test.add("Parvo");
        pet.setVaccinations(test);
//        Assert
        assertEquals("Rabies, Distemper, Parvo", pet.listVaccinations());
    }
}
