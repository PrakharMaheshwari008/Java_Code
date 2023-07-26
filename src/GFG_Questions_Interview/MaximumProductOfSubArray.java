package GFG_Questions_Interview;
public class MaximumProductOfSubArray {
    public static void main(String[] args) {
       int A[] = {-1, -1, -2, 4, 3};
        System.out.println(findMaxProduct(A.length,A));
    }
    public static int findMaxProduct(int n, int[] arr) {
        int currPro = 1;
        int overAll = Integer.MIN_VALUE;
        for(int i =0 ; i < n;i++){
            currPro *= arr[i];
            if(currPro>overAll){
                overAll = currPro;
            }
            else{
                currPro = 1;
            }
        }
        return overAll;
    }
}
