package GFG_Questions_Interview;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicates(arr,index));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n -1;i++){
            if(arr[i] == arr[i+1]){
                list.add(arr[i]);
            }
            }
        if (list.isEmpty()){
            System.out.println(-1);
        }
        return list;
    }
}
