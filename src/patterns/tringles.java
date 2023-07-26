package patterns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tringles {
    public static void main(String[] args) {
//        pattern(10,10);
//        pattern1(10,10);
        int[] arr = {4,9,2,1};
//        bubble(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
//    static void pattern(int row,int col)
//    {
////                for (int i = 0 ; i<=row;i++)
////        {
////            for (int j = 0 ; j <= col; j++)
////            {
////                System.out.print("*"+ " ");
////            }
////            System.out.println();
////        }
//        if (row == 0)
//        {
//            return;
//        }
//        if (col<row)
//        {
//            pattern(row,col+1);
//            System.out.print("*"+"  ");
//
//        }
//
//        else {
//            pattern(row-1, 0);
//            System.out.println();
//
//        }
//
//    }

    static void pattern1(int row,int col)
    {
        if (row == 0)
        {
            return;
        }
        if (col<row)
        {
            System.out.print("*"+"  ");
            pattern1(row,col+1);
        }
        else {
            System.out.println();
            pattern1(row-1, 0);

        }

    }



//  **************************************************************************
//  ------------------------- Bubble Sort Using Recursion --------------------
    static void bubble (int[] arr,int r, int c)
    {
        if (r==0)
        {
            return;
        }
        if (c<r)
        {
            if (arr[c]>arr[c+1])
            {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }
        else {
            bubble(arr,r-1,0);
        }

    }

    static void selection(int[] arr,int r, int c, int max)
    {
        if (r==0)
        {
            return;
        }
        if (c < r)
        {
            if (arr[c] > arr[max])
            {
                selection(arr,r,c+1,c);
            }
            else {
                selection(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr,r-1,0,0);
        }
    }



}
