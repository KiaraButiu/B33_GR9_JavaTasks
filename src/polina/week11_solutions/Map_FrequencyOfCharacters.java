package polina.week11_solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
      /*
    Write a method that prints the frequency of each character from a String
     */
    public static void main (String[] args) {
        String str = "tteeesssttt";
        printCharacterFrequencies(str);
    }
    public static void printCharacterFrequencies(String str){
// LinkedHashMap to maintain the order of characters as they first appear in the string
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
// Loop through each character in the string
        for (char ch : str.toCharArray()) {
// Update the frequency map with each character, incrementing the count if the character already exists
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
// Iterate over the frequency map to print each character and its frequency
        for (Map.Entry<Character, Integer> entry : frequencyMap. entrySet()){
        System.out.println("Character: " + entry.getKey() + "; Frequency: " + entry.getValue());
    }
}
    }

