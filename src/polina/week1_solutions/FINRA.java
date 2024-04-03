package polina.week1_solutions;

public class FINRA {


    public static void finra(){
    for (int i = 1; i <= 30 ; i++) {      //The code uses a for loop that increments i by 1 and stops when i is greater than or equal to 30.
                                          //Inside the for loop, the code checks if i is a multiple of 3 and 5 using the modulo operator (%).
        if(i % 3 ==0 && i % 5 ==0){
            System.out.print("FINRA ");  //If i is a multiple of both 3 and 5, the code prints "FINRA" instead of the number.
        } else if (i % 3 == 0) {
            System.out.print("FIN ");   //If i is a multiple of 3, the code prints "FIN" instead of the number.
        }else if (i % 5 ==0){
            System.out.print("RA ");    //If i is a multiple of 5, the code prints "RA" instead of the number.
        }else{
            System.out.print(i + " ");  //Otherwise, the code prints the number i.
        }
    }
}
    public static void main(String[] args) {
        FINRA.finra();
    }
}



// FINRA.finra(); method calling, without static ,
// we can call in other class thru object creation (FINRA finra= new FINRA();)


 /*
    FINRA :
Write
a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
     */