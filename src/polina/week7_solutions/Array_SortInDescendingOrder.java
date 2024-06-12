package polina.week7_solutions;

import java.util.Arrays;

public class Array_SortInDescendingOrder {
     /*
        Write a return method that can sort an int array in descending order without using the sort method
     */
     public static int[] descendOrder(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if(arr[i] < arr[j]){
                     int temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                 }
             }
         }


         return arr;
     }

    public static void main(String[] args) {
        int[] nums = {3,7,9,55,8,444,89,0,-5,10};
        System.out.println("descendOrder(nums) = " + Arrays.toString(descendOrder(nums)));
    }
}
