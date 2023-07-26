package GFG_Questions_Interview;

import java.util.Arrays;

//Product array puzzle
public class Ques_12 {
    public static void main(String[] args) {
        int[] arr = {12,0};
        System.out.println(Arrays.toString(productExceptSelf(arr, arr.length)));
    }
    public static long[] productExceptSelf(int nums[], int n)
    {
//        int sum = 0;
//        long[] p = new long[nums.length];
//        for(int j = 0 ; j < nums.length; j++){
//            sum = 1;
//            for(int i = 0 ; i < nums.length;i++){
//                if(i != j ){
//                    sum *= nums[i];
//
//                }
//                p[j] = sum;
//            }
//        }
//        return p;

        long[] product = new long[n];
        long value = 1;
        boolean check = false;
        int more = 0;//if it constains more than 1 zero then finall array will have zeroes in all cells
        for(int num:nums){
            if(num!=0){
                value *= num;
            }
            else{
                check=true;
                more++;
            }
        }
        for(int i=0;i<n;i++){
            if(check){
                if(nums[i]!=0 || more>=2){
                    product[i]=0;
                }
                else{
                    product[i]=value;
                }
            }
            else{
                product[i]=value/nums[i];
            }
        }
        return product;
    }
}
