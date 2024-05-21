package sam.week5_solutions;

import java.util.ArrayList;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(uniqueChars(str));

    }

    public static String uniqueChars(String str){
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (eachChar == str.charAt(j)){
                    frequency++;
                }
            }
            if (frequency == 1){
                unique.append(eachChar);
            }
        }
       return unique.toString();
    }
}
