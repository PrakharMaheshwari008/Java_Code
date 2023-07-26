package First_Modual_Basic;

public class febonaaci_series {
    public static void main(String[] args) {
        System.out.println(febo(7));
    }
    public static int febo(int n1)
    {
        if(n1==0)
        {
            return 0;
        }
        else if (n1 == 1)
        {
            return 1;
        }

        return febo(n1-1)+febo(n1-2);
    }
}
