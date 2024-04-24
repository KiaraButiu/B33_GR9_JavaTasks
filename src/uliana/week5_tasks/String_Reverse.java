package uliana.week5_tasks;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        String str = "ABCD";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }


//        String str = "ABCD";
//        String str2 = "";
//        for (int i = str.length()-1; i >= 0; i--) {
//            str2+=str.charAt(i);
//
//        }
//        System.out.println(str2);
    }



}
