package GFG_Questions_Interview;

import java.util.Scanner;

//peak Element
public class Ques_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(peakElement(arr,index));
    }
    public static int peakElement(int[] arr,int n)
    {
//        int max = arr[0];
//        int tIndex = 0;
//        for(int i = 0 ; i < n;i++){
//
//            if(arr[i] > max){
//                max = arr[i];
//                tIndex = i;
//            }
//        }
//        int res = 0;
//        if (tIndex >= 0)
//        {
//            res = 1;
//        }
//        return res;

        int first = 0;
        int last = n-1;
        while(first < last){
            int mid = (first+last)/2;
            if (arr[mid] < arr[mid+1]){
                first = mid+1;
            }
            else {
                last = mid;
            }
        }
        return first;
    }
}
