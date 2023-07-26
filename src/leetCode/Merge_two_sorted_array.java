package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};;
        int[] arr2 = {2,5,6};
      merge(arr1,arr1.length,arr2,arr2.length);

    }
//XXXXXXXXXXXXXXXXXXXXXXXX
    public static void merge(int[] arr1, int n, int[] arr2, int m) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr1[i] != 0) {
                arr3.add(arr1[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            if (arr2[i] != 0) {
                arr3.add(arr2[i]);
            }
        }

        Collections.sort(arr3);
        System.out.println(arr3);
    }
}