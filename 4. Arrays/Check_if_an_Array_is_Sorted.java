package Arrays;

public class Check_if_an_Array_is_Sorted {
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6};
        System.out.println(is_sorted(arr));

    }
    public static boolean is_sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1] ){
                return false;
            }
        }
        return true;
    }
}
