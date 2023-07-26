package leet_code_Contest;

import java.util.Scanner;

public class _6020_Divide_Array_nto_Equal_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        int size = arr.length/2;
        for (int i = 0 ; i <index;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(divide_array(arr));
    }
    public static boolean divide_array(int[] arr){
        int index = arr.length;
        int count = 0;
        for (int i = 0 ; i < index; i++){
            for (int j = i + 1 ; j <index-1; j++){
                if (arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        int size = arr.length/2;
        if (count == size){
            return true;
        }
        return false;
    }
}

