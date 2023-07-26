package GFG_Questions_Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class find_missing_and_repeat {
    public static void main(String[] args) {
//        int[] arr = {47,13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6 ,4 ,20, 27, 9 ,3, 8, 40, 24,
//                44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        int[] arr = {1,3,3};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }
   static int[] findTwoElement(int arr[], int n) {
//        Arrays.sort(arr);
//        int[] res = new int[2];
//        int idx = 1;
//        HashSet<Integer> hash = new HashSet<>();
//        for(int i = 0 ; i< arr.length;i++) {
////            if (i > 2 &&arr[i] != arr[i - 1]) {
//                if (arr[i] != idx++ && ) {
//                    res[1] = --idx;
//                    break;
//                }
//            }
////        }
//        for(int i = 0 ;i < n ;i++){
//            if(hash.contains(arr[i])){
//                res[0] = arr[i];
//                break;
//            }
//            hash.add(arr[i]);
//        }
//        return res;
       Arrays.sort(arr);
       int[] res = new int[2];
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i = 0 ;i < n;i++){
           if(hm.containsKey(arr[i]) == true){
               res[0] = arr[i];
           }
           else{
               hm.put(arr[i],1);
           }
       }
       for(int i = 1;i <= n;i++){
           if(hm.containsKey(i) == false){
               res[1] = i;
           }
       }
       return res;
   }
}
