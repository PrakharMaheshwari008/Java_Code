package Array;
import java.util.Scanner;
public class sum_pair {
    public static void main(String[] args) {
        int[] arr = inputArray();
//        System.out.println(sum_pair(arr));
        System.out.println(average(arr));
    }

//    ***************************************8
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
//      ***************************************
    public static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (max < salary[i]) {
                max = salary[i];
            }
            if (min > salary[i]) {
                min = salary[i];
            }
        }
        double add =0;
        int size = 0;
        for (int i = 0; i<salary.length;i++)
        {
            if (salary[i] != max && salary[i]!= min) {
                add += salary[i];
                size++;
            }

        }
        double res = add/size;
        return res;
    }

//    **************************************************
    public static int sum_pair(int[] array)
    {
        int num_pair = 0;
        for (int i = 0 ; i<array.length;i++)
        {
            for (int j =0 ;j<array.length-1;j++)
            {
                if (array[i]+array[j+1]==array.length){
                   num_pair++;
                }
            }
        }
        return num_pair;
    }
}