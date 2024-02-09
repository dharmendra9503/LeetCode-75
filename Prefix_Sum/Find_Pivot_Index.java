package Prefix_Sum;

public class Find_Pivot_Index {
    private static int pivotIndex(int[] nums) {
        //Prefix sum approach
        int sum = 0;
        int leftSum = 0;
        for(int i:nums){
            sum += i;
        }

        for(int i=0;i<nums.length;i++){
            if(leftSum == sum-leftSum-nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Find Pivot Index");

        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
