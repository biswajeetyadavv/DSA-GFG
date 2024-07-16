package Arrays.Operation_in_array;

import java.util.Arrays;

public class Deletion_of_Element {
    public static void main(String args[]){
        int[] arr = {1,2,3,5,6};
        int n=5;
        int num = 3;
        deletion(arr,n,num);

    }
    public static void deletion(int[] arr,int n, int num){
        int i;
        for(i =0;i<n;i++){
            if(arr[i] == num){
                break;
            }
            if(i==n){
                System.out.println(n);
            }
        }
        for(int j = i;j<n-1;j++){
            arr[j] = arr[j+1];

        }
        System.out.println(Arrays.toString(arr));
    }
}
