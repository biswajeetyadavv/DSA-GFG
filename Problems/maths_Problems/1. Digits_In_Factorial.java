package problems.maths_problems;

public class Digits_In_Factorial {
    public static void main(String args[]){
        System.out.println(digi_in_fact(5));
    }
    public static int digi_in_fact(int n){
//        lets divide the problem into two parts
//        1. we'll find the factorial.
//        2. we'll find the num of digit in the factorial.

//        1. finding factorial.
        if(n == 0){
            return 1;
        }
        int value =0;
         return value = n *digi_in_fact(n-1);

// complete it.

//        2.finding num of digit in the factorial.
//        if(value/10 == 0){
//            return 1;
//        }
//        return 1 + digi_in_fact(value/10);
    }

}
