package HashMap_Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique_Number_of_Occurrences {

    /*              Time complexity and Space complexity
                                                T.C     S.C
        Building the map	                    O(n)	O(n)
        Building the set	                    O(n)	O(n)
        Checking the values in the set      	O(n)	O(n)
        Total	                                O(n)	O(n)
    */
    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        /*
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(!set.add(entry.getValue())){
                return false;
            }
        }
        return true;
        */

        Set<Integer> set = new HashSet<>(map.values());
        return (set.size() == map.size());
    }

    public static void main(String[] args) {
        System.out.println("Unique Number of Occurrences");

        int[] nums = {1,7,3,6,5,6};
        System.out.println(uniqueOccurrences(nums));
    }
}
