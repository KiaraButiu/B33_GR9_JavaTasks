package seyma.week5_solutions;

import java.sql.PreparedStatement;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */


    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
    public static String unique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                result += str.charAt(i);
            }

        }

        return result;
    }
}
