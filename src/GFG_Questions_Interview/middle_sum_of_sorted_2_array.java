package GFG_Questions_Interview;

public class middle_sum_of_sorted_2_array {
    public static void main(String[] args) {
        int ar1[] = {1, 2, 4, 6, 10};
        int ar2[] = {4, 5, 6, 9, 12};
//        int[] arr = new int[ar1.length+ar1.length];
//        arr = Merge_two_Array(ar1,ar2,ar1.length);
        merge(ar1,ar2,ar1.length,ar2.length);
//        System.out.println(middle_value(arr,0,ar1.length-1));
    }
//    static int  findMidSum(int[] ar1, int[] ar2, int n) {
//        ar1 = Merge_two_Array(ar1,ar2,n);
//
//        return middle_value(ar1,0,ar1.length-1);
//    }
   static int[] Merge_two_Array(int[] arr1, int[] arr2, int n) {
        // code here
        for(int i = 0 ;i < n;i++){
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            int k;
            int first = arr2[0];
            for( k = 1; k< n&& arr2[k] < first;k++){
                arr2[k-1] = arr1[k];
            }
            arr2[k-1] = first;
        }
        return arr2;
    }
   static int middle_value(int[] arr,int start,int end){
        start = 0;
        end = arr.length-1;
        int mid = start + (end-start)/2;

        int sum = arr[mid] + arr[mid-1];
        return sum;
    }
    public static void merge(int arr1[], int arr2[], int n, int m)
    {
        for(int i = 0 ; i < n;i++){

            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }

            int k;
            int first = arr2[0];
            for(k = 1; k < m && arr2[k] < first;k++){
                arr2[k-1] = arr2[k];
            }
            arr2[k-1] = first;
        }
    }
}