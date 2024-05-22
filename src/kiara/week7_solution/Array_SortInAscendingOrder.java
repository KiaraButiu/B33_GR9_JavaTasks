package kiara.week7_solution;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    public static void main (String[] args){

        int[] numbers = {-10, 200, 56, 90, 0 };

        System.out.println(Arrays.toString(ascendingOrder(numbers)));

    }

    /*
        Write a method that can sort an int array in Ascending order without using the sort method
         */

    public static int[] ascendingOrder(int[] arrayNum){

        for (int i = 0; i < arrayNum.length; i++) {           //Outter For Loop will iterate through the array

            for (int j = i + 1; j < arrayNum.length; j++) {     //Inner For Loop: iterates through the i + 1 all the way to the end.
                                                                    // Here we find the smallest element in the remaining unsorted array.
                                                                    // and compare the elements at index "i" and "j"

                if (arrayNum[i] > arrayNum[j]) {                // If current element 'i' is greater than 'j'
                                                                    // swap to sort the array in ascending order
                    int swap = arrayNum[i];                     // 'swap' variable will temporary store arrayNum[i]
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = swap;                         // then the values of arrayNum[i] and [j] are then exchanged.
                }
            }
        }
        return arrayNum;
    }
}
