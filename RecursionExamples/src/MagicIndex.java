package com.company;

/**
 * Created by Shruti on 2/14/16.
 */
//Cracking The Coding Interview - Example 9.3
//Find the magic index
public class MagicIndex {

    public static int MagicIndex(int[] arr)
    {
        return MagicIndexHelper(arr, 0, arr.length - 1);
    }

    private static int MagicIndexHelper(int[] arr, int left, int right)
    {
        if (left > right || left < 0 || right >= arr.length)
            return -1;

        int mid = (left + right) /2 ;

        if (arr[mid] == mid)
            return mid;

        if (arr[mid] < mid)
            return MagicIndexHelper(arr, mid + 1, right);
        else
            return MagicIndexHelper(arr, left, mid - 1);
    }
}
