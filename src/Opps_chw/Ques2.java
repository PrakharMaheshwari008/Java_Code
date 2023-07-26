package Opps_chw;

public class Ques2 {
    public static void main(String[] args) {
//        retrangle  rec = new retrangle(2,3);
//        cuboid obj = new cuboid(1,2,3);
//
//        System.out.println(obj.perimeter(20));

    }
}
//class retrangle{
//    int l;
//    int b;
//
//    public retrangle(int l, int b) {
//        this.b = b;
//        this.l = l;
//        int p = b * l;
//        System.out.println(p);
//    }
//
//
//}
//class cuboid extends retrangle{
//    public int h;
//    cuboid(int l,int b,int h)
//    {
//        super(l,b);
//        int area_cub = l*b*h;
//        System.out.println(area_cub);
//    }
//    public int perimeter(int h)
//    {
//     return 4*(this.b * this.h * this.l);
//    }
//
//
//}
////***********************************************************8
//
//class Rectangle1{
//    private double length;
//    private double breadth;
//
//    Rectangle1(){
//        System.out.println("I am non param of Rectangle1");
//    }
//
//    Rectangle1(double l,double b){
//        System.out.println("I am Rectangle1 parameterized constructor");
//        this.length = l;
//        this.breadth = b;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getBreadth() {
//        return breadth;
//    }
//
//    public double area(){
//        return length * breadth;
//    }
//}
//
//class Cuboid1 extends Rectangle1{
//    private double height;
//
//    public double getHeight() {
//        return height;
//    }
//
//    Cuboid1(double l, double b, double h){
//        super(l,b);
//        System.out.println("I am Cuboid1 parameterized constructor");
//        this.height = h;
//    }
//
//    public double volume(){
//        return this.getLength() * this.getBreadth() * this.height;
//    }
//}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%



abstract class Rectangle1{
//    area of rectangle L.B.H
    public int length;
    public int breadth;
//    constructor
Rectangle1(){

    System.out.println("I am non paramenterized constructoe of rectangle");
}
Rectangle1(int l,int b)
{
    System.out.println("I ma pramerterized contructor of rectangle");
    this.length = l;
    this.breadth = b;
}
public int getLength()
{
    return length;
}
public int getBreadth()
{
    return breadth;
}
public void setLength(int length)
{
    this.length = length;
}
public void setBreadth(int breadth)
{
    this.breadth = breadth;
}

//method

//    public int area();
//    {
//
//        return breadth * length;
//    }


}
