package natalia.week3_solutions;

public class Number_ReverseInteger {
    public static void main(String[] args) {

        ReverseNegativeInteger(-321);
    }

    public static void ReverseNegativeInteger(int a) {

        int result = 0;
                                                //     Step1        Step2     Step3    Step4
        while (a != 0) {                        //  a=-321 true    -32 true   -3 true  0 false
            result *= 10;                       //  result = 0     -10        -120
            result += a % 10;                   //  result = -1    -12        -123
            a = a / 10;                         //  a = -32         -3         0
        }
        System.out.println("result = " + result);                   //result -123
    }

}

/*
Write a return method that can reverse
negative number and return it as int
 */




