package prlacement_Practicle_opps.Polymopism;
class A4
{
    public A4(int i)
    {
        System.out.println(myMethod(i));
    }

    int myMethod(int i)
    {
        return ++i + --i;
    }
}
class B4 extends A4{
    public B4(int i, int j){
        super(i*j);
        System.out.println(myMethod(i, j));
    }

    int myMethod(int i, int j){
        return myMethod(i*j);
    }
}

public class MainClass9{
    public static void main(String[] args){
            B4 b = new B4(12, 21);
    }
}