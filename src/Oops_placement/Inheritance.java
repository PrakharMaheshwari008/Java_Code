package Oops_placement;

public class Inheritance {
    public static void main(String[] args) {
    }
}
//*****************************************************
//**************** 1 *************************************************
class Shape {
    public void area() {
        System.out.println("Display area");
    }
}
//****************** 2 ************************************************
class Triangle extends Shape{ // this class inherit their parent(base) class so this is example if
//                                        single inheritance.....
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//********************** 3 *****************************************************
class EquilateralTriangle extends Triangle{
//            this class is a example of multi_level_ inheritance.
//            their parent class is drived class(child class) from shape class(base class)

    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
// ********************* 4 ***********************************************
//        Class 4 and class 2 is used to implemented the heirarcical inheritance
class circle extends Shape{
//            this class is a example of multi_level_ inheritance.
//            their parent class is drived class(child class) from shape class(base class)

    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}


