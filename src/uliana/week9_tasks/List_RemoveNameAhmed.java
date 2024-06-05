package uliana.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {

    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        // Remove all occurrences of "Ahmed"
        namesList.removeIf(name -> name.equals("Ahmed"));

        // Print the updated list
        System.out.println(namesList);
    }






}
