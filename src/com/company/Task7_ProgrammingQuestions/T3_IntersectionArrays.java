package com.company.Task7_ProgrammingQuestions;

public class T3_IntersectionArrays {


        public static void main(String[] args) {

            int arr1[] = {2, 6, 7, 8, 9};
            int arr2[] = {6, 9, 10};

            /**
             Take two indexes,
             and initialize with zero.
             */
            int i = 0;
            int j = 0;

            while(i < arr1.length && j < arr2.length) {
                if(arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    i++;
                    j++;
                } else if(arr1[i] > arr2[j]) {
                    j++;
                } else {
                    i++;
                }
            }
        }
    }

