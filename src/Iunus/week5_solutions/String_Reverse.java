package Iunus.week5_solutions;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reversed(str));
    }

    public static String reversed(String str){                 // Custom method was created
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {            // Reversed loop to take characters symbol by symbol
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}
