package GFG_Questions_Interview;

import java.util.HashMap;

public class Longest_subarray_with_0_sum {
    public static void main(String[] args){
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr,arr.length));
    }

  static   int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0;
        for(int  i = 0 ;i < n ;i++){
            sum +=arr[i];
            if(sum == 0){
                maxi = i+1;
            }
            else{
                System.out.println(mpp.get(sum));
                if(mpp.get(sum) != null){
                    maxi = Math.max(maxi, i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;
    }
}
