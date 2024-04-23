package natalia.week5_solutions;

public class String_UniqueCharacters {

    public static void main(String[] args) {
        unique("AAABBBCCCDEF");
    }

    public static void unique(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1)
                result += "" + ch;
        }
        System.out.println(result);

    }



    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */


}
