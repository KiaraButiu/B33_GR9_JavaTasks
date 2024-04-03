package Fettouma.Week2_Solutions;

public class Number_DivisibleBy3_5_15 {

    public static void main(String[] args) {
     int n=100;
DivisibleBy(100);
    }

    public static void DivisibleBy(int n){
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i% 15 ==1) {
                System.out.print(" Divisible By 3 "+i);

            } else if  (i % 5 == 0 && i% 15 ==1) {
                System.out.print("    Divisible By 5 "+i);

            } else if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                System.out.print(" Divisible By "+i);
            }
        }
            }

}
