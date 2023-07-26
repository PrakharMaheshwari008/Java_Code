package GFG_Questions_Interview;

import java.util.ArrayList;

public class Alternate_positive_negative_num {
    public static void main(String[] args) {
        int[] Arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(Arr,Arr.length);
    }
   static void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i = 0 ;i < n;i++){
            if(arr[i]  < 0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }

        }
        int i = 0;
        int index = 0;
        int j =0;
        while(i<pos.size() && j < neg.size()){
            arr[index++] = pos.get(i);
            j++;
            i++;
            arr[index++] = neg.get(j);
            j++;
            i++;
        }
            while (i< pos.size()){
                arr[index++] = pos.get(i);
                i++;
            }
            while ((j<neg.size())){
                arr[index+1] = neg.get(j);
                j++;
        }

    }
}