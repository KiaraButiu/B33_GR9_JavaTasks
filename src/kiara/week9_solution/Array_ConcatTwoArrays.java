package kiara.week9_solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ConcatTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,6,8,10,12};
        int[] arr3 = concatTwoArrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3));



    }

    /*  Write a return method that can concat two arrays  */
    public static int[] concatTwoArrays(int[] arr1, int[] arr2){

        int[] combine = new int[arr1.length + arr2.length];            // this array will hold the concatenated Arrays with correct length

        int count = 0;                                                 // this variable will keep tract of current index in the 'combined' array

        for (int each : arr1) {                                       // this loop will iterate over each element of arr1,
            combine[count++] = each;                                 // Each element in 'arr1' will be assigned in 'combined' array
        }                                                               // and then count is incremented by 1.
        for (int each : arr2) {
            combine[count++] = each;
        }

        return combine;
    }
}





