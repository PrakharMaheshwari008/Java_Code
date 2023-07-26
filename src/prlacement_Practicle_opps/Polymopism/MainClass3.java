package prlacement_Practicle_opps.Polymopism;

public class MainClass3
{
    double overloadedMethod(double d)
    {
        return d *= d;
    }

    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }

    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }

    public static void main(String[] args)
    {
        MainClass3 main = new MainClass3();

        System.out.println(main.overloadedMethod(100));
    }
}