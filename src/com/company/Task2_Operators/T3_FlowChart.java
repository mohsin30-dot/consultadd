package com.company.Task2_Operators;

//import package

public class T3_FlowChart {
        // main() method
        public static void main(String[] args) {
            // declaring three variables of integer type
            int a = 10;
            int b = 20;
            int c = 30;
            // calculating average of a ,b,c
            int avg = (a + b + c) / 3;
            // print average
            System.out.println("avg = " + avg);
            // checking avg
            if (avg > a && avg > b && avg > c) {
                // if avg is greater than a , b, c then
                // print message
                System.out.println("avg is higher than a,b,c");
            }
            // if avg is not greater than a,b,c then
            else if (avg > a && avg > b) {
                // if avg is greater than a and b then
                System.out.println("avg is higher than a,b");
            } else if (avg > a && avg > c) {
                // if avg is greater than a and c then
                System.out.println("avg is higher than a,c");
            } else if (avg > b && avg > c) {
                // if avg is greater than c and b then
                System.out.println("avg is higher than b,c");
            } else if (avg > a) {
                // if avg is greater than a then
                System.out.println("avg is just higher than a");
            } else if (avg > b) {
                // if avg is greater than a then
                System.out.println("avg is just higher than b");
            } else if (avg > c) {
                // if avg is greater than a then
                System.out.println("avg is just higher than c");
            }

        }

    }

