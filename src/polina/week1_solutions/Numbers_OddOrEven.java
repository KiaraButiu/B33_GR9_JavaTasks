package polina.week1_solutions;

public class Numbers_OddOrEven {

    //this method takes an integer "num" as input
    public static void oddOrEven(int num){
        //num is even if the remainder of num divided by 2 is 0
        if(num %2 == 0){
            System.out.println("Even");   //it prints "Even"
        }else{
            System.out.println("Odd");    //otherwise, it prints "Odd"
        }
    }

//    public static void main(String[] args) {
//        oddOrEven();
//    }
}



 /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */