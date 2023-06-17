package Two_Pointers;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int maxWater = 0;

        int start = 0, end = height.length-1;
        while(start < end){
            int len = end - start;
            int heig;

            if(height[end] >= height[start]){
                heig = height[start];
                start++;
            }
            else{
                heig = height[end];
                end--;
            }

            maxWater = Math.max(maxWater, len*heig);
        }

        return maxWater;
    }

    public static void main(String[] args) {
        System.out.println("Container With Most Water");

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
