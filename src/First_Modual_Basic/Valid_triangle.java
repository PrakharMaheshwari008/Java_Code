package First_Modual_Basic;

public class Valid_triangle {
    public static void main(String[] args) {
        valid_triangle(4,5,8);
    }
    public static void valid_triangle(int a, int b, int c){
        if(a+b<= c|| a+c<= b || b+c<=a)
        {
            System.out.println("No.. !! This is not  triangle");
        }
        else {
            System.out.println("Yes .  This is  a triangle");
        }
    }
}
