package leetCode;

public class Best_time_to_Buy_and_sale {
    public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6,4};
//        int[] arr = {7,6,4,3,1};
        int[] arr = {2,4,1};
        System.out.println(sele(arr));
    }
    public static int sele(int[] A) {
//        if (prices.length == 0) {
//            return 0;
//        }
//        int minSoFar = prices[0];
//        int maxProfits = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minSoFar)
//            {
//                minSoFar = prices[i];
//            }
//            if (prices[i] - minSoFar > maxProfits){
//                maxProfits = prices[i] - minSoFar;
//            }
//        }
//        return maxProfits;

    int n = A.length;
    int min =A[0];
    int idx = 0;
        int profit = 0;
      for(int i = 1 ; i < n;i++){
        if(min > A[i]){
            min = A[i];
            }
        if(A[i] - min > profit){
            profit = (A[i] - min);
        }
    }
        return profit;
    }
}

