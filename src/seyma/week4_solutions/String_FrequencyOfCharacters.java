package seyma.week4_solutions;

import java.util.HashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        System.out.println(charFreq("AAABBCDD"));
    }

    public static String charFreq(String word) {
        String result = "";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (result.contains(word.charAt(i) + ""))
                continue;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))
                    count++;

            }
            result += word.charAt(i) + "" + count;
            count = 0;

        }

        return result;
    }


}
