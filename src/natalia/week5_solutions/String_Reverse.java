package natalia.week5_solutions;

public class String_Reverse {

    public static void main(String[] args) {

        reverse("ABCD");

    }
    public static void reverse(String str){

    String revers="";

    for (int i = str.length()-1; i >= 0; i--) {
        revers += str.charAt(i);
    }
    System.out.println(revers);
}

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

}
