package com.company.Task7_ProgrammingQuestions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class T4_UniqueCharacters {

        public static void main(String[] args) throws ParseException {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            StringBuffer sb = new StringBuffer(s1);
            for (int i = 0; i < sb.length(); i++) {
                int count = 0;
                for (int j = i + 1; j < sb.length(); j++) {
                    if (sb.charAt(i) == sb.charAt(j)) {
                        sb.deleteCharAt(j);
                        j--;
                        count++;
                    }
                }
                if (count >= 1) {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
            System.out.println(sb.length());
        }
    }

