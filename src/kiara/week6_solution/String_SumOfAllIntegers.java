package kiara.week6_solution;

public class String_SumOfAllIntegers {

    public static void main(String[] args) {
        String str = "12 some text 3 7";
        integerSum(str);

    }

    public static void integerSum (String string){
        int sum = 0;

        for (int i = 0; i < string.length(); i++) {
            if( Character.isDigit(string.charAt(i))){
                sum += string.charAt(i) -'0';                         //not to use ASCII table values
            }
        }
        System.out.println(sum);

    }

}
/*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */