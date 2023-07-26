package leet_code_Contest;

//import java.util.Scanner;

public class biweekly_contest_FindTriangularSumofanArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(triangularSum(arr));
    }
    public static int triangularSum(int[] nums) {
        int result =0;
        int len = nums.length;
        if (len<=0)
        {
            return result;
        }
        for(int j = 0;j<nums.length;j++)
        {
            for (int i = 0;i<len-j-1;i++)
            {
                nums[i]= nums[i] + nums[i+1];
                if (nums[i]>=10)
                {
                    nums[i] = nums[i]%10;
                }
            }
        }
        result = nums[0];
        return result;
    }
}