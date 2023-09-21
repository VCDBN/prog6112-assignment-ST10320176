/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carwashapp;

/**
 *
 * @author colin
 */
// CarWashManager class to manage employees and generate a payment report
public class CarWashManager {
    private Employee[] employees;

    public CarWashManager(Employee[] employees) {
        this.employees = employees;
    }

    public void generatePaymentReport() {
        System.out.println("Payment Report for Car Wash Employees");
        System.out.println("-------------------------------------");
        double totalPayment = 0;

        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            totalPayment += salary;

            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Hourly Rate: $" + employee.calculateSalary());
            System.out.println("Hours Worked: " + employee.getHoursWorked());
            System.out.println("Salary: $" + salary);
            System.out.println("-------------------------------------");
        }

        System.out.println("Total Payment: $" + totalPayment);
    }
}