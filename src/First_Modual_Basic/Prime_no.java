package First_Modual_Basic;

public class Prime_no {
    public static void main(String[] args) {
        if (isprime(31))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static int i = 2;
    public static boolean isprime(int n){

        if(n==0 || n==1)
        {
            return false;
        }
        if (n==i){
            return true;}
        if ((n%i == 0))
        {
            return false;
        }
        i++;
        return isprime(n);
    }

}
