package kiara.week1_solution;

public class FINRA {
    public static void main(String[] args) {
        FINRA();
    }

    public static void FINRA(){

        for (int i = 1; i <= 30 ; i++) {        // Initialize a for loop that will iterate from 1 to 30 and incrementing "i" by 1 each time

            if (i %3 == 0 && i %5 == 0 ){       // if current value "i" is BOTH divisible by 3 & 5, print FINRA
                System.out.println("FINRA");
            } else if (i %3 == 0) {
                System.out.println("FIN");      // if current value "i" is divisible by 3, print "FIN"
            }else if (i %5 == 0) {
                System.out.println("RA");       // if current value "i" is divisible by 5, print "RA"
            }else{
                System.out.println(i);          // Otherwise, print the current value of "i".

                //HEY
            }
        }
    }
}
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
     */