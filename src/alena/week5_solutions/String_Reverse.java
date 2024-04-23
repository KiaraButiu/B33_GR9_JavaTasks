package alena.week5_solutions;



    public class String_Reverse {
        public static void main(String[] args) {
            String str1 = "ABCD";
            String reversed = "";

            for (int i = str1.length()-1 ; i >= 0 ; i--) {
                reversed += str1.charAt(i);
            }
            System.out.println(reversed);


        }



}
 /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */
