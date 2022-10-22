package main;

import util.InputUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School's Operation Center");
        int operation = InputUtil.enterInteger("What do you want to do?"+
                "\n1: Register Student"+
                "\n2: Show All Students"+
                "\n3: Find A Student"+
                "\n4: Update a Student"+
                "\n5: Quit"
                );

        if(operation==1){//register student
            int count = InputUtil.enterInteger("How many students are you registering?");
            Config.students = new Student[count]; // count determines the size of the array
            for(int i=0;i<count;i++){
                System.out.println((i+1)+". Registration");
                Student studentDetails = InputUtil.fill();
                Config.students[i] = studentDetails;
            }
        }

    }
}
