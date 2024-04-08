package alice.week2_solutions;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a + b; // sum stored in 'a'
        b = a - b; // 'b' becomes original 'a'
        a = a - b; // 'a' becomes original 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

    /*
    Swap two variable values without using a third variable
     */






