/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carwashapp;
import java.util.Scanner;

/**
 *
 * @author colin
 */
public class CarWashApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of employees: ");
            int numEmployees = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            Employee[] employees = new Employee[numEmployees];
            
            for (int i = 0; i < numEmployees; i++) {
                System.out.println("Enter details for Employee " + (i + 1));
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Hourly Rate: $");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Hours Worked: ");
                int hoursWorked = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                
                employees[i] = new Employee(name, hourlyRate, hoursWorked);
            }
            
            CarWashManager manager = new CarWashManager(employees);
            manager.generatePaymentReport();
        }
    }
}






