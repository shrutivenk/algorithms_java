package com.company;

import java.util.ArrayList;

/**
 * Created by Shruti on 2/15/16.
 */
//Cracking
public class AllValidParanthesis {

    public static ArrayList<String> GenerateParan(int n)
    {
        ArrayList<String> paranList = new ArrayList<String>();
        char[] str = new char[n * 2];
        AddParan(paranList, n, n, str, 0);
        return paranList;
    }

    private static void AddParan(ArrayList<String> list, int leftrem, int rightrem, char[] str, int count)
    {
        if (leftrem < 0 || rightrem < leftrem)
            return;

        System.out.println("leftrem="+leftrem+" rightrem="+rightrem+" str="+String.copyValueOf(str)+" count="+count);
        if( leftrem == 0 && rightrem == 0)
        {
            String s = String.copyValueOf(str);
            System.out.println(s);
            list.add(s);
        }

        else {
            if (leftrem > 0)
            {
                str[count] = '(';
                AddParan(list, leftrem - 1, rightrem, str, count + 1);
            }

            if (rightrem > 0)
            {
                str[count] = ')';
                AddParan(list, leftrem, rightrem - 1, str, count + 1);
            }
        }
    }
}
