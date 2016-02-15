package com.company;

/**
 * Created by Shruti on 2/6/16.
 */
public class MergeSort {

    public static void split(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf)
    {
        int secondHalfIndex = listFirstHalf.length;

        for(int i = 0; i < listToSort.length; i++)
        {
            if(i < secondHalfIndex)
            {
                listFirstHalf[i] = listToSort[i];
            }
            else
            {
                listSecondHalf[i - secondHalfIndex] = listToSort[i];
            }
        }
    }

    public static void merge(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf)
    {
        int mergeIndex = 0;
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;

        while(firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length)
        {
            if(listFirstHalf[firstHalfIndex] < listSecondHalf[secondHalfIndex])
            {
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            }
            else
            {
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
            mergeIndex ++;
        }

        while(firstHalfIndex < listFirstHalf.length)
        {
            listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
        }

        while(secondHalfIndex < listSecondHalf.length)
        {
            listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
        }
    }

    public static void mergeSort(int[] listToSort)
    {
        if(listToSort.length == 1)
            return;

        int midPoint = listToSort.length/2 + listToSort.length%2;
        int[] listFirstHalf = new int[midPoint];
        int[] listSecondHalf = new int[listToSort.length - midPoint];
        split(listToSort, listFirstHalf, listSecondHalf);

        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);

        merge(listToSort,listFirstHalf,listSecondHalf);
        Main.printList(listToSort);
        
    }
}
