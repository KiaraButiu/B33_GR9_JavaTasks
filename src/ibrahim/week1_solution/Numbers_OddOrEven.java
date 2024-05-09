package ibrahim.week1_solution;

public class Numbers_OddOrEven {


    public static void main(String[] args) {
        numberChecker(5);
    }

    public static void numberChecker (int number){// This method takes number as an argument
        if (number % 2 != 0){                     // If number is not divisible by 2 means that this number is ODD
            System.out.println("This number: " + number + " is ODD");
        } else {                                  // Otherwise, number is Even
            System.out.println("This number: " + number + " is EVEN");
        }
    }
}
