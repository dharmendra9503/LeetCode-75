package HashMap_Set;

import java.util.ArrayList;
import java.util.Arrays;

public class Equal_Row_and_Column_Pairs {
    private static int equalPairs(int[][] grid) {
        ArrayList<int[]> col = new ArrayList<>();
        for(int i=0;i<grid.length;i++) {
            int[] temp = new int[grid.length];
            for(int j=0;j<grid.length;j++) {
                temp[j] = grid[j][i];
            }
            col.add(temp);
        }

        int ans = 0;
        for(int[] x : grid) {
            for(int[] y : col) {
                if(Arrays.equals(x, y)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Equal Row and Column Pairs");

        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }
}
