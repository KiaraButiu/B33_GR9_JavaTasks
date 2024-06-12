package alena.week6_solutions;

public class String_SumOfAllIntegers {
    public static void main(String[] args) {

        sumAllInteger("12 some text 4 7");
    }
        public static void sumAllInteger (String str){

        String[] array = str.split(" ");
        int sum = 0;

        for (String each : array) {
            try {
                sum += Integer.parseInt(each);
            }catch (NumberFormatException e){

            }
        }

        System.out.println(sum);
    }

    /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */





}
