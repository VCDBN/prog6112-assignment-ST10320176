/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementapp;
import java.util.Scanner;
/**
 *
 * @author colin
 */
public class StudentManagementApp {
    

    public static void main(String[] args) {
        
        MyMethods object = new MyMethods();
     Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("*******************************************");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            System.out.print("Please select one of the following menu items: ");

            String choice = scanner.next();
            scanner.nextLine(); // Consume the newline character

            if ("1".equals(choice)) {
               
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Capture a new student.");
            System.out.println("2. Search for a student.");
            System.out.println("3. Delete a student.");
            System.out.println("4. Print student report.");
            System.out.println("5. Exit Application");
            System.out.print("Enter your choice: ");

            int menuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (menuChoice) {
                case 1 -> object.captureStudent();
                case 2 -> object.searchStudent();
                case 3 -> object.deleteStudent();
                case 4 -> object.printStudentReport();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
