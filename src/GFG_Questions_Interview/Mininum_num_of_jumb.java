package GFG_Questions_Interview;

import java.util.Scanner;

public class Mininum_num_of_jumb {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        long num = sc.nextLong();
//        int index = sc.nextInt();
//        int[] arr = new int[index];
//        for (int i = 0 ; i < index;i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr));
    }

    static int minJumps(int[] arr){

//        int len = arr.length;
//        int count = 0;
//        int index = arr[0];
//        int jump = arr[0];
//        int in = 0;
//        if (len == 1)
//        {
//            return 0;
//        }
//        if(arr[0]==0){
//            return -1;
//        }
//        int i;
//        for( i =  index+arr[in] ; i < len ;i++){
//            if(index  < len-1){
//                count++;
//                in = i;
//                jump = arr[i];
//                index+= i;
//            }
//            if (index == len-1) {
//                return count;
//
//            }
//        }
//        return ++count;

        int len = arr.length;
//        int count = 0;
//        int index = arr[0];
//        int jump = arr[0];
//        int in = 0;
        if(arr.length==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int maxrange = arr[0];
        int  step = 0;
        int jump =0;
        for(int i=0;i<arr.length;i++){
            step = Math.max(step,i+arr[i]);
            if(i==maxrange){
                maxrange = step;
                jump++;
            }
            if(maxrange>=arr.length-1){
                return jump+1;
            }
        }
        return -1;
    }

}
