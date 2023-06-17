package Two_Pointers;

import java.util.*;

public class MaxNumberOfKSumPairs {

    //T.C: O(nlogn) Because of inbuilt sort function
    /*
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;
        int i=0, j=nums.length-1;
        while(i < j) {
            int sum = nums[i] + nums[j];
            if(sum > k){
                j--;
            }
            else if(sum < k){
                i++;
            }
            else{
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
    */


    //T.C: O(N)
    //S.C: O(N)
    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        for (int num : nums) {
            int res = k - num;

            if (map.containsKey(res)) {
                cnt++;
                if (map.get(res) == 1)
                    map.remove(res);
                else {
                    map.put(res, map.get(res) - 1);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println("Max Number of K-Sum Pairs");

        int[] nums = {1,2,3,4};
        System.out.println(maxOperations(nums, 5));
    }
}
