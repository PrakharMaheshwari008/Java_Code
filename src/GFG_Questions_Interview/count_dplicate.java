package GFG_Questions_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class count_dplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ;i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(remove_duplicate(arr,arr.length));
    }
  static   int remove_duplicate(int arr[],int n){
        // code here
        int count = 1;
        for(int i =0 ;i < n-1 ;i++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
