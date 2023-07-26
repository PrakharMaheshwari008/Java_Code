package prlacement_Practicle_opps.Polymopism;
class ABC2
{
    void methodABC()
    {
        System.out.println(111);
    }

    void methodABC(int i)
    {
        System.out.println(222);
    }
}

class XYZ2 extends ABC2
{
    @Override
    void methodABC(int i)
    {
        System.out.println(333);
    }

    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}

public class MainClass12{
    public static void main(String[] args)
    {
        ABC2 abc = new XYZ2();

        abc.methodABC(10);

        abc.methodABC();
    }
}