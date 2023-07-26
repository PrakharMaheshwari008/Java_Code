package leet_code_Contest.NO_306;

import java.util.Arrays;

public class Largest_local_variable {
    public static void main(String[] args) {
        int[][] arr = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(Arrays.deepToString(largestLocal(arr)));
    }
    public static int[][] largestLocal(int[][] grid) {
        int[][] sec = new int[grid.length-2][grid[0].length-2];
            int p;
            for(int k =0 ;k < grid.length-2;k++){
                for( p = 0; p<grid.length-2;p++) {
                    int max = Integer.MIN_VALUE;

                    for(int i = k ; i < k+3;i++){
                        for(int j = p ; j < p+3;j++){
                            if(max < grid[i][j]){
                                max = grid[i][j];
                            }
                        }
                    }
                    sec[k][p] = max;
                }
            }
        return sec;
    }
}
