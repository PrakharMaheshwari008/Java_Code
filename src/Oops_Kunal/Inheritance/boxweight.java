package Oops_Kunal.Inheritance;


public class boxweight extends Box{
    double weight;
    public boxweight() {
//        this.weight = -1;
        System.out.println("hellp");
    }
    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }
    boxweight (boxweight other) {
        super(other);
        weight = other.weight;
    }
    boxweight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
    public boxweight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
          this.weight = weight;
    }
}