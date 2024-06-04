package seyma.week9_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {

    public static void main(String[] args) {

        // List of empty String to store the names
        List<String> names = new ArrayList<>();

        //.addAll method to add each names
       names.addAll(Arrays.asList("Ahmed","John","Eric", "Ahmed", "Seyma","Ahmed"));

        names.removeIf(removeName -> removeName.equals("Ahmed"));

        System.out.println(names);

    }


    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */







}
