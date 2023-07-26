import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long index = sc.nextLong();
        long[] arr = new long[(int) index];
        for (int i = 0; i < index-1; i++) {
            arr[ i] = sc.nextLong();}
        long in =  arr[0];
//        System.out.println(missing(arr,index));


//        **************************************** Hashmap________
        int n = sc.nextInt();
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0;i<n-1;i++){
            int x = sc.nextInt();
            h.add(x);
        }
        int m = 0;
        for(int i = 1;i<=n;i++){
            if(!h.contains(i)){
                m=i;
                break;
            }
        }
        System.out.println(m);
    }
    public static long missing(long[] arr,long index) {
        Arrays.sort(arr);
        long count = arr[0];
        for (int i = 0; i < index; i++) {
            if (arr[i] != count) {
                return count;}
            count++;
        }
        return count;
    }
}
