package Iunus.week1_solutions;

public class FINRA {



          public static void main(String[] args) {
              // result = 0 is fin ||  i result= 1 ===>ra
              //int number = 15;
              for (int i = 1; i <= 30; i++) {


                  if (i % 3 == 0 & i % 5 == 0) {
                      System.out.println("FINRA");
                  } else if (i % 5 == 0) {
                      System.out.println("RA");
                  } else if (i % 3 == 0) {
                      System.out.println("FIN");
                  }else System.out.println(i + " ");

              }

          }
      }





