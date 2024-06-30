package problems.maths_problems;

import java.math.BigInteger;

public class Multiplication_Under_Modulo {
    public static void main(String args[]){
        System.out.println(under_M(92233720368547758L,92233720368547758L, 1000000007));
        // its a trial.

    }
    public static long under_M(long a, long b, long M){
//        exmaple= value of a ,b and M
//        let a and b be equal value = 92233720368547758L here, you must
//        use the L so that compiler can recognize it as long value.
//        M = 1000000007
         long value1 = a % M;
         long value2 = b % M;
         long value12 = (value1 * value2) % M;

         return value12;

    }
}
