package GFG_Questions_Interview;

import java.util.ArrayList;

public class best_time_tobuy_stocks {
    public static void main(String[] args) {
        int[] arr =  {100,180,260,310,40,535,695};
        System.out.println(stockBuySell(arr,arr.length));
    }
   static ArrayList<ArrayList<Integer>>stockBuySell(int a[], int n) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<n;i++){
            ArrayList<Integer>a1=new ArrayList<>();
            if(a[i]>a[i-1]){
                a1.add(i-1);
                a1.add(i);
                ans.add(a1);
            }
        }
        return ans;

    }
}
