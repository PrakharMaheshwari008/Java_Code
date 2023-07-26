package GFG_Questions_Interview;

public class linked_gfg_Happy_number {
    public static void main(String[] args) {
        System.out.println(isHappy(19,19));
    }

//   static int  total = 0;
//   static int rem = 1;
//    static int res;
    static int isHappy(int n, int ori) {
        int  total = 0;
         int rem;
        if(n == 1)
        {
            return 1;
        }


        while (n>0) {
            rem = n % 10;
            n /= 10;
            total = total + rem*rem;
        }

       return isHappy(n,ori);

    }
}
