package Irina.week1_solution;

public class FINRA {
    public static void main(String[] args) {
       FINRA(); // new method designed/created. Accessible from every class and package:
       // belongs to the class itself, we are able to call it via creating an object.
       // void return type - no return value;
        // Main-name of the class w/o this method the program will not be executed.

    }

    public static void FINRA() { // Four loop.
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}
 /*
    FINRA :
Write
a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.

1,2, FIN, 4, RA, FIN, 7, 8, FIN, RA, 11, FIN, 13, 14, FINRA
     */
