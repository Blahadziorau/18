package com.company;

import java.util.Scanner;

/**
 * Created by USER on 18.05.2016.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите X");
        x = sc.nextInt();
        System.out.println("Введите Y");
        y = sc.nextInt();
        sc.close();
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void printQuarter() {
        String message = null;
        if (x == 0 && y == 0) {
            message = "in 0";
        } else if (x == 0) {
            message = "on line X";
        } else if (y == 0) {
            message = "on line Y";
        } else if (x > 0 && y > 0) {
            message = "in I quarter";
        } else if (x < 0 && y > 0) {
            message = "in II quarter";
        } else if (x < 0 && y < 0) {
            message = "in III quarter";
        } else if (x > 0 && y < 0) {
            message = "in IV quarter";
        }
        System.out.println(message);
    }
}
