//package leet_code_Contest;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class merge_value_live_ {
//    public static void main(String[] args) {
//        int[][] arr = { { 1,1 }, { 4, 5 } ,{3,8}};
//        int[][] arr1 = { { 3,1},{1,5 } ,{ 4, 5 }};
//        System.out.println(mergeSimilarItems(arr,arr1));
//    }
////    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
////        List<List<Integer>> arr = new ArrayList<List<Integer>>();
////
////        for(int i =0 ; i < items1.length-1;i++){
////            ArrayList<Integer> innerArr = new ArrayList<>();
////            for(int j = 0;j < items2.length;j++){
////                System.out.println(items1[i][0] + " ********** "+items2[j][0] +"****" + items2[i][1]);
////                if(items1[i][0] == items2[j][0]){
////                    innerArr.add(items1[i][0],items2[i][0]+items1[i][0]);
////                    arr.add(innerArr);
////                }
////            }
////
////
////        }
////     return arr;
////    }
//
//
//    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//        for (int[] item : items1) {
//            map.put(item[0], item[1]);
//        }
//        for (int[] item : items2) {
//            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
//        }
//        ArrayList<List<Integer>> list = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            list.add(List.of(entry.getKey(), entry.getValue()));
//        }
//        return list;
//    }
//
//}
