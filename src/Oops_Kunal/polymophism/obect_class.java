package Oops_Kunal.polymophism;

public class obect_class {

    int num;

    public obect_class(int num)
    {
        this.num = num;
    }

//    @Override
//    public String toString() {
//        return "obect_class{" +
//                "num=" + num +
//                '}';
//    }

    public static void main(String[] args) {
        obect_class obj = new obect_class(54);
        System.out.println(obj);
    }
}
