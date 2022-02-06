package com.techelevator.crm;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    String firstName = "John";
    String lastName = "Doe";
    String phoneNumber = "8675309";

    @Test
    public void customer_get_balance_due_map_sum_test() {
        Map<String, Double> services = new HashMap<String, Double>();
        services.put("Grooming", 10.00);
        services.put("Walking", 20.00);
        services.put("Sitting", 30.00);
        Customer customer = new Customer(firstName, lastName);

        assertEquals(60.00, customer.getBalanceDue(services), 0.0);


    }

    //    Attempted to constructor test, full coverage requires getPhoneNumber
//    not instructed to create getter/setter for customer, but if we did a PN test goes here too
    @Test
    public void customer_constructor_functionality_test() {
        Customer johndoe = new Customer("john", "doe", "8675309");
        assertEquals("john", johndoe.getFirstName());
        assertEquals("doe", johndoe.getLastName());
//        assertEquals("8675309", johndoe.getPhoneNumber());

    }
}
