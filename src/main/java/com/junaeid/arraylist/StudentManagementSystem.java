package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>();


        int user_choice = 0;


        boolean running = true;
        String person_info = "";

        while (running) {

            System.out.println(
                    "1. Add Student\n" +
                            "2. Remove Student\n" +
                            "3. Search Student\n" +
                            "4. Show Students\n" +
                            "5. Exit\n"
            );
            user_choice = sc.nextInt();
            sc.nextLine();

            switch (user_choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    person_info = sc.nextLine();
                    students.add(person_info);
                    break;
                case 2:
                    System.out.print("Enter Student Name: ");
                    person_info = sc.nextLine();
                    if (students.contains(person_info))
                        students.remove(person_info);
                    else
                        System.out.println("Student does not exists");
                    break;
                case 3:
                    System.out.print("Enter Student Name: ");
                    person_info = sc.nextLine();
                    if (students.contains(person_info)) {
                        System.out.println(students.indexOf(person_info) + " : " + person_info);
                    } else
                        System.out.println("Student does not exists");

                    break;
                case 4:
                    System.out.println("List of student name ");
                    for (String i : students)
                        System.out.println("Name : " + i);
                    System.out.println(" ");
                    break;
                case 5:
                    running = false;
                    break;

            }
        }

    }
}
