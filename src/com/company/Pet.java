package com.company;

/**
 * Created by USER on 18.05.2016.
 */
public class Pet {
    String name;
    int birth;

    public Pet(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}

