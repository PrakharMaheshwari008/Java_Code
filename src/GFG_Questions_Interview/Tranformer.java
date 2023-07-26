package GFG_Questions_Interview;

public class Tranformer {
    public static void main(String[] args) {
       String A = "ABGH";
       String B = "CDEF";
        System.out.println(transfigure(A,B));
    }
   static int transfigure (String A, String B)
    {
        // Your code goes here.
        int count = 0 ;
        if(A.length() != B.length()){
            return -1;
        }
        int sum = 0;
        for(int i =0 ;i < A.length();i++){
            sum+=A.charAt(i);
            sum-=B.charAt(i);
        }
        if(sum!=0) return -1;
        int i = A.length()-1,j = B.length()-1;
        while(i>0 && j>0){
            if(A.charAt(i) == B.charAt(j)){
                j--;
                i--;
            }
            if(A.charAt(i) != B.charAt(j)){
                count++;
                i--;
            }
        }
        if(count>0){
            return count;
        }
        return -1;
    }
}
