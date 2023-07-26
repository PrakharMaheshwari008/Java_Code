package leet_code_Contest;

public class Smallest_even_multiple {
    public static void main(String[] args) {
        System.out.println(mul(5));
    }
    public static int mul(int n){
        if(n%2 ==0 && n%n == 0){
            return n;
        }
        if (n % 2 == 0) {
            n *= 5;
            mul(n);
        }else{
            n*= 2;
            mul(n);
        }

        return n;
    }
}
