package GFG_Questions_Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class first_repeated {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr,arr.length));
    }
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i < n ; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm);
        for(int i =0 ; i < n;i++){
            System.out.println(i+1);
            System.out.println(hm.get(i));
            System.out.println(hm.get(arr[i]));
            if(hm.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }
}
