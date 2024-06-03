package polina.week9_solutions;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNumbers {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        //Creates a List<Integer> called numbers and populates it with integers.
        // For demonstration, it adds values from 1 to 110, incrementing by 10 each time.
        List<Integer> numbers = new ArrayList<>();
        // Adding values to the list, including values greater than 100
        for (int i = 1; i <= 110; i += 10) {
            numbers.add(i);
        }
        //Prints the list before removal.
        System.out.println("Before removal: " + numbers);
        //Calls the removeValuesGreaterThan100 method to remove all values greater than 100.
        removeValuesGreaterThan100(numbers);
        //Prints the list after removal.
        System.out.println("After removal: " + numbers);
    }

    public static void removeValuesGreaterThan100(List<Integer> numbers) {
        /*
        Takes a List<Integer> as a parameter.
        Uses the removeIf method with a lambda expression to remove all elements greater than 100.
         */
        numbers.removeIf(number -> number > 100);
    }
}
