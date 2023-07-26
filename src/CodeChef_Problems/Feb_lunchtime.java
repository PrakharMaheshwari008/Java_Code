package CodeChef_Problems;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Feb_lunchtime {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        while(test != 0){
            int count = sc.nextInt();
            int k = sc.nextInt();
          for(int i = 0 ; i < count;i++){
              String ele = sc.next();
              arr.add(ele);
          }
            while(k!=0){
                String last = arr.remove(arr.size()-1);
                if(Objects.equals(last, "H")){
                for(int i = 0 ; i <arr.size();i++ ){
                        arr.set(i,"T");
                    }
                }
                k--;
            }
            test--;
            int count1 = 0;
            for(int i = 0 ; i < arr.size();i++){
                if(arr.get(i) == "H"){
                    count1++;
                }
            }
            System.out.println(count1);

        }

    }
}
