package GFG_Ques;

import java.util.ArrayList;
import java.util.Scanner;

public class Make_the_array_beautifull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        int len = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i < arr.length;i++){
            if (arr[i-1] < 0 && arr[i] >0 || arr[i] < 0 && arr[i-1] >0){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        return list;
    }
}
