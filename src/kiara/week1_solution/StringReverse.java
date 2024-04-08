package kiara.week1_solution;

public class StringReverse {

    public static void main(String[] args) {

        // Question-1: How would you reverse a String? (without using ready methods)

        /*I will initialize a new String variable name 'reversed'
          this is where I am going to store the new String */
        String str = "Reverse";
        String reversed = "";

        /* To iterate through the characters of String 'str' I need to create a for loop, specifically a reversed for loop.
         In this loop, the loop counter is initialized to i = str.length() -1, meaning we are starting from the last index of String str.
         Then, the loop condition is i >= 0, meaning the loop will continue until it reached the first character that has index 0.
          And in each iteration the loop decrements by 1.*/

        for (int i = str.length() -1; i >= 0; i--) {

            /* Inside our loop, we need to access each character of String str, str.chartAt() to retrieves each character
            at the specified index.
           And I will concatenate each character to the String reversed variable using additional operator */

           reversed += str.charAt(i);
        }

        /*Lastly, I will sout to print out the reversed to the console*/
        System.out.println(reversed);
    }
}
