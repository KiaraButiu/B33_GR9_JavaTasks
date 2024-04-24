package uliana.week5_tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static String findUniqueCharacters(String input) {
        // Create an empty string to store the result
        String result = "";

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isUnique = true;

            // Check if the current character is unique
            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the result
            if (isUnique) {
                result += currentChar;
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        String inputString = "AAABBBCCCDEF";
        String result = findUniqueCharacters(inputString);
        System.out.println("Unique characters in '" + inputString + "': " + result);
    }




}
