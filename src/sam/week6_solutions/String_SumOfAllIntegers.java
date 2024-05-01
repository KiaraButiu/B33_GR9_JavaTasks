package sam.week6_solutions;

public class String_SumOfAllIntegers {
    /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */
    public static void main(String[] args) {
        String str = "12 some text 3 7";
        System.out.println(sum(str));
    }

    public static int sum(String str){
       int sum = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (Character.isDigit(str.charAt(i))){
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

}
