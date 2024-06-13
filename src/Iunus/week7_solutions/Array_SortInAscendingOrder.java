package Iunus.week7_solutions;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static void main(String[] args) {
        int[] array = {10, -6, 45, 18, -100, -30, 15}; // int Array

        int[] ascendingArray = ascendingOrder(array);

        System.out.println("ascendingOrder(array) = " + Arrays.toString(ascendingArray));


    }

    public static int[] ascendingOrder(int[] ArrayToCheck) {
       int[] extraArray;
        extraArray = ArrayToCheck;

        for (int i = 0; i < ArrayToCheck.length; i++) {
            for (int j = i + 1; j < extraArray.length; j++) {
                int temporary = 0;
                if (ArrayToCheck[i] > extraArray[j]) {
                    temporary = ArrayToCheck[i];
                    ArrayToCheck[i] = extraArray[j];
                    extraArray[j] = temporary;
                }

            }
        }
        return ArrayToCheck;

    }



}
