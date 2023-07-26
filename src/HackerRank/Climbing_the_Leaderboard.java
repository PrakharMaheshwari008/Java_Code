package HackerRank;

import java.util.Scanner;

public class Climbing_the_Leaderboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int[] arr = new int[index1];
        int[] empty = new int[index1];
        int[] sec_1 = new int[index2];
        int[] main = new int[index1];
        int count = 1;

        for (int  i = 0;i<index1;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i<index2;i++)
        {
            sec_1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < index1-1;i++)
        {
            if (arr[i] == arr[i+1]){
                empty[i] = count;
                empty[i+1] = empty[i];
            }
            else if(arr[i]> arr[i+1]){
                empty[i+1]  = count++;
            }
        }
        int k = 0;
        for (int i = 0; i<index1 ;i++)
        {
            for (int j = index2-1;j>=0;j--)
            {
                if (sec_1[index2-1] == arr[0])
                {
                    main[k] = 1;
                }
                if (sec_1[j] == arr[i]){
                    main[j] = empty[i];
                }
                else if (arr[i]<sec_1[j])
                {
                    main[j] = empty[i]--;
                }
//                else{
//                    main[k] = empty[i]++;
//                }
                k++;
            }
        }
        for(int i = 0 ; i<index2;i++)
        {
            System.out.println(main[i]);
        }
    }
}
