package com.company;

/**
 * Created by Shruti on 2/6/16.
 */
public class QuickSort {

    public static int partition(int[] listToSort, int low, int high)
    {
        int pivot = listToSort[low];
        int l = low;
        int h = high;

        while(l < h)
        {
            while (listToSort[l] < pivot)
            {
                l++;
            }
            while(listToSort[h] > pivot)
            {
                h--;
            }
            Main.swap(listToSort, l, h);
        }

        System.out.println("Pivot=" + pivot);
        Main.printList(listToSort);
        return h;
    }

    public static void quickSort(int[] listToSort, int low, int high)
    {
        if(low > high)
            return;

        int pivot = partition(listToSort, low, high);
        quickSort(listToSort, low, pivot - 1);
        quickSort(listToSort, pivot + 1, high);
    }
}
