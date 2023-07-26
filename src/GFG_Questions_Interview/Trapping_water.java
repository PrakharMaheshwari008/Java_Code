package GFG_Questions_Interview;

public class Trapping_water {


    public static void main(String[] args) {
        int[] arr = {8, 8, 2, 4, 5, 5, 1};
        System.out.println(trappingWater(arr,arr.length));
    }
    static long trappingWater(int arr[], int n) {


//        int count = 0;
//
//        int left_max = Integer.MIN_VALUE;;
//        int left_idx = 0;
//        int Right_max = Integer.MIN_VALUE;;
//        int right_idx = 0;
//        for(int i = 0;i < arr.length/2;i++){
//            if(left_max < arr[i]){
//                left_max = arr[i];
//                left_idx = i;
//            }
//        }
//
//        for(int i = arr.length/2+1;i < arr.length;i++){
//            if(Right_max <= arr[i]){
//                Right_max = arr[i];
//                right_idx = i;
//            }
//        }
//        int g_max = Math.min(Right_max,left_max);
//
//        for(int i = left_idx;i < right_idx;i++){
//            int add = g_max-arr[i];
//            count+=add;
//        }
//        return count;

        long count =0;
        int mi=0;  //  this is to find index which has maximum value in array.
        for(int i =1;i<n;i++){

            if(arr[i]>arr[mi]){
                mi=i;
            }
        }

        int mhl =0;   // initilly taking maximum height left =0
        int mhr=0;  // initilly taking maximum height right =0


        // now breaking the array in two part left ---> maximum index and maximum index <--- right.
        for(int i=0;i<mi;i++){

            if(arr[i]>mhl){    // here comparing if the current is higher than max height if yes then assigning it to mhl
                mhl =arr[i];
            }
            else{
                count+= mhl-arr[i]; // else adding maximum height left - current height
            }
        }
        for(int i=n-1;i>mi;i--){
            if(arr[i]>mhr){
                mhr = arr[i];
            }
            else{
                count+= mhr-arr[i];
            }
        }
        return count;

    }
}
