package seraching;

public class Binary_search {
//    it is a more efficient way for searching an element in array.

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,7};
        System.out.println(binarysearch(arr,5));

    }
    public static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }

}
