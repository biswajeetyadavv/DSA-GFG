package problems.maths_problems;

public class Addition_Under_Modulo {
    public static void main(String args[]){
        System.out.println(addition_U_modulo(9223372036854775807L,9223372036854775807L,1000000007));

    }
    public static long addition_U_modulo(long a,long b, long M){
        long value1 = a % M;
        long value2 = b% M;
        long soluton = (value1 + value2) % M;

        return soluton;
    }


}
