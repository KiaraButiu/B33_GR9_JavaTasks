package natalia.week6_solutions;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] array = {1,21,8,3,11,4,15};
        maximum(array);

    }
    public static void maximum (int[] array){

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max=array[i];
            }
        }
        System.out.println(max);

    }



    /*
        Write a function that can find the maximum number from an int Array
     */




}
