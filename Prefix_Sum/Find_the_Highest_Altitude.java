package Prefix_Sum;

public class Find_the_Highest_Altitude {
    private static int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int highestPoint = currentAlt;

        for(int altGain : gain) {
            currentAlt += altGain;
            highestPoint = Math.max(highestPoint, currentAlt);
        }

        return highestPoint;
    }

    public static void main(String[] args) {
        System.out.println("Find the Highest Altitude");

        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
