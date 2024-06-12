package polina.week9_solutions;

import java.util.Arrays;

public class Array_ConcatTwoArrays {
     /*
    Write a return method that can concat two arrays
     */
     public static int[] concatArrays(int[] arr1, int[] arr2) {
         int[] arr3 = new int[arr1.length + arr2.length];

         int j = 0; // for keeping track of arr3 indexes

         for (int each : arr1) { //iterates over arr1, copying their elements into arr3
             arr3[j++] = each;
         }

         for (int each : arr2) { //iterates over arr2, copying their elements into arr3
             arr3[j++] = each;
         }

         return arr3;
     }
    public static void main(String[] args) { //The main method initializes two arrays (arr1 and arr2),
                                             // calls the concatArrays method to concatenate them,
                                             // and then prints the resulting array.
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90};

        int[] arr3 = concatArrays(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }
}
