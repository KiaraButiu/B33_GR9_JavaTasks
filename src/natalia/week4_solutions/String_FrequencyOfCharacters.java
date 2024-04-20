package natalia.week4_solutions;

public class String_FrequencyOfCharacters {
    public static void main(String[] args) {
        FrequencyOfChars("AAABBCDD");
    }

    public static void FrequencyOfChars(String str) {

        String result= "";                  //1.New variable to store result

        for(int i=0; i<str.length(); i++){  //2.Outer loop taking each letters one by one

            char ch = str.charAt(i);        //3. Use charAt method to find each letter
            int frequency=0;                //4. New variable to store frequency of each character

            for(int j =0; j< str.length(); j++){//5. inner loop comparing each letters with the all the other letters in String
                if(ch==str.charAt(j)){
                    frequency++;                //6.If conditional true frequency will increment  by one.
                }
            }
              if(!result.contains(""+ch+frequency)) //7. Repeating char will not add to result repeatedly.
                result += ""+ch+frequency;
        }
        System.out.println(result);
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
