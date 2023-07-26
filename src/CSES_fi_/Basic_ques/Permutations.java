
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(per(n));
    }
    public static String per(int n){

        StringBuilder sb = new StringBuilder();
        if(n == 1){
            System.out.println("1");
        }
        else if(n ==2 || n==3){
            System.out.println("NO SOLUTION");
        }
        else {
        int[] odd = new int[n+1];
        int[] even = new int[n+1];
        for(int i = 1;i <=n;i++) {
            if (i % 2 == 1) {
                odd[i] = i;
            }
        } for(int i = 1;i <= n;i++) {
            if (i % 2 == 0) {
                even[i] = i;
            }
        }
        for (int i = 0 ; i <= n;i++) {
            if (even[i] != 0) {
                sb.append(even[i]+" ");
            }
        }
        for (int i = 0 ; i <= n;i++) {
            if (odd[i] != 0) {
                sb.append(odd[i] + " ");
            }
        }

        }

        return String.valueOf(sb).trim();
    }

}
