package ibrahim.week1_solution;

public class Numbers_DivideWithoutOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOp(20,4);

    }

    public static void divideWithoutDivisionOp(int num1, int num2){

        int count = 0;

        while (num1 >= num2){

            num1 -= num2;
            count++;
        }
        System.out.println(count);
    }
}
