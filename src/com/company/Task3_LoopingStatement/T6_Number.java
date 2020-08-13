package com.company.Task3_LoopingStatement;

import java.util.Scanner;

public class T6_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First Number");
        double x = in.nextDouble();

        System.out.println("Input Second Number");
        double y = in.nextDouble();

        System.out.println("Input Third Number");
        double z = in.nextDouble();

        if (x < y && y < z) {
            System.out.println("Increasing Orders");
        } else if (x > y && y > z) {
            System.out.println("Decreasing Orders");
        } else {
            System.out.println("Neither Increasing or Decreasing Orders");
        }
    }
}


