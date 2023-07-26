package HackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matching_socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int count= 0;
        int arr[] = new int[index];
        for(int i = 0 ; i < index; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();
        System.out.println(twoSum(arr,target));
        arr = twoSum(arr,target);
        System.out.println(Arrays.toString(arr));
//        for(int i = 0 ;i<index ; i++){
//            for(int j = i; j < index-1; j++){
//                if(arr[i] == arr[j+1]){
//                    count++;
//                }
//            }
//        }
//        int result = (int) Math.sqrt(count);
//        System.out.println(result);
    }
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
//        int k = 2;
        int[] result = new int[2];
        for(int i = 0; i< len; i++){

            for(int j = 1;j<len;j++){
                if((nums[i]+nums[j] == target)&& i!=j){
                   result[1] = j;
//                   k--;
                   result[0] = i;
//                   break;
                }
//break;
            }
        }
        return result;
    }
}
