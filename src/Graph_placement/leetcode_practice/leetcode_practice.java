package Graph_placement.leetcode_practice;

import java.util.Arrays;

public class leetcode_practice {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},{1,1,0},{1,0,1}
        };
        System.out.println(Arrays.deepToString(floodFill(arr, 1, 2, 2)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, color, newColor);
        fill(image, sr - 1, sc, color, newColor);
        fill(image, sr, sc + 1, color, newColor);
        fill(image, sr, sc - 1, color, newColor);
    }

}
