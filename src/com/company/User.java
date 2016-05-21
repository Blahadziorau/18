package com.company;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by USER on 18.05.2016.
 */
public class User {

    private int salary;
    private String firstName1;
    private String lastName1;
    private Date date;

    public void setSalary(int i) {
        if (i >= 0) {
            salary = i;
        }
    }

    int getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("Salary " + getSalary());
    }

}
