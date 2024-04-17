package Irina.week4_solution;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";
        System.out.println("Frequency of characters in \"" + str + "\": " + findFrequency(str));

    }

    public static String findFrequency(String str) {
        String result = "";
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }

        // Build the result string
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                result += (char) i;
                result += frequency[i];
            }
        }

        return result;
    }


}
