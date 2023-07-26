package GFG_Questions_Interview;

import java.util.Scanner;

//Missing no
public class ques_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MissingNumber(arr,index));

    }
   static int MissingNumber(int array[], int n) {

        int sum = 0 ;
        int sum2 = 0;
        int result = 0;
        for( int i = 0 ; i< n;i++){
            sum = sum + array[i];
        }
        int temp = 1;
        for(int i = 0 ;i<n+1;i++){
            sum2 = sum2 + temp ;
            temp++;
        }
//        To find the total no. of sequenced distinct digit
//       Approach - 2
       sum2 = ((n+1)*(n+2))/2;
        result = sum2 - sum;

        return result;
    }
}
