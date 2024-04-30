package batuhan.week6_solutions;

public class String_SumOfAllIntegers {

        /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

    public static void main(String[] args) {
            System.out.println(sumOfIntegers("12 some text 3 7")); // 22
    }

    public static int sumOfIntegers(String str) {
        String[] arr = str.split(" ");
        int sum = 0;
        for (String s : arr) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
            }
        }
        return sum;
    }





}
