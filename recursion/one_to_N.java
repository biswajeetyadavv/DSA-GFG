package recursion;

public class one_to_N {
    public static void main(String args[]){
        o_to_N(3 );
    }
//    here we will write a recursion fuction.
    public static void  o_to_N(int n){
//        here we will write a base code.
        if(n == 0){
            return ;
        }
        o_to_N(n-1);
        System.out.println(n);
    }
}
