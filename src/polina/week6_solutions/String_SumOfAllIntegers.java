package polina.week6_solutions;

public class String_SumOfAllIntegers {

    public static void main(String[] args) {

        String str = "12 Polina 779 java 5coder";

        System.out.println("sumOfIntegers(str) = " + sumOfIntegers(str));

    }

      /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

    public static int sumOfIntegers (String text){
        int num = 0;

        for (int i = 0; i < text.length(); i++) {
            if( Character.isDigit(text.charAt(i))){
                num+=text.charAt(i) -'0'; //not to use ASCII table values
            }
        }
        return num;
    }


}
