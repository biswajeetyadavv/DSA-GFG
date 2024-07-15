package Arrays.Operation_in_array;

public class linerSearch_In_Arrays {
    public static void main(String args[]) {
        int[] arr = {11, 32, 4, 53, 2, 3};
        int traget = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == traget) {
                System.out.println(i);
                System.out.println("found it");
            }


        }


    }
}

