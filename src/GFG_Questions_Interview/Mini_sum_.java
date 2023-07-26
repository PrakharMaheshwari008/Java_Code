package GFG_Questions_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_sum_ {
    public static void main(String[] args) {
        int[] arr ={5, 3, 0, 7, 4};
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int[] arr1 = new int[id];

        for(int i =0 ;i < id ;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(solve(arr1,id));
    }
   static String solve(int[] arr, int n) {
        Arrays.sort(arr);
        String A1 = "";
        String A2 = "";
        for(int i =0 ;i <n;i++){
            if(i%2 == 0){
                A1+=arr[i];
            }
            if(i%2 == 1){
                A2+=arr[i];
            }
        }
        long ans =  Long.parseLong(A1) +Long.parseLong(A2);
        return String.valueOf(ans);
        // code here
    }
}

