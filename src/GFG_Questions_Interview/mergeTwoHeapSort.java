package GFG_Questions_Interview;

import java.util.Arrays;

public class mergeTwoHeapSort {
    public static void main(String[] args) {
        int[] a = {10, 5, 6, 2};
       int[] b = {12, 7, 9};
        System.out.println(Arrays.toString(mergeHeaps(a, b, a.length, b.length)));
    }
    public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int i,k;
        for(i =0;i < n;i++){
            if(a[i] > b[0]){
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;
            }
            int first = b[0];
            for(k = 1;k < m && b[k] < first;k++){
                b[k-1] = b[k];
            }
            b[k-1] = first;
        }
        return b;
    }
}
