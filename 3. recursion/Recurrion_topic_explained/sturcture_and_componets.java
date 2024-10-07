package recursion.RecursionInDetail;

public class sturcture_and_componets {
//    declaring main funtion
    public static void main(String args[]){
//        practice for recursion and its structure
//        often, we use same fuction to complete our task.
//        to complete it we need to call the same fuction many time.
//        no need to write it multiple time.
//        we can use recursion where it calls itslef.


    }
    static void print(int n){
//        calling itslef can cause infinite loop so, to stop it we use base condtion.
//        simple if statement
        if(n==5){
            System.out.println(n);
            return;
//            return statement will go back the dead end of recurtion no more function calling.
        }



//      what the fuction will do?
        System.out.println(n);
//        calling itself
        print(n+1);
//        (n+1) so that value of n will increase by 1.

    }
}
