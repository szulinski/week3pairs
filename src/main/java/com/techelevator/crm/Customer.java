package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<String> pets = new ArrayList<>();


    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public double getBalanceDue(Map<String, Double> serviceMap) {
        double billTotal = 0.00;
        for (Map.Entry<String, Double> service : serviceMap.entrySet()) {
            billTotal += service.getValue();
        }
        return billTotal;
    }

}
