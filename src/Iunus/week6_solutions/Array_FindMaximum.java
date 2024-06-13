package Iunus.week6_solutions;

public class Array_FindMaximum {



        public static int findMaximum(int[] array) {

            int max = array[0];


            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] numbers = {2,8,5,6};
            System.out.println("MAX int " + findMaximum(numbers));
        }
    }


