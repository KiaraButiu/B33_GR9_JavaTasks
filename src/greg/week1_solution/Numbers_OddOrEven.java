package greg.week1_solution;

public class Numbers_OddOrEven {

    public static void main(String[] args) {
        // Test cases
        System.out.println("identify(5) = " + identify(5)); // Odd
        System.out.println("identify(6) = " + identify(6)); // Even
        System.out.println("identify(7) = " + identify(7)); // Odd

    }
     public static String identify ( int number){

            if (number % 2 == 0) {
                return "Even";
            }else{
                return "Odd";
            }
        }
    }


/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */