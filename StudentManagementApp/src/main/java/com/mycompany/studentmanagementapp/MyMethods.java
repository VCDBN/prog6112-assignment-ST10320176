package com.mycompany.studentmanagementapp;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colin
 */
public class MyMethods {
    private static final int MAX_STUDENTS = 100; // Maximum number of students
    private static Student[] students = new Student[MAX_STUDENTS];
    public static int studentCount = 0;
    
    Scanner scanner = new Scanner(System.in);


    public void captureStudent() {
        if (studentCount < MAX_STUDENTS) {
            System.out.println("\nCAPTURE A NEW STUDENT");
            System.out.println("*********************************");

            System.out.print("Enter the student id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the student's name: ");
            String name = scanner.nextLine();

            int age;
            do {
                System.out.print("Enter the student age: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("You have entered an incorrect student age!!!!");
                    System.out.print("Please re-enter the student age: ");
                    scanner.next();
                }
                age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } while (age < 16);

            System.out.print("Enter the student email address: ");
            String email = scanner.nextLine();

            System.out.print("Enter the student course: ");
            String course = scanner.nextLine();

            Student newStudent = new Student(id, name, age, email, course);
            students[studentCount] = newStudent;
            studentCount++;

            System.out.println("Student details have been successfully saved.");
        } else {
            System.out.println("Maximum number of students reached!");
        }
    }

    public void searchStudent() {
        System.out.print("\nEnter the Student ID to search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == searchId) {
                System.out.println("\n----------------------------------------------------");
                System.out.println("STUDENT ID: " + students[i].getId());
                System.out.println("STUDENT NAME: " + students[i].getName());
                System.out.println("STUDENT AGE: " + students[i].getAge());
                System.out.println("STUDENT EMAIL: " + students[i].getEmail());
                System.out.println("STUDENT COURSE: " + students[i].getCourse());
                System.out.println("--------------------------------------------------------");
                return;
            }
        }

        System.out.println("\n------------------------------------------------------");
        System.out.println("Student with Student ID: " + searchId + " was not found!");
        System.out.println("----------------------------------------------------------");
    }

    public void deleteStudent() {
        System.out.print("\nEnter the student ID to be deleted: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == deleteId) {
                System.out.print("Are you sure you want to delete student " + students[i].getId() + " from the system? (Y/N): ");
                String confirm = scanner.nextLine().trim().toLowerCase();

                if (confirm.equals("y")) {
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    studentCount--;
                    System.out.println("Student with Student ID: " + deleteId + " was deleted!");
                } else {
                    System.out.println("Deletion canceled.");
                }
                return;
            }
        }

        System.out.println("\n------------------------------------------------------");
        System.out.println("Student with Student ID: " + deleteId + " was not found!");
        System.out.println("----------------------------------------------------------");
    }

    public void printStudentReport() {
        System.out.println("\nSTUDENT REPORT");
        System.out.println("*********************************");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("STUDENT ID: " + students[i].getId());
            System.out.println("STUDENT NAME: " + students[i].getName());
            System.out.println("STUDENT AGE: " + students[i].getAge());
            System.out.println("STUDENT EMAIL: " + students[i].getEmail());
            System.out.println("STUDENT COURSE: " + students[i].getCourse());
            System.out.println("--------------------------------------------------------");
        }
    }
}
