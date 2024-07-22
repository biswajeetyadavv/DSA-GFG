package Arrays;

public class Largest_element_in_arrays {
    public static void main(String args[]){
        int[] arr = {1,2,6,5,4};
        System.out.println(check_largest(arr));

    }

    public static int check_largest(int[] arr){
        int largest = 0;
        for(int i =0;i <arr.length;i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
}
