package Irina.week5_solution;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters in \"" + input + "\": " + unique(input));
    }

    public static String unique(String str) {
        String uniqueChars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                uniqueChars += ch;
            }
        }
        return uniqueChars;
    }

}
