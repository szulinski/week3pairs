package com.techelevator.hr;

import com.techelevator.crm.Customer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.", employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.", 100, employee.getSalary(), 0.0);
    }


    @Test
    public void employee_get_balance_due_map_sum_test() {
        Employee employee = new Employee("john", "doe");
        Map<String, Double> services = new HashMap<String, Double>();
        services.put("Grooming", 10.00);
        services.put("Walking", 20.00);
        services.put("Sitting", 30.00);

        assertEquals(50.00, employee.getBalanceDue(services), 0.0);
    }
}