package recursion_Problems;

public class Count_Total_Digits_in_a_Number {
    public static void main(String args[]){
        System.out.println(numdigit(123));

    }
    public static int numdigit(int n){

        if(n/10 ==0 ){
            return 1;
        }
        return 1+ numdigit(n/10);



    }
}
