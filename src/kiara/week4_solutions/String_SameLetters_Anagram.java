package kiara.week4_solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class String_SameLetters_Anagram {
    public static void main(String[] args) {
        String str1 = "good";
        String str2 = "noob";
        System.out.println("isAnagram() = " + isAnagram(str1,str2));

        String str3 = "dear";
        String str4 = "read";
        System.out.println("isAnagram() = " + isAnagram(str3,str4));
    }

    public static boolean isAnagram(String word1, String word2) {

        char[] charArray1 = word1.toCharArray();        //Convert both strings to character arrays using toCharArray()
        char[] charArray2 = word2.toCharArray();            //allows for easier manipulation of characters

        Arrays.sort(charArray1);                       //Sort the characters in ascending order for comparing characters
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);      //Return True if equal, if not return false

    }

}
// Write a return method that check if a string is build out of the same letters as another string.
// Ex:  same("abc",  "cab"); -> true