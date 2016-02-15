package com.company;

/**
 * Created by Shruti on 2/6/16.
 */
public class InsertionSort {

    public static void insertionSortMethod(int[] listToSort)
    {
        for (int i = 0; i < listToSort.length - 1; i++)
        {
            for (int j = i + 1; j > 0; j--)
            {
                if (listToSort[j] < listToSort[j-1])
                {
                    Main.swap(listToSort, j, j-1);
                }
                else
                    break;
            }
        }
        Main.printList(listToSort);
    }
}
