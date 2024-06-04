package kiara.week9_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {
        /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();         // List of String to store the names
        names.add("Ahmed");                             //.add method to add each string
        names.add("Kiara");
        names.add("Edward");
        names.add("Ahmed");
        names.add("Amahara");

        names.removeIf(removeName -> removeName.equals("Ahmed"));   //removeIf Method in lamba expression takes a specific condition
                                                                    // and removes all elements that satisfy to that condition

        System.out.println(names);

    }




}
