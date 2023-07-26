package GFG_Questions_Interview.String_Quees;

import static java.lang.Math.max;

//Stickler Thief
public class Ques_13 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 11, 2, 4, 6};
        System.out.println(FindMaxSum(arr,7));
    }
    public static int FindMaxSum(int[] arr, int n)
    {
        if(n==1){
            return arr[0];
        }
        int[] dp=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[n-1];
    }
}
