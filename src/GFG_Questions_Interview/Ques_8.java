package GFG_Questions_Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Count_pair_with_given_Pair
public class Ques_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getPairsCount(arr,index,num));
    }
    static int getPairsCount(int[] arr, int n, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);
            }
            map.putIfAbsent(arr[i],0);
            map.put(arr[i],map.get(arr[i]+1));
        }
        return count;

    }
}
