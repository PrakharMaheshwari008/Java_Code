package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class _2Sum {
    public static void main(String[] args) {

        int[] a = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a, 13)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hm.containsKey(temp)) {
                return new int[]{hm.get(temp), i};
            }
            hm.put(nums[i], i);
        }
        return new int[0];
    }
}