package Two_Pointers;

public class MoveZeroes {

    /*
    public static void moveZeroes(int[] a) {
        int zeros = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0)
                zeros++;
        }

        int cnt = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0)
                a[cnt++] = a[i];
        }

        while(zeros-- > 0){
            a[cnt++] = 0;
        }
    }
    */


    public static void moveZeroes(int[] a) {
        int cnt = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[cnt];
                a[cnt] = temp;
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Move Zeroes");

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
