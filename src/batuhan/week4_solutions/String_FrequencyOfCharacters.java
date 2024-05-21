package batuhan.week4_solutions;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";
        System.out.println(FrequencyOfChars(str));

    }

    //Write function that can find the frequency of characters
    //            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String FrequencyOfChars(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(!result.contains(str.charAt(i) + "")){
                result += str.charAt(i) + "" + count;
            }
        }
        return result;
    }




}
