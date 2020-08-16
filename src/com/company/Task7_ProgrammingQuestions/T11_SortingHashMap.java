package com.company.Task7_ProgrammingQuestions;

import java.util.*;

public class T11_SortingHashMap {
    // Java Code to sort Map by key value



        // This map stores unsorted values
        static Map<String, Integer> map = new HashMap<>();

        // Function to sort map by Key
        public static void sortbykey()
        {
            // TreeMap to store values of HashMap
            TreeMap<String, Integer> sorted = new TreeMap<>();

            // Copy all data from hashMap into TreeMap
            sorted.putAll(map);

            // Display the TreeMap which is naturally sorted
            for (Map.Entry<String, Integer> entry : sorted.entrySet())
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
        }

        // Driver Code
        public static void main(String args[])
        {
            // putting values in the Map
            map.put("Mohsin", 80);
            map.put("Bidyut", 90);
            map.put("Anam", 80);
            map.put("Amit", 75);
            map.put("Danish", 40);

            // Calling the function to sortbyKey
            sortbykey();
        }
    }

