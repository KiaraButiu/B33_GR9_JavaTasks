package uliana.week4_tasks;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {


    String input = "AAABBBCCC";
    String result = "";

        for (int i = 0; i < input.length(); i++) {
        char currentChar = input.charAt(i);
        if (currentChar != ' ' && result.indexOf(currentChar) == -1) {
            result += currentChar;
        }
    }

        System.out.println("Output: " + result);
}
}




