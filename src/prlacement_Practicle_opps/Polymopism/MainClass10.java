package prlacement_Practicle_opps.Polymopism;
class A3
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}

class B3 extends A3
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}

public class MainClass10
{
    public static void main(String[] args)
    {
        A3 a = new B3();

        a.methodOne();
    }
}
