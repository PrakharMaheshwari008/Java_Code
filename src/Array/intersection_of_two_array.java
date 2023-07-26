package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class intersection_of_two_array {
    public static void main(String[] args) {
//        int[] array = inputArray();
//        int[] array1 = inputArray();
        int[] array = {1,2,34,4,5,6};
        int[] array1 = {1,2,3,4,5,6};
        System.out.println(intersection(array,array1));

    }
    public static int[] inputArray()
    {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] array = new int[index];
        for (int i = 0 ; i < index;i++)
        {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static ArrayList intersection(int[] array, int[] array1)
    {int temp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < array.length;i++)
        {
            for (int j = 0; j< array1.length;j++)
            {
                if (array[i] ==array1[j]){
                   temp = array[i];
                   arrayList.add(temp);
                }
            }
        }
     return arrayList;
    }
}
