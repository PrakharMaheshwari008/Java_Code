package String_Interview_Question;

public class Reverse_String {
    public static void main(String[] args) {
        char_method("Prakhar");
        System.out.println();
        ArrayChar_method("Prakhar");
        System.out.println();
        String_Buffer("Prakhar");
        System.out.println();
        String_builder("PRakhar");

    }

    public  static void ArrayChar_method(String str)
    {
        char[] ch = str.toCharArray();
        for (int i =str.length()-1 ;i>=0;i--)
        {
            System.out.print(ch[i]+" ");
        }
    }
    public  static void String_Buffer(String str)
    {
      StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse()+" ");
    }

    public  static void String_builder(String str)
    {
      StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse()+" ");
    }



//    *****************************************************************
    public static void char_method(String str)
    {
//        String str = "prakhar";
        for (int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i)+" ");

        }
    }
}
