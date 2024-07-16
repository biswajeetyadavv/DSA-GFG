package Arrays.Operation_in_array;

public class insert_static_array {
//    remember we cannot add more elements to an array if the size is fixed
//    and no more space is available for new elements.
//    we can only add a new element when there is a space of new element.

    public static void main(String args[]){

    }
    public static int insert(int[] arr,int n,int cap,int pos,int value){
        if(n == cap){
            return n;
        }
        int index = pos-1;
        for(int i = n-1;i>=index;i--){
            arr[n+1] = arr[i];

        }
        arr[index] = value;
        return (n+1);
    }

}
