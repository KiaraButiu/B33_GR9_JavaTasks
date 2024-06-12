package kiara.week7_solution;

import java.util.Arrays;

public class Array_SortInDescendingOrder {

    public static void main (String[] args){

        int[] numbers = {567, -876, 3, 5, 87, 10};
        System.out.println(Arrays.toString(descendingOrder(numbers)));


    }

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */

    public static int[] descendingOrder(int[] arrNum){

        for (int i = 0; i < arrNum.length; i++) {

            for (int j = i + 1; j < arrNum.length; j++) {

                if (arrNum[i] < arrNum[j]){
                    int swap = arrNum[j];
                    arrNum[j] = arrNum[i];
                    arrNum[i] = swap;
                }
            }
        }
        return arrNum;
    }
}
