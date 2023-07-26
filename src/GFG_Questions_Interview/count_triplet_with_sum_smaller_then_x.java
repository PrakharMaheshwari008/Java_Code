package GFG_Questions_Interview;

import java.util.Arrays;

public class count_triplet_with_sum_smaller_then_x {
    public static void main(String[] args) {
       int N = 5, sum = 12;
      long[] arr = {5, 1, 3, 4, 7};
        System.out.println(countTriplets(arr,N,sum));
    }
   static long countTriplets(long[] arr, int n, int sum) {
    Arrays.sort(arr);
    long count = 0;
    for (int i = 0;i < n-2;i++){
        int l = i+1,r= n-1;
        while (l<r){
            if ((arr[i] + arr[l]+ arr[r]) < sum){
                count+=(r-l);
                l++;
            }else{
                r--;
            }
        }
    }
    return count;

    }
}
