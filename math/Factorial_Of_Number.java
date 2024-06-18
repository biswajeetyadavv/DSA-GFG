package Math;

public class Factorial_Of_Number {
    public static void main(String args[]){
        factorial(4);

    }
    public static void factorial(int num){
        int factorial = 1;
        for(int i=2; i <= num; i++){
                if (i <= num) {
                    factorial = factorial * i;
                }
        }
        System.out.println(factorial);
    }
}

