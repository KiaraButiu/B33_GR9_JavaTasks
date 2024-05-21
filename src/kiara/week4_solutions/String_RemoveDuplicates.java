package kiara.week4_solutions;

public class String_RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBBCCC";

        System.out.println(removeDuplicate(str));

    }

    public static String removeDuplicate(String str){

        String result = "";                             // String 'result' will store the unique characters

        for (int i = 0; i < str.length() ; i++) {      // Loop will iterate through each character of String 'str'
                                                          // Inside the loop:
            char ch = str.charAt(i);                         // gets the current character of index 'i' & store it in 'ch' variable

            if (!result.contains("" + ch)){                 // If current character 'ch' is NOT present in the 'result' String
                                                                // we converted 'ch' to a string by adding ""
                result += ch;                               // Concatenate the current 'ch' to the 'string' to ensure its unique
            }
        }
        return result;
    }
}
 /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */