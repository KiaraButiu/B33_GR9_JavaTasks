package polina.week4_solutions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class String_RemoveDuplicates {

    public static String removeDuplic(String word){
        String result ="";
        Set<Character> charSet = new LinkedHashSet<>();

        for (int i = 0; i <word.length() ; i++) {
            charSet.add(word.charAt(i));
        }

        for (Character ch:charSet) {
            result+=ch+"";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("removeDuplic(\"Hello\") = " + removeDuplic("hello"));

    }

}
