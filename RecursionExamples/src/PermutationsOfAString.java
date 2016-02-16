package com.company;

import java.util.ArrayList;

/**
 * Created by Shruti on 2/15/16.
 */
//Cracking The Coding Interview - Example 9.5
//Write a program to return all permutations of a string
public class PermutationsOfAString {

    public static ArrayList<String> Permutations (String s)
    {
        return PermsHelper(new ArrayList<String>(), -1, s);
    }

    private static ArrayList<String> PermsHelper(ArrayList<String> p, int index, String s) {
        if (p.size() == 0) {
            p.add("");
        }

        if (index == s.length() - 1)
            return p;

        ArrayList<String> q = new ArrayList<String>();
        for (String s1 : p) {
            char item = s.charAt(index + 1);
            for (int i = 0; i <= index + 1; i++) {
                StringBuilder s2 = new StringBuilder();
                s2.append(s1);
                s2.insert(i, item);
                q.add(s2.toString());
            }
        }
        index = index + 1;
        return PermsHelper(q, index, s);
    }

}


