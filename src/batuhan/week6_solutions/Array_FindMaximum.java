package batuhan.week6_solutions;

public class Array_FindMaximum {


    //Write a function that can find the maximum number from an int Array

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(FindMaximum(arr)); // 6
    }

    public static int FindMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }





}
