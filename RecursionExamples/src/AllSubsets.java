package com.company;

import java.util.ArrayList;

/**
 * Created by Shruti on 2/14/16.
 */
//Cracking The Coding Interview - Example 9.4
//Write a program to return all subsets of a set
public class AllSubsets {

    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> set, int index)
    {
        ArrayList<ArrayList<Integer>> allSubsets;

        if (set.size() == index) //if set is empty
        {
            allSubsets = new ArrayList<ArrayList<Integer>>();
            allSubsets.add(new ArrayList<Integer>());
        }
        else
        {
            allSubsets = AllSubsets(set, index + 1);
            int item = set.get(index);

            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();

            for (ArrayList<Integer> subset : allSubsets)
            {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }

            allSubsets.addAll(moreSubsets);
        }

        return allSubsets;

    }

}



