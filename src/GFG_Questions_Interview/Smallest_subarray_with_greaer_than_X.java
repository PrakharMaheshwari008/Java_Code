package GFG_Questions_Interview;

import java.util.Arrays;

public class Smallest_subarray_with_greaer_than_X {
    public static void main(String[] args) {
        int[] max = {2,2,4,1,1,7,3};
        int[] arr = {0,0,4,4};
//        System.out.println(smallestSubWithSum(max,max.length,8));


//        ***********************

        System.out.println(minSubset(arr,arr.length));
    }



    public static int smallestSubWithSum(int a[], int n, int x) {
        int sum = 0;
        int s = 0, e = 0;
        int len = Integer.MAX_VALUE;
        if(a.length == 1){
            return 1;
        }
        for(e = 0; e < n; e++) {
            sum += a[e];
            while(sum > x && s < n) {
                len = Math.min(len, e - s + 1);
                sum -= a[s++];
            }
        }
        return len;
    }


   static int minSubset(int[] Arr,int N) {

        Arrays.sort(Arr);
        int sum = 0;
        for(int i = 0 ; i < N ;i++){
            sum+=Arr[i];
        }
        int val = 0;
        int count = 1;
        for(int i =N-1;i>=0;i--){

            val+= Arr[i];
            sum-=Arr[i];

            if(val <= sum ){
                count++;

            }
        }
        return count;
    }

    }

