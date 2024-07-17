package seraching;

public class recurssion_binary_search {
    public static void main(String args[]){
        int[] arr = {1,2,3,5,65};
        System.out.println(recur_binary_sreach(arr,0,arr.length,4));

//        here, why output is arraybound when i am puting value to search which is out
//        of the frequency. like 76 of greater then 65.
//        check it by youself. and solve the problem.
    }
    public static int recur_binary_sreach(int[] arr,int start, int end,int target){
//        base case
        if(start > end){
            return -1;
        }

        int mid = (start + end)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return recur_binary_sreach(arr,start,mid-1,target);
        }
        else{
            return recur_binary_sreach(arr,mid +1,end,target);
        }
    }
}
