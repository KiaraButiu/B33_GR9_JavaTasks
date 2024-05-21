package polina.week4_solutions;

import java.util.Set;
import java.util.TreeSet;

public class String_SameLetters {
    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true

    public static boolean isSameLetters(String word1, String word2){

        Set<Character> set1 = new TreeSet<>();
        for (char eachLetter:word1.toCharArray()) {
            set1.add(eachLetter);
        }
        Set<Character> set2 = new TreeSet<>();
        for (char eachLetter:word2.toCharArray()) {
            set2.add(eachLetter);
        }

        return set1.equals(set2);
    }

    public static void main(String[] args) {

        System.out.println("isSameLetters(\"poker\", \"koper\") = " + isSameLetters("poker", "koper"));
    }
}
