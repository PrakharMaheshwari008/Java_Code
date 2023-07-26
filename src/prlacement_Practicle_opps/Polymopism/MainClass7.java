package prlacement_Practicle_opps.Polymopism;
class X2
{
    int method(int i)
    {
        return i *= i;
    }
}

class Y2 extends X2
{
    double method(double d)
    {
        return d /= d;
    }
}

class Z2 extends Y2
{
    float method(float f)
    {
        return f += f;
    }
}

public class MainClass7
{
    public static void main(String[] args)
    {
        Z2 z = new Z2();

        System.out.println(z.method(21.12));
    }
}