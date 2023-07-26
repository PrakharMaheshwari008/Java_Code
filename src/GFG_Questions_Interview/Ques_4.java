package GFG_Questions_Interview;

import java.util.ArrayList;

public class Ques_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,75,3,4,45,4,6,6};
        System.out.println(subarraySum(arr,9,49));
    }
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
            int curSum = 0;
            int start = 0;
            int end = -1;
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int i = 0 ; i< n-1;i++)
            {
                curSum =+ arr[i];
                if (curSum - s == 0){
                    start = 0;
                    break;
                }
                if (list1.contains(curSum-s));{
                    start = list1.get(curSum-s);;
                    end = i;
            }
            list1.add(curSum);
                if (end == -1) {
                    System.out.println("Not Found");
                }
                else {
                    System.out.println("Start"+ end);
                }
            }
            return list1;
        }

}
