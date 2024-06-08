package kiara.week9_solution;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();  // to store the list of numbers

        int N = 200;                                // represents till when loop will iterate

        for (int i = 0; i <= N; i++) {              // Loop will iterate each element through N
            numbers.add(i);                         // each element will be added to List of Numbers
        }

        System.out.println("Original List of Numbers: " + numbers);

        removeNumGreaterThan100(numbers);       //used the custom method which will return a new list of number

        System.out.println("New List of Numbers: " + numbers);


    }
      /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void removeNumGreaterThan100(List<Integer> listOfNum){

        /* Takes a list of Integer and used removeIf() with lamba expression to remove condition
        * if an element is greater than 100 */

        listOfNum.removeIf(number -> number > 100);


    }
}
