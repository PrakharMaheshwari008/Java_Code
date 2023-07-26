import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        long[] arr = new long[index];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(inc_arr(arr));
    }
    public static long inc_arr(long[] arr)
    {
        long count = 0;
        for (int  i = 0 ; i< arr.length-1;i++)
        {
            if (arr[i] > arr[i+1]){
                long diff = arr[i] - arr[i+1];
                count += arr[i] - arr[i+1];
                arr[i+1] +=diff;
            }
        }
        return count;
    }
}