package Recursion_Hoga.recursion_Array;

import java.util.Scanner;

public interface Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];

        for (int i = 0; i < index;i++)
        {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int last = 1;
        System.out.println(check_Array_sorted(arr,start, last ));
    }
   static int start = 0;
    static int last = 1;
    static boolean check_Array_sorted(int[] arr, int start, int last) {
        int len = arr.length;
        if (len == last) {
            return true;
        }
        if (arr[start] < arr[last]) {
            return check_Array_sorted(arr, start + 1, last + 1);
        }
        return false;
    }
}
