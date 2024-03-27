package sam.week1_solutions;

public class Numbers_DivideWithoutOperator {

     /*
    Write a method that can divide two numbers without using division operator
     */


     /*
    Main method to the test
     */
     public static void main(String[] args) {
        countMethod(8,2);
     }

     public static void countMethod(int num1, int num2){
         if ( num1 < 0 || num2 < 0 ){      // Condition in order not to break the logic of the loop in case if
                                           // negative numbers will provide
             throw new RuntimeException("Number cannot be negative");
         }

         int counter = 0;
         while (num1 >= num2){ // While loop was used in reason that numbers of iterations is unknown, and it will run
                               // the code again and again as far as condition will be evaluated to - true
             counter++;        // increment of counter after condition will be evaluated to true
             num1 -= num2;     // mathematical operation: num1 = num1 - num2 -- will be repeated until condition will be evaluated to true

         }
         System.out.println(counter);      // Total amount of subtractions mun2 from num1

     }
}
