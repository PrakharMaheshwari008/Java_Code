package leetCode;

import java.io.PrintStream;
import java.util.HashSet;
/*
217. Contains Duplicate
Given an integer array nums, return true if any value appears
 at least twice in the array, and return false if every element is distinct.
 */
public class duplicate_contiains {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
//        System.out.println(containsDuplicate(arr));
        int arr1[] = productExceptSeft(arr);
        System.out.println(arr1.toString());
    }
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0 ; i< arr.length;i++)
        {
            if (!hSet.add(arr[i])) {
                return true;
            }
        }
        return false;
    }

//    
    public static int[] productExceptSeft(int[] nums){
        int[] sol = new int[nums.length];
        if (nums.length ==0)
        {
            return new int[0];
        }
        sol[0] = 1;
        for (int i = 1;i < nums.length;i++)
        {
            sol[i] = sol[i-1] * nums[i-1];
        }
        int rightProduct = 1;
        for (int i = nums.length-1;i>=0;i--)
        {
            sol[i] = sol[i] * rightProduct;
            rightProduct *= nums[i];
        }
        return sol;
    }
}
