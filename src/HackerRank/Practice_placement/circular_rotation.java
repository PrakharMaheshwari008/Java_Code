package HackerRank.Practice_placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class circular_rotation {
    public static void main(String[] args) {
//        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int[] arr = {2,4,6,8,10,12,14,16,18,20};

//        System.out.println(Arrays.toString(rotateArr(arr, 2, arr.length)));
//        System.out.println(rotLeft(arr1,4));
//        System.out.println(rotLeft(arr,4,0));
    }
//    public static List<Integer> rotLeft(List<Integer> a, int d,int i) {
//        if(d<0){
//            return a;
//        }
//        int last = a.get(0);
////    i = 1;
//            System.out.println("sample 1:  "+a);
//           a.set(i,a.get(i+1));
////           a.set()
//            return rotLeft(a,d-1,i+1);
//    }
//    static int[] rotateArr(int arr[], int d, int n)
//    {
//        int[] newarr = new int[n];
//            for(int i = 0 ; i < arr.length;i++){
//                int new_indx = (i+d)%n;
//                newarr[i] = arr[new_indx];
//            }
//            return newarr;
//        }
        public static List<Integer> rotLeft(List<Integer> a, int d) {

            List<Integer> li = new ArrayList<>();
            for(int i = 0 ;i < a.size();i++){
                int new_idx = (i+d)%a.size()-1;
            li.set(i,a.get(new_idx));
        }
     return li;
    }
}
