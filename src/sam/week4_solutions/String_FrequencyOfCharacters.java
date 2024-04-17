package sam.week4_solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {
    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String frequencyOfChars = "AAABBCDD";

        Map<Character, Integer> frequencyOfCharsMap = new HashMap<>();
        ArrayList<Character> listOfCharacters = new ArrayList<>();
        int counter = 0;

        for (char eachCharacter : frequencyOfChars.toCharArray()) {
            listOfCharacters.add(eachCharacter);
            if (listOfCharacters.contains(eachCharacter)){
                counter= Collections.frequency(listOfCharacters, eachCharacter);
            }
            frequencyOfCharsMap.put(eachCharacter, counter);
        }

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> characterIntegerEntry : frequencyOfCharsMap.entrySet()) {
            result.append(characterIntegerEntry.getKey());
            result.append(characterIntegerEntry.getValue());
        }

        System.out.println(result);
    }
}
