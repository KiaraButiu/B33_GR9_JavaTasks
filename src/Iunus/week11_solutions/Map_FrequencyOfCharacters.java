package Iunus.week11_solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*
    Write a method that prints the frequency of each character from a String
    */

    public static void main(String[] args) {
        String str = "ttteeesssttt";
        printCharacterFrequencies(str);
    }

    public static void printCharacterFrequencies(String str) {

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
