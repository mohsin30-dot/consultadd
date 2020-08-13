package com.company.Task4_Array;

public class T5_MoveRelativeOrderInArray {

        public static void main(String[] args) throws Exception {
            int[] array_numbs = {0,0,1,0,3,0,5,0,6};
            int i = 0;
            System.out.print("\nOriginal array: \n");
            for (int n : array_numbs)
                System.out.print(n+"  ");

            for(int j = 0, l = array_numbs.length; j < l;) {
                if(array_numbs[j] == 0)
                    j++;
                else {
                    int temp = array_numbs[i];
                    array_numbs[i] = array_numbs[j];
                    array_numbs[j] = temp;
                    i ++;
                    j ++;
                }
            }
            while (i < array_numbs.length)
                array_numbs[i++] = 0;
            System.out.print("\nAfter moving 0's to the end of the array: \n");
            for (int n : array_numbs)
                System.out.print(n+"  ");
            System.out.print("\n");
        }
    }

