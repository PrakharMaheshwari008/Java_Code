package GFG_Questions_Interview;

public class max_path_in_two_arrays {
    public static void main(String[] args) {
        int A[] = {1,2,3};
       int  B[] = {3,4,5};
        System.out.println(maxPathSum(A,B));
    }
   static int maxPathSum(int[] ar1, int[] ar2){
        // Your code here
        int i,j;
        int sum = 0;
        for(i = 0,j = 0 ; i < ar1.length-1 && j < ar2.length-1;i++,j++){

            if(ar1[i] + ar1[i+1] < ar2[j] + ar2[j+1]){
                sum+=ar2[j];
            }
            else{
                sum+=ar1[i];
            }
        }
        while(i<ar1.length){
            sum+=ar1[i++];
        }
        while(i<ar2.length){
            sum+=ar1[i++];
        }
        return sum;

    }
}
