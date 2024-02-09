package Sliding_Window;

public class Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        int i=0, j=0;
        double sum = 0;
        double avg = Integer.MIN_VALUE;
        while(j < nums.length){
            sum += nums[j];
            if(j-i+1 == k){
                avg = Math.max(avg, sum/k);

                sum -= nums[i];
                i++;
            }
            j++;
        }
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Average Subarray I");
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
