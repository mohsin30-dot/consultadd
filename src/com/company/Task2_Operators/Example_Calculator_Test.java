package com.company.Task2_Operators;

import java.io.*;

public class Example_Calculator_Test {

        public static void main(String arg[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int ch,cont=1;double n1,n2,res;
            System.out.println("Welcome to simple calculator developed by Mohsin");
            while(cont==1)
            {
                n1=0;n2=0;res=0.0;
                System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square root\n\n Enter your choice : ");
                ch=Integer.parseInt(br.readLine());
                System.out.println();
                if(ch>=1 && ch<=4)
                {
                    if(ch==1||ch==2||ch==3||ch==4)
                    {
                        System.out.print("Enter first number : ");
                        n1=Double.parseDouble(br.readLine());
                        System.out.print("Enter second number : ");
                        n2=Double.parseDouble(br.readLine());
                    }
                    else if(ch==5)
                    {
                        System.out.print("Enter number : ");
                        n1=Double.parseDouble(br.readLine());
                    }
                    if(ch==1)
                    {
                        res=n1+n2;
                    }
                    if(ch==2)
                    {
                        res=n1-n2;
                    }
                    if(ch==3)
                    {
                        res=n1*n2;
                    }
                    if(ch==4)
                    {
                        res=n1/n2;
                    }
                    if(ch==5)
                    {
                        res=Math.sqrt(n1);
                    }
                    System.out.println("\nResult = "+res+"\n");
                    System.out.print("Do you want to continue? (1->Yes || 0->NO) : ");
                    cont=Integer.parseInt(br.readLine());
                    System.out.println("_________________________________________________");
                }
                else
                {
                    System.out.print("Wrong choice Input...Try again? (1->Yes || 0->No) : ");
                    cont=Integer.parseInt(br.readLine());
                    System.out.println("_____________________________________________________");
                }
            }
        }
    }

