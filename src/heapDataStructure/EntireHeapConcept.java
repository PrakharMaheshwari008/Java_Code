package heapDataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class EntireHeapConcept {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,9,2,1,4,5));
        int size = arr.size();
        insert(arr,10);
        System.out.println("Max Heap Array: ");
        printArray(arr,size);

        deletion(arr,4);
        System.out.println("After Deleting an element");
        printArray(arr,size);
    }

   static void heapify(ArrayList<Integer> arr, int idx) {
        int size = arr.size();
        int largest = idx;
        int left_n = 2 * idx + 1;
        int right_n = 2 * idx + 2;
        if (left_n < size && arr.get(left_n) > arr.get(largest))
            largest = left_n;
        if (right_n < size && arr.get(right_n) > arr.get(largest))
            largest = right_n;
        if (largest != idx){
            int temp = arr.get(largest);
            arr.set(largest,arr.get(idx));
            arr.set(idx,temp);
            heapify(arr,largest);
        }
    }
   static void insert(ArrayList<Integer> arr, int newNum){
        int size = arr.size();
        if(size == 0){
            arr.add(newNum);
        }else{
            arr.add(newNum);
            for(int i = size/2-1;i>=0;i--){
                heapify(arr,i);
            }
        }
    }
    static void deletion(ArrayList<Integer> arr,int num){
        int size = arr.size();
        int i;
        for(i =0 ;i < size;i++){
            if(num == arr.get(i)){
                break;
            }
        }
        int temp = arr.get(i);
        arr.set(i,arr.get(size-1));
        arr.set(size-1,temp);

        arr.remove(size-1);
        for (int j = size/2-1;j>=0;j--){
            heapify(arr,j);
        }
    }
  static   void printArray(ArrayList<Integer> arr,int size){
        for (Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
