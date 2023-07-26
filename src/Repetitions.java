import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println(max_repetition_optimize(str1));
    }
    public static int max_repetition_optimize(String str) {
        char[] s = str.toCharArray();
        int n = s.length;
        int c = 1;
        int max_c = 1;
        for (int i = 1; i<n;i++)
        {
            if (s[i] == s[i-1])
            {
                c++;
            }
            else {
                c = 1;
            }
            max_c = Math.max(max_c,c);
        }
        return max_c;
    }
}
