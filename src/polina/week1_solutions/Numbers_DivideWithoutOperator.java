package polina.week1_solutions;

public class Numbers_DivideWithoutOperator {

    //this method takes two integers (Ex: int x = 12; int y = 2) and computes their quotient without division operator
    public static void divideWithoutOperator(int x, int y) {

        //initializes a variable count to 0.
        int count = 0;

    //enters a while loop as long as x is greater than or equal to y
        while (x >= y) {
            count++;        //1 //2 //3 //4 //5 //6   in each iteration of the loop, increments count by 1
            x -= y;          //10 //8 //6 //4 //2 //0   subtracts y from x
        }
        System.out.println(count);

        //after the loop ends, it prints the value of count, which represents the quotient of x divided by y
    }
    public static void main(String[] args) {   //12(x) divide 2(y) = 6 (count), as an example
        divideWithoutOperator(12,2);
    }
}



/*
    Write a method that can divide two numbers without using division operator
     */