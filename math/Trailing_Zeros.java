package Math;

public class Trailing_Zeros {
    public static void main(String args[]) {
        System.out.println(trailing_Zeroes(100));


    }
//    function of trailing zeros in factorial.
//    means we need make a fuction which counts the num of zeroes at the last position of a factorial.
    public static int trailing_Zeroes(int num){
//        logic for factorial calculation.
        int factorial = 1;
        for(int i = 2;i<=num;i++){
            factorial = factorial * i;

        }
//        logic for trailing zeroes
//        don't write return statement for factorial over here.
         int count = 0;
        while(factorial % 10 == 0){
            count++;
            factorial = factorial/10;


        }
        return count;
    }


}
