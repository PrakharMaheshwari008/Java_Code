package prlacement_Practicle_opps.Polymopism;
//https://javaconceptoftheday.com/java-practice-questions-on-method-overloading-and-overriding/
class A
{

}

class B extends A1
{

}

class C extends B3
{

}

public class MainClass
{
    static void overloadedMethod(A1 a1)
    {
        System.out.println("ONE");
    }

    static void overloadedMethod(B4 b)
    {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }

    public static void main(String[] args)
    {
        C c = new C();

        overloadedMethod(c);
    }
}
