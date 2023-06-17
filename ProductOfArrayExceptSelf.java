import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0] = 1;

        for(int i=1;i<nums.length;i++){
            temp[i] = temp[i-1] * nums[i-1];
        }

        int right = 1;
        for(int  i=nums.length-1;i>=0;i--) {
            temp[i] *= right;
            right *= nums[i];
        }

//        for(int num : temp) {
//            System.out.print(num +" ");
//        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Product of Array Except Self");

        int[] nums = {1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
}
