package alena.week7_solutions;

import java.util.Arrays;

public class Array_SortInDescendingOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
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
                int tmp = 0;
                if (ArrayToCheck[i] < extraArray[j]) {
                    tmp = ArrayToCheck[i];
                    ArrayToCheck[i] = extraArray[j];
                    extraArray[j] = tmp;
                }

            }
        }
        return ArrayToCheck;

    }



}
