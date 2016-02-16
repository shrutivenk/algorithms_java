package com.company;

public class Main {

    public static void main(String[] args) {
	  // Call NSteps
      /*  int[] map = new int[100];
        for (int i = 0; i < map.length; i++)
        {
            map[i] = -1;
        }

        int ways = NSteps.NStepsMethod(3, map);
        System.out.println("Total number of ways is " + ways); */

      //Call MagicIndex
     /*   int[] arr = {-20, -10, -1, 2, 4, 6, 7};
        int mi = MagicIndex.MagicIndex(arr);
        System.out.print("Magic index is " + mi); */

       //Call AllSubsets
      /*  ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(1); set.add(2); set.add(3);
        AllSubsets.AllSubsets(set, 0);*/

       //All Permutations of String
       /* ArrayList<String> myList = PermutationsOfAString.Permutations("abc");
        System.out.print(myList.size()); */

       //All Valid Paranthesis
        AllValidParanthesis.GenerateParan(2);
    }
}
