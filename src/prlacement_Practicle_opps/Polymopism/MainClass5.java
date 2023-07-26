package prlacement_Practicle_opps.Polymopism;
class A1
{
    public A1(int i)
    {
        System.out.println(1);
    }

    public A1()
    {
        this(10);

        System.out.println(2);
    }

    void A1()
    {
        A1(10);

        System.out.println(3);
    }

    void A1(int i)
    {
        System.out.println(4);
    }
}

public class MainClass5
{
    public static void main(String[] args)
    {
        new A1().A1();
    }
}