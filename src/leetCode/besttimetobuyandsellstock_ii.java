package leetCode;

public class besttimetobuyandsellstock_ii {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(find_best(arr));
    }
    public static int find_best(int[] arr)
//    { int final_min = 0;
//        int min_index = 0;
//        int addUp = 0;
//        int min = arr[0];
//        for (int i = 1 ;i < arr.length;i++)
//        {
//            if (min > arr[i]) {
//                min = arr[i];
//                min_index = i;
//            }
//
//
//        }
//        int temp1 = arr[min_index];
//
//        for (int j = min_index ; j < arr.length-1;j++) {
////                int temp = arr[temp1];
//            int comp  = arr[min_index];
//            if (min>arr[min_index+1]){
//                addUp = addUp + (arr[min_index]-temp1);
//                min = arr[min_index];
//            }
//        }
//        return addUp;
//
//    }
    {
//        we need prices for 2 days at atleast to find the profit.
        if(arr == null || arr.length <= 1){
            return 0;
        }
        int total_profit = 0;
        for (int i = 0 ;i<arr.length;i++)
        {
            //checking if we can profit with previous doy's price
            //if yes ,then we buy on previous day and sell on current day.
            // Add all such profit to get the total profit.
            if (arr[i-1]< arr[i])
            {
                total_profit += arr[i]-arr[i-1];
            }
        }
        return total_profit;
    }
}
