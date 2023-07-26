package Recursion_Hoga;

public class Print_1_to_n {
    public static void main(String[] args) {
//        System.out.println(print(8));
        __1(9);
    }
    static int print(int n)
    {
        if (n<1)
        {
            return n;
        }

        return print(n-1);

//        System.out.println(n);
    }
    static void  __1(int n)
    {
        if (n<1)
        {
            return;
        }
//        System.out.println();
//       __1(n--);
       __1(--n);
        System.out.println(n);
    }
}
