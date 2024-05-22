package uliana.week6_tasks;

public class String_SumOfAllIntegers {
    public static void main(String[] args) {
        // split the input string by spaces and then try to parse each token as an integer. If successful, add it to the sum
        String input = "12 some text 3 7";
        String[] tokens = input.split(" ");
        int sum = 0;

        for (String token : tokens) {

            try {
                sum += Integer.parseInt(token);
            } catch (NumberFormatException e) {
                // Ignore non-integer tokens
            }
        }
        System.out.println("The sum is: " + sum);



    /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */


    }
}
