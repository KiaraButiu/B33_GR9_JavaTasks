package uliana.week4_tasks;

import java.util.Arrays;

public class String_SameLetters {

    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true


    public static boolean areSameLetters(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(areSameLetters("abc", "cab")); // true
        System.out.println(areSameLetters("hello", "world")); // false
    }




}
