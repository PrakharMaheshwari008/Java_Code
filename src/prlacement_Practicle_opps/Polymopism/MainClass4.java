package prlacement_Practicle_opps.Polymopism;
class X1
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class Y1 extends X1
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Z extends Y1
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Z");
    }
}

class MainClass4
{
    public static void main(String[] args)
    {
        X1 x = new Y1();

        x.calculate(10, 20);

        Y1 y = (Y1) x;

        y.calculate(50, 100);

        Z z = (Z) y;

        z.calculate(100, 200);
    }
}