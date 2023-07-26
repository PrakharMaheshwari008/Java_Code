package GFG_Questions_Interview;

public class Maxmum_index {
    public static void main(String[] args) {
//        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int[] arr = {1, 10};

        System.out.println(maxIndexDiff(arr,arr.length));
    }
    static int maxIndexDiff(int arr[], int N) {
        // max
        int max = 0;
        int idex = 0;
        // int ma
        int i = 0;
        int j = N-1;
        while(i < j){
            if(arr[i] < arr[j]){
                int sub = arr[j] - arr[i];
                idex = j-i;
                max = Math.max(max,idex);
                i++;j--;
            }
            if(arr[i] > arr[j]){
                i++;j--;
            }
        }

        return max;
    }
}
