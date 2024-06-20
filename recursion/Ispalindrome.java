package recursion;

public class Ispalindrome {
    public static void main(String args[]){
//        here start = 0
//        end = length of string - 1
        System.out.println(ispalindrome("bbicbb",0, 4));

    }
//    here we'll write the code which will be helping us to
//    find the string is palindrome or not by providing boolean value : yes or no.
    static boolean ispalindrome(String str, int start, int end){
//        base case
        if(start >= end){
            return true;
        }


//        return stament where we'll compare the first and last letters and
//        we'll be proceding to recursion
        return (str.charAt(start) == str.charAt(end) && ispalindrome(str,start+1, end-1) );
    }
}
