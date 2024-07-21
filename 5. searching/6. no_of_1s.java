package seraching;

public class no_of_1s {
    public static void main(String args[]){
        int[] arr = {0,0,0,1,1,1,1,1};
        count_1s(arr,0,arr.length,1);
    }
    public static int count_1s(int[] arr,int start,int end,int target){
        int first = first_occ(arr,start,end,target);
        if(first == -1){
            return 0;
        }
        return arr.length-first;
    }

    // -------- THIS PART IS NOT REQUIRED FOR FIND THE NUM OF 1's ------
    // -----IT CONTAINS THE FUCTION OF FINDING LAST OCC----------


    // public static int first_occ(int[] arr,int start,int end,int target){
    //     int mid = (start + end)/2;
    //     if(arr[mid] > target){
    //         return end = mid -1;
    //     }
    //     else if(arr[mid]< target){
    //         return start = mid+1;
    //     }
    //     else{
    //         if(mid==0||arr[mid-1] != arr[mid]){
    //             return mid;
    //         }
    //         else{
    //             return first_occ(arr,start,mid -1,target);
    //         }
    //     }
    // }

    // public static int last_occ(int[] arr,int start,int end,int target){
    //     int mid = (start+end)/2;
    //     if(arr[mid] > target){
    //         return end = mid -1;
    //     }
    //     else if(arr[mid] < target){
    //         return start = mid +1;
    //     }
    //     else{
    //         if(mid == 0|| arr[mid+1]!=arr[mid]){
    //             return mid;
    //         }
    //         else{
    //             return last_occ(arr,mid+1,end,target);
    //         }
    //     }
    // }
}
