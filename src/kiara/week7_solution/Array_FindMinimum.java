package kiara.week7_solution;

public class Array_FindMinimum {

    public static void main(String[] args){

        int[] numbers = {-10, -20, 0, 10, 20};
        System.out.println("minNum(numbers) = " + minNum(numbers));

    }


    public static int minNum(int[] arrayNum){

        int min = arrayNum[0];

        for (int each : arrayNum) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }
}
 /*
    Write a function that can find the minimum number from an int Array
     */