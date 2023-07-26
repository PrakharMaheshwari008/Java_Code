package Oops_Kunal.Access;

class protector1 extends main1 {

    public protector1(int num,String name)
    {
        super(num,name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        protector1 pr = new protector1(2,"43");
//        System.out.println(pr.name);

    }
}
class subsubclass extends protector1{
    public subsubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subsubclass obj = new subsubclass(45,"Prakhar Maheshwari");
        int n = obj.num;
    }
}
class subclass2 extends main1{
    public subclass2(int num, String name) {
        super(num, name);
    }
    subclass2 obj2 = new subclass2(23,"$3");
}