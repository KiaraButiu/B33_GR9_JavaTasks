package Iunus.week6_solutions;

public class String_SumOfAllIntegers {





        public static int sumOfIntegers(String s) {
            int sum = 0; //
            String currentNumber = "";

            s += " ";


            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {

                    currentNumber += c;
                } else if (!currentNumber.isEmpty()) {

                    sum += Integer.parseInt(currentNumber);
                    currentNumber = "";
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            String input = "1ur3";
            System.out.println("num of numbers " + sumOfIntegers(input));
        }
    }






