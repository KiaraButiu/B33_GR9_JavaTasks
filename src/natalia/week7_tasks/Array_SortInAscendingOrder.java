package natalia.week7_tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 4, 5};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }


}
