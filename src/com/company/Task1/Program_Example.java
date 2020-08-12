package com.company.Task1;

import java.util.Scanner;
import java.io.*;

public class Program_Example {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            int[] arr=new int[2];
            int z;
            System.out.print("\n\nEnter any two Number between 1-10 : ");

            for(int i=0;i<2;i++)
            {
                arr[i]=sc.nextInt();
            }

            z=arr[0]+arr[1];

            z=z+30;

            System.out.println("\n\nFinal Value : Z = "+z);

            System.out.println("\n");
        }
    }



