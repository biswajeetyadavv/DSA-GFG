package Math;

public class palindrom_Num {
    public static void main(String args[]){
        System.out.println(is_pal(4554));

    }
    public static boolean is_pal(int num){
        int rev = 0;
        int temp = num;
        while(temp != 0){
            int id = temp%10;
            rev = rev * 10 +id;
            temp = temp/10;
        }
        return (num == rev);
    }

}
