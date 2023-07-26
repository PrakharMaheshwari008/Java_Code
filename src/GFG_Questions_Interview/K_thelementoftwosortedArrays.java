package GFG_Questions_Interview;

public class K_thelementoftwosortedArrays {
    public static void main(String[] args) {
        int[] arr= {2, 3, 6, 7, 9};
        int[] arr1 = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(arr,arr1,arr.length,arr1.length,k));
    }
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int[] merge = new int[n+m];
        merge = merge(arr1,arr2,n,m);
//        long res = 0;
        for(int i =0 ; i < merge.length;i++){
            System.out.println(merge[i] + " "+ "->"+i );
        }
        return (long) merge[k];
    }
    public static int[] merge(int[] arr1 ,int arr2[],int n1,int n2){
        int[] merge = new int[n1+n2+1];
        int i = 0;
        int j = 0;
        int k = 1;
        while(i<n1& j<n2){

            if(arr1[i] < arr2[j]){
                merge[k++] = arr1[i++];
            }
            else{
                merge[k++] = arr2[j++];
            }
        }
        while(i<n1){
            merge[k++] = arr1[i++];
        }
        while(j<n2){
            merge[k++] = arr2[j++];
        }
        return merge;
    }

}
