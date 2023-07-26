package Slide_window_problem_approach;
//        Description of the problem:
//       ************************************ problem Statement:***********************
//      1. Given an array of integer n and a positive k.find the maximum sum of any contiguous subarray of
//        size k.
//        Example 1 : (Test Cases:)
//        Input : [2,1,5,1,3], k = 3;
//        Output: 9
//        Explanation : Sub-array with maximum sum is {5, 1, 3}.

//       ************************************** SOLUTION: ************************************
//    Given an array of integers of size ‘n’.
//Our aim is to calculate the maximum sum of ‘k’
//consecutive elements in the array.
//
//Input  : arr[] = {100, 200, 300, 400}
//         k = 2
//Output : 700
//
//Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
//         k = 4
//Output : 39
//We get maximum sum by adding subarray {4, 2, 10, 23}
//of size 4.
//
//Input  : arr[] = {2, 3}
//         k = 3
//Output : Invalid
//There is no subarray of size 3 as size of whole
//array is 2. .

public class basic_approach {
    public static void main(String[] args) {
        int[] arr = new int[]{19, 14, 4, 9, 16, 4, 12, 10, 6, 16};
        System.out.println(sliding_window(arr,20));
    }
    public static int sliding_window(int[] arr,int k){
        int window_sum = 0;
        int max_sum = 0;
        for(int i =0;i < k;i++){
            window_sum+= arr[i];
        }
        for (int i =k;i< arr.length;i++){
            window_sum+=arr[i] - arr[i-k];
            max_sum = Math.max(window_sum,max_sum);

        }

        return max_sum;
    }
}
