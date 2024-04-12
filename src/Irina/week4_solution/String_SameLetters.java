package Irina.week4_solution;

import java.util.Arrays;

public class String_SameLetters {

    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" composed of the same letters? " + same(str1, str2));
    }

    public static boolean same(String str1, String str2) {
        // Sort both strings
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted strings
        return Arrays.equals(arr1, arr2);
    }







}
