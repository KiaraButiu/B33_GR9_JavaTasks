package polina.week5_solutions;

public class String_Reverse {
     /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverseString(String original){
        String reversed = "";

        char[] chars = original.toCharArray();

        for (int i = chars.length -1; i >= 0; i--) {
            reversed += chars[i] + "";
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));
    }
}
