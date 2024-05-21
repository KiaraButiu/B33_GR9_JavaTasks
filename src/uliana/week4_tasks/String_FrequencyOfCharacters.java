package uliana.week4_tasks;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";
        String result=freq(str);

        System.out.println("result = " + result);
    }


        private static String freq(String word) {

            //we can create a empty result container variable
            String result="";

            //get the char one by one

            for (int i = 0; i < word.length(); i++) {
                char each=word.charAt(i);  //first it each=a
                // System.out.println(each);  //print it
                //count the char
                int numberOfEach = count(each,word); //I have 2 a in a word
                //put in a container
                if (!result.contains(each+""))
                    result+=""+each+ numberOfEach;


            }

            return result;

        }
    private static int count(char searched, String word) {
        int counter=0;
        for (int i = 0; i <word.length() ; i++) {
            char each= word.charAt(i);
            if (each==searched)
                counter++;

        }

        return counter;
    }



}
