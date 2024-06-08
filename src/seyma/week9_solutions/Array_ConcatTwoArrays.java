package seyma.week9_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_ConcatTwoArrays {

    /*
    Write a return method that can concat two arrays
     */


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr3=new int[arr1.length+arr2.length]; //since array size is fixed, I need a 3rd array
        //so length of the 3rd array should be combination of the arr1 and arr2 length



        //I need to get all the elements of first and second array and then assign them 1 by 1
        //to each indexes of the 3rd array starting from 0 to last.

        int j=0; //declare an additional variable for keeping track of arr3 indexes.

        for (int each : arr1) {         //use for each loop to get the elements of arr1
            arr3[j++]=each;             //then assign each element of arr1 to arr3
        }
        for (int each : arr2) {         //use for each loop to get the elements of arr2
            arr3[j++]=each;             //then assign each element of arr2 to arr3
        }
        System.out.println(Arrays.toString(arr3));
                
    }





}
