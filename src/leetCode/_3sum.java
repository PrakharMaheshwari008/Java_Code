package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _3sum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};


    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i]; // last var is 3rd pointer to be                               compare with 2's pointer

                while (hi > lo) {
                    if (nums[lo] + nums[hi] == sum) {
                        List<Integer> temp = new LinkedList<>();
                        temp.add(nums[i]);
                        temp.add(nums[lo]);
                        temp.add(nums[hi]);
                        res.add(temp);

                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;

                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else {
                        hi--;
                    }
                }
            }
        }
        return res;

    }
}