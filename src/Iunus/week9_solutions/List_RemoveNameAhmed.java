package Iunus.week9_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {

     /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
     public static void main(String[] args) {
         List<String> original = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Bob", "Shawn", "Ahmed", "Jake" ));
         List<String> strings = newArray(original);
         System.out.println(strings);

     }

     public static List<String> newArray (List<String> original){
         List<String> customArray = new ArrayList<>();

         for (String each : original) {
             if (each.equalsIgnoreCase("Ahmed")){
                 continue;
             } else {
                 customArray.add(each);
             }
         }
         return customArray;
     }
}
