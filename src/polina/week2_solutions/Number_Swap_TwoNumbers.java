package polina.week2_solutions;

public class Number_Swap_TwoNumbers {
    public static void main(String[] args) {
        swap(10,6);
    }
    public static void swap(int x, int y){
        System.out.println("Numbers before swap: x = " + x + " y = " + y);
        x+=y; // x = 16
        y=x-y; //y=10
        x=x-y; //x=6
        System.out.println("Numbers after swap: x = " + x + " y = " + y);
    }
}

    /*
    Swap two variable values without using a third variable
     */
