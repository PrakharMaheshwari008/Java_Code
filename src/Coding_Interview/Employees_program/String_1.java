package Coding_Interview.Employees_program;

public class String_1 {
    public static void main(String[] args) {
        String str1 = "Abc"; //(String Literal variable)  stored in the String Constant pool
        String str2 = "Abc";// this will check inside the String constant pool is the content of the
//            Literal variable str2 is already present inside the constant pool i.e. str1 than str2 will
//            reference to the address of str1;
        String str3 = new String("Abc");

        System.out.println(str1 == str2); // it will return true b'coz both are
                                // point to same reference
        System.out.println(str1 == str3); // str1 store in the string constant pool
                                // and srt3 store in the heap memory so both have different address
        System.out.println(str1.equals(str3));  // equal operator will
    }
}