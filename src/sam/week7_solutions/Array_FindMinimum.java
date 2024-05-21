package sam.week7_solutions;

public class Array_FindMinimum {

    /*
    Write a function that can find the minimum number from an int Array
     */

    public static void main(String[] args) {

        int[] array = {10, -6, 45, 18, -100, -30, 15}; // int Array

        int number = findTheMinNumber(array);
        System.out.println("Minimum number = " + number);
    }

    public static int findTheMinNumber(int[] ArrayToCheck){ //custom created method that looking for minimum number in the array
        int minimumNumber = ArrayToCheck[0];                //assume that the 1 number in the array is the smallest
        for (int i = 0; i < ArrayToCheck.length; i++) {     //iterating our array to check our hypothesis
            if (ArrayToCheck[i] < minimumNumber){
                minimumNumber = ArrayToCheck[i];
            }
        }
        return minimumNumber;                               //returning custom
    }

}
