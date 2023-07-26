package CodeChef_Problems;

import java.util.Scanner;

public class CanChef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for(int i = 1 ;i <=n;i++){
                arr[i] = sc.nextInt();
            }
            float sum = 0;
            int count = 0 ;
            for(int i = 1; i <=n;i++){
                sum+=arr[i];
                float pro = (sum/i) * 100;
                if(pro == 100){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
