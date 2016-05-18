package com.company;



import java.util.Date;

/**
 * Created by USER on 18.05.2016.
 */
public class App {
    public static void main(String... args) {
        User admin = new User();
        admin.setSalary(-1000);
        System.out.println(admin.getSalary());
    }
}
