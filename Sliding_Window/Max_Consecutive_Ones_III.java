package Sliding_Window;

public class Max_Consecutive_Ones_III {
    private static int longestOnes(int[] nums, int k) {
        int i=0, j=0, maxLen = 0, zeros = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[i] == 0){
                    zeros--;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Max Consecutive Ones III");

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
