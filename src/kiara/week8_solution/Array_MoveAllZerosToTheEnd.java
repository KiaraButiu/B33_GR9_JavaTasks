package kiara.week8_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {
        int[] numbers = {0,2,3,4,50,8,0,0,100,0};
        moveAllZeros(numbers);

    }

     /*
    write a program that can move all the zeros to the end of an array
     */

    public static void moveAllZeros(int[] array){

        List<Integer> numbers = new ArrayList<>();                      // List to store numbers that are not zero from array
        List<Integer> zero = new ArrayList<>();                         // List to store all zero numbers from array

        for (int each : array) {                                        // For Each loop will iterate through each element of array
            if (each == 0){                                             // If 'each' == 0, add to Zero List
                zero.add(each);
            } else {                                                    // else if element is not zero, add to Numbers List
                numbers.add(each);
            }                                                           //By the end of For each loop: List Numbers will have digits & List Zero will have 0
        }
        numbers.addAll(zero);                                          //This line adds List of Zero at the end of List Numbers

        for (int i = 0; i < array.length; i++) {                       //I created a for loop to copy elements from List Numbers back to an Array
            array[i]=numbers.get(i);                                    // numbers.get(i) will retrieve each element and store it to array
        }

        System.out.println(Arrays.toString(array));                      // Arrays.toString(array) will convert array to string for printing

    }


}
