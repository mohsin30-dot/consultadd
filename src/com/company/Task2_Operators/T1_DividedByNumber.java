package com.company.Task2_Operators;

import java.util.Scanner;

public class T1_DividedByNumber {
        public static void main(String args[]) {

            int num;
            String str="";
//reading input from user
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number: ");
            num=input.nextInt();

//if else conditions
            if(num%3==0)
            {
                str="Consultadd";
            }
            else if(num%5==0)
            {
                str="JAVA Training";
            }
            else if((num%3==0) && (num%5==0))
            {
                str="Consultadd JAVA Training";
            }

//printing the result
            System.out.println(str);
        }
    }

