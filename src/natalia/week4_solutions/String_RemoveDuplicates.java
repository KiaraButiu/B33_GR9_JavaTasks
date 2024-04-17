package natalia.week4_solutions;

public class String_RemoveDuplicates {
    public static void main(String[] args) {
        removeDup("AABBBCCC");
    }

    public static void removeDup(String str) {
                                                    //step1     step2      step3
        char ch = str.charAt(0);                    //ch = A
        String result = "" + ch;                    //result=A

        for (int i = 0; i < str.length()-1; i++) {

            if(str.charAt(i) != ch){                //A=A false  A=A false   B!=A true
                ch = str.charAt(i);                 //                       ch=B
                result += ch;                       //                       result=AB
            }
        }
        System.out.println(result);
    }
}
 /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */