package alena.week4_solutions;

public class String_FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";

        System.out.println(charFrequency(str));
    }
    public static String charFrequency(String str){

        String result = "";                            // to store the result in a string variable

        for (int i = 0; i < str.length() ; i++) {     // Outer Loop : iterates through each character of String "str"
            // Inside the loop :
            char ch = str.charAt(i);                           // gets the character of current index 'i' & stores it in variable 'ch'
            int count = 0;                                     // variable 'count' will store the frequency of current character

            for (int j = 0; j < str.length(); j++) {    // Inner Loop : iterates through each character of String "str" AGAIN
                // this loop compares each character of the string with character 'ch' obtained
                if (ch == str.charAt(j)){                   // IF character at index 'j' is equal to the character 'ch'
                    count++;                                // it increments the 'counter' variable
                }
            }
            if(!result.contains("" + ch + count)){      // This checks IF the current character 'ch' & frequency have NOT already been added
                // to the String 'result'
                result += "" + ch + count;              // Then, Concatenate the character & its frequency to string 'result'
            }
        }
        return result;
    }

}
/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/
/*
            1.New variable to store result
            2. For iterate each character of a given string, we use For loop.
            Outer loop taking each letters one by one
            3. Use charAt method to find each element
            4. New variable to store frequency of each character
            5. inner loop comparing each letters with the all the other letters in String
            6.If conditional true frequency will increment  by one.
     */
