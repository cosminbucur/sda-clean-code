package com.sda.refactoring.features.ex2.after;

public class Client {

    public static void start() {
        Developer developer = new Developer();
        Doctor.getSalary();

        Doctor doctor = new Doctor();
    }
}
