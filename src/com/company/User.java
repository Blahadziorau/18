package com.company;

import javax.xml.crypto.Data;

/**
 * Created by USER on 18.05.2016.
 */
public class User {


    private int salary;
    private String firstName1;
    private String lastName1;

    //Date date;
    public void setSalary(int i) {
        if (i >= 0) {
            salary = i;
        }
    }

    int getSalary() {
        return salary;
    }


}
