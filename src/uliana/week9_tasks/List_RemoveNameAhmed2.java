package uliana.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed2 {
     /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
     public static void main(String[] args) {
         List<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

         // Remove all occurrences of "Ahmed"
         for (int i = namesList.size() - 1; i >= 0; i--) {
             if (namesList.get(i).equals("Ahmed")) {
                 namesList.remove(i);
             }
         }

         // Print the updated list
         System.out.println(namesList);
     }
     //we iterate through the list in reverse order to avoid issues with index shifting when removing elements
}
