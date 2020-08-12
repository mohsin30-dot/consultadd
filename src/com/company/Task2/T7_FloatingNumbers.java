package com.company.Task2;

import java.util.Scanner;
import java.lang.*;

public class T7_FloatingNumbers {
    public static void main (String[] args)
    {
        double number;

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in); //use Scanner object to input number
        number = sc.nextDouble();


// check number
        if(number == 0)
            System.out.println("zero");
        else if(number < 0)
            System.out.println("negative");
        else if(number > 0)
            System.out.println("positive");



        if(Math.abs(number)<1)
            System.out.println("small");

        if(Math.abs(number)>1000000)
            System.out.println("large");

    }
}

