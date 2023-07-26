package GFG_Questions_Interview;

import java.util.Arrays;

public class Move_all_NegativeElementToEnd {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr, arr.length);
    }

    public static void segregateElements(int[] arr, int n) {
        // Your code goes here
        int[] arr1 = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]);
        }

    }
}
