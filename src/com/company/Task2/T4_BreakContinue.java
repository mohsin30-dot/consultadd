package com.company.Task2;

//import package
import java.util.*;

public class T4_BreakContinue {

        // main() method
        public static void main(String[] args) {
            // Object of Scanner class
            Scanner sc = new Scanner(System.in);
            // using while loop
            while (true) {
                // This line will ask user a number
                System.out.print("Enter a number : ");
                // reading number
                int number = sc.nextInt();
                // checking number
                if (number < 0) {
                    break;// break the while loop
                } else {
                    // when number is positive then
                    System.out.println("Good Going");
                    continue;// continue the loop
                }
            }
            // When loop will break print It’s Over
            System.out.println("It’s Over");

        }

    }

