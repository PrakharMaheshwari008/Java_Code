package leetCode;

import java.util.Arrays;

public class Product_except_itself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
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
