package leetCode;

public class Largest_product_subarray {
    public static void main(String[] args) {
        int[] arr = {3,-1,4};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int curr = 1;
        int max_pro = nums[0];

        for (int i = 0; i < nums.length ; i++) {

            curr *= nums[i];

            if (max_pro < curr) {
                max_pro = curr;
            }

            if (curr == 0) {
                curr = 1;
            }
        }
        curr = 1;
        for (int i = nums.length-1;i>=0;i--) {
            curr *= nums[i];
                if (max_pro < curr) {
                    max_pro = curr;
                }

                if (curr == 0) {
                    curr = 1;
                }
            }
            return max_pro;
        }
    }
