package com.company;

/**
 * Created by Shruti on 2/14/16.
 */
//
//Cracking The Coding Interview - Example 9.1
/* A child is running up a staircase with n steps and can run either 1, 2 or 3 steps at a time. Implement a method to count
how many possible ways the child can run up the stairs */

public class NSteps {

    public static int NStepsMethod(int n, int[] map) //dynamic programming
    {
        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        if (map[n] > -1)
            return map[n];

        System.out.println("Step right now is " + n);

        map[n] = NStepsMethod(n - 1, map) + NStepsMethod(n - 2, map) + NStepsMethod(n - 3, map);

        return map[n];
    }
}
