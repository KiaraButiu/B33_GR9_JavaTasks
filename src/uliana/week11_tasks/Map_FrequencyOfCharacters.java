package uliana.week11_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*
    Write a method that prints the frequency of each character from a String
     */





        public static void main(String[] args) {
            frequencyOfCharacter("banana apple pie");
        }
        public static void frequencyOfCharacter(String str){
            Map<Character,Integer> counter = new LinkedHashMap<>();
            for (int i = 0; i <str.length() ; i++) {
                char eachChar = str.charAt(i);
                if (!counter.containsKey(eachChar)){
                    counter.put(eachChar,0);
                }
                counter.put(eachChar, counter.get(eachChar)+1);
            }
            System.out.println(counter);
        }


    }

