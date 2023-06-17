package Array_String;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n == 0) {
            return true;
        }

        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0) {
                boolean left = (i == 0 || flowerbed[i-1] == 0);
                boolean right = (i == flowerbed.length-1 || flowerbed[i+1] == 0);

                if(left && right) {
                    n--;
                    i++;
                    if(n == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Can Place Flowers");

        int[] flowerbed = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }
}
