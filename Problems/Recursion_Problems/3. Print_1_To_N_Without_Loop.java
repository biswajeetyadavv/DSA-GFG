package recursion_Problems;

public class Print_1_To_N_Without_Loop {
    public static void main(String args[]){
        printNom(3);
    }
    public static void printNom(int n){

        if(n == 0){
            return;
        }

        printNom(n-1);
        System.out.print(n + " ");
    }
}
