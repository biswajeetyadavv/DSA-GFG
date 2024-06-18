package recursion;

public class N_to_1 {
    public static void main(String args[]){
        N_to_1(3);

    }
    public static void N_to_1(int n){
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
        N_to_1(n-1);
    }
}
