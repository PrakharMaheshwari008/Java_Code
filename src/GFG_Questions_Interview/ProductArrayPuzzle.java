package GFG_Questions_Interview;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{12,0};

        System.out.println(Arrays.toString(productExceptSelf(arr,arr.length)));
    }
    public static long[] productExceptSelf(int nums[], int n)
    {

        long[] res1 = new long[n];
        for(int  i = 0; i < n;i++){
            long res = 1;
            for(int j = 0 ; j <n ;j++){
                if(i!=j){
                    res= res * nums[j];
                }
            }
            res1[i] = res;
        }
        return res1;
    }
}
