package seyma.week9_solutions;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNumbers {

      /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();  // Create an empty List of Integer to store the list of numbers

        int N = 300;                                // Declare integer N and assign it to 300 to use it during iteration

        for (int i = 0; i <= N; i++) {              // Loop will iterate each element through 300.

            numbers.add(i);                         // Each element will be added to List of Integer.
        }

        System.out.println("Before removing numbers: " + numbers);

        removeNumsIfGreaterThan100(numbers);

        System.out.println("After removing numbers: " + numbers);


    }

    public static void removeNumsIfGreaterThan100(List<Integer> listOfNums){

      /*
        Create a custom method with a list of integer and use the remove if method
         with the lambda expression. It will remove if the value is greater than 100.
       */

        listOfNums.removeIf(number -> number > 100);


    }










}
