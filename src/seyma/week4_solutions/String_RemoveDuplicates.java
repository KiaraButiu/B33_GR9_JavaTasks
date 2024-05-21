package seyma.week4_solutions;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String word) {

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!result.contains("" + ch))
                result += ch;
        }

        return result;
    }


}
