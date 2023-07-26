package Opps_chw;

public class Ques1 {
    public static void main(String[] args) {
//        Cylinder obj = new Cylinder();
        Circle obj1 = new Circle();
    }
}
class Circle{
    public int radius;
    Circle()
    {
        System.out.println("I am non param of circle");
    }
    Circle(int r)
    {
        System.out.println("I am circle paraterized contructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am cylinder parameterized contructore");
        this.height = h;
    }
}


