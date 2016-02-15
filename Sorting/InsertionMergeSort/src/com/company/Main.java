package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] listToSort = {5,9,8,2,3,1,4,6,7};
      //  MergeSort.mergeSort(listToSort);
        QuickSort.quickSort(listToSort, 0, listToSort.length - 1);
    }

    public static void printList(int[] listToSort)
    {
        for (int el : listToSort)
        {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iindex, int jindex)
    {
        int temp = listToSort[iindex];
        listToSort[iindex] = listToSort[jindex];
        listToSort[jindex] = temp;
    }

}
