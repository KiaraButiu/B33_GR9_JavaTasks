package batuhan.week3_solutions;

public class Number_ReverseInteger {

//Write a return method that can reverse negative number and return it as int

    public static int reverseNegative(int num){
        if(num>=0){
            return num; // if the given number is positive
        }
        return num/-1;
    }

    public static void main(String[] args) {
        System.out.println("the result is: " + reverseNegative(6));
    }

}
