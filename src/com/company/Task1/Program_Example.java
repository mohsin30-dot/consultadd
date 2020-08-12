package com.company.Task1;

import java.util.Scanner;

public class Program_Example {

    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter Two Numbers (Press Enter after each):");
        //two variables to hold numbers
        double x, y, z;
        x = readme.nextDouble();
        y = readme.nextDouble();
        z = x + y + 30;
        System.out.println("Total = " + z);
    }
}
