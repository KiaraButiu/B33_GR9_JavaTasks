package natalia.week4_solutions;

import java.util.Arrays;

public class String_SameLetters {


    public static void main(String[] args) {

        same("abc", "cab");
    }

    public static void same(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("false");        // strings of different lengths cannot be anagrams.

        } else {

            char[] left = str1.toCharArray();
            char[] right = str2.toCharArray();

            Arrays.sort(left);                  //sort the characters in both strings (using Arrays.sort).
            Arrays.sort(right);

            System.out.println(Arrays.equals(left, right));
        }
    }
}
// Write a return method that check if a string is build out of the same letters as another string.
// Ex:  same("abc",  "cab"); -> true





