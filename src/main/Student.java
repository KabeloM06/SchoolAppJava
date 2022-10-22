package main;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;
    private int balance = 0;

    // Default constructor


    public Student() {
    }

    public Student(String name, String surname, int age, String className, int balance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
        this.balance = balance;
    }
}
