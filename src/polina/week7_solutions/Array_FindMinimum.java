package polina.week7_solutions;

public class Array_FindMinimum {
      /*
    Write a function that can find the minimum number from an int Array
     */
    public static int minNum(int[] arr){
        int min = arr[0];

        for(int each:arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,-2,-3};
        System.out.println("minNum(arr) = " + minNum(arr));
    }
}
