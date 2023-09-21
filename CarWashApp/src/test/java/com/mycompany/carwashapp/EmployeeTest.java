/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.carwashapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author colin
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    @Test
    public void testCalculateSalary() {
        Employee employee = new Employee("John Doe", 10.0, 40);
        double expectedSalary = 10.0 * 40;
        assertEquals(expectedSalary, employee.calculateSalary(), 0.001); // Using delta for double comparison
    }
    @Test
    public void testCalculateSalaryFail() {
        Employee employee = new Employee("John Doe", 10.0, 40);
        double expectedSalary = 500.0; // Incorrect expected value
        assertEquals(expectedSalary, employee.calculateSalary(), 0.001); // This will fail
    }

    
    @Test
    public void testGetHourlyRate() {
        Employee employee = new Employee("Jane Smith", 15.0, 35);
        assertEquals(15.0, employee.getHourlyRate(), 0.001);
    }
    @Test
    public void testGetHourlyRateFail() {
        Employee employee = new Employee("Jane Smith", 15.0, 35);
        assertEquals(20.0, employee.getHourlyRate(), 0.001); // Incorrect expected value
    }

    
    @Test
    public void testGetHoursWorked() {
        Employee employee = new Employee("Bob Johnson", 12.5, 45);
        assertEquals(45, employee.getHoursWorked());
    }
    @Test
    public void testGetHoursWorkedFail() {
        Employee employee = new Employee("Bob Johnson", 12.5, 45);
        assertEquals(40, employee.getHoursWorked()); // Incorrect expected value
    }
    
    
    @Test
    public void testConstructor() {
        Employee employee = new Employee("Alice Johnson", 20.0, 30);
        assertEquals("Alice Johnson", employee.getName());
        assertEquals(20.0, employee.getHourlyRate(), 0.001);
        assertEquals(30, employee.getHoursWorked());
    }
    @Test
    public void testConstructorFail() {
        Employee employee = new Employee("Alice Johnson", 20.0, 30);
        assertEquals("Bob Johnson", employee.getName()); // Incorrect expected value
        assertEquals(25.0, employee.getHourlyRate(), 0.001); // Incorrect expected value
        assertEquals(35, employee.getHoursWorked()); // Incorrect expected value
    }
    
}

