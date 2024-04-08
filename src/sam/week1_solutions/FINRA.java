package sam.week1_solutions;

public class FINRA {
       /*
    FINRA :
Write
a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
     */

    /*
    Main method to the test
     */
    public static void main(String[] args) {
        finraMethod();
    }

    public static void finraMethod(){
        int number = 30;
        for (int i = 1; i <= number; i++) {
            if (i%3 ==0 && i%5 ==0){             //numbers which are a multiple of both 3 and 5, print "FINRA"
                System.out.print("FINRA ");
            } else if (i%3 ==0){                 //for numbers which are a multiple of 3 print "FIN"
                System.out.print("FIN ");
            } else if (i%5 ==0) {                //for numbers which are a multiple of 5, print "RA"
                System.out.print("RA ");
            } else {                             //This number not meet any condition and will be printed as it is
                System.out.print(i + " ");
            }
        }
    }



}
