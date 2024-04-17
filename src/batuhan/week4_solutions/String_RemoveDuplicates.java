package batuhan.week4_solutions;

public class String_RemoveDuplicates {

    //  Write function that can remove the duplicated values from String
    //            Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDup(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC")); // ABC
    }




}
