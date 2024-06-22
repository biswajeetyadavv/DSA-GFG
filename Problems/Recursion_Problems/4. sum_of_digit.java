package recursion_Problems;

public class sum_of_digit {
    public static void main(String args[]){
        System.out.print(sum(345));
    }
    public static int sum(int n){
//        base case
        if(n ==0){
            return 0;
        }
//        here, n/10 removes the last digit from the number.
//        where as n%10 gets the last digit.
        return sum(n/10) + n%10;
    }
}
