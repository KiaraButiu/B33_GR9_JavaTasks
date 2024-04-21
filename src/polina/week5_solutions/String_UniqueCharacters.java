package polina.week5_solutions;

public class String_UniqueCharacters {
     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String uniqueChar(String word){

        char[] unique = word.toCharArray();
        int count = 0;
        String result = "";

        for (int i = 0; i < unique.length; i++) {
            for (int j = 0; j < unique.length; j++) {
                if(unique[i] == unique[j]){
                    count++;
                }
            }
            if(count==1){
                result+= unique[i] + "";
            }
            count = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("uniqueChar(\"AAABBBCCCDEF\") = " + uniqueChar("AAABBBCCCDEF"));
    }
}
