package GFG_Questions_Interview;

import java.util.Arrays;

//Cyclically rotate an array by one
public class Ques_1 {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotate(arr, 5)));
    }
    public static int[] rotate(int arr[], int n)
    {
        int temp = arr[n - 1];
        for(int i = n-1 ;i>=1;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

}
