package GFG_Questions_Interview;

public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args) {
        int[] arr=  {0, 0, 0, 4};
        pushZerosToEnd(arr,arr.length);
    }
   static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count = 0;
        int k = 0;
        int num = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] == 0){
                count++;
            }else{
                num++;

                arr[k++] = arr[i];
            }

        }
        for(int i = n-1 ;i >=n-count;i-- ){
            arr[i] = 0;
        }
        for(int i =0 ;i <n;i++ ){
            System.out.print(arr[i]+ " ");
        }

    }
}
