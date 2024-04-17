package greg.week3_solution;

public class Number_ReverseInteger {

    public static void main(String[] args) {
        int givenNum = -77;
        System.out.println("Given number is " + givenNum + ". And Voila!: " + reverseNegativeNum(givenNum));
    }
    public static int reverseNegativeNum(int num) {
        if (num >= 0) {
            return num; //return num if its positive as it is
        }
        return num / -1;

    }
}

/*
Write a return method that can reverse
negative number and return it as int
 */