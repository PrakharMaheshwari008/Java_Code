//https://javaconceptoftheday.com/java-practice-questions-on-method-overloading-and-overriding/

package prlacement_Practicle_opps.Polymopism;
class X
{
    void method(int a)
    {
        System.out.println("ONE");
    }

    void method(double d)
    {
        System.out.println("TWO");
    }
}

class Y extends X
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}

public class MainClass1
{
    public static void main(String[] args)
    {
        new Y().method((double) 100);
    }
}