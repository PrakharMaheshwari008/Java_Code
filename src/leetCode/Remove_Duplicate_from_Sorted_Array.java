package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicate_from_Sorted_Array {
    public static void main(String[] args) {
//        int[] arr = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5};
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(remove_Duplicate(arr));
//        System.out.println(Arrays.toString(remove_Duplicate(arr)));
        System.out.println(Arrays.toString(remove_Duplicat1(arr, 1)));
    }


    public static int remove_Duplicate(int[] arr) {
        int temp = arr[0];
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[result] != arr[i]){
                result++;
              arr[result] = arr[i];
            }
        }
        return result+1;
    }
    public static int[] remove_Duplicat1(int[] nums, int val) {
        int point = 0;

        for(int i = 1 ; i < nums.length;i++){
            if(val != nums[i]){
                nums[point] = nums[i];
                point++;
            }
        }
        return nums;
    }
}