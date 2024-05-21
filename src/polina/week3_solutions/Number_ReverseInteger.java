package polina.week3_solutions;

public class Number_ReverseInteger {
    public static int reverseNegative(int num){
        //num/=-1; redundant
        if(num>=0){
            return num; // if the given number is positive
        }
        return num/-1;
    }
    public static void main(String[] args) {
        System.out.println("the result is: " + reverseNegative(-64));
    }
    /*
Write a return method that can reverse
negative number and return it as int
 */
}
