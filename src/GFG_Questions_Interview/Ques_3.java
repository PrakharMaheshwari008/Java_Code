package GFG_Questions_Interview;

import java.util.Scanner;

public class Ques_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int index = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        System.out.println(search(arr,index,tar));
    }
    static int search(int arr[], int N, int X)
    {
        long res = 0;
        for(long i = 0 ; i < N  ; i++){
            if(arr[(int) i] == X){
                res = i ;
            }
        }
        return (int) res;

    }

}
