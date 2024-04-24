package batuhan.week5_solutions;
   /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

public class String_Reverse {
    public static void main(String[] args) {
        System.out.println(Reverse("ABCD")); // DCBA

    }

    public static String Reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }
}
