package seraching;

public class Num_of_occ {
    public static void main(String args[]){
        int[] arr = {1,2,3,3,3,3,4};
        System.out.println(first_occ(arr,0,arr.length,3));

    }
    public static int no_of_times(int[] arr,int start,int end,int target){
        int first = first_occ(arr,start,end,target);
        if(first == -1){
            return 0;
        }
        else{
            return last_occ(arr,start,end,target)-first+1;
        }
    }
    public static int first_occ(int[] arr,int start,int end,int target){
        int mid = (start+end)/2;
        if(arr[mid]>target) {
            end = mid - 1;
        }
        else if(arr[mid]<target){
            start = mid+1;
        }
        else{
            if(mid == 0|| arr[mid-1] != arr[mid]){
                return mid;
            }
            else{
                return first_occ(arr,start,mid-1,target);
            }
        }
        return -1;
    }
    public static int last_occ(int[] arr,int start,int end,int target){
        int mid = (start+end)/2;
        if(arr[mid]>target){
            end = mid-1;
        }
        else if(arr[mid]<target){
            start = mid +1;
        }
        else{
            if(mid == 0 || arr[mid+1] != arr[mid]){
                return mid;
            }
            else{
                return last_occ(arr,mid+1,end,target);
            }
        }
        return -1;
    }
}
