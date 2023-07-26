package Oops_placement;

public  class Polymorphism {
    String name ;
    int age;
    public void one_poly()
    {
        System.out.println("No Argument");
    }
    public int one_poly(int p)
    {
        return p;
    }
    public String one_poly(String p)
    {
        return "this is the  one_argument func _ with int return";
    }
    public void one_poly(String p,int age)
    {
        System.out.println("");
    }

    public static class Opps {

        public static void main(String[] args) {
            Polymorphism p1 = new Polymorphism();
            p1.name  = "Prakhar";
            p1.age = 21;

            System.out.println(p1.one_poly(p1.age));
        }
    }
}
