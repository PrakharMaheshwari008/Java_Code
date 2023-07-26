package leetCode;

public class isHappy_num {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {

        if (n == 1 ||  n == 7)
        {
            return true;
        }
        if (n<=9)
        {
            return false;
        }
        return isHappy(sumOfSquareDigits(n));
    }
    public static int sumOfSquareDigits(int n)
    {
        int num = n;
        int sum = 0;
        while (num != 0)
        {
            sum = sum + ((num%10) * (num%10));
            num = num/10;
        }
        return sum;
    }
}
