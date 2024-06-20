package recursion;

public class Natural_Num_Sum {
    public static void main(String args[]){
       System.out.println(numsum(3));

    }
    public static int numsum(int n){
        if(n == 0){
            return 0;
        }

        return n+ numsum(n-1);
    }
}
