package polina.week9_solutions;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNameAhmed {
    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {
        //Creates a List<String> called names and populates it with several names, including "Ahmed".
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Mike");
        //Prints the list before removal.
        System.out.println("Before removal: " + names);
        //Calls the removeName method to remove all occurrences of "Ahmed".
        removeName(names, "Ahmed");
        //Prints the list after removal.
        System.out.println("After removal: " + names);
    }

    public static void removeName(List<String> names, String nameToRemove) {
        /*
        Takes a List<String> and a String representing the name to remove as parameters.
        Uses the removeIf method with a lambda expression to remove all elements that match the specified name.
         */
        names.removeIf(name -> name.equals(nameToRemove));
    }
}
