package GFG_Questions_Interview;

import java.util.HashMap;

public class LOngest_subarray_with_sum_divisible_y_k {
    public static void main(String[] args) {
        int[] A = {-2, 2, -5, 12, -11, -1, 7};
        int K = 3;
        System.out.println(longSubarrWthSumDivByK(A,A.length,K));
    }
   static int longSubarrWthSumDivByK(int arr[], int n, int k){
        // Complete the function
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int max = 0;
        int num = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            int temp = sum%k;
            if(temp<0){ // for negative remainder values
                temp = temp+k;
            }
            System.out.println(hm);
            if(hm.containsKey(temp)){
                num = i - hm.get(temp);
                if(num>max){
                    max = num;
                }
            }
            else{
                hm.put(temp,i);
            }
        }
        return max;
}
}
