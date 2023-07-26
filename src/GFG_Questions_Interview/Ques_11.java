package GFG_Questions_Interview;
import java.util.ArrayList;
import java.util.Scanner;

// Subarray with given sum
public class Ques_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int index = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[index];
        for(int i = 0 ; i < index;i++)
        {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {3,4,6,7,4,3,6,8,4,3,2,4,7,8};
        System.out.println(subarraySum(arr,index,s));


    }


    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int start = 0;
        int sum = 0;
        for (int i = start;i< n;i++)
        {
            if (sum == s) {
                start++;
//                i++;
                list1.add(start);
                list1.add(i);
                return list1;
            }
            sum+=arr[i];

            if (sum>s)
            {
                sum = sum - arr[start];
//                sum = sum + arr[start+1];
                start++;

            }


        }
        return list1;

    }
}
