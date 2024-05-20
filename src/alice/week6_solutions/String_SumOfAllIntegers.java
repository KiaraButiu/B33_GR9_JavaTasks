package alice.week6_solutions;

public class String_SumOfAllIntegers {

    public static void main(String[] args) {
        String s = "12 some text 3 7";
        System.out.println("Sum of integers in \"" + s + "\": " + sumOfIntegers(s));
    }

    public static int sumOfIntegers(String s) {
        int sum = 0;
        String[] parts = s.split("\\s+"); // Split the string by one or more spaces
        for (String part : parts) {
            try {
                sum += Integer.parseInt(part); // Attempt to parse each part as an integer and add it to the sum
            } catch (NumberFormatException e) {
                // Ignore if the part cannot be parsed as an integer
            }
        }
        return sum;
    }

    /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */





}
