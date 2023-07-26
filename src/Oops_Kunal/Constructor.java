package Oops_Kunal;

public class Constructor {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student kunal;
//        kunal = new Student();

        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;


//        kunal.changeName("Shoe lover");
//        kunal.greeting();

//
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
//        random2 = new Student(3,"4dfd",4234.2f)
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);


        System.out.println("************************************************************");
//      #%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#
//        Use of  final keyword
        final int bonus =  2;
//        bonus = 34; //


//        **************************************************&&&&&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        final A kunal1 = new A("Prakhar Maheshwari");
        kunal1.name = "other name";
//        when a non primitive is final, you cannot reassign it.
//        kunal1 = new A("fdvdsvd");
        A obj = new A("sfdafsgsg");

        System.out.println(obj);
//        
    }
}

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Understanding of Final Keyword %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//    Final Keyword In Java // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
//
//        variable
//        method
//class
//The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword.
//
//final keyword in java
//        1) Java final variable
//        If you make any variable as final, you cannot change the value of final variable(It will be constant).
//
//        Example of final variable
//        There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.
//
//
//
//class Bike9{
//    final int speedlimit=90;//final variable
//    void run(){
//        speedlimit=400;
//    }
//    public static void main(String args[]){
//        Bike9 obj=new  Bike9();
//        obj.run();
//    }
//}//end of class
//    Test it Now
//        Output:Compile Time Error
//
//
//        2) Java final method
//        If you make any method as final, you cannot override it.
//
//        Example of final method
//class Bike{
//    final void run(){System.out.println("running");}
//}
//
//class Honda extends Bike{
//    void run(){System.out.println("running safely with 100kmph");}
//
//    public static void main(String args[]){
//        Honda honda= new Honda();
//        honda.run();
//    }
//}
//    Test it Now
//        Output:Compile Time Error
//        3) Java final class
//If you make any class as final, you cannot extend it.
//
//        Example of final class
//final class Bike{}
//
//class Honda1 extends Bike{
//    void run(){System.out.println("running safely with 100kmph");}
//
//    public static void main(String args[]){
//        Honda1 honda= new Honda1();
//        honda.run();
//    }
//}
//    Test it Now
//        Output:Compile Time Error
//        Q) Is final method inherited?
//        Ans) Yes, final method is inherited but you cannot override it. For Example:
//
//class Bike{
//    final void run(){System.out.println("running...");}
//}
//class Honda2 extends Bike{
//    public static void main(String args[]){
//        new Honda2().run();
//    }
//}
//    Test it Now
//        Output:running...
//        Q) What is blank or uninitialized final variable?
//        A final variable that is not initialized at the time of declaration is known as blank final variable.
//
//        If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee.
//
//        It can be initialized only in constructor.
//
//        Example of blank final variable
//class Student{
//    int id;
//    String name;
//    final String PAN_CARD_NUMBER;
//...
//}
//Que) Can we initialize blank final variable?
//        Yes, but only in constructor. For example:
//
//class Bike10{
//    final int speedlimit;//blank final variable
//
//    Bike10(){
//        speedlimit=70;
//        System.out.println(speedlimit);
//    }
//
//    public static void main(String args[]){
//        new Bike10();
//    }
//}
//    Test it Now
//        Output: 70
//static blank final variable
//        A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.
//
//
//        Example of static blank final variable
//class A{
//    static final int data;//static blank final variable
//    static{ data=50;}
//    public static void main(String args[]){
//        System.out.println(A.data);
//    }
//}
//Q) What is final parameter?
//        If you declare any parameter as final, you cannot change the value of it.
//
//class Bike11{
//    int cube(final int n){
//        n=n+2;//can't be changed as n is final
//        n*n*n;
//    }
//    public static void main(String args[]){
//        Bike11 b=new Bike11();
//        b.cube(5);
//    }
//}
//    Test it Now
//        Output: Compile Time Error
//        Q) Can we declare a constructor final?
//        No, because constructor is never inherited.



//******************** Content from kunal video *********************************
class A{
    final  int num = 10;
    String name;
    public A(String name)
    {
        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}



//******************************************************************************************************
// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}