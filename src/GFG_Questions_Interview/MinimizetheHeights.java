package GFG_Questions_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizetheHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
//        int[] arr = {1, 5, 8, 10};
        System.out.println(getMinDiff(arr,arr.length,k));
    }
  static   int getMinDiff(int[] arr, int n, int k) {
//      Arrays.sort(arr);
//      for(int i = 0; i <n; i++){
//          if(arr[i] >= k && arr[i]-k > 0 ){
//              arr[i] = arr[i] - k;
//          }
//          else if(arr[i] < k ){
//              arr[i] = arr[i] + k;
//          }
//      }
//      int max = 0;int min = arr[0];
//      for(int i = 0 ; i< n ;i++){
//          max = Math.max(max,arr[i]);
//          min = Math.min(min,arr[i]);
//      }
//
//      return max - min;

      // code here
      if(n == 1){
          return 0;
      }
      int max,min;
      Arrays.sort(arr);
      int diff = arr[n-1] - arr[0];
      for(int i=1;i<n;i++){
          if(arr[i]-k<0){
              continue;
          }
          max = Math.max(arr[n-1]-k, arr[i-1]+k);
          min = Math.min(arr[0]+k, arr[i]-k);
          diff = Math.min(diff, max - min);
      }
      return diff;
      }
  }