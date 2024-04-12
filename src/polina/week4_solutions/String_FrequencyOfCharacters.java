package polina.week4_solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class String_FrequencyOfCharacters {
        /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String freqChar(String word) {  //AAABBCDD
        /*
        This Java code is a function called freqChar that takes a string (word) as input
        and returns a string representing the frequency of each character in the input string.
        It initializes an empty string called result to store the result and an integer
        variable count to count the frequency of each character.

         */
        String result = "";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (result.contains(word.charAt(i) + "")) continue;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) count++;
            }
            result += word.charAt(i) + "" + count;
            count = 0;
        }
        return result;

        /*
        It iterates through each character of the input string (word) using a loop.

        For each character, it checks if the result string already contains that character.
        If it does, it skips to the next character using the continue statement.

        If the character is not already in the result string,
        it starts another loop to count how many times that character appears in the input string (word).

        After counting, it appends the character and its frequency to the result string.

        Finally, it resets the count variable to 0 for the next character.

        Once all characters in the input string have been processed, it returns
        the result string containing the characters and their frequencies.
         */
    }

    public static void main(String[] args) {
        System.out.println(freqChar("AAAvvvBSsrwweBCvDD"));
    }
}
