package Irina.week5_solution;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        String original = "ABCD";
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reverse(original));
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = temp;
        }
        return new String(chars);
    }



}
