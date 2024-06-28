package Math;

public class All_Divisior_Of_A_Num {
    public static void main(String args[]){
        Divisor_In_sort_efficientmethod(25);

    }
//   first we will go for naive method
//    naive method means the most simplest method.
    public static void Divisors_In_sort_naivemethod(int n){
//        our logic is simply go from 1 to n and check whether the num is
//        divisible by num or not.

        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

// -------------PROBLEM-----------
//        this algo for n.
//        we can have better algo.

    }

    public static void Divisor_In_sort_efficientmethod(int n){
        int i ;
        for(i = 1 ; i*i < n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        for(i = i;i>=1 ; i--){
            if(n%i == 0){
                System.out.println(n/i);
            }
        }
    }
}
