package alena.week1_solutions;

public class FINRA {

    public static void main(String[] args) {
        finra();                                //8. Calling the method
    }

    public static void finra() {                //1. Creat method finra() without parameter.
        for (int i = 1; i <= 30; i++) {         //2. Create for loop to iterate numbers from 1 to 30.
            //3. Create if-else if-else statement to verified conditions
            if (i % 3 == 0 && i % 5 == 0) {     //4. Checks whether the number i is divisible by both 3 and 5
                System.out.print(" FINRA ");
            } else if (i % 3 == 0) {
                System.out.print(" FIN ");      //5. Checks whether the number i is divisible by 3
            } else if (i % 5 == 0) {
                System.out.print(" RA ");       //6. Checks whether the number i is divisible by 5
            } else {
                System.out.print(i + " ");      //7. else block prints the original number i, if
                // none of the above conditions are met.
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
     */