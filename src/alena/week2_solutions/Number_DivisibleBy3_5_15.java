package alena.week2_solutions;

public class Number_DivisibleBy3_5_15 {

    public static void main(String[] args) {

        int n = 100;
        String divisibelBy15 = "";
        String divisibelBy5 = "";
        String divisibelBy3 = "";


        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 &&  i % 5 == 0 && i % 15 == 0) {
                divisibelBy15 += i + " ";
            }
            if(i % 5 == 0  && i % 15 != 0) {
                divisibelBy5 += i + " ";
            }
            if(i % 3 == 0  && i % 15 != 0) {
                divisibelBy3 += i + " ";
            }
        }
        System.out.println("Divisible By15  " + divisibelBy15 + " ");
        System.out.println("Divisible By5  " + divisibelBy5 + " ");
        System.out.println("Divisible By3  " +  divisibelBy3 + " ");

    }

}
