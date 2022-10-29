package main;

import util.InputUtil;
import util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School's Operation Center");

        while (true) {
            int operation = InputUtil.enterInteger("What do you want to do?" +
                    "\n1: Register Student" +
                    "\n2: Show All Students" +
                    "\n3: Find A Student" +
                    "\n4: Update a Student" +
                    "\n5: Quit"
            );


            if (operation == 1) {//register student
                MenuUtil.registerStudent();
            } else if (operation == 2) {
                MenuUtil.printAllStudents();
            }
        }

    }
}
