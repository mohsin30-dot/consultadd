package com.company.Task2_Operators;
import java.util.Scanner;

public class Example_Calculator {

        public static void main(String args[]) {
            int choice;
            do{
                System.out.println("Welcome to use this simple calculator developed by Mohsin!");
                System.out.println("Enter 1 for Addition");
                System.out.println("Enter 2 for Subtraction");
                System.out.println("Enter 3 for Multiplication");
                System.out.println("Enter 4 for Division");
                System.out.println("Enter 5 for Square Root");
                System.out.println("Enter 6 for Exit");
                System.out.println("Enter your Choice:");
                Scanner s=new Scanner(System.in);
                choice=s.nextInt();
                int first_num,second_num,result;
                switch(choice){
                    case 1:
                        System.out.println("Enter First Number:");
                        first_num=s.nextInt();
                        System.out.println("Enter Second Number:");
                        second_num=s.nextInt();
                        result=first_num+second_num;
                        System.out.println("Sum of two Numbers:"+result);
                        break;
                    case 2:
                        System.out.println("Enter First Number:");
                        first_num=s.nextInt();
                        System.out.println("Enter Second Number:");
                        second_num=s.nextInt();
                        result=first_num-second_num;
                        System.out.println("Difference of two Numbers:"+result);
                        break;
                    case 3:
                        System.out.println("Enter First Number:");
                        first_num=s.nextInt();
                        System.out.println("Enter Second Number:");
                        second_num=s.nextInt();
                        result=first_num*second_num;
                        System.out.println("Multiplication of two Numbers:"+result);
                        break;
                    case 4:
                        System.out.println("Enter First Number:");
                        double f_num=s.nextDouble();
                        System.out.println("Enter Second Number:");
                        double s_num=s.nextDouble();
                        double result1=f_num/s_num;
                        System.out.println("Division of two Numbers:"+result1);
                        break;
                    case 5:
                        System.out.println("Enter a Number:");
                        first_num=s.nextInt();
                        double result2=Math.sqrt(first_num);
                        System.out.println("Square Root is:"+result2);
                        break;
                    case 6:
                        System.out.println("Good Bye!");
                        break;
                    default:
                        System.out.println("You have entered a wrong choice!!!");

                }
            }while(choice!=6);
        }
    }

