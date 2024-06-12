package polina.week7_solutions;

import java.util.Arrays;

public class Array_SortInAscendingOrder {
   /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static int[] ascendOrder(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {3,7,9,55,8,444,89,0,-5,10};
        System.out.println("ascendOrder(nums) = " + Arrays.toString(ascendOrder(nums)));
    }
}
