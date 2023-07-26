package GFG_Questions_Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Smallest_positive_missing_number {
    public static void main(String[] args) {
        int[] arr2 = {1,-2,-3,-4,5};
        int[] arr = {28, 7, -36, 21, -21, -50, 9, -32};
        System.out.println((missingNumber(arr, arr.length)));
    }
    static int missingNumber(int arr[], int size)
    {
        int temp = 1;
        Arrays.sort(arr);
        for(int i = 0; i < size;i++){
            if(arr[i] > 0 && arr[i] == temp){
                temp++;
                continue;
            }
        }
        return temp;
    }
}
