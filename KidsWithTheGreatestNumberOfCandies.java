import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    //T.C: O(n)
    //S.C: O(1)
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int maxCandies = 0;
        for(int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        for(int candy : candies) {
            if(candy + extraCandies >= maxCandies) {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return  ans;
    }

    public static void main(String[] args) {
        System.out.println("Kids With the Greatest Number of Candies");

        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}
