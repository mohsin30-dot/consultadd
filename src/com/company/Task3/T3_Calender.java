package com.company.Task3;

import java.util.Scanner;

public class T3_Calender {



// Main method of the program

        public static void main(String[] args)

        {

// Define the days of the week.

            String weekDays[] = {"Sunday", "Monday","Tuesday",

                    "Wednesday", "Thursday","Friday", "Saturday"};

// Create an object of the scanner class.

            Scanner scan = new Scanner(System.in);

// prompt the user to enter the month.

            System.out.print("Enter the month: ");

            String monthName = scan.next();

// Prompt the user to enter the first day of the month.

            System.out.print("What day is the first"+ " of the month: ");

            String firstDay = scan.next();

// Prompt the user to enter the number of days in a month.

            System.out.print("How many days "+ "in this month: ");

            int noOfDays = scan.nextInt();

// Declare the 2D array.

            String days[][] = new String[6][7];

            int startDay = 0;

// Use for loop find the start day of the month.

            for (int i = 0; i < weekDays.length; i++)

            {

                if(weekDays[i].equalsIgnoreCase(firstDay))

                {

                    startDay = i;

                }

            }

            int pos = 1;

// Use for loop to store the days in the 2D array.

            for (int i = 0; i < days.length; i++)

            {

                for (int j = 0; j < days[0].length; j++)

                {

                    if (i == 0 && j < startDay)

                    {

                        days[i][j] = " ";

                    }

                    else

                    {

                        if (pos <= noOfDays)

                        {

                            days[i][j] = pos + "";

                            pos++;

                        }

                        else

                        {

                            days[i][j] = " ";

                        }

                    }

                }

            }

            System.out.println();

// Print the name of the month on the console.

            System.out.println(monthName);

            System.out.println();

// Print the week days on the console.

            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

// Use for loop to print the days.

            for (int i = 0; i < days.length; i++)

            {

                for (int j = 0; j < days[0].length; j++)

                {

                    System.out.print(days[i][j] + "\t");

                }

                System.out.println();

            }

        }

    }

