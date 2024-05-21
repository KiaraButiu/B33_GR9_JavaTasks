package polina.week6_solutions;

public class Array_FindMaximum {
     /*
        Write a function that can find the maximum number from an int Array
     */

    public static int maxNum(int arr[]){
        int max = arr[0];

        for(int each:arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,-2,-3};
        System.out.println("maxNum(arr) = " + maxNum(arr));
    }
}
