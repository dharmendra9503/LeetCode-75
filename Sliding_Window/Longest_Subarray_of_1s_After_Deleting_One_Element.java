package Sliding_Window;

public class Longest_Subarray_of_1s_After_Deleting_One_Element {
    private static int longestSubarray(int[] nums) {
        int i=0, j=0;
        int maxLen = 0;
        int zeroPos = -1;
        while(j < nums.length){
            if(nums[j] == 0){
                if(zeroPos == -1){
                    zeroPos = j;
                }
                else{
                    maxLen = Math.max(maxLen, j-i-1);
                    i = zeroPos+1;
                    zeroPos = j;
                }
            }
            j++;
        }
        maxLen = Math.max(maxLen, j-i-1);
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Longest Subarray of 1's After Deleting One Element");

        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
