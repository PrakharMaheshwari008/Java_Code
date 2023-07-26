package prlacement_Practicle_opps.Polymopism;
class ABC
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}

class XYZ extends ABC
{
    void methodXYZ()
    {
        methodABC();
    }
}

public class MainClass11
{
    public static void main(String[] args)
    {
        new ABC().methodABC();
    }
}