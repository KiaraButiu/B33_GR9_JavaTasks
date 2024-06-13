package Iunus.week9_solutions;

import java.util.Arrays;

public class Array_ConcatTwoArrays {
    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,6,8,10,12};
        int[] arr3 = concatTwoArrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public static int[] concatTwoArrays (int[] arr1, int[] arr2){

        int[] result = new int [arr1.length + arr2.length];

        int count = 0;

        for (int eachMemberOf : arr1) {
            result[count++] = eachMemberOf;
        }
        for (int eachMemberOf : arr2) {
            result[count++] = eachMemberOf;
        }
        return result;
    }
}
