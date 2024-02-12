package HashMap_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_the_Difference_of_Two_Arrays {
    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        list = new ArrayList<>();
        for(Integer element : set1) {
            if(!set2.contains(element)) {
                list.add((int)element);
            }
        }

        ans.add(list);

        list = new ArrayList<>();
        for(Integer element : set2) {
            if(!set1.contains(element)) {
                list.add((int)element);
            }
        }

        ans.add(list);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Find the Difference of Two Arrays");

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }

}
