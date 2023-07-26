package GFG_Questions_Interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques_10_zic_Zac {
    public static void main(String[] args) {
        int[] arr =  {4, 3, 7, 8, 6, 2, 1};
        System.out.println(Arrays.toString(zic_zac(arr,arr.length)));
    }
    public static int[]  zic_zac(int arr[], int n) {
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i+1] < arr[i] && i%2 == 0 ) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
            }
                if (arr[i+1] > arr[i] && i%2 == 1) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            return arr;
        }
    }

