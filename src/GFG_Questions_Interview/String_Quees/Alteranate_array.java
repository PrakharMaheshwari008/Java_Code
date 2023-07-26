package GFG_Questions_Interview.String_Quees;

public class Alteranate_array {
    public static void main(String[] args) {
        long[] arr = {10,20,30,40,50,60,70,80,90,100,110};
        rearrange(arr, arr.length);
    }
    public static void rearrange(long arr[], int n){

        // Your code here
        long arr1[] = new long[n];
        for(int i  = 0,j = 1;i<n &&j<n;i++,j=j+2){
            int mid = n/2;
            if (i<mid)
                arr1[j] = arr[i];
            }

        for(int i  = n-1,j = 0;i>n ||j<n;i--,j=j+2){
            int mid = n/2;
            if (mid<n)
                arr1[j] = arr[i];
        }
        for(int i = 0 ; i  < n; i++){
            arr[i] = arr1[i];
            System.out.print(arr[i]+" ");
        }

    }
}
