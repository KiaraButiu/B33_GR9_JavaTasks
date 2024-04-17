package sam.week4_solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class String_SameLetters {
    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println("String1 use the same letters as String2: This is --- " + stringInspector(str1, str2));


    }

    public static boolean stringInspector(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        ArrayList<String> arrayListStr1 = new ArrayList<>();
        ArrayList<String> arrayListStr2 = new ArrayList<>();

        arrayListStr1.addAll(Arrays.asList(str1.split("")));

        arrayListStr2.addAll(Arrays.asList(str2.split("")));

        for (String eachSymbol : arrayListStr1) {
            if (arrayListStr2.contains(eachSymbol)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
