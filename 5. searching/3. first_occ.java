package seraching;

public class first_occ {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,4,4,5,5,5,5};
        System.out.println(fir_occ(arr,0,arr.length,4));

    }
    public static int fir_occ(int[] arr,int start,int end,int target){
        int mid = (start + end)/2;
        if(arr[mid] > target){
            return end = mid-1;
        }
        else if(arr[mid] < target){
           return start = mid+1;

        }
        else{
            if(mid == 0 || arr[mid-1] != arr[mid]){
                return mid;
            }
            else{
                end = mid-1;
            }
        }
    }
}
